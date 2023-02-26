import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertServiceTest {
 
    

    @Test 
    public void ConvertService_SuccessTest() {
        String val = "1010";
        ConvertService bs = new ConvertService(val);

        assertEquals(true, bs.IsValid());
        assertEquals(val, bs.BinaryValue());
        assertEquals(10, bs.IntegerValue());
        assertEquals("A", bs.HexadecimalValue());

    }
    
    @Test 
    public void ConvertService_Success_Short_0() {
        String val = "0";
        ConvertService bs = new ConvertService(val);

        assertEquals(true, bs.IsValid());
        assertEquals(val, bs.BinaryValue());
        assertEquals(0, bs.IntegerValue());
        assertEquals("0", bs.HexadecimalValue());
    }

    @Test 
    public void ConvertService_Success_32Bits_AllHexValues1() {
        //Test all the values from 0 to 7
        String val = "00000001001000110100010101100111";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(19088743, bs.IntegerValue());
        assertEquals("01234567", bs.HexadecimalValue());
    }

    @Test 
    public void ConvertService_Success_32Bits_AllHexValues2() {
        //Test all the values from 8 to 15
        String val = "10001001101010111100110111101111";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(2309737967L, bs.IntegerValue());
        assertEquals("89ABCDEF", bs.HexadecimalValue());
    }

    //Assignment Solution

    //testing the validate
    @Test
    public void ConvertService_Validate_SmallFail() //Test negative number
    {
        ConvertService bs=new ConvertService(-12l); //negative number should fail validate

        assertEquals(false, bs.IsValid());
    }

    @Test
    public void ConvertService_Validate_BigFail(){
        ConvertService bs=new ConvertService(4294967296L); //number is too big should fail validate

        assertEquals(false, bs.IsValid());
    }

    @Test
    public void ConvertService_Validate_NearBounds(){
        ConvertService bs=new ConvertService(4294967294L); //number is close to bounds but should still work

        assertEquals(true, bs.IsValid());
    }

    @Test
    public void ConvertService_Validate_AverageNumber(){
        ConvertService bs=new ConvertService(28L); //number is too long

        assertEquals(true, bs.IsValid());
    }

    //Testing the convert to binary method
    @Test
    public void ConvertService_toBinary_NormalNumber()
    {
        ConvertService bs=new ConvertService(12l);

        assertEquals(true, bs.IsValid());
        assertEquals("1100", bs.BinaryValue());
    }

    @Test
    public void ConvertService_toBinary_NormalNumber2()
    {
        ConvertService bs=new ConvertService(250l);

        assertEquals(true, bs.IsValid());
        assertEquals("11111010", bs.BinaryValue());
    }
    @Test
    public void ConvertService_toBinary_LargeNum() //Test a large number
    {
        ConvertService bs=new ConvertService(5820753l);

        assertEquals(true, bs.IsValid());
        assertEquals("10110001101000101010001", bs.BinaryValue());
    }

    @Test
    public void ConvertService_toBinary_0()
    {
        ConvertService bs=new ConvertService(0l);

        assertEquals(true, bs.IsValid());
        assertEquals("0", bs.BinaryValue());
    }

    @Test
    public void ConvertService_toBinary_1()
    {
        ConvertService bs=new ConvertService(1l);

        assertEquals(true, bs.IsValid());
        assertEquals("1", bs.BinaryValue());
    }

    @Test
    public void ConvertService_toBinary_Leading0s() //Test a number with leading 0's
    {
        ConvertService bs=new ConvertService(00002l);

        assertEquals(true, bs.IsValid());
        assertEquals("10", bs.BinaryValue());
    }

}
