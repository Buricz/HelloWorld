import java.util.Scanner;

public class SortApp {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Rozmiar tabeli: ");
        int a=scanner.nextInt();

        System.out.println("Liczby w tabeli: ");
        int[] tab = new int[a];
        for(int i=0;i<a;i++){
            int b=scanner.nextInt();
            tab[i]=b;
        }

        int c=0;
        int d=5;
        for(int j=0;j<a;j++) {
            for (int i = 0; i < a; i++) {
                if(tab[j]==tab[i]){
                    c++;
                }
            }

            if(d<c){
                d=c;
                c=0;
                System.out.println("to liczba "+tab[j]);
            }
            c=0;

        }
        if (d > 5) {
            System.out.println("Ile razy wystąpiła: "+d);
        }
        else{
            System.out.println("-1");
            return;
        }

    }
}
