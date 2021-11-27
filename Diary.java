import java.io.*;
import java.util.Scanner;

class Diary
{
    String f_n = "";
    PrintWriter f;
    ResourceProvider rp = new ResourceProvider();
    Diary(String fl_name)
    {
        f_n = fl_name;
        try
        {
            f = new PrintWriter(new BufferedWriter(new FileWriter(rp.getRepository()+f_n)),true);
        }
        catch(Exception e){
            System.err.println("Shit happens!! \n This is the shit  : "+e+"\n repository: "+rp.getRepository()+"\nflname:"+f_n);
        }
    }

    public void WriteNew(String wrt)
    {
        String temp ="";
        for(int i=0;i<wrt.length();i++)
        {
            temp+=incrypter(wrt.charAt(i));
        }
        try
        {
            f.println(temp);
        }
        catch(Exception e){
            System.err.println("the line was not written! : "+e);
        }
    }

    public  void closeUp()
    {
        f.close();
    }

    public char incrypter(char s)
    {
        String srt_consonents = "abcdefghijklmnopqrstuvwxyz";
        if(srt_consonents.indexOf(s)!=-1)
        {
            return srt_consonents.charAt(srt_consonents.length()-1-srt_consonents.indexOf(s));
        }
        else{
            return s;
        }
    }
}