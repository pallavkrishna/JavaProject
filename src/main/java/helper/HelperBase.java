package helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HelperBase {
    public String configPath=null;
    public Properties prop=null;
    {
        setConfigPath();
    }
    public void setConfigPath (){
        configPath=System.getProperty("user.dir")+"\\src\\main\\resources\\";
        prop=new Properties();
        try {
            prop.load(new FileInputStream(configPath+"config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   public void getStatusCode(){

   }

}
