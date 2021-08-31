import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    int note = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Note de Nathan: ");
    note = sc.nextInt();
    sc.close();

    switch (note) {
      case 0:
        System.out.println("Ca fait mal");
        break;
      case 10:
        System.out.println("La moyenne, ça passe");
        break;
      case 20:
        System.out.println("BIEN JOUE");
        break;
      default:
        System.out.println("Il faut travailler");
        break;
    }
  }
}
