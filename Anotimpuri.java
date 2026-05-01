package problemeMici;

import java.util.Scanner;

public class Anotimpuri {
    public static void main(String[] args) {

        Scanner anotimp = new Scanner(System.in);
        System.out.println("introduceti luna");
        int luna = anotimp.nextInt();
        switch(luna){
            case 1:
            case 2:
            case 12:
                System.out.println("iarna");
                break;
            case 3:
            case 5:
            case 4:
                System.out.println("primavara");
                break;
            default:
                System.out.println("404. invalida");

        }
    }
}
