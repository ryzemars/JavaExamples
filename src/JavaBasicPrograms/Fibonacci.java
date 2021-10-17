package JavaBasicPrograms;

public class Fibonacci {
    static int number1=0;
    static int number2=1;
    static int number3;
    static int count=10;
    public static void main(String[] args) {
        fibonacci_without_recursion();
    }
    public static void fibonacci_without_recursion(){

        //        int n1=0,n2=1,n3,i,count=10;
        System.out.print(number1+" "+number2);//printing 0 and 1

        for(int index=2;index<count;index++)//why there is some underline bellow number?
        {
            number3=number1+number2;
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }
    }
    public static void  fibonacci_using_recursion(){
       //https://www.javatpoint.com/fibonacci-series-in-java
    }
}
