import java.util.Scanner;

/*
 * Examen Unidad II - Problema 1
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
        Scanner input = new Scanner(System.in);
        int iPiedra = 1;
        int iPapel = 2;
        int iTijeras = 3;
        int contU = 0;
        int contIA = 0;
        int contE = 0;
        boolean termina = false;
        
        while(!termina){
            System.out.println("Juego de piedra, papel o tijeras");
            System.out.println("¿Que eliges?, ¿Piedra, papel o tijeras?");
        String sJugador = input.nextLine();
        
        if(("piedra".equals(sJugador)) || ("papel".equals(sJugador)) || ("tijeras".equals(sJugador))){
        
        int iInteligenciaArtificial =(int)(Math.random()*3+1); 
        switch(iInteligenciaArtificial){
            
        case 1:
            System.out.println("La inteligencia artificial elige Piedra.");   
            break;
       
        case 2:
            System.out.println("La inteligencia artificial elige Papel.");  
            break;
        
        case 3:
            System.out.println("La inteligencia artificial elige Tijeras.");
            break;
        }     //Si la PC elige 1 (piedra) y tu piedra = Empate
        if(iInteligenciaArtificial == 1 && "piedra".equals(sJugador)){
            System.out.println("Empate.");
            contE++;
            }
            if(iInteligenciaArtificial == 2 && "papel".equals(sJugador)){
                System.out.println("Empate.");
                contE++;
                }   
                if(iInteligenciaArtificial == 3 && "tijeras".equals(sJugador)){
                    System.out.println("Empate.");
                    contE++;
                    }     //Si la PC elige 1 (piedra) y tu tijeras = Perdiste
                    if(iInteligenciaArtificial == 1 && "tijeras".equals(sJugador)){
                        System.out.println("Perdiste.");
                        contIA++;
                        }    
                        if(iInteligenciaArtificial == 1 && "papel".equals(sJugador)){
                            System.out.println("Ganaste.");
                            contU++;
                            }
                            if(iInteligenciaArtificial == 2 && "piedra".equals(sJugador)){
                                System.out.println("Perdiste.");
                                contIA++;
                                }     //Si la PC elige 2 (papel) y tu tijeras = Ganaste
                                 if(iInteligenciaArtificial == 2 && "tijeras".equals(sJugador)){
                                    System.out.println("Ganaste.");
                                    contU++;
                                    }
                                    if(iInteligenciaArtificial == 3 && "piedra".equals(sJugador)){
                                        System.out.println("Ganaste.");
                                        contU++;
                                        }
                                        if(iInteligenciaArtificial == 3 && "papel".equals(sJugador)){
                                            System.out.println("Perdiste.");
                                            contIA++;
        }
            System.out.println("**************************************");
            System.out.println("        IA      -> "+contIA);
            System.out.println("        Usuario -> "+contU);
            System.out.println("        Empates -> "+contE);
            System.out.println("**************************************");
            System.out.println("");
                                        
            System.out.println("Desea seguir jugando? Responda si o no.");
            String seguir = input.nextLine();
            switch(seguir){
                case "no":
                    termina = true;
                    break;
                case "si":
                    System.out.println("*** El juego continua. ***");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Respuesta no válida. Juego terminado.");
                    termina = true;
            }
        }else{
            System.out.println("Respuesta inválida.");
            System.out.println("");
        }
      }
    }
}
