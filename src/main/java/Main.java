import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu tamanho:");
    int altura = sc.nextInt();

    System.out.println("Digite seu peso:");
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);

    System.out.printf("O seu IMC é de %f kg/m² ", imc);

    
    if( 16.9 < imc ) {
      System.out.println("Você está muito abaixo do peso.");
    }
    if( 17 < imc && imc < 18.4 ) {
      System.out.println("Você está abaixo do peso.");
    }
    if( 18.5 < imc && imc < 24.9 ) {
      System.out.println("Você está com peso normal");
    }
    if( 25 < imc && imc < 29.9 ) {
      System.out.println("Você está acima do peso.");
    }
    if( 30 < imc && imc < 34.9 ) {
      System.out.println("Você está obeso grau 1.");
    }
    if( 35 < imc && imc < 40 ) {
      System.out.println("Você está obeso grau 2.");
    }
    if( 45 > imc ) {
      System.out.println("Você está obeso grau 3");
    }
    
    sc.close();
    
   }

  
}