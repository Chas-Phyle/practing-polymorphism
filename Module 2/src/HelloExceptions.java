import java.io.FileNotFoundException;
import java.io.FileReader;

public class HelloExceptions {

    public static void main(String[] args){
       
        try {
            foo();
        } catch (CustomerRecordsMissingException crme) {
            // TODO Auto-generated catch block
            System.out.println(crme.getMessage());
        }


      
       // ArithmeticException ae = new ArithmeticException(" Horrible problem!");
        // throw  new ArithmeticException(" Horrible problem!");







    }

    private static void foo() throws CustomerRecordsMissingException {
        // if (10 > 5) {
        //     throw new CustomerRecordsMissingException("I'm in foo with an important message");
        // }
        try {
            foo2();
        } catch (FileNotFoundException e) {
            System.out.println("Lots of bugs shame shame");
            // e.printStackTrace();
        }
        System.out.println("I'm in foo");
    }

    private static void foo2() throws FileNotFoundException{
       
       


        try {
        int e = 45; 
        int a = 10;
        int b = 0;  
        double test = a/b;
        } catch (ArithmeticException ae ) {
            System.out.println("I'm dealing with a problem!");
        }catch (Exception ae){
            System.out.println("Another problem really??");
        } finally{
            System.out.println("Going up the stack");
        }
       FileReader fileReader = new FileReader("Bob");
        System.out.println("I'm in foo2");
    }
    
}
