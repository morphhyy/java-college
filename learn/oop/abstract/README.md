## _Java Abstract Class_
The abstract class in Java can't be instantiated. We can't create create object of that class. We use `abstract` keyword to declare an abstract class.

```java
abstract class className {
    /// body
}
//throws error when trying to create object
className obj = new ClassName();
```

## _Abstract Method_
A method that doesn't have it's body is known as abstract method.
```java
abstract void get();
/// this is it
```

- Though abstract classes cannot be instantiated, we can create subclasses from it. We can then access members of the abstract class using the object of the subclass.

- If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method.