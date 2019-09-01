public class Prime {

    /*
    * The class isPrime checks if the number n which is from 1 to 20 is prime or not.
    * It returns a Non-Prime number if the condition (remainder of n and i is equal to zero) is true
    * else it returns false which is a Prime number.
    * But here in this case we require a non-Prime number.*/

    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n%i == 0)
                return true;
        }
        return false;
    }

    /* k variable stores the number of Prime Factors of the non-Prime number n.
    * sum variable consists of the sum of all the prime factors of the non-prime number n.
    * if k is 2, p=a/y is printing the first factor
    * b variable is used as a counter just like variable sum but it helps me in printing the output as required.
    * when b is equal to 1, I print "+" sigh. */

    public static void result(int n){
        int k = 0,  sum = 0, a = n, b = 0;
        for(int i=2; i<=n; i++) {
            if (n % i == 0){
                n = n / i;
                sum += i;
                i=1;
                k++;
            }
        }
        if(k==2){
            System.out.print("The sum of all primes for "+a+":   "+sum+"   (");
            for(int y=2; y<a; y++){
                if(a%y==0){
                    b++;
                    int p= a/y;
                    System.out.print(p);
                    if(b==1)
                        System.out.print("+");
                }

                /* When numbers like 4 or 9 occur which have identical factors,
                this condition below will execute and give the identical factors as output*/

            }
            if(b==1){
                for(int y=2; y<a; y++) {
                    if (a % y == 0) {
                        System.out.print(a / y);
                    }
                }
            }
            System.out.println(")");
        }
    }

    /* The main function calls the class isPrime which checks for all the numbers between 1 to 20.
    * if the number is not prime, then the if condition is true and result class is executed.*/

    public static void main(String[] args) {
        for(int i = 2; i<= 20; i++){
            if(isPrime(i)){
                result(i);
            }
        }
    }
}
