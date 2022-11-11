// Hubert Soroczyński
public class ProblemZestawuPaszowego {

    public static void main(String[] args) {

        int x1, x2, x3, suma;
        int w1 =0, w2 = 0, w3 = 0;
        int min = 100000;

        for (x1 = 1; x1 <= 10; x1++)
            for (x2 = 1; x2 < 30; x2++)
                for (x3 = 1; x3 < 30; x3++)
                    if (50 * x1 + 20 * x2 + 180 * x3 >= 2000)
                        if (6 * x1 + 4 * x2 + 3 * x3 >= 120)
                            if (2 * x1 + x2 + x3 >= 40) {
                                suma = 3 * x1 + 2 * x2 + 5 * x3;
                                if (suma < min) {
                                    min = suma;
                                    w1 = x1;
                                    w2 = x2;
                                    w3 = x3;
                                }
                            }

        System.out.println("Minimalny koszt " + min + " zł uzyskamy" +
                " dla zestawu paszowego: " + w1 + " kg siana, " + w2 +
                " kg kiszonki, " + w3 + " kg paszy treściwej.");
    }
}