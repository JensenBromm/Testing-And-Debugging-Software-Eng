Lab 3

Purpose: 
Prove your debugging skills by figuring out why the Unit Test is failing


Steps:

1. First look at the tests.  Do they provide full code coverage?

2. Run the tests in ConvertServiceTest.  Notice that they are all working properly.

3. The method is tested for 16 bit values; however, we would like the code to work for 24 bit values.

Notice there are 3 tests at the bottom that are commented out: ConvertService_Success_24Bits_AllHexValues1, ConvertService_Success_24Bits_AllHexValues2, and  
ConvertService_Success_24Bits_AllHexValues3.

Uncomment these run the unit tests.  Why are they not failing?

4. Debug the code to determine why this is happening.

5. Attempt to fix the code.