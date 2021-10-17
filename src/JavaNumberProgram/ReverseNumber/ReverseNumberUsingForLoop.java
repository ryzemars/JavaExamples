package JavaNumberProgram.ReverseNumber;

public class ReverseNumberUsingForLoop {
    public static void main(String[] args)
    {
        int number = 123, reverse = 0, remainder = 0;
//we have not mentioned the initialization part of the for loop
        for( ;number!=0; number=number/10)
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
//        In the above program, we can also write the for loop as follows:

//        for( ;; number=number/10)
//        {
//            int remainder = number % 10;
//            if (number==0) {
//                break;
//            }
//            reverse = reverse * 10 + remainder;
//        }

//        orrrrrrrrrrr
//        for(;number != 0;)
//        {
//            int remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//            number=number/10;
//        }

        System.out.println("The reverse of the given number is: " + reverse);
    }
}
