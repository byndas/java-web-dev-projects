package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare & init CD & DVD objects

        // TODO: Call CD & DVD methods to verify working as expected
    }
}

/*
design an interface_

CD & DVD classes only contain signatures
extend parent & implement interface to add fields & methods
consider logic within interfaces, abstract & non-abstract classes

As with Restaurant Menu studios, draw a diagram

1.  collecting & sorting behaviors common to CDs & DVDs:

METHODS:
spin,
store (laser write) data to disc,
laser read disc data,
remove info

report loaded data:
    name, capacity, contents, disc type

add more behavior:
    omit storage capacity since describes a field, not a behavior (method)

Which behaviors depend on a type of instance variable?
    for example, spinning behavior requires no field from CD or DVD classes

next, consider with behaviors depend on data stored in a specific object


2.  class-specific fields & methods:

decide which behaviors go in interface vs abstract class

interface methods need not be identical in each implementing object
    methods need no object-specific data
        methods can accept generic value parameters,
            like String searchTerm,
                not a field like DVD.title

for example, CDs & DVDs share a spin method
    but have different speed field arguments
        spinDisc() belongs to an interface

decide which other behaviors belongs to an interface

INTERFACE:
spin,
reading & writing via laser

FIELDS:
info (title, artist)


CLASS:
CD --> storage, data type, spin rate
DVD --> storage, data type, spin rate




write how these interface behaviors (methods) differ between CDs & DVDs,
    how must each class override these methods?

decide if non-interface behaviors belong to an abstract class
    or to separate CD & DVD classes


write fields needed to define props of a CD or DVD (i.e. storageCapacity)

consider:
    fields CD & DVD share?
    fields unique to CD or DVD class?
    constants fields?

//////////////////////////////////////////////////////////////////////////

implement the interface_

add OpticalDisc interface file

review syntax in Creating an Interface

declare & initialize constant fields

add method signature for each interface method (behavior)

for example:    void spinDisc();

//////////////////////////////////////////////////////////////////////////

focus on remaining fields & methods:

write abstract class_

begin with parent class

create abstract BaseDisc class
    declare CD & DVD shared fields

code shared constructors, getters, setters, custom methods

//////////////////////////////////////////////////////////////////////////

complete disc classes_

CD & DVD classes extend parent class & implement interface

code @Override for each interface method

to generate method signatures:
    hover over "implements" keyword & click IntelliJ suggestions

since only signatures, add method-specific code:
    getters, setters, custom methods as each class needs


call methods in Main:
    declare & init CD & DVD object instances for each behavior

examples:
    myCd.spinDisc();
    myDvd.spinDisc();
    Output

CD spin rate = 200 - 500 rpm
DVD spin rate = 570 - 1600 rpm

///////////////////////////////////////////////////////////////////////

Bonus Missions:

add classes for vinyl records & floppy disks

if your interface apply to all four classes,
    implement interface into Vinyl & Floppy classes,
        complete appropriate override methods

if your interface does NOT apply to all four classes,
    modify it to do so, at least rename the interface

if your abstract class apply to Vinyl & Floppy disks, extend to new classes
     else, modify or extend a different abstract class?

Wheels & Frisbees are also spinning disks but not used for data storage

does an abstract class or an interface apply to Wheel & Frisbee classes?

discuss & code one such class for fun

*/