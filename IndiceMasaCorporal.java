import java.util.Scanner;

public class IndiceMasaCorporal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu altura en metros: ");
        double altura = sc.nextDouble();
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = sc.nextDouble();
        sc.close();

        double imc = calcularIMC(altura, peso);

        String clasificacion = "";
        if(imc < 16){
            clasificacion = "Desnutrición grado 3";
        } else if(imc < 17){
            clasificacion = "Desnutrición grado 2";
        } else if(imc < 18.50){
            clasificacion = "Desnutrición grado 1";
        } else if(imc < 25){
            clasificacion = "Peso normal";
        } else if(imc < 30){
            clasificacion = "Sobrepeso Grado 1";
        } else if(imc < 35){
            clasificacion = "Sobrepeso grado 2";
        } else if(imc < 40){
            clasificacion = "Spbrepeso Grado 3";
        }

        System.out.println("\nTu índice de masa corporal es: " + imc);
        System.out.println("Atendiendo al IMC, tiene: " + clasificacion);

    }

    private static double calcularIMC(double altura, double peso){
        double imc = peso/(Math.pow(altura, 2));
        return Math.rint(imc*100)/100;
    }
}