import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię psa: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj rasę psa: ");
        String rasa = scanner.nextLine();

        System.out.print("Podaj wiek psa: ");
        int wiek = scanner.nextInt();

        Pies pies = new Pies(imie, rasa, wiek);

        System.out.println("Imię: " + pies.getImie());
        System.out.println("Rasa: " + pies.getRasa());
        System.out.println("Wiek: " + pies.getWiek());

        scanner.close();
    }
}
