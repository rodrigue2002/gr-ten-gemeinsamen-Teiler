import java.util.*;
public class Ggt{
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           char c = 'j';
          do{
               System.out.print("geben Sie die erste Ganzzahl ein: ");
               int a = sc.nextInt();
               System.out.print("geben Sie die zweite Ganzzahl ein: ");
               int b = sc.nextInt();
               System.out.println("Der GGT von " + a + " und " + b + " ist " + GGT(a,b) );
               System.out.print("Möchten Sie eine weitere Berechnung durchführen? (j/n) ");
               c = sc.next().charAt(0);
           }  while(c == 'j');
    }

    public static int GGT(int a ,int b){
           if(a == 0 || b == 0) return 0;
           if(a == b) return a;
           if (a > b) return GGT(a-b, b);
              return GGT(a, b-a);
    }
}