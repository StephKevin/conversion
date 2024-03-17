//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
       int fin=0, pas=0;
       double Cel=0, Far=0;
       double decal;//decal=declage
       char ON='O';//oui on non
        System.out.println("ce programme convertit les températures C° en F°");
        while (ON =='O'){
            while(Cel > fin || pas > fin || pas == 0)
            {
                System.out.print("entrez la valeur de départ: ");
                Cel = sc.nextDouble();
                System.out.print("jusqu'à: ");
                fin = sc.nextInt();
                System.out.print("par pas de: ");
                pas = sc.nextInt();
                if (Cel > fin || pas > fin || pas == 0){
                    System.out.println("impsossible");
                }
            }
            while (Cel<=fin){
                Far = ((9.0/5.0)*Cel)+32;
                System.out.println(Cel+"°C = "+Far+"°F");
                Cel = Cel+pas;
            }
            System.out.print("Voulez vous continuer(si oui: O/si non: N)");
            String sr = sc.next();
            ON = sr.charAt(0);
        }
    }
    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) /
                Math.pow(10, B);
    }
}