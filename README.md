
# Java Reflection
In Java, reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.

There is a class in Java named Class that keeps all the information about objects and classes at runtime. The object of Class can be used to perform reflection.


## Reflection of Java Classes
In order to reflect a Java class, we first need to create an object of Class.

And, using the object we can call various methods to get information about methods, fields, and constructors present in a class.

There exists three ways to create objects of Class:

``1. Using forName() method``
```java
class Dog {...}
Class a = Class.forName("Dog");
```
Here, the forName() method takes the name of the class to be reflected as its argument.

``2. Using getClass() method``
```java
Dog d1 = new Dog();

Class b = d1.getClass();
```
Here, we are using the object of the Dog class to create an object of ``Class``.

``3. Using .class extension``
```java
Class c = Dog.class;
```
Now that we know how we can create objects of the Class. We can use this object to get information about the corresponding class at runtime.

## Advantages of using Java Reflection

```
a) Java Reflection allows an application to use user-defined and external classes by creating instances of extensible objects using their fully-qualified names.

b) Debuggers make use of the property of reflection to detect the private members of a class. 
```

## Disadvantages of using Java Reflection

```
a) The performance of operations of Reflection is slower than the non-reflective operations.

b) Reflective code violates the concept of abstraction and therefore there may be a change in the behavior with upgrades of the platform.
```

