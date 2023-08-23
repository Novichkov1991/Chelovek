import Chelovek.Chelovek;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        Chelovek chelovek1 = new Chelovek("gri",LocalDate.of(1991,10,23), "89209730450", "Russia", "Ruazan", "Lenina 5, korp1, kv.5");

        String name = sc.nextLine();
        LocalDate data = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
        String tel = sc.nextLine();
        String strana = sc.nextLine();
        String gorod = sc.nextLine();
        String adres = sc.nextLine();


        Chelovek chelovek = new Chelovek(name,data,tel,strana,gorod,adres);
        System.out.println(chelovek);
        System.out.println(chelovek.getTel());
        System.out.println(chelovek1);
    }
}
