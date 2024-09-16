package Etapa4y5;

import entities.Maquina;

import java.util.Scanner;

public class CoffeMachine {
    public static Scanner scan = new Scanner(System.in);
    public static Maquina maquina = new Maquina(400,120,540,9,550);

    public static void main(String[] args) {
        machine();
    }

    public static void machine() {

        System.out.println("Escribe la acción a realizar (buy, fill, take, remaining, exit):");
        String p = scan.next();
        String m;
        m = p.toUpperCase();

        switch (m){
            case "BUY":
                buy();
                break;
            case "TAKE":
                take();
                break;
            case "FILL":
                fill();
                break;
            case "REMAINING":
                read();
                break;
            case "EXIT":
                System.out.println("Apagando..");
                break;
            default: System.out.println("Escriba bien la accion"); read();
        }


    }


    public static void buy() {
        System.out.println("¿Qué quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int num = scan.nextInt();


        int agua = maquina.getAgua();
        int cafe =maquina.getCafe();
        int leche =maquina.getLeche();
        int vaso =maquina.getVaso();
        int euro =maquina.getEuro();

        int agua1,cafe1,leche1,vaso1,euro1;

        if(num >= 1 || num <= 3){

            switch (num){
                case 1:

                    agua1=agua - 250;
                    cafe1=cafe - 16;
                    vaso1=vaso - 1;
                    euro1=euro + 4;

                    if(agua1<=0){
                        System.out.println("¡Lo siento, no tengo suficiente agua!");
                        read();
                    }else if(cafe1<0){
                        System.out.println("¡Lo siento, no tengo suficiente cafe!");
                        read();
                    }else if(vaso1<0){
                        System.out.println("¡Lo siento, no tengo suficientes vasos!");
                        read();

                    }else{
                        maquina.setAgua(agua1);
                        maquina.setCafe(cafe1);
                        maquina.setVaso(vaso1);
                        maquina.setEuro(euro1);
                        read();
                }
                    break;

                case 2:

                    agua1=agua - 200;
                    cafe1=cafe - 12;
                    leche1=leche - 100;
                    vaso1=vaso - 1;
                    euro1=euro + 6;

                    if(agua1<=0){
                        System.out.println("¡Lo siento, no tengo suficiente agua!");
                        read();
                    }else if(cafe1<0){
                        System.out.println("¡Lo siento, no tengo suficiente cafe!");
                        read();
                    }else if(leche1<0){
                        System.out.println("¡Lo siento, no tengo suficiente leche!");
                        read();
                    }else if(vaso1<0){
                        System.out.println("¡Lo siento, no tengo suficientes vasos!");
                        read();

                    }else{
                        maquina.setAgua(agua1);
                        maquina.setCafe(cafe1);
                        maquina.setVaso(vaso1);
                        maquina.setEuro(euro1);
                        read();
                    }
                    break;

                case 3:

                    agua1=agua - 200;
                    cafe1=cafe - 12;
                    leche1=leche - 100;
                    vaso1=vaso - 1;
                    euro1=euro + 6;

                    if(agua1<0){
                        System.out.println("¡Lo siento, no tengo suficiente agua!");
                        read();
                    }else if(cafe1<0){
                        System.out.println("¡Lo siento, no tengo suficiente cafe!");
                        read();
                    }else if(leche1<0){
                        System.out.println("¡Lo siento, no tengo suficiente leche!");
                        read();
                    }else if(vaso1<0){
                        System.out.println("¡Lo siento, no tengo suficientes vasos!");
                        read();

                    }else{
                        maquina.setAgua(agua1);
                        maquina.setCafe(cafe1);
                        maquina.setVaso(vaso1);
                        maquina.setEuro(euro1);
                        read();
                    }
                    break;

            }


        }else{
            System.out.println("Introduzca un valor entre 1 e 3");
            read();
        }


    }
    public static void take() {

        int num = maquina.getEuro();
        System.out.println("Te acabo de dar " + num + " euros");
        maquina.setEuro(maquina.getEuro()-num);
        read();
    }
    public static void fill() {

        System.out.println("Escribe cuántos ml de agua quieres añadir:");
        int agua =scan.nextInt();
        System.out.println ("Escribe cuántos ml de leche quieres añadir:");
        int leche =scan.nextInt();
        System.out.println ("Escribe cuántos gramos de café quieres añadir:");
        int cafe = scan.nextInt();
        System.out.println ("Escribe cuántos vasos desechables quieres añadir:");
        int vaso = scan.nextInt();

        if(agua > 0 || leche > 0 || cafe > 0 || vaso > 0){

            int agua1 = maquina.getAgua();
            int leche1 = maquina.getLeche();
            int cafe1 = maquina.getCafe();
            int vaso1 = maquina.getVaso();


            maquina.setAgua(agua+agua1);
            maquina.setLeche(leche+leche1);
            maquina.setCafe(cafe+cafe1);
            maquina.setVaso(vaso+vaso1);
            read();
        }else {
            System.out.println ("Introduzca una cantidad superior a 0");
        }


    }

    public static void read() {
        System.out.println(maquina.toString());
        machine();
    }
}
