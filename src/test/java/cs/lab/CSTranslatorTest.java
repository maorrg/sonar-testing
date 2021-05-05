package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;


class CSTranslatorTest {
    static final Logger logger = Logger.getLogger(CSTranslator.class.getName());
    

    @Test
    public void testCase0(){
        CSTranslator csTranslator = new CSTranslator();
        String response = csTranslator.translateXYZ();
        Assert.assertEquals(response, "Door");
    }
};