class Matrix
{
    public static void main(String[] args)
    {
        String str = "comp";
        for(int i=0;i<=str.length();i++)
        {
            for(int x=0;x<i;x++)
            {
                System.out.print(str.charAt(x));
            }
            System.out.println();
        }
    }
}