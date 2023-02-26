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


    //Testing ConvertToHex Paths
    @Test 
    public void ConvertService_Success_1BitMod() {
        //Test the "filling" of value
        String val = "1";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(1, bs.IntegerValue());
        assertEquals("1", bs.HexadecimalValue());
    }
    @Test 
    public void ConvertService_Success_2BitMod() {
        //Test the "filling" of value
        String val = "10";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(2, bs.IntegerValue());
        assertEquals("2", bs.HexadecimalValue());
    }
    @Test 
    public void ConvertService_Success_3BitMod() {
        //Test the "filling" of value
        String val = "100";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(4, bs.IntegerValue());
        assertEquals("4", bs.HexadecimalValue());
    }
    @Test 
    public void ConvertService_Success_4BitMod() {
        //Test the "filling" of value
        String val = "1000";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(8, bs.IntegerValue());
        assertEquals("8", bs.HexadecimalValue());
    }



    @Test 
    public void ConvertService_Success_16Bits_AllHexValues1() {
        //Test all the values from 0 to 3
        String val = "0000000100100011";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(291, bs.IntegerValue());
        assertEquals("0123", bs.HexadecimalValue());
    }

    @Test 
    public void ConvertService_Success_16Bits_AllHexValues2() {
        //Test all the values from 4 to 7
        String val = "0100010101100111";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(17767, bs.IntegerValue());
        assertEquals("4567", bs.HexadecimalValue());
    }

    @Test 
    public void ConvertService_Success_16Bits_AllHexValues3() {
        //Test all the values from 8 to 11
        String val = "1000100110101011";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(35243, bs.IntegerValue());
        assertEquals("89AB", bs.HexadecimalValue());
    }

    
    @Test 
    public void ConvertService_Success_16Bits_AllHexValues4() {
        //Test all the values from 12 to 15
        String val = "1100110111101111";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(52719, bs.IntegerValue());
        assertEquals("CDEF", bs.HexadecimalValue());
    }

 
    @Test 
    public void ConvertService_Success_24Bits_AllHexValues1() {
        //Test all the values from 0 to 5
        String val = "000000010010001101000101";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(74565, bs.IntegerValue());
        assertEquals("012345", bs.HexadecimalValue());
    }


    @Test 
    public void ConvertService_Success_24Bits_AllHexValues2() {
        //Test all the values from 6 to 11
        String val = "011001111000100110101011";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(6785451, bs.IntegerValue());
        assertEquals("6789AB", bs.HexadecimalValue());
    }

    @Test 
    public void ConvertService_Success_24Bits_AllHexValues3() {
        //Test all the values from 12 to 15
        String val = "110011011110111100000000";
        ConvertService bs = new ConvertService(val);
        assertEquals(val, bs.BinaryValue());
        assertEquals(13496064, bs.IntegerValue());
        assertEquals("CDEF00", bs.HexadecimalValue());
    }

}
