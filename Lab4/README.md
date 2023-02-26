Lab 4

Purpose: 
Prove your debugging skills by figuring out why the Unit Test is failing


Steps:

In Lab 3, you updated the validation to allow for 24 bit numbers.  In this lab, you will make the same edits but to allow for 32 bits.  This will be a little more difficult to fix.

1. Run the tests, and notice the final two do not pass.

2. Make the same change as in Lab 3 to allow a string of length 32.

3. Rerun the tests and verify they all pass.  Great!  All done, right?

4. Notice in the last test, ConvertService_Success_32Bits_AllHexValues2, the assert for the integer value is missing.  Put a breakpoint in this test, then verify what the value of bs.IntegerValue() is.  Why is it this value?

5. Debug the issue.  Why is this happening?

6. Attempt to fix this bug.