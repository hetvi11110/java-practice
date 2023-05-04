# java

Remember that every Java program has a <b>class name which must match the filename,</b>, and that every program ,<b>must contain the main() method</b>.

<code>System.out.println("Hello World");</code></br>
System is a built-in Java class that contains useful members, such as out, which is short for "output". The println() method, short for "print line", is used to print a value to the screen (or a file).

<code>print()</code> method is similar to <code>println()</code>, the only difference is that it does not insert a new line at the end of the output.

<code>static void myMethod() {
    // code to be executed
  }</code></br>
 <b>static</b> means that the method belongs to the Main class and not an object of the Main class.</br><b>void</b> means that this method does not have a return value 

There is for-each loop</br>
<code>for (type variableName : arrayName) {
  // code block to be executed
}</code>

The <b>constructor</b> name must match the class name, and it cannot have a return type (like void).</br>
Also note that the constructor is called when the object is created.</br>
All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.</br>
Constructors can also take parameters, which is used to initialize attributes.

<b>Method overloading</b>, multiple methods can have the same name with different parameters</br>
Multiple methods can have the same name as long as the number and/or type of parameters are different.
<code>int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
</code>

In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.</br>
To access the inner class, create an object of the outer class, and then create an object of the inner class:
