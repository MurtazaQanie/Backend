# Exceptions

Java uses exceptions to handle errors and other exceptional events. Exceptions are the conditions that occur at runtime and may cause the termination of the program.

When an exception occurs, Java displays a message that includes the name of the exception, the line of the program where the exception occurred, and a stack trace. The stack trace includes:

* The method that was running
* The method that invoked it
* The method that invoked that one
and so on…

Make sure to examine it.

In the main method we are trying to access the element at the 5th index (the last element in numbers).

Run the code and you will see that we are getting an ArrayIndexOutOfBoundsException error.

Source: codeacademy.com
