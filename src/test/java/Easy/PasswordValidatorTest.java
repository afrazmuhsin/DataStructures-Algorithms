package Easy;

import org.example.PasswordValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PasswordValidatorTest {
    PasswordValidator pwd = new PasswordValidator();

    @Test
    void testPwdValidatorTest1(){
        Assert.assertTrue(pwd.isPasswordValid("Affuz@123"));
    }

    @Test
    void testPwdValidatorTest2(){
        Assert.assertFalse(pwd.isPasswordValid("affuz@123"));
    }

    @Test
    void testPwdValidatorTest3(){
        Assert.assertFalse(pwd.isPasswordValid("AFFUZ@123"));
    }

    @Test
    void testPwdValidatorTest4(){
        Assert.assertFalse(pwd.isPasswordValid("AFFUz123"));
    }

    @Test
    void testPwdValidatorTest5(){
        Assert.assertFalse(pwd.isPasswordValid("AFFUz@"));
    }

    @Test
    void testPwdValidatorTest6(){
        Assert.assertFalse(pwd.isPasswordValid("1234@"));
    }

    @Test
    void testPwdValidatorTest7(){
        Assert.assertFalse(pwd.isPasswordValid(""));
    }
}
