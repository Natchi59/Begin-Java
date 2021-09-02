package Chapitres;

public class Methodes {

  public static void main(String[] args) {
    String[][] array = { { "a", "b", "c" }, { "d", "e", "f" } };
    readArrayInArray(array);
  }

  public static void readArray(String[] array) {
    for (String value : array) {
      System.out.println(value);
    }
  }

  public static void readArrayInArray(String[][] array) {
    for (String[] arrayIn : array) {
      for (String value : arrayIn) {
        System.out.print(value);
      }
      System.out.println("");
    }
  }
}
