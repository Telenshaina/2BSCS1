import java.util.*;

public class ExceptionNow{

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);while(true){
        try {
            
            
            int num1, num2;
            num1 = 0;
            num2 = 0;
            double result = 0 ;
            System.out.print("Enter Num1: ");
            num1 = input.nextInt();

            System.out.print("Enter Num2: ");
            num2 = input.nextInt();
            
            if (num2 == 0)
                throw new DivZeroException("Zero division is not allowed :<< ");
            result = (float) num1/ num2;

            System.out.println("Result is " + result);
    

        
        }


            catch (InputMismatchException e ){
                    System.out.println("Only integers are allowed for input");
            }
            catch (DivZeroException e ){
                System.out.println(e.getMessage());
            }
            finally{  //lumalabas kung may error duun baliwala na yung 
                //while true mo ,kasi meron ka nang system exit
                input.close();
                System.out.println("Byebye , Program is terminated");
                System.exit(0);
            }
       
    }

}

}