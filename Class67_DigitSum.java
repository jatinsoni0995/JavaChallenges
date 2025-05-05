public class Class67_DigitSum {
    public static void main(String[] args) {

       // sumDigits(125);
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(9999));

    }

    public static int sumDigits(int n) {
        if (n < 0) {
            return -1;
        } else {
            int sum = 0;

            while(n > 9) {
                sum = sum + (n%10);
                n = n / 10;
            }
   return (sum+n);     }
    }
}
