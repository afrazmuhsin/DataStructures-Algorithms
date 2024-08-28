package org.example;

/**
 * This method is to validate password .
 */
public class PasswordValidator {
    public boolean isPasswordValid(String str){
        boolean isCapital = false , isSmall = false , isDigit = false , isSpecialChar = false;

        for (Character each: str.toCharArray()) {
            int ascii = each;
            if(((ascii >= 33) && (ascii <= 47)) || ((ascii >= 58) && (ascii <= 64))) {isSpecialChar = true;}
            if ((ascii >= 97) && (ascii <= 122)) {isSmall = true;}
            if ((ascii >= 65) && (ascii <= 90)) {isCapital = true;}
            if((ascii>=48) && (ascii<=57)) {isDigit = true;}
        }
        return isDigit && isCapital && isSmall && isSpecialChar;
    }

}
