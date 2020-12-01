package BaseFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Its like Parent Class
public class BaseClass
{
    //Code fot properties file
    static File file;
    static Properties prop;
    static FileInputStream fip;

    public static void initialization(String[] args)
    {
        file = new File(filepath);
        try
        {
            fip = new FileInputStream(file);
            prop = new Properties();
            prop.load(fip);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException is initialized"+e.getMessage());
        } catch (IOException e)
        {
            System.out.println("IOException is initialized"+e.getMessage());
            e.printStackTrace();
        }
    }

    public static String readProperty(String property)
    {
        return prop.getProperty(property);
    }
}
