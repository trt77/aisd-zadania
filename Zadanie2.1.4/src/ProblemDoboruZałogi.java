//Hubert Soroczyński

public class ProblemDoboruZałogi {

    public static void main(String[] args) {

        int b1, b2, b3, b4, b5;
        int mamyA, mamyB, mamyC, mamyD;
        int min = 6;

        for (b1 = 0; b1 <= 1; b1++)
            for (b2 = 0; b2 <= 1; b2++)
                for (b3 = 0; b3 <= 1; b3++)
                    for (b4 = 0; b4 <= 1; b4++)
                        for (b5 = 0; b5 <= 1; b5++) {

                                mamyA = 0;
                                mamyB = 0;
                                mamyC = 0;
                                mamyD = 0;

                                if (b1 == 1) {
                                    mamyA = 1;
                                    mamyD = 1;
                                }
                                if (b2 == 1) {
                                    mamyB = 1;
                                    mamyD = 1;
                                }
                                if (b3 == 1) {
                                    mamyB = 1;
                                    mamyC = 1;
                                }
                                if (b4 == 1) {
                                    mamyA = 1;
                                    mamyB = 1;
                                }
                                if (b5 == 1) {
                                    mamyC = 1;
                                    mamyD = 1;
                                }

                                if (mamyA == 1 && mamyB == 1 && mamyC == 1 && mamyD == 1) {
                                    int suma = b1 + b2 + b3 + b4 + b5;
                                    /*Wartość sumy rośnie z każdą iteracją, toteż dobór kosmonautów
                                    jest optymalny już dla pierwszej prawdziwej ewaluacji.*/
                                    if (suma < min) {
                                        min = suma;
                                        System.out.printf("Wytypowani kosmonauci:\n" +
                                                "Kosmonauta 1: " +
                                                        ((b1 == 1) ? "Wytypowano.\n" : "Nie wytypowano.\n") +
                                                "Kosmonauta 2: " +
                                                        ((b2 == 1) ? "Wytypowano.\n" : "Nie wytypowano.\n") +
                                                "Kosmonauta 3: " +
                                                        ((b3 == 1) ? "Wytypowano.\n" : "Nie wytypowano.\n") +
                                                "Kosmonauta 4: " +
                                                        ((b4 == 1) ? "Wytypowano.\n" : "Nie wytypowano.\n") +
                                                "Kosmonauta 5: " +
                                                        ((b5 == 1) ? "Wytypowano.\n" : "Nie wytypowano.\n"));
                                    }
                                }
                            }
    }
}