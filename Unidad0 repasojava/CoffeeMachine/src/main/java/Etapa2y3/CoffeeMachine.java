package Etapa2y3;

import java.util.Scanner;

public class CoffeeMachine {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    machine();
    }


    public static void machine() {

        /* EJ2 */
        int numTazas;
        numTazas = pedirTazas();

        calcularIngrediente(numTazas);

        /* EJ3 */
        numPorciones();



    }

    public static Integer pedirTazas() {
        int numTazas;
        System.out.println("Escribe cuántas tazas de café vas a necesitar:");
        numTazas = scan.nextInt();
        return numTazas;
    }

    public static void calcularIngrediente(int numTazas){

        /*Ten en cuenta que una taza de café preparada en esta cafetera contiene 200 ml de agua, 50 ml de leche
        y 15 g de granos de café. Devuelva al usuario las cantidades requeridas de ingredientes*/
        int agua = 200;
        int leche = 50;
        int cafe = 15;

        int[] ingredientes = {agua, leche, cafe};
        int[] cantIngre;

        cantIngre = multiplicarIngre(ingredientes,numTazas);

        System.out.println("Para "+ numTazas +" tazas de café necesitas: \n" +
                cantIngre[0] +" ml de agua\n" +
                cantIngre[1] +" ml de leche\n" +
                cantIngre[2] +" g de café");

    }
    public static void numPorciones(){

        int[] cantIngre;

        System.out.println("Escribe cuántos ml de agua tiene la máquina:");
        int agua =scan.nextInt();
        System.out.println ("Escribe cuántos ml de leche tiene la máquina:");
        int leche =scan.nextInt();
        System.out.println ("Escribe cuántos gramos de café tiene la máquina:");
        int cafe = scan.nextInt();
        System.out.println ("Escribe cuántas tazas de café necesitas hacer:");
        int numTazas = scan.nextInt();


        if(agua >= 200 && leche >= 50 && cafe >= 15){


            if (numTazas > 0){

                int[] cantNormal = {200,50,15};
                int[] ingredientes = {agua,leche,cafe};
                cantIngre = dividirIngre(ingredientes,cantNormal);

                /*hay que ordenar el array, luego coger el nunmero mas bajo*/
                int num ;
                num = ordenarArray(cantIngre);

                if(numTazas > num){

                    String t = (num == 1) ? "taza" : "tazas";
                    System.out.println("No, solo puedo hacer "+ num +" "+ t);

                }else if(numTazas < num){

                    int diferencia = num - numTazas;
                    String t = (num == 1) ? "taza" : "tazas";
                    System.out.println("Si, puedo hacer esa cantidad de cafe" + '('+ "e incluso "+diferencia+" mas"+')');

                }else{

                    System.out.println("Tengo justo para esos cafe, ni uno mas");
                }

            }else{

                System.out.println("ERROR");
            }

        }else{
            System.out.println("ERROR.. La cantidad minima por ingrediente es agua 200, leche 50, cafe 15");
        }



    }

    public static int[] multiplicarIngre(int[] ingredientes,int numTazas) {
        int[] cantIngre = new int[3];

        for(int i = 0 ; i < ingredientes.length ; i++){
            cantIngre[i] = ingredientes[i] * numTazas;
        }
        return cantIngre;
    }

    public static int[] dividirIngre(int[] ingredientes,int[] cantNormal) {
        int[] cantIngre = new int[3];

        for(int i = 0 ; i < ingredientes.length ; i++){
            cantIngre[i] = ingredientes[i] / cantNormal[i];
        }
        return cantIngre;
    }


    public static int ordenarArray(int[] cantIngre){

        /*hay que ordenar ascendente el array, luego coger el numero mas bajo*/

        for (int i = 0; i < (cantIngre.length - 1); i++) {
            for (int j = i + 1; j < cantIngre.length; j++) {
                if (cantIngre[i] > cantIngre[j]) {
                    // Intercambiamos valores
                    int variableauxiliar = cantIngre[i];
                    cantIngre[i] = cantIngre[j];
                    cantIngre[j] = variableauxiliar;
                }
            }
        }

        return cantIngre[0];


    }


}
