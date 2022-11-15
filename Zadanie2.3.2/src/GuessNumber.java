import java.util.Random;

public class GuessNumber {


    public static void main(String[] args) {
        int N = losuj(0,1001);
        maszynaLosujaca(N,0,1001);
    }
    public static int losuj(int a, int b){
        Random rand = new Random();
        int c = rand.nextInt(a,b);
        return c;
    }
    public static void maszynaLosujaca(int c, int lowerLimit, int upperLimit){

        int currentGuessedNumber = losuj(lowerLimit, upperLimit);
        System.out.println("Czy " + currentGuessedNumber + "to jest liczba " + c + " ?");
        if(currentGuessedNumber == c){
            System.out.println("TAK");
        }
        if(currentGuessedNumber < c){
            System.out.println("ZA MAŁA");
            maszynaLosujaca(c, currentGuessedNumber, upperLimit);
        }
        if(currentGuessedNumber > c){
            System.out.println("ZA DUŻA");
            maszynaLosujaca(c, lowerLimit, currentGuessedNumber);
        }

    }

}
