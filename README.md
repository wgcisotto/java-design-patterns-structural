 Design Patterns Structural
-

#### Adapter
Is a great pattern for connecting new code to a legacy code 
without having to change the working contract

* Plug Adaptor
* Convert interface into another interface
* Translate requests from the client to the code we're adapting to

#### Bridge
* Decouple Abstraction and implementation
* Changes in Abstraction won't affect client
* Design for uncertainty 
* More than composition

#### Composite
* Components represent part or whole structure
* Compose objects into tree structure

#### Decorator
* Inheritance based
* Utilizes composition and inheritance (is-a, has-a)
* Alternative to subclassing

#### Facade
* Make an API easier to use
* Reduce dependencies on outside the code
* Simplify the interface or client usage

#### Flyweight
* More efficient use of memory 
* Large number of similar objects 
* Immutable Ex: String
* Pattern of pattern, utilizes a Factory 
* Encompasses Creation and Structure

#### Proxy
* Interface by wrapping 
* Proxy called to access real object 
* Can add functionality
