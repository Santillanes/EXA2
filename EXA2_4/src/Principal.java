
import java.util.Scanner;

/*
 * Examen Unidad II - Problema 4
 */

/**
 *
 * @author     EQUIPO #4 DONUT
 *         Luis Carlos Santillanes Loya - 18550694
 *         Luis Arturo Monsivais Vargas - 18550667
 *         Elena Guadalupe Díaz López - 18550623
 *         Paola Xóchitl Carrillo Ortíz - 18550693
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        /*
        * Palabra 1  -> Contaminar
        * Palabra 2  -> Cantar
        * Palabra 3  -> Bailar
        * Palabra 4  -> Pelota
        * Palabra 5  -> Maestro
        * Palabra 6  -> Terminar
        * Palabra 7  -> Comprar
        * Palabra 8  -> Objeto
        * Palabra 9  -> Clases
        * Palabra 10 -> Métodos
        */
        
        String le1 = "_ ", le2 = "_ ", le3 = "_ ", le4 = "_ ", le5 = "_ ";
        String le6 = "_ ", le7 = "_ ", le8 = "_ ", le9 = "_ ", le10 = "_ ";
        boolean l1 = false, l2 = false, l3 = false, l4 = false, l5 = false;
        boolean l6 = false, l7 = false, l8 = false, l9 = false, l10 = false;
        int palabra = (int)(Math.random()*10+1);
        boolean termina = false;
        String p1 = "_______     ";
        String p2 = " |          ";
        String p3 = " |          ";
        String p4 = " |          ";
        String p5 = " |          ";
        String p6 = " |          ";
        String p7 = " |          ";
        String p8 = "_|__________";
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        
        
        while(!termina){
            switch (palabra){
                case 1:
//======================================== Contaminar ============================================================================
                    System.out.println("Palabra de 10 letras: "+le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                    int completa = 0;
                    int errores = 0;
                    
                    
                    while(completa < 10 && errores <5){
                    
                    System.out.print("Ingrese una letra: ");
                    String letra = input.nextLine();
                    switch (letra){
                        case "c":
                            if(l1){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le1 = "C ";
                                l1 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa++;
                            }
                            break;
                        case "o":
                            if(l2){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le2 = "o ";
                                l2 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa++;
                            }
                            break;
                        case "n":
                            if(l3){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le3 = "n ";
                                le8 = "n ";
                                l3 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa+=2;
                            }
                            break;
                        case "t":
                            if(l4){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le4 = "t ";
                                l4 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa++;
                            }
                            break;
                        case "a":
                            if(l5){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le5 = "a ";
                                le9 = "a ";
                                l5 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa+=2;
                            }
                            break;
                        case "m":
                            if(l6){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le6 = "m ";
                                l6 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa++;
                            }
                            break;
                        case "i":
                            if(l7){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le7 = "i ";
                                l7 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa++;
                            }
                            break;
                        case "r":
                            if(l8){
                                System.out.println("Letra ya ingresada.");
                            }else{
                                le10 = "r ";
                                l10 = true;
                                System.out.println(p1);
                                System.out.println(p2);
                                System.out.println(p3);
                                System.out.println(p4);
                                System.out.println(p5);
                                System.out.println(p6);
                                System.out.println(p7);
                                System.out.println(p8);
                                System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                completa++;
                            }
                            break;
                        default:
                            errores++;
                            switch(errores){
                                case 1:
                                    p2 = " |   |      ";
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                    break;
                                case 2:
                                    p3 = " |   0      ";
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                    break;
                                case 3:
                                    p4 = " |  ---     ";
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                    break;
                                case 4:
                                    p5 = " |   |      ";
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                    break;
                                case 5:
                                    p6 = " |  | |      ";
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8+le9+le10);
                                    System.out.println("Haz perdido. La palabra era -Contaminación-");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                    String seguir = input.nextLine();
                                    if("si".equals(seguir)){
                                        le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                        le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                        l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                        l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                        palabra = (int)(Math.random()*10+1);
                                        termina = false;
                                        p1 = "_______     ";
                                        p2 = " |          ";
                                        p3 = " |          ";
                                        p4 = " |          ";
                                        p5 = " |          ";
                                        p6 = " |          ";
                                        p7 = " |          ";
                                        p8 = "_|__________";
                                    }else{
                                        termina = true;
                                    }
                                    break;
                            }
                    }
                    }
                    
                    if(completa == 10){
                        System.out.println("Felicidades, ganaste!");
                        System.out.println("Desea seguir jugando? Responda si o no.");
                                    String seguir = input.nextLine();
                                    if("si".equals(seguir)){
                                        le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                        le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                        l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                        l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                        palabra = (int)(Math.random()*10+1);
                                        termina = false;
                                        p1 = "_______     ";
                                        p2 = " |          ";
                                        p3 = " |          ";
                                        p4 = " |          ";
                                        p5 = " |          ";
                                        p6 = " |          ";
                                        p7 = " |          ";
                                        p8 = "_|__________";
                                    }else{
                                        termina = true;
                                    }
                    }
                    break;
//======================================== Contaminar ============================================================================
                case 2:
//======================================== Cantar ============================================================================
                    
                    System.out.println("Palabra de 6 letras: "+le1+le2+le3+le4+le5+le6);
                    int completa2 = 0;
                    int errores2 = 0;
                    
                    while(completa2 < 6 && errores2 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "c":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "C ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa2++;
                                }
                                break;
                            case "a":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "a ";
                                    le5 = "a ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa2+=2;
                                }
                                break;
                            case "n":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "n ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa2++;
                                }
                                break;
                            case "t":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "t ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa2++;
                                }
                                break;
                            case "r":
                                if(l6){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le6 = "r ";
                                    l6 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa2++;
                                }
                                break; 
                        
                    
                    
                            default:
                                    errores2++;
                                    switch(errores2){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Cantar-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    
                    if(completa2 == 6){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }

                    break;
//======================================== Cantar ============================================================================
                case 3:
//======================================== Bailar ============================================================================
                    
                    System.out.println("Palabra de 6 letras: "+le1+le2+le3+le4+le5+le6);
                    int completa3 = 0;
                    int errores3 = 0;
                    
                    while(completa3 < 6 && errores3 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "b":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "B ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa3++;
                                }
                                break;
                            case "a":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "a ";
                                    le5 = "a ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa3+=2;
                                }
                                break;
                            case "i":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "i ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa3++;
                                }
                                break;
                            case "l":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "l ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa3++;
                                }
                                break;
                            case "r":
                                if(l6){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le6 = "r ";
                                    l6 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa3++;
                                }
                                break; 
                        
                    
                    
                            default:
                                    errores3++;
                                    switch(errores3){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Bailar-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    if(completa3 == 6){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }
                    
                    break;
//======================================== Bailar ============================================================================
                case 4:
                    
//======================================== Pelota ============================================================================
                    
                    System.out.println("Palabra de 6 letras: "+le1+le2+le3+le4+le5+le6);
                    int completa4 = 0;
                    int errores4 = 0;
                    
                    while(completa4 < 6 && errores4 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "p":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "P ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa4++;
                                }
                                break;
                            case "e":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "e ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa4++;
                                }
                                break;
                            case "l":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "l ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa4++;
                                }
                                break;
                            case "o":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "o ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa4++;
                                }
                                break;
                            case "t":
                                if(l5){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le5 = "t ";
                                    l5 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa4++;
                                }
                                break; 
                            case "a":
                                if(l6){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le6 = "a ";
                                    l6 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa4++;
                                }
                                break; 
                        
                    
                    
                            default:
                                    errores4++;
                                    switch(errores4){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Pelota-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    if(completa4 == 6){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }
                    
                    break;
//======================================== Pelota ============================================================================
                
                case 5:

//======================================== Maestro ============================================================================
                    
                    System.out.println("Palabra de 7 letras: "+le1+le2+le3+le4+le5+le6+le7);
                    int completa5 = 0;
                    int errores5 = 0;
                    
                    while(completa5 < 7 && errores5 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "m":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "M ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa5++;
                                }
                                break;
                            case "a":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "a ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa5++;
                                }
                                break;
                            case "e":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "e ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa5++;
                                }
                                break;
                            case "s":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "s ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa5++;
                                }
                                break;
                            case "t":
                                if(l5){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le5 = "t ";
                                    l5 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa5++;
                                }
                                break; 
                            case "r":
                                if(l6){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le6 = "r ";
                                    l6 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa5++;
                                }
                                break; 
                            case "o":
                                if(l7){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le7 = "o ";
                                    l7 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa5++;
                                }
                                break; 
                        
                    
                    
                            default:
                                    errores5++;
                                    switch(errores5){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Maestro-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    if(completa5 == 7){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }
                    
                    break;
//======================================== Maestro ============================================================================
                
                case 6:

//======================================== Terminar ============================================================================
                    
                    System.out.println("Palabra de 8 letras: "+le1+le2+le3+le4+le5+le6+le7+le8);
                    int completa6 = 0;
                    int errores6 = 0;
                    
                    while(completa6 < 8 && errores6 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "t":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "T ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8);
                                    completa6++;
                                }
                                break;
                            case "e":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "e ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8);
                                    completa6++;
                                }
                                break;
                            case "r":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "r ";
                                    le8 = "r ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8);
                                    completa6+=2;
                                }
                                break;
                            case "m":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "m ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8);
                                    completa6++;
                                }
                                break;
                            case "i":
                                if(l5){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le5 = "i ";
                                    l5 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8);
                                    completa6++;
                                }
                                break; 
                            case "n":
                                if(l6){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le6 = "n ";
                                    l6 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8);
                                    completa6++;
                                }
                                break; 
                            case "a":
                                if(l7){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le7 = "a ";
                                    l7 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7+le8);
                                    completa6++;
                                }
                                break; 
                        
                    
                    
                            default:
                                    errores6++;
                                    switch(errores6){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Terminar-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    if(completa6 == 8){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }
                    
                    break;
//======================================== Terminar ============================================================================
                
                case 7:
                    
//======================================== Comprar ============================================================================
                    
                    System.out.println("Palabra de 7 letras: "+le1+le2+le3+le4+le5+le6+le7);
                    int completa7 = 0;
                    int errores7 = 0;
                    
                    while(completa7 < 7 && errores7 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "c":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "C ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa7++;
                                }
                                break;
                            case "o":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "o ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa7++;
                                }
                                break;
                            case "m":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "m ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa7++;
                                }
                                break;
                            case "p":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "p ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa7++;
                                }
                                break;
                            case "r":
                                if(l5){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le5 = "r ";
                                    le7 = "r ";
                                    l5 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa7+=2;
                                }
                                break; 
                            case "a":
                                if(l6){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le6 = "a ";
                                    l6 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa7++;
                                }
                                break;
                    
                            default:
                                    errores7++;
                                    switch(errores7){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Comprar-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    if(completa7 == 7){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }
                    
                    break;
//======================================== Comprar ============================================================================
                
                case 8:
                    
//======================================== Objeto ============================================================================
                    
                    System.out.println("Palabra de 6 letras: "+le1+le2+le3+le4+le5+le6);
                    int completa8 = 0;
                    int errores8 = 0;
                    
                    while(completa8 < 6 && errores8 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "o":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "O ";
                                    le6 = "o ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa8+=2;
                                }
                                break;
                            case "b":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "b ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa8++;
                                }
                                break;
                            case "j":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "j ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa8++;
                                }
                                break;
                            case "e":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "e ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa8++;
                                }
                                break;
                            case "t":
                                if(l5){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le5 = "t ";
                                    l5 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa8++;
                                }
                                break; 
                        
                    
                    
                            default:
                                    errores8++;
                                    switch(errores8){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Objeto-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    
                    if(completa8 == 6){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }

                    break;
//======================================== Objeto ============================================================================
                
                case 9:
                    
//======================================== Clases ============================================================================
                    
                    System.out.println("Palabra de 6 letras: "+le1+le2+le3+le4+le5+le6);
                    int completa9 = 0;
                    int errores9 = 0;
                    
                    while(completa9 < 6 && errores9 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "c":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "C ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa9++;
                                }
                                break;
                            case "l":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "l ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa9++;
                                }
                                break;
                            case "a":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "a ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa9++;
                                }
                                break;
                            case "s":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "s ";
                                    le6 = "s ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa9+=2;
                                }
                                break;
                            case "e":
                                if(l5){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le5 = "e ";
                                    l5 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6);
                                    completa9++;
                                }
                                break; 
                        
                    
                    
                            default:
                                    errores9++;
                                    switch(errores9){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Clases-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    
                    if(completa9 == 6){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }

                    break;
//======================================== Clases ============================================================================
                
                case 10:
                    
//======================================== Métodos ============================================================================
                    
                    System.out.println("Palabra de 7 letras: "+le1+le2+le3+le4+le5+le6+le7);
                    int completa10 = 0;
                    int errores10 = 0;
                    
                    while(completa10 < 7 && errores10 <5){
                        System.out.print("Ingrese una letra: ");
                        String letra = input.nextLine();
                        switch (letra){
                            case "m":
                                if(l1){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le1 = "M ";
                                    l1 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa10++;
                                }
                                break;
                            case "e":
                                if(l2){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le2 = "é ";
                                    l2 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa10++;
                                }
                                break;
                            case "t":
                                if(l3){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le3 = "t ";
                                    l3 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa10++;
                                }
                                break;
                            case "o":
                                if(l4){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le4 = "o ";
                                    le6 = "o ";
                                    l4 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa10+=2;
                                }
                                break;
                            case "d":
                                if(l5){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le5 = "d ";
                                    l5 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa10++;
                                }
                                break; 
                            case "s":
                                if(l7){
                                    System.out.println("Letra ya ingresada.");
                                }else{
                                    le7 = "s ";
                                    l7 = true;
                                    System.out.println(p1);
                                    System.out.println(p2);
                                    System.out.println(p3);
                                    System.out.println(p4);
                                    System.out.println(p5);
                                    System.out.println(p6);
                                    System.out.println(p7);
                                    System.out.println(p8);
                                    System.out.println(le1+le2+le3+le4+le5+le6+le7);
                                    completa10++;
                                }
                                break;
                    
                            default:
                                    errores10++;
                                    switch(errores10){
                                        case 1:
                                            p2 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 2:
                                            p3 = " |   0      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 3:
                                            p4 = " |  ---     ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 4:
                                            p5 = " |   |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            break;
                                        case 5:
                                            p6 = " |  | |      ";
                                            System.out.println(p1);
                                            System.out.println(p2);
                                            System.out.println(p3);
                                            System.out.println(p4);
                                            System.out.println(p5);
                                            System.out.println(p6);
                                            System.out.println(p7);
                                            System.out.println(p8);
                                            System.out.println(le1+le2+le3+le4+le5+le6);
                                            System.out.println("Haz perdido. La palabra era -Métodos-");
                                            System.out.println("Desea seguir jugando? Responda si o no.");
                                            String seguir = input.nextLine();
                                            if("si".equals(seguir)){
                                                le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                palabra = (int)(Math.random()*10+1);
                                                termina = false;
                                                p1 = "_______     ";
                                                p2 = " |          ";
                                                p3 = " |          ";
                                                p4 = " |          ";
                                                p5 = " |          ";
                                                p6 = " |          ";
                                                p7 = " |          ";
                                                p8 = "_|__________";
                                            }else{
                                                termina = true;
                                            }
                                            break;
                                    }

                                

                                
                                break;
                            }
                    }
                    
                    if(completa10 == 7){
                                    System.out.println("Felicidades, ganaste!");
                                    System.out.println("Desea seguir jugando? Responda si o no.");
                                                String seguir = input.nextLine();
                                                if("si".equals(seguir)){
                                                    le1 = "_ "; le2 = "_ "; le3 = "_ "; le4 = "_ "; le5 = "_ ";
                                                    le6 = "_ "; le7 = "_ "; le8 = "_ "; le9 = "_ "; le10 = "_ ";
                                                    l1 = false; l2 = false; l3 = false; l4 = false; l5 = false;
                                                    l6 = false; l7 = false; l8 = false; l9 = false; l10 = false;
                                                    palabra = (int)(Math.random()*10+1);
                                                    termina = false;
                                                    p1 = "_______     ";
                                                    p2 = " |          ";
                                                    p3 = " |          ";
                                                    p4 = " |          ";
                                                    p5 = " |          ";
                                                    p6 = " |          ";
                                                    p7 = " |          ";
                                                    p8 = "_|__________";
                                                }else{
                                                    termina = true;
                                                }
                                }
                    
                    break;
//======================================== Métodos ============================================================================
                    
                }
            }
        }
    }