package com.chap03.parameter;

/**
 * Created by Ashutosh on 13-01-2017.
 */
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class OptionalTest {
    @Parameters({"optional-value"})
    @Test
    public void optionTest(@Optional("optional value")
                           String value){
        System.out.println("This is: "+value);
    }
}