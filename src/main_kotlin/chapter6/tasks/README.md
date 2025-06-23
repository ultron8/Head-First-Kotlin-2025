# Serious Polymorphism
### abstract classes and interfaces

- superclass inheritance hierarchy
- abstract classes
- interfaces
- how to use abstract classes to control which classes in your hierarchy can and cant be instantiated
- force concrete subclasses to provide their own implementations
- how to use interfaces to share behavior between independent classes
- 'is', 'as' and 'when'

### some bullet points
- abstract classes cannot be instantiated
- any class that contains abstract properties and functions must be declared abstract
- !abstract = concrete (non-abstract)
- implementing abstract properties and functions by overriding them
- all abstract properties and functions must be overridden in any concrete subclasses
- interfaces lets you define common behavior outside a superclass hierarchy so independent classes can still benfit from polymorphism
- interfaces can have abstract or non-abstract functions
- interfaces properties can be abstract, or they can have getters and setters. They can't be initialized, and they don't have access to a backing field
- a class can implement multiple interfaces
- if a sublcass inherits from superclass (or implements an interface) named A, you can use the code:
  super<A>.myFunction -> to call the implementation of myFunction that's defined in A
  super<B>.myFunction -> to call the implementation of myFunction that's defined in B
- 'is' / 'as' operator:
  - the is operator helps to recognize whether an object has the preferred type
  - the is operator performs a smart cast
  - the as operator performs a explicit cast
- when expression lets you compare a variable against an exhaustive set of different options