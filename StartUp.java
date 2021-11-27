    import java.io.*;
    import javax.swing.JOptionPane;
    /**
     * This Class has a onStart() function which only executes ones! when the ware runs for the first time
     *
     * @author (your name)
     * @version (a version number or a date) 
     */
    public class StartUp
    {
        public static void onStart()
        {
            File ch_fl = new File("\\SophieFiles\\.$i.txt");
            if(!ch_fl.exists())
            {
                File fl = new File("\\SophieFiles\\");
                fl.mkdir();
                File fl2 = new File("\\SophieFiles\\.impfls");
                fl2.mkdir();
                File fl3 = new File("\\SophieFiles\\Diary");
                fl3.mkdir();
                try
                {
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("\\SophieFiles\\.$i.txt")));
                pw.print("don't delete this file!");
                pw.close();
                pw = new PrintWriter(new BufferedWriter(new FileWriter("\\SophieFiles\\.impfls\\about.txt")));
                String name = JOptionPane.showInputDialog("What should I call you?");
                pw.print(name.trim());
                pw.close();
            }
            catch(Exception err)
            {
                JOptionPane.showMessageDialog(null,"Some Error occuerd in making _impp.txt file delete the file and try again! Hell");
                System.exit(0);
            }
        }
    }
    public static boolean resetSystem()
    {
        File fl = new File("\\SophieFiles\\.impfls\\");
        String[] fls = fl.list();
        for(int i=0;i<fls.length;i++)
        {
            new File("\\SophieFiles\\.impfls\\"+fls[i]).delete();
        }
        fl = new File("\\SophieFiles\\");
        fls = fl.list();
        for(int i=0;i<fls.length;i++)
        {
            new File("\\SophieFiles\\"+fls[i]).delete();
        }
        new File("\\SophieFiles\\").delete();        
        return true;
    }
}
