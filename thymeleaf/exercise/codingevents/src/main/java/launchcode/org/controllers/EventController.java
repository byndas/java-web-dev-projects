package launchcode.org.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/events")
public class EventController {

	private Map<String, String> events = new HashMap<>();

	@GetMapping("/")
	public String EventsPage(Model model) {
		events.put("AuTechers","Meetup for coders who love Autechre");
		events.put("FCC","FreeCodeCamp meetup");
		events.put("JSmasters", "JS lecture series");

		model.addAttribute("events", events);
		return "events/index";
	}

	@GetMapping("/form")
	public String EventsFormPage() { return "events/form"; }

	@PostMapping("/add-event")
	public String submitEvent(
			@RequestParam String eventName,
			@RequestParam String eventDescription
	) {
		events.put(eventName, eventDescription);
		return "redirect:/events/success";
	}

	@GetMapping("/success")
	public String SuccessPage(Model model) {
		model.addAttribute("events", events);
		return "events/success";
	}
}

