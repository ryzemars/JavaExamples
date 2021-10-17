package JavaBasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    static int index, flag=0;
    static int m=0;
    static int n=5;

    public static void main(String[] args) {
//        prime_number();
        prime_number_using_scanner();
    }

    public static void prime_number(){
        m=n/2;
//        System.out.println(m);
        if(n==0||n==1){
            System.out.println(n+" is not a prime number (khong phai so nguyen to)");
        }else {
            for (index = 2; index < m; index++) {
                if(n%index==0){
                    System.out.println(n+"is a prime number");
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                System.out.println(n+" is a prime number");
            }
        }
    }

    public static void  prime_number_using_scanner(){
        Scanner s = new Scanner(System.in);//Khai bao 1 bien s co kieu du lieu Scanner
        System.out.println("Enter a number:");
        int n=s.nextInt();
//        public static boolean isPrime(int n){
//            if (n<=1){
//                return false;
//            }
//            for (int i=2; i<Math.sqrt(n); i++){
//                if(n % i == 0){
//                    return false;
//                }
//            }
//            return true;
//        }
        if (isPrime(n)){
            System.out.println(n+" is a prime number");
        }else {
            System.out.println(n+" is not a prime number");
        }
        }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
