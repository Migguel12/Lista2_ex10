import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Em qual turno voce estuda? Digit M para matutino, V para vespertino e N para noturno: ");
        String tur = ler.nextLine();
        System.out.println("");

        if("M".equalsIgnoreCase(tur)){
            System.out.println("Bom dia!");
        }

        else if("V".equalsIgnoreCase(tur)){
            System.out.println("Boa tarde!");
        }

        else if("N".equalsIgnoreCase(tur)){
            System.out.println("Boa noite!");
        }

        else{
            System.out.println("Valor Invalido");

        }
    }
}
