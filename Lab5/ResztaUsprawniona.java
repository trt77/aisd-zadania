import java.util.Scanner;


class ResztaUsprawniona{

public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    final int[] monety = {500,200,100,50,20,10,5,2,1};
    final int[] L = {2,1,2,3,1,2,3,1,0}
    int i = 0;
    System.out.println("Podaj resztę: \nzłotych: ");
    int zl = scan.nextInt();
    System.out.println("groszy: ");
    int gr = scan.nextInt();

    int reszta = zl*100 + gr;

    while(reszta>0 && i < monety.length){ //inicjujemy pętlę działającą aż do "wydania" całej kwoty
        if(reszta>=monety[i] && L[i]>0) //sprawdzamy czy damy radę wydać za pomocą nominału który akurat mamy w ręce (zaczynamy od największego)
        {
            //jeśli tak, to:
            System.out.print(monety[i]/100.0 + " "); //wypisujemy ten nominał
            reszta = reszta - monety[i];  //i zmn6iejszamy resztę o wydaną sumę 
		L[i]--;  
        }else{
            i++; //idziemy w prawą stronę tabeli nominałów, gdyż reszta jest już mniejsza niż wybrany obecnie nominał (indeks tab.)
        }

	if(reszta>0){
		System.out.println("Nie można wydać całej reszty. Zostało : " + reszta/100.0 + " zł.");
	}

    //while zapewnia trwanie iteracji dopóki reszta nie osiągnie 0 (nie zostanie wydana cała reszta)
    }
}
}