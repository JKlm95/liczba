import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String doPrzetworzeniaNaInt = scanner.nextLine();
        int naszaLiczba = Integer.parseInt(doPrzetworzeniaNaInt);

        if(naszaLiczba < 10){
            System.out.println("Nasza liczba jest mniejsza od 10");
        } else if (naszaLiczba == 10) {
            System.out.println("Nasza liczba jest równa 10");
        } else {
            System.out.println("Nasza liczba jest większa od 10");
        }
    }
}
