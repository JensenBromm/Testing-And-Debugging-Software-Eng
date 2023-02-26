public class ConvertService {
    
    private Boolean isValid;
    private int intValue;
    private String hexValue;
    private String binaryValue;

    public ConvertService(String binaryValue) {
        this.binaryValue = binaryValue;
        Validate(binaryValue);
        if (this.isValid) {
            ConvertToInt(binaryValue);
            ConvertToHex(binaryValue);
        }
    }

    public boolean IsValid() {
        return isValid;
    }

    public String BinaryValue() {
        return binaryValue;
    }

    public int IntegerValue() {
        return intValue;
    }

    public String HexadecimalValue() {
        return hexValue;
    }


    /*
     * Validate that the input value is not blank, and less than 16 characters long.
     * Validate that the input value is only 1s and 0s.
     */
    private void Validate (String value) {
        Boolean isValid = true;
    
        if (!is1sAnd0sOnly(value)) {
            isValid = false;
        }

        if (!isProperLength(value)) {
            isValid = false;
        }

        this.isValid = isValid;
    }

    private boolean is1sAnd0sOnly (String str) {
        if (str.matches("^[01]+$")) {
			return true;
		}
		return false;
    }

    private boolean isNullEmptyBlank(String str){
		if (str == null || str.equals("") || str.trim().equals(""))
			return true;
		return false;
	}

    private boolean isProperLength (String str) {
		if (isNullEmptyBlank(str) ||
			str.length() <= 24 ) { //had to change the length checking to 24 to accept 24 bit binary numebrs
			return true;
		}
		
		return false;
    }

    private void ConvertToInt(String value) {
        int iValue = 0;
        for (int i=0; i<value.length(); i++) {
            int multiplier = ((Double)Math.pow(2, value.length() - 1 - i)).intValue();
            if (value.charAt(i) == '1') {
                iValue += multiplier;
            } 
        }
        this.intValue = iValue;
    }

    private void ConvertToHex(String value) {
        String hexValue = "";

        //Fill the left size of the value with 0's so the length is a multiple of four.
        int leftover = value.length() % 4;
        if (leftover != 0) {
            for (int i=0; i< (4-leftover); i++) {
                value = "0" + value;
            }
        }

        for (int i=0; i < value.length() / 4; i++) {
            //a nibble is 4 bits
            String nibble = value.substring(i*4, (i*4)+4);
            if (nibble.equals("0000")) {
                hexValue = hexValue + "0";
            } else if (nibble.equals("0001")) {
                hexValue = hexValue + "1";
            } else if (nibble.equals("0010")) {
                hexValue = hexValue + "2";
            } else if (nibble.equals("0011")) {
                hexValue = hexValue + "3";
            } else if (nibble.equals("0100")) {
                hexValue = hexValue + "4";
            } else if (nibble.equals("0101")) {
                hexValue = hexValue + "5";
            } else if (nibble.equals("0110")) {
                hexValue = hexValue + "6";
            } else if (nibble.equals("0111")) {
                hexValue = hexValue + "7";
            } else if (nibble.equals("1000")) {
                hexValue = hexValue + "8";
            } else if (nibble.equals("1001")) {
                hexValue = hexValue + "9";
            } else if (nibble.equals("1010")) {
                hexValue = hexValue + "A";
            } else if (nibble.equals("1011")) {
                hexValue = hexValue + "B";
            } else if (nibble.equals("1100")) {
                hexValue = hexValue + "C";
            } else if (nibble.equals("1101")) {
                hexValue = hexValue + "D";
            } else if (nibble.equals("1110")) {
                hexValue = hexValue + "E";
            } else if (nibble.equals("1111")) {
                hexValue = hexValue + "F";
            } 
        }

        this.hexValue = hexValue;

    }

}
