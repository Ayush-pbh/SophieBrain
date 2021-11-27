
/**
 *This class gives conectivity to all the classes 
 *
 * @author Ayush Tripathi.
 * @version 1.0.0
 */
public class MainBody
{
    public static void main(String [] args)throws Exception
    {
        StartUp.onStart();
        Sorter s = new Sorter();
        s.run();
    }
}
