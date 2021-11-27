    import java.io.*;
    /**
     * This class helps Sophie to speak through VBS script
     *
     * @author Ayush Tripathi
     * @version 1.0.0
     */
public class Speak
{
    static String _$1 = "Dim speaks, speech",
    _$2 = "speaks = ",
    _$3 = "Set speech = CreateObject(\"sapi.spvoice\")",
    _$4 = "speech.Speak speaks";
    public boolean Say(String sayThis)
    {
        try
        {
            PrintWriter pw;        
            pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Ayush\\Desktop\\Spk.vbs")));
            pw.println(_$1);
            pw.println(_$2+"\""+sayThis+"\"");
            pw.println(_$3);
            pw.println(_$4);
            pw.close();
            //since we have now written on vbs script we can now run the script.
            Runtime r = Runtime.getRuntime();
            String[] s={"C:\\Windows\\System32\\wscript.exe","C:\\Users\\Ayush\\Desktop\\spk.vbs"};
            r.exec(s);
            return true;
        }
        catch(Exception err)
        {
            System.err.println(err);
            return false;
        }
    }
    public static boolean makeNewNote(String stringtowrite, String filename)
    {
        try
        {
            PrintWriter pw;        
            pw = new PrintWriter(new BufferedWriter(new FileWriter("D:\\SophieFiles"+filename+".vbs")));
            pw.println(_$1);
            pw.println(_$2+"\""+stringtowrite+"\"");
            pw.println(_$3);
            pw.println(_$4);
            pw.close();
            return true;
        }
        catch(Exception err)
        {
            System.err.println(err);
            return false;
        }
    }
}