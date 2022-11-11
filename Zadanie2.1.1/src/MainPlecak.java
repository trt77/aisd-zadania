public class MainPlecak {

    public static void main(String[] args) {

        int b1,b2,b3,b4,b5,b6;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int s4 = 0;
        int s5 = 0;
        int s6 = 0;
        int sumaobj, sumawart;
        int sumaobjkonc = 0;
        int maxwart = 0;


        for (b1 = 0; b1 <= 1; b1++)
            for (b2 = 0; b2 <= 1; b2++)
                for (b3 = 0; b3 <= 1; b3++)
                    for (b4 = 0; b4 <= 1; b4++)
                        for (b5 = 0; b5 <= 1; b5++)
                            for (b6 = 0; b6 <= 1; b6++) {
                                sumaobj = b1 * 6 + b2 * 2 + b3 * 3 + b4 * 2 + b5 * 3 + b6;
                                if (sumaobj <= 10) {
                                    sumawart = b1 * 6 + b2 * 4 + b3 * 5 + b4 * 7 + b5 * 10 + b6 * 2;
                                    if (sumawart > maxwart) {
                                        maxwart = sumawart;
                                        s1 = b1;
                                        s2 = b2;
                                        s3 = b3;
                                        s4 = b4;
                                        s5 = b5;
                                        s6 = b6;
                                        sumaobjkonc = sumaobj;
                                    }
                                }
                            }

        System.out.println("\nW plecaku o maksymalnej " +
                "wartości znajdą się przedmioty: \n" +
                "Przedmiot 0: " + s1 +
                "\nPrzedmiot 1: " + s2 +
                "\nPrzedmiot 2: " + s3 +
                "\nPrzedmiot 3: " + s4 +
                "\nPrzedmiot 4: " + s5 +
                "\nPrzedmiot 5: " + s6 +
                "\no wartości " + maxwart +
                " i objętości: " + sumaobjkonc);
    }
}

