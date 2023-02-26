import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryServiceTest {
 
    

    @Test 
    public void BinaryService_SuccessTest() {
        String ten = "1010";
        BinaryService bs = new BinaryService(ten);

        assertEquals(true, bs.IsValid());
        assertEquals(10, bs.IntegerValue());
    }
    
    @Test 
    public void BinaryService_Success_Short_0() {
        String val = "0";
        BinaryService bs = new BinaryService(val);

        assertEquals(true, bs.IsValid());
        assertEquals(0, bs.IntegerValue());
    }

    @Test 
    public void BinaryService_Success_Short_1() {
        String val = "1";
        BinaryService bs = new BinaryService(val);

        assertEquals(true, bs.IsValid());
        assertEquals(1, bs.IntegerValue());
    }

    
    @Test 
    public void BinaryService_Fail_Number_1() {
        String val = "1a";
        BinaryService bs = new BinaryService(val);

        assertEquals(false, bs.IsValid());
    }

/* 
    @Test 
    public void is1sAnd0sOnly_Successful_Number_1() {
        String val = "1";
        BinaryService bs = new BinaryService(val);

        boolean result = bs.is1sAnd0sOnly(val);

        assertEquals(true,result);
    }
*/

}
