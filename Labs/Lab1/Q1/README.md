## Types of Constructor

-   ### No-Arg Constructor

    If a constructor does not accept any parameters, it is known as a no-argument constructor.

    ```java
    private Constructor(){
        // body
    }

    ```

-   ### Parameterized Constructor

    Constructor having one or more parameters.

    ```java
    private Constructor(String name, String dob){
        // body
    }

    ```

-   ### Java Default Constructor

    If we do not create any constructor, the Java compiler automatically create a no-arg constructor during the execution of the program. This constructor is called default constructor.

    | Type      | Default Value  |
    | --------- | -------------- |
    | `boolean` | false          |
    | `byte`    | 0              |
    | `short`   | 0              |
    | `int`     | 0              |
    | `long`    | 0L             |
    | `char`    | \u0000         |
    | `float`   | 0.0f           |
    | `double`  | 0.0d           |
    | `object`  | Reference null |
