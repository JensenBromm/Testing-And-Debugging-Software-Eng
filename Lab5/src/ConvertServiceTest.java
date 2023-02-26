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
    public void ConvertService_Success_Short_1() {
        String val = "1";
        ConvertService bs = new ConvertService(val);

        assertEquals(true, bs.IsValid());
        assertEquals(val, bs.BinaryValue());
        assertEquals(1, bs.IntegerValue());
        assertEquals("1", bs.HexadecimalValue());
    }

    
    @Test 
    public void ConvertService_Fail_Number_1() {
        String val = "1a";
        ConvertService bs = new ConvertService(val);
        assertEquals(false, bs.IsValid());
    }

    @Test 
    public void ConvertService_Success_2() {
        String val = "0010";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(2, bs.IntegerValue());
        assertEquals("2", bs.HexadecimalValue());
    }

    @Test 
    public void ConvertService_Success_3() {
        String val = "0011";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(3, bs.IntegerValue());
        assertEquals("3", bs.HexadecimalValue());
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


}
