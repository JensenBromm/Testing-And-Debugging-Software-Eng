public class BinaryService {
    
    private Boolean isValid;
    private int intValue;

    public BinaryService(String binaryValue) {
        Validate(binaryValue);
        if (this.isValid)
            Convert(binaryValue);
    }

    public Boolean IsValid() {
        return isValid;
    }

    public int IntegerValue() {
        return intValue;
    }



    /*
     * Validate that the input value is not blank, and less than 10 characters long.
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

    private Boolean is1sAnd0sOnly (String str) {
        if (str.matches("^[01]+$")) {
			return true;
		}
		return false;
    }

    private Boolean isNullEmptyBlank(String str){
		if (str == null || str.equals("") || str.trim().equals(""))
			return true;
		return false;
	}

    private Boolean isProperLength (String str) {
		if (isNullEmptyBlank(str) ||
			str.length() <= 10 ) {
			return true;
		}
		
		return false;
    }

    private void Convert (String value) {
        int iValue = 0;
        
        for (int i=0; i<value.length(); i++) {
        
            int multiplier = (int)Math.pow(2, value.length() - i - 1 );
        
            if (value.substring(i,i+1).equals("1")) {
                iValue += multiplier;
            } 
        }

        this.intValue = iValue;
    }

/*
    private void Convert (String value) {
        int iValue = 0;

        
        for (int i=0; i<value.length(); i++) {
        
            int multiplier = (int)Math.pow(2, value.length() - 1 - i);
        
            if (value.charAt(i) == '1') {
                iValue += multiplier;
            } 
        }

        this.intValue = iValue;
    }
    */
}
