import java.util.LinkedList;
import java.util.Scanner;

public class SortApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Wprowadz A:");
        System.out.println("Wprowadz B:");

        LinkedList lista1=new LinkedList();
        LinkedList lista2=new LinkedList();
        LinkedList lista3=new LinkedList();


        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c=0;
        int d=0;


        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                lista1.add(i);
                c++;
            }
        }
        System.out.println("1" +lista1);
        System.out.println("2: "+c);

        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                lista2.add(i);
                d++;
            }
        }
        System.out.println("3" +lista2);
        System.out.println("4: "+d);




        for(int j=0;j<lista1.size();j++){
            for(int i=0;i<d;i++){
                if(lista1.get(j)==lista2.get(i)){
                    lista3.add(lista1.get(j));
                }
            }
        }
        System.out.println(lista3);

        
    }
}
