## WITHOUT PACKAGE
### This code is to compile the test class

javac -cp "junit-4.8.1.jar; hamcrest-2.2.jar;." CalculatorTesting.java

### This code is to run the test

java -cp "junit-4.8.1.jar; hamcrest-2.2.jar;." org.junit.runner.JUnitCore CalculatorTesting


## WITH A PACKAGE
### This code is to compile the test class

javac -d . -cp "junit-4.8.1.jar; hamcrest-2.2.jar;." CalculatorTesting.java

### This code is to run the test

java -cp "junit-4.8.1.jar; hamcrest-2.2.jar;." org.junit.runner.JUnitCore packageName.CalculatorTesting



### The below piece of code may not be neccessary but I have removed this path from my system env variables for the above code to work

C:\Program Files (x86)\Common Files\Oracle\Java\javapath
