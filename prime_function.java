 import java.util.Scanner;

public class prime_function {

    public static void prime(int n){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Not a Prime Number");
                return;
                }
                else{
                    System.out.println("A prime number");
                    return;
                }
            }
            return; 
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        prime(n);
    }
}
