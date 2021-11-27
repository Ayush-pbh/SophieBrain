import java.util.*;
import javax.swing.JOptionPane;
/**
 * this class sorts the inputs and processes them hence this class is the main brain of sophie!
 *
 * @author Ayush Tripathi
 * @version 1
 */
public class Sorter
{
    Scanner in = new Scanner(System.in);
    Salutations sal = new Salutations();
    Random r = new Random();
    ResourceProvider get = new ResourceProvider();
    static Speak spk = new Speak();
    String input="";
    Date dt =new Date();
    Diary d = new Diary("dd"+Math.random()+".txt");
    public void run()throws Exception
    {
        plnspk(sal.greetings[r.nextInt(sal.greetings.length)]+get.getAdminName()+", "+sal.wht2do[r.nextInt(sal.wht2do.length)]);
        while(true)
        {   
            input = in.nextLine().trim();
            if(input.equalsIgnoreCase("exit")||input.equalsIgnoreCase(":!"))
            {
                System.exit(0);
            }
            if(input.equalsIgnoreCase("Date")||input.equalsIgnoreCase("time"))
            {
                plnspk("its "+dt);
            }
            else if(input.equalsIgnoreCase(":d")||input.equalsIgnoreCase("diary"))
            {
                plnspk("Start Writing.");
                while(true)
                {
                    input = in.nextLine().trim();
                    d.WriteNew(input);
                    if(input.equalsIgnoreCase("!d")||input.equalsIgnoreCase("!diary"))
                        break;
                }
                d.closeUp();
            }
            else if(input.toLowerCase().startsWith("open:")||input.toLowerCase().startsWith("o:")){
                //running things here format open: chrome.exe OR o:chrome.exe
            }
            else
            {
                plnspk("I dont know what you meant by that. Lets Try again!");
                for(int i=0;i<sal.greetings.length;i++)
                {
                    if(input.equalsIgnoreCase(sal.greetings[i].trim().replaceAll(",","")))
                        plnspk(sal.greetings[r.nextInt(sal.greetings.length)]);
                }
            }
        }
    }

    public static void print(String strrr){System.out.print(strrr);}

    public static void println(String strrr){System.out.println(strrr);}

    public static void plnspk(String strrr){System.out.println(strrr);spk.Say(strrr);}

    public static boolean contains(String srt,String org)
    {
        for(int i=0;i<org.length();i++)
        {
            if(org.length()-i>srt.length())
            {
                return false;
            }
            if(org.substring(i,srt.length()+1).equalsIgnoreCase(srt))
            {
                break;
            }
        }
        return true;
    }

    public static boolean contains(String srt,String[] org)
    {
        for(int x=0;x<org.length;x++)
        {
            for(int i=0;i<org.length;i++)
            {
                if(org.length-i>srt.length())
                {
                    return false;
                }
                if(org[x].substring(i,srt.length()+1).equalsIgnoreCase(srt))
                {
                    break;
                }
            }
        }
        return true;
    }
}
