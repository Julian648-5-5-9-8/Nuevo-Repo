public class Calculadora{
  private static float n1;
  private static float n2;
  private static String op;
  private static float resultado;


  public static void operacion(float n1,float n2,String op,float resultado){
    switch(op){
      case "suma": resultado=n1+n2;
      System.out.print(resultado);
      break;
      
      case "resta": resultado=n1-n2;
      System.out.print(resultado);
      break;

      case "multiplicacion": resultado=n1*n2;
      System.out.print(resultado);
      break;

      case "division": 
      if (n2==0){
        System.out.print("No se puede operar");}
        else{
          resultado=n1/n2;
        System.out.print(resultado);
        break;
        }
      break;
    }
  }

  public static void main(String[] args){
    float n1=1;
    float n2=2;
    op="division";
    operacion(n1,n2,op,resultado);
  }
}
 