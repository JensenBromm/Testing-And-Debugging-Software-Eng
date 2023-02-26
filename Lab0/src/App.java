

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
  
        
        BinaryService binaryService = new BinaryService("10000000");
    
        System.out.println(binaryService.IsValid());
        System.out.println(binaryService.IntegerValue());


       System.out.println(TimeService.getTime());
       TimeService.incrementTime();
       System.out.println(TimeService.getTime());
    
        
        System.out.println("---Factorial---");

        System.out.println(factorial(3));
    

    
    }



    public static int factorial(int x) {
        if (x == 0) {               
            System.out.println("base case");
            return 1;
        }
        System.out.println("RS - " + x);
        
        return x*factorial(x-1); 
    }



}
