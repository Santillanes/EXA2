
import java.util.Scanner;

/*
 * Examen Unidad II - Problema 2
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
        
        boolean banu1 = false, banu2 = false, banu3 = false, banu4 = false, banu5 = false;
        boolean banu6 = false, banu7 = false, banu8 = false, banu9=false;
        
        boolean banc1 = false, banc2 = false, banc3 = false, banc4 = false, banc5 = false;
        boolean banc6 = false, banc7 = false, banc8 = false, banc9=false;
        
        boolean ban1 = false, ban2 = false, ban3 = false, ban4 = false, ban5 = false;
        boolean ban6 = false, ban7 = false, ban8 = false, ban9=false;
        
        String p1 = "|   "; String p2 = "|   "; String p3 = "|   "; String p4 = "|   "; String p5 = "|   ";
        String p6 = "|   ";  String p7 = "|   "; String p8 = "|   "; String p9 = "|   ";
        
        int cont = 1;
        boolean termina = false;
        System.out.println("*********************** INSTRUCCIONES ***********************");
        System.out.println("Las posiciones del juego es: ");
        System.out.println("    1   2   3  ");
        System.out.println("1 "+p1+p2+p3+"|");
        System.out.println("2 "+p4+p5+p6+"|");
        System.out.println("3 "+p7+p8+p9+"|");
        System.out.println("Las posiciones se ingresan de la siguiente manera: 1,2");
        System.out.println("*********************** INSTRUCCIONES ***********************");
        System.out.println("");
        int inicio = (int)(Math.random()*2+1);
        
        if(inicio == 1){
            
//******************************************************************************************************************************* 
//************************************* INICIA USUARIO **************************************************************************
            
             System.out.println("Inicia el Usuario.");
             
             while(!termina){
                //===================================== INICIA TURNO USUARIO =================================================
                if(cont%2 != 0){
                System.out.print("Ingrese la posición: ");
                String pos = input.nextLine();
                switch (pos){
                    case "1,1":
                        if(banu1 || banc1){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p1="| X ";
                        banu1 = true;
                        ban1 = true;
                        cont++;
                        }
                        break;
                    case "2,1":
                        if(banu2 || banc2){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p2="| X ";
                        banu2 = true;
                        ban2 = true;
                        cont++;
                        }
                        break;
                    case "3,1":
                        if(banu3 || banc3){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p3="| X ";
                        banu3 = true;
                        ban3 = true;
                        cont++;
                        }
                        break;
                    case "1,2":
                        if(banu4 || banc4){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p4="| X ";
                        banu4 = true;
                        ban4 = true;
                        cont++;
                        }
                        break;
                    case "2,2":
                        if(banu5 || banc5){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p5="| X ";
                        banu5 = true;
                        ban5 = true;
                        cont++;
                        }
                        break;
                    case "3,2":
                        if(banu6 || banc6){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p6="| X ";
                        banu6 = true;
                        ban6 = true;
                        cont++;
                        }
                        break;
                    case "1,3":
                        if(banu7 || banc7){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p7="| X ";
                        banu7 = true;
                        ban7 = true;
                        cont++;
                        }
                        break;
                    case "2,3":
                        if(banu8 || banc8){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p8="| X ";
                        banu8 = true;
                        ban8 = true;
                        cont++;
                        }
                        break;
                    case "3,3":
                        if(banu9 || banc9){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p9="| X ";
                        banu9 = true;
                        ban9 = true;
                        cont++;
                        }
                        break;
                    default:
                        System.out.println("Coordenada inválida.");
                        continue;                     
                }
                }
                //================================== TERMINA TURNO USUARIO ====================================================
                
                //============================== INICIA GANADOR ===================================================
                if((banu1 && banu2 && banu3) || (banu4 && banu5 && banu6) || (banu7 && banu8 && banu9)
                        || (banu1 && banu4 && banu7) || (banu2 && banu5 && banu8) || (banu3 && banu6 && banu9)
                        || (banu1 && banu5 && banu9) || (banu3 && banu5 && banu7)){
                    System.out.println("El usuario gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                    
                }else if((banc1 && banc2 && banc3) || (banc4 && banc5 && banc6) || (banc7 && banc8 && banc9)
                        || (banc1 && banc4 && banc7) || (banc2 && banc5 && banc8) || (banc3 && banc6 && banc9)
                        || (banc1 && banc5 && banc9) || (banc3 && banc5 && banc7)){
                    System.out.println("La computadora gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }else if(ban1 && ban2 && ban3 && ban4 && ban5 && ban6 && ban7 && ban8 && ban9){
                    System.out.println("Ninguno gana. Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }
                //================================ TERMINA GANADOR ==================================================
                
                //================================== INICIA TURNO COMPUTADORA =================================================
                if(cont%2 == 0){
                int x = (int)(Math.random()*3+1);
                int y = (int)(Math.random()*3+1);
                String pos2 = ""+x+","+y+"";
                switch (pos2){
                    case "1,1":
                        if(banu1 || banc1){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p1="| O ";
                        banc1 = true;
                        ban1 = true;
                        cont++;
                        }
                        break;
                    case "2,1":
                        if(banu2 || banc2){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p2="| O ";
                        banc2 = true;
                        ban2 = true;
                        cont++;
                        }
                        break;
                    case "3,1":
                        if(banu3 || banc3){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p3="| O ";
                        banc3 = true;
                        ban3 = true;
                        cont++;
                        }
                        break;
                    case "1,2":
                        if(banu4 || banc4){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p4="| O ";
                        banc4 = true;
                        ban4 = true;
                        cont++;
                        }
                        break;
                    case "2,2":
                        if(banu5 || banc5){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p5="| O ";
                        banc5 = true;
                        ban5 = true;
                        cont++;
                        }
                        break;
                    case "3,2":
                        if(banu6 || banc6){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p6="| O ";
                        banc6 = true;
                        ban6 = true;
                        cont++;
                        }
                        break;
                    case "1,3":
                        if(banu7 || banc7){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p7="| O ";
                        banc7 = true;
                        ban7 = true;
                        cont++;
                        }
                        break;
                    case "2,3":
                        if(banu8 || banc8){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p8="| O ";
                        banc8 = true;
                        ban8 = true;
                        cont++;
                        }
                        break;
                    case "3,3":
                        if(banu9 || banc9){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p9="| O ";
                        banc9 = true;
                        ban9 = true;
                        cont++;
                        }
                        break;
                    default:
                        System.out.println("Coordenada inválida.");
                        continue;                  
                }
                }
                //================================== TERMINA TURNO COMPUTADORA ====================================================
                
                System.out.println("Las posiciones del juego es: ");
                System.out.println("    1   2   3  ");
                System.out.println("1 "+p1+p2+p3+"|");
                System.out.println("2 "+p4+p5+p6+"|");
                System.out.println("3 "+p7+p8+p9+"|");
                
                //============================== INICIA GANADOR ===================================================
                if((banu1 && banu2 && banu3) || (banu4 && banu5 && banu6) || (banu7 && banu8 && banu9)
                        || (banu1 && banu4 && banu7) || (banu2 && banu5 && banu8) || (banu3 && banu6 && banu9)
                        || (banu1 && banu5 && banu9) || (banu3 && banu5 && banu7)){
                    System.out.println("El usuario gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                    
                }else if((banc1 && banc2 && banc3) || (banc4 && banc5 && banc6) || (banc7 && banc8 && banc9)
                        || (banc1 && banc4 && banc7) || (banc2 && banc5 && banc8) || (banc3 && banc6 && banc9)
                        || (banc1 && banc5 && banc9) || (banc3 && banc5 && banc7)){
                    System.out.println("La computadora gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }else if(ban1 && ban2 && ban3 && ban4 && ban5 && ban6 && ban7 && ban8 && ban9){
                    System.out.println("Ninguno gana. Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }
                //================================ TERMINA GANADOR ==================================================
             }
//************************************* INICIA USUARIO **************************************************************************             
//*******************************************************************************************************************************            
        }else{
//******************************************************************************************************************************* 
//************************************* INICIA COMPUTADORA **********************************************************************
            System.out.println("Inicia la Computdora.");
            
            while(!termina){
                //================================== INICIA TURNO COMPUTADORA =================================================
                if(cont%2 != 0){
                int x = (int)(Math.random()*3+1);
                int y = (int)(Math.random()*3+1);
                String pos2 = ""+x+","+y+"";
                switch (pos2){
                    case "1,1":
                        if(banu1 || banc1){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p1="| O ";
                        banc1 = true;
                        ban1 = true;
                        cont++;
                        }
                        break;
                    case "2,1":
                        if(banu2 || banc2){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p2="| O ";
                        banc2 = true;
                        ban2 = true;
                        cont++;
                        }
                        break;
                    case "3,1":
                        if(banu3 || banc3){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p3="| O ";
                        banc3 = true;
                        ban3 = true;
                        cont++;
                        }
                        break;
                    case "1,2":
                        if(banu4 || banc4){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p4="| O ";
                        banc4 = true;
                        ban4 = true;
                        cont++;
                        }
                        break;
                    case "2,2":
                        if(banu5 || banc5){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p5="| O ";
                        banc5 = true;
                        ban5 = true;
                        cont++;
                        }
                        break;
                    case "3,2":
                        if(banu6 || banc6){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p6="| O ";
                        banc6 = true;
                        ban6 = true;
                        cont++;
                        }
                        break;
                    case "1,3":
                        if(banu7 || banc7){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p7="| O ";
                        banc7 = true;
                        ban7 = true;
                        cont++;
                        }
                        break;
                    case "2,3":
                        if(banu8 || banc8){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p8="| O ";
                        banc8 = true;
                        ban8 = true;
                        cont++;
                        }
                        break;
                    case "3,3":
                        if(banu9 || banc9){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p9="| O ";
                        banc9 = true;
                        ban9 = true;
                        cont++;
                        }
                        break;
                    default:
                        System.out.println("Coordenada inválida.");
                        continue;                  
                }
                }
                //================================== TERMINA TURNO COMPUTADORA ====================================================
                
                System.out.println("Las posiciones del juego es: ");
                System.out.println("    1   2   3  ");
                System.out.println("1 "+p1+p2+p3+"|");
                System.out.println("2 "+p4+p5+p6+"|");
                System.out.println("3 "+p7+p8+p9+"|");
                //============================== INICIA GANADOR ===================================================
                if((banu1 && banu2 && banu3) || (banu4 && banu5 && banu6) || (banu7 && banu8 && banu9)
                        || (banu1 && banu4 && banu7) || (banu2 && banu5 && banu8) || (banu3 && banu6 && banu9)
                        || (banu1 && banu5 && banu9) || (banu3 && banu5 && banu7)){
                    System.out.println("El usuario gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                    
                }else if((banc1 && banc2 && banc3) || (banc4 && banc5 && banc6) || (banc7 && banc8 && banc9)
                        || (banc1 && banc4 && banc7) || (banc2 && banc5 && banc8) || (banc3 && banc6 && banc9)
                        || (banc1 && banc5 && banc9) || (banc3 && banc5 && banc7)){
                    System.out.println("La computadora gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }else if(ban1 && ban2 && ban3 && ban4 && ban5 && ban6 && ban7 && ban8 && ban9){
                    System.out.println("Ninguno gana. Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }
                //================================ TERMINA GANADOR ==================================================
                
                //===================================== INICIA TURNO USUARIO =================================================
                if(cont%2 == 0){
                System.out.print("Ingrese la posición: ");
                String pos = input.nextLine();
                switch (pos){
                    case "1,1":
                        if(banu1 || banc1){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p1="| X ";
                        banu1 = true;
                        ban1 = true;
                        cont++;
                        }
                        break;
                    case "2,1":
                        if(banu2 || banc2){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p2="| X ";
                        banu2 = true;
                        ban2 = true;
                        cont++;
                        }
                        break;
                    case "3,1":
                        if(banu3 || banc3){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p3="| X ";
                        banu3 = true;
                        ban3 = true;
                        cont++;
                        }
                        break;
                    case "1,2":
                        if(banu4 || banc4){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p4="| X ";
                        banu4 = true;
                        ban4 = true;
                        cont++;
                        }
                        break;
                    case "2,2":
                        if(banu5 || banc5){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p5="| X ";
                        banu5 = true;
                        ban5 = true;
                        cont++;
                        }
                        break;
                    case "3,2":
                        if(banu6 || banc6){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p6="| X ";
                        banu6 = true;
                        ban6 = true;
                        cont++;
                        }
                        break;
                    case "1,3":
                        if(banu7 || banc7){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p7="| X ";
                        banu7 = true;
                        ban7 = true;
                        cont++;
                        }
                        break;
                    case "2,3":
                        if(banu8 || banc8){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p8="| X ";
                        banu8 = true;
                        ban8 = true;
                        cont++;
                        }
                        break;
                    case "3,3":
                        if(banu9 || banc9){
                            System.out.println("Casilla ocupada.");
                            continue;
                        }else{
                        p9="| X ";
                        banu9 = true;
                        ban9 = true;
                        cont++;
                        }
                        break;
                    default:
                        System.out.println("Coordenada inválida.");
                        continue;                     
                }
                }
                //================================== TERMINA TURNO USUARIO ====================================================
                
                
                //============================== INICIA GANADOR ===================================================
                if((banu1 && banu2 && banu3) || (banu4 && banu5 && banu6) || (banu7 && banu8 && banu9)
                        || (banu1 && banu4 && banu7) || (banu2 && banu5 && banu8) || (banu3 && banu6 && banu9)
                        || (banu1 && banu5 && banu9) || (banu3 && banu5 && banu7)){
                    System.out.println("El usuario gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                    
                }else if((banc1 && banc2 && banc3) || (banc4 && banc5 && banc6) || (banc7 && banc8 && banc9)
                        || (banc1 && banc4 && banc7) || (banc2 && banc5 && banc8) || (banc3 && banc6 && banc9)
                        || (banc1 && banc5 && banc9) || (banc3 && banc5 && banc7)){
                    System.out.println("La computadora gana.");
                    System.out.println("Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }else if(ban1 && ban2 && ban3 && ban4 && ban5 && ban6 && ban7 && ban8 && ban9){
                    System.out.println("Ninguno gana. Desea seguir jugando? Responda si o no.");
                    String jugar = input.nextLine();
                    switch (jugar){
                        case "no":
                            termina = true;
                            break;
                        case "si":
                            //REINICIAMOS TODO
                            banu1 = false; banu2 = false; banu3 = false; banu4 = false; banu5 = false;
                            banu6 = false; banu7 = false; banu8 = false; banu9=false;
                            banc1 = false; banc2 = false; banc3 = false; banc4 = false; banc5 = false;
                            banc6 = false; banc7 = false; banc8 = false; banc9=false;
                            p1 = "|   "; p2 = "|   "; p3 = "|   "; p4 = "|   "; p5 = "|   ";
                            p6 = "|   ";  p7 = "|   "; p8 = "|   "; p9 = "|   ";
                            ban1 = false; ban2 = false; ban3 = false; ban4 = false; ban5 = false;
                            ban6 = false; ban7 = false; ban8 = false; ban9 = false;
                            cont = 1;
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                            break;
                    }
                }
                //================================ TERMINA GANADOR ==================================================
             }
            
        }
//************************************* INICIA COMPUTADORA **********************************************************************             
//******************************************************************************************************************************* 
        
    }

    }