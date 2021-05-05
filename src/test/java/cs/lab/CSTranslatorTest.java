package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;
import java.util.logging.Logger;


class CSTranslatorTest {
    static final Logger logger = Logger.getLogger(CSTranslator.class.getName());
    

    @Test
    public void testCase0(){
        CSTranslator csTranslator = new CSTranslator();
        String response = csTranslator.translateXYZ();
        Assert.assertEquals(response, "Door");
    }

    @Test
    public void testCase1(){
        CSTranslator csTranslator = new CSTranslator();
        String response = csTranslator.translate();
        Assert.assertEquals(response, "Door");
    }
};