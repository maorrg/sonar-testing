package cs.lab;

import java.util.logging.Logger;

public class CSTranslator {

    static final Logger logger = Logger.getLogger(CSTranslator.class.getName());    

    public String translate() {
        logger.info("Traductor CS!");
        return "Door";
    }

    public String translateXYZ(){
        String translation = "Door";
        return translation;
    }
    
}