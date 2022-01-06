## _Try, catch, throw and throws in Java_
An exception is an “unwanted or unexpected event”, which occurs during the execution of the program i.e, at run-time, that disrupts the normal flow of the program’s instructions. When an exception occurs, execution of the program gets terminated.

## _try_
The `try` block contains set of statements where an exception can occur.
```java
try{
    // statement that might cause exception
}
```

## _catch_ 
`catch` block is used to handle the uncertain condition of try block. A try block is always followed by a catch block, which handles the exception that occurs in associated try block.

## _throw_ 
Throw keyword is used to transfer control from try block to catch block.

## _throws_ 
Throws keyword is used for exception handling without try & catch block. It specifies the exceptions that a method can throw to the caller and does not handle itself.

## _finally_
 It is executed after catch block. We basically use it to put some common code when there are multiple catch blocks.