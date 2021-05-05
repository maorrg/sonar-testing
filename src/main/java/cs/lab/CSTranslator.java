package cs.lab;

import java.util.logging.Logger;

public class CSTranslator {

    static final Logger logger = Logger.getLogger(CSTranslator.class.getName());    

    public void translate(String toBeTranslated) {
        logger.info("Traductor CS!");
    }

    public String translateXYZ(){
        String translation = "Door";
        return translation;
    }
    
}