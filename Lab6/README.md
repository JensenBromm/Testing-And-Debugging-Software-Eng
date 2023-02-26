Lab 6

Purpose: 
Use your unit testing and debugging skills to figure out if this code is working.

Steps:

In this lab, the ConvertService is updated to include a constructor to allow an integer value to be passed in.  When this occurs, the value is then converted into binary string and the binary string is used to convert the hexadecimal value.

1. Look at the new constructor and follow the logic.  Does it make sense?
   Verify the new Validate method is correct.
   Verify the order of the logic is correct.  First it will call ConvertToBinary, then it will call ConvertToHex, is this correct?

2. Look at the new ConvertToBinary code.  Does it look correct?  See if you can spot any issues.  If you do see any, do not fix them yet, but make note of them.

3. Create some unit tests for this new constructor to evaluate if the code is working or not.

4. Fix all of the issues.  Note: The base code I have provided must be used.  You may not find a "binary converter" on the internet and paste it into the ConvertToBinary method. 

5. Rename the Lab6 directory to Lab6-LastName-FirstName, then Zip the directory.  Submit the zip file to Folio.  (For example, the directory should be Lab6-Florin-Ryan).  If you work with someone else to complete this Lab, provide a note when submitted.  Only 1 person needs to submit.


How will this be graded?

This will be graded by checking over your test cases for coverage of the the ConvertService(long) constructor.  Specifically, the test cases must coverage the lines in Validate(long) and ConvertToBinary(long).  You do not need to provide test cases that cover the other methods.

Additionally, I will run your code against my own unit tests to verify the ConvertToBinary is working properly.
