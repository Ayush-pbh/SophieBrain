import java.io.File;
class Test{
    public static void main(){
        for(;;){
            System.out.println("|");
            stp();
            System.out.println("/");
            stp();
            System.out.println("--");
            stp();
            System.out.println("\\");
            stp();
            System.out.println("|");
            stp();
            
        }
          }
    static void stp(){
        try{Thread.sleep(70);}
            catch(Exception e){}
        System.out.println("\f");
    }
    }

    