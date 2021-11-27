import java.util.Scanner;
import java.io.*;
/**
 * 
 * This class does nothing much but just has functions to make sure that things are in right place. and provide resources like name, etc.
 */
public class ResourceProvider
{
    public static String getAdminName()throws Exception
    {
        String name = "";
        BufferedReader sc = new BufferedReader(new FileReader("D:\\SophieFiles\\.impfls\\about.txt"));
        name = sc.readLine();
        return name;
    }
    public String getRepository()
    {
        return "D:\\SophieFiles\\Diary\\";
    }
}
