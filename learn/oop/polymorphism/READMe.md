## _Java Polymorphishm_

_Polymorphism is an important concept of object-oriented programming, which simply means more than one form._


### _Method Overriding_
During inheritance in Java, if the same method is present in both the superclass and the subclass. Then, the method in the subclass overrides the same method in the superclass. This is called method overriding.

Method overriding is a run-time polymorphism.

### _Method Overloading_
We can create methods with the same name if they differ in parameters. 
```java
void function(){}
void function(int a){}
void function(String a){}
float function(int a, int b){}
```
Here, the same method will perform different operations based on the parameter.