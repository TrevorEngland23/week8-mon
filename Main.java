/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
    }

    public static void Special(int x){
        if(x == 2023){
            throw new NullPointerException("Special Exception");
        } else {
            System.out.println(x);
        }
    }


    public static boolean isPrime(int number){
        if(number <= 1){ // edge case
            return false;
        }
        for(int i =2; i <= Math.sqrt(number); i++){
            if(number % i == 0) {
                return false; // a divisor is found
            }
        }
        return true; // no divisor is found
    }

}