Lab 2

Purpose: 

Learn and prove your skills in Unit Testing

Steps: 

In this lab, you will learn to use the unit testing tools and create a set of unit tests to test the ConvertToHex(string) method.

Using the Unit Testing Tools

1. First, open ConvertServiceTest.java and look at the tests that are provided.  Make note of the three steps in the unit tests.  The first testis labelled in this Lab, but you do not need to label these.  It is only labelled here for academic purposes.  Make a quick note of the three steps in the second unit test.

2. Now, on the left side bar, click the conical flask to open the Testing panel.  

3. Expand each of the labels, and highlight over the first test.  There are three buttons that appear.  The first two options run the test without debugging and run the test with debugging.  The third button opens the test.  Notice that you can run a test with debugging turned on.  This is often helpful to determine why a test is not working.  

4. Set a breakpoint in the test, then run the test with debugging.

5. Also, you can run more than one test at at time.  In the Testing panel, highlight over Lab2.  The test structure is hierarcial, so you can run all the tests in the program, all the tests in a certain file, or just a single test.  Run all the tests without debugging.

6. Finally, in the second test, add an assert that will cause the unit test to fail.  There are several ways to do this.  One option is to add assertEquals(true, false);

7. Next, open the ConvertServiceTest.java file so you can see the test.  In the testing panel, Run the test without debugging.  Notice a popover opens that tells you the test failed, the expected value, and the actual value.

8. Open this README.md file.  In the testing panel, run the test without debugging.  Notice the popover does not open.

9. Now you can finally write the unit tests.  


Writing Unit Tests

The first part of the ConvertToHex code will fill the value with leading zeros so the length of value is a multiple of four.  For example, if value is "10", it will update the value to be "0010".

The second part of the ConvertToHex code will step through four characters at a time and map the binary value to the hexadecimal value using if then else statements.

Write a set of unit tests that provides full coverage of the ConvertToHex(string) method.  Remember, full code coverage means that your tests need to run through each line of the code.  Think, is there there a way to test the binary-to-hex mapping without writing a single test for each case?  (The answer is yes)
