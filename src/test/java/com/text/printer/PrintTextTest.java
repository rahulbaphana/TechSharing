package com.text.printer;

import com.text.printer.PrintText;
import org.junit.Assert;
import org.junit.Test;

public class PrintTextTest {
    @Test
    public void shouldPrintText(){
        PrintText printText = new PrintText("Hello Groovy!!");

        Assert.assertEquals("Hello Groovy!!", printText.getTextToPrint());
    }
}
