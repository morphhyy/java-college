## _Java is an object programming language_

The core concepty of OOP is to break complex problems into smaller objects.


## _Java Class_
_A class is a blueprint for the object._ 

#### Syntax:
```java
class ClassName {
    // fields
    // method
}
```

Here, `fields` (variables) and methods represent the state and behavior of the object respectively.
- fields are used to store data
- methods are used to perform some operations


### _Example_:
```java

Class Dog {
    
    //field
    public int foot = 4;

    //method
    public void bark(){
        System.out.println("Bark");
    }
}
```

Here we have a class name `Dog`. It contains of field name `foot` and a method `bark`. We can create any number of object using the Class.



## _Java Objects_
_It is an instance of a class_
```java

Dog bulldog = new Dog();

Dog poddle = new Dog();

Dog Husky = new Dog();
```
- Here we have created 3 types of Dog using className `Dog`
- All can access field and method inside the class.

## _Access Modifier_
- `Default`

    ### declarations are visible only within the package (package private)

- `Private`

    ### declarations are visible within the class only

- `Protected`
    ### declarations are visible within the package or all subclasses

- `Public`
    ### declarations are visible everywhere
