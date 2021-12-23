## _An Array is a collection of similar data type._

### Syntax: 
```
datatype[] arrayName
```

- `dataType` - it can be primitive data types  `int`, `char`, `double`, `byte`, etc.
- `arrayName` - it is an identifier.


---
<br>

To define the number of elements an array can hold, we  have to allocate memory.
```java
String[] num = new String[10]
```
- Here 10 defines, we can store 10 elements in it.
- Also indicates the size and length of an array.

---

## Initialize Arrays in Java
```java
int num[] = {2,7,1,9,7}
```

- Note that we have not provided the size of the array. In this case, the Java compiler automatically specifies the size by counting the number of elements in the array.

```java
//declare
int num[] = new int[5]

//initialize
num[0] = 2;
num[1] = 7;
num[2] = 1;
num[3] = 9;
num[4] = 7;
```

- We can access the element of an array using the index number. 

    `array[index]`