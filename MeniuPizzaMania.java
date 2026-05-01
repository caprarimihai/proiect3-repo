package problemeMici;

import java.util.Scanner;

public class MeniuPizzaMania {
    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.println("Hello this is MeniuPita!");
        System.out.println("1 sushi");
        System.out.println("2 pizza");
        System.out.println("3 apa");
        int punct = nr.nextInt();
        switch (punct) {
            case 1:
                System.out.println("ati ales susi pret 500 lei");
                break;
            case 2:
                System.out.println("ati ales pizza 300 lei");
                break;
            case 3:
                System.out.println("ati ales apa 23 lei");
                break;
            default:
                System.out.println("cred ca nu va este foame!!!!!!");
        }

    }

}
