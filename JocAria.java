package problemeMici;

import java.util.Scanner;

public class JocAria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu figura:");
        System.out.println("1 patrat ,2 dreptunghi ,3 cerc");
        int obtiune = sc.nextInt();
        switch(obtiune){
            case 1:
                System.out.println("introdu latura: ");
                double lat = sc.nextDouble();
                System.out.println("aria: " + lat*lat  + "  cm2");
                break;
            case 2:
                System.out.println("introdu lungime: ");
                double lungime = sc.nextDouble();
                System.out.println("introdu latime");
                double latime = sc.nextDouble();
                System.out.println("aria dreptunghi: " + latime*latime  + "cm2");
                break;
            case 3:
                System.out.println("introdu raza: ");
                double raza = sc.nextDouble();
                System.out.println("aria cerc" +(3.14 * raza*raza ) + " cm2");
        }



    }


}
