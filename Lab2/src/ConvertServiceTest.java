import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertServiceTest {
 
    

    @Test 
    public void ConvertService_SuccessTest() {
        //Arrage - Prepare the data for the test
        String val = "1010";

        //Act - Run the test
        ConvertService bs = new ConvertService(val);

        //Assert - Verify the results
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

        //assertEquals(true, false); //supposed to fail

    }

    @Test
    public void ConvertService_Test_0_3(){ //THis test binary- hex conversion between 0-3
       String s="0000000100100011";
       ConvertService bs = new ConvertService(s);

       assertEquals(true, bs.IsValid());
       assertEquals(s, bs.BinaryValue());
       assertEquals(291, bs.IntegerValue());
       assertEquals("0123", bs.HexadecimalValue());
    }

    @Test
    public void ConvertService_Test_4_7(){ //This test binary- hex conversion between 4-7
        String s="0100010101100111";
        ConvertService bs = new ConvertService(s);
 
        assertEquals(true, bs.IsValid());
        assertEquals(s, bs.BinaryValue());
        assertEquals(17767, bs.IntegerValue());
        assertEquals("4567", bs.HexadecimalValue());
     }


}
