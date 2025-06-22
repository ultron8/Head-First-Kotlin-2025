# 5. Using Your Inheritance

- advantages of inheritance
- how to create subclasses
- how to inherit the properties and functions of a superclass
- how to override functions and properties to make classes behave the way you want
- how inheritance helps you avoid duplicate code
- how to improve flexibility with polymorphism

### some bullet points
- superclass contains common properties and functions that are inherited by one or more subclasses.
- subclass can include extra properties and functions that aren't in the superclass. And override things it inherits.
- 'open' before superclass and 'open' before properties and functions which you want to override
- when overriding a function, its parameter list must stay the same & return type must be compatible with that of the superclass
- overridden functions and properties stay open until they declared with 'final'
- polymorphism -> "many forms": allows different subclasses to have different implementations of the same function