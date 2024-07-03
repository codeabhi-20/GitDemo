import java.util.Scanner;

public class even_funct {
    public static void evenfunction(int n){
        if(n%2==0){
            System.out.println("Number is even : "+n);
            return;
        }
        else{
            System.out.println("Number is odd");
            return;
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        evenfunction(0);
    }
}
