package Chapitres;

import java.util.Scanner;

class Tableaux {

  public static void main(String[] args) {
    char array[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
    char rep = ' ', searchValue = ' ';
    boolean check = false;

    Scanner sc = new Scanner(System.in);

    do {
      System.out.println(
        "Veuillez taper une lettre à rechercher dans le tableau"
      );

      searchValue = sc.next().charAt(0);

      for (int i = 0; i < array.length; i++) {
        if (array[i] == searchValue) {
          check = true;
          System.out.println(
            "La lettre " + searchValue + " est dans le tableau"
          );
        }
      }

      if (check == false) System.out.println(
        "La lettre " + searchValue + " n'est pas dans le tableau"
      );

      do {
        System.out.println("Voulez-vous faire une nouvelle recherche ? (O/N)");
        rep = sc.next().charAt(0);
      } while (rep != 'O' && rep != 'N');
    } while (rep == 'O');

    sc.close();
    System.out.println("Fin");
  }
}
