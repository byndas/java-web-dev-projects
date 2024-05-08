package launchcode.org.controllers;

import launchcode.org.data.EventData;
import launchcode.org.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/events")
public class EventController {

//	private Map<String, String> events = new HashMap<>();
//	private static List<Event> events = new ArrayList<>();

	@GetMapping("")
	public String EventsPage(Model model) {
		EventData.add(new Event("AuTechers","Meetup for coders who love Autechre"));
		EventData.add(new Event("FCC","FreeCodeCamp meetup"));
		EventData.add(new Event("JSmasters", "JS lecture series"));
		model.addAttribute("events", EventData.getAll());
		return "events/index";
	}

	@GetMapping("/form")
	public String EventsFormPage(Model model) {
		model.addAttribute("event", new Event("", ""));
		return "events/form";
	}

	@PostMapping("/add-event")
	public String submitEvent(
//			@RequestParam String eventName,
//			@RequestParam String eventDescription
			@ModelAttribute Event newEvent
	) {
		EventData.add(newEvent);
//		EventData.add(new Event(eventName, eventDescription));
		return "redirect:/events/success";
	}

	@GetMapping("/delete")
	public String renderDeleteEventForm(Model model) {
		model.addAttribute("title", "Delete Event");
		model.addAttribute("events", EventData.getAll());
		return "events/delete";
	}

	@PostMapping("/delete")
	public String processDeleteEventsForm(
			// required=false prevents program from breaking
			//    when form submitted with no checkbox selected
			@RequestParam(required=false) int[] eventIds
	) {
		if (eventIds != null) {
			for (int id : eventIds) {
				EventData.remove(id);
			}
		}
		return "redirect:/events/success";
	}

	@GetMapping("/success")
	public String SuccessPage(Model model) {
		model.addAttribute("events", EventData.getAll());
		return "events/success";
	}

	@GetMapping("edit/{eventId}")
	public String displayEditForm(Model model, @PathVariable int eventId) {
		Event eventToEdit = EventData.getById(eventId);
		model.addAttribute("event", eventToEdit);
		String title = "Edit Event " + eventToEdit.getName() + " (id=" + eventToEdit.getId() + ")";
		model.addAttribute("title", title );
		return "events/edit";
	}

	@PostMapping("edit")
	public String processEditForm(int eventId, String name, String description) {
		Event eventToEdit = EventData.getById(eventId);
		eventToEdit.setName(name);
		eventToEdit.setDescription(description);
		return "redirect:/events/success";
	}

}

