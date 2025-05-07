public class getLargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(24));
        System.out.println(getLargestPrime(34));
        System.out.println(getLargestPrime(99));
        System.out.println(getLargestPrime(165));

    }

    public static int getLargestPrime(int number){

        if(number < 2){

            return 0;
        }

        int largestPrime = 0;

        //dividing continously by 2, bcz 2 is the smallest prime no. if at last, it leaves 0 as a remainder
        // means, 2 is the largest prime factor for that no.
        while(number % 2 == 0){
            largestPrime = 2;
            number /= 2;

        }

        // diving by odd numbers
        for(int i = 3; i <= Math.sqrt(number); i += 2){

            while(number % i == 0){

                largestPrime = i;
                number /= i;

            }

        }

        if(number > 2){
            largestPrime = number;
        }

        return largestPrime;
    }
}
