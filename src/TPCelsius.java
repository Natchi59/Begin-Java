import java.util.Scanner;

class TPCelsius {

  public static void main(String[] args) {
    char rep = ' ', mode = ' ';
    int oldTemp = 0, newTemp = 0;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("Choisissez le mode de conversion:");
      System.out.println("C - Convertisseur Celsius - Fahrenheit");
      System.out.println("F - Convertisseur Fahrenheit - Celsius");

      mode = sc.next().charAt(0);

      while (mode != 'C' && mode != 'F') {
        System.out.println("Veuillez saisir un mode de température valide");
        mode = sc.nextLine().charAt(0);
      }

      System.out.println("Température à convertir :");
      oldTemp = sc.nextInt();

      if (mode == 'C') newTemp = ((oldTemp - 32) * 5) / 9; else newTemp =
        (9 / 5) * oldTemp + 32;

      System.out.println(
        oldTemp +
        (mode == 'C' ? "°C" : "°F") +
        " correspond à : " +
        newTemp +
        (mode == 'C' ? "°F" : "°C")
      );

      do {
        System.out.println(
          "Souhaitez-vous convertir une autre température ? (O/N)"
        );
        rep = sc.next().charAt(0);
      } while (rep != 'O' && rep != 'N');
    } while (rep == 'O');

    System.out.println("Fin");
    sc.close();
  }
}
