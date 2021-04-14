public class Carro{
  private static String color;
  private static String marca;
  private static String modelo;

  public static void main(String[]args){
    Valores("Azul","Ferrari","Veneno");
    System.out.print("Este carro es de color "+color+" de marca "+marca+ " modelo "+modelo);
  }

  public static void Valores(String col, String mar, String model){
    color=col;
    marca=mar;
    modelo=model;
  }

}