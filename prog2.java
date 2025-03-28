import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
    
            /*int s1 = 150;
            int s2=120;
            int s3=170;
        
            if(s1<s2)
            {
                System.out.println("s1 is tall");
            }
            else{
                System.out.println("s2 is tall");
            }*/

            // Scanner a = new Scanner(System.in);
        //     System.out.print("enter the number : ");
        //     int b = a.nextInt();
        //     if(b >0){
            

        //     if ((b % 5 ==0) && (b%3==0)){
        //         System.out.println(" Given value is multiple  of both");
        //     }
        //     else if(b%3==0){
        //         System.out.println(" Given value is divisible by 3");
        //     }
        //     else if(b % 5 ==0){
        //         System.out.println(" Given value is multiple of 5");
        //     }
        // }
        
            
        //     else{
        //         System.out.println("given number is invalid");
            
        // }
           
        // int n = a.nextInt();
        // int m = a.nextInt();

        // for (int i=1;i<=7;i++){
        //     System.out.println(i*i*i);
        // int index =2;

        // for(int i=2; i<=4; i++)
        // {
        //     System.out.println(i*index);
            
        // }
        // int n=10;

        // for(int i=0; i<=n;i++){
        //     if(i%1==0)
        //     {
        //     if(i % 2 ==0){
        //         System.out.println(i);
        //     }
        //     {}
        //     else{
        //         System.out.println("it is not a prime ");
        //     }
        // }
       Scanner s =new Scanner(System.in);
       System.out.print("Input : ");
       int a =s.nextInt();
       int b = s.nextInt();

       int i,j;
     
       for(i=a; i<= b; i++){
        for(j=2; j<i;j++){
            if(i%j==0)
            break;
        }
        if(i==j){
            System.out.println(i);
        }
       }


       


















         
        }  
    }

