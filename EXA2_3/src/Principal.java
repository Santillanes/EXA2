
import java.util.Scanner;

/*
 * Examen Unidad II - Problema 3
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
        
        System.out.println("Tiene Fiebre?");
        boolean bFiebre;
        
        bFiebre = input.nextBoolean();
        if (bFiebre == true) {
            System.out.println("Tose?");
            boolean bToz;
            
            bToz = input.nextBoolean();
            if (bToz == true) {
                System.out.println("Le cuesta respirar o toce con flemas?");
                boolean bFlemas;
                
                bFlemas = input.nextBoolean();
                if (bFlemas == true) {
                    System.out.println("Posible Diagnostico: Neunomia o infeccion en las vias respiratorias");
                } else {
                    System.out.println("Le duele la Cabeza?");
                    boolean bCabe;
                    
                    bCabe = input.nextBoolean();
                    if (bCabe == true) {
                        System.out.println("Posible Diagnostico: Infeccion Virica");
                    } else {
                        System.out.println("Le duelen los huesos o las articulaciones?");
                        boolean bHueso;
                        
                        bHueso = input.nextBoolean();
                        if (bHueso == true) {
                            System.out.println("Posible Diagnostico: Infeccion Virica");
                        } else {
                            System.out.println("Precenta erupciones cutaneas?");
                            boolean bCuta;
                            
                            bCuta = input.nextBoolean();
                            if (bCuta == true) {
                                System.out.println("No se dispone de informacion suficiente para un diagnostico");
                            } else {
                                System.out.println("Le duele la garganta?");
                                boolean bGarga;
                                
                                bGarga = input.nextBoolean();
                                if (bGarga == true) {
                                    System.out.println("Posible diagnostico: Infeccion de garganta");
                                } else {
                                    System.out.println("Le duele la espalda con escalfrios y fiebre?");
                                    boolean bEspa;
                                    
                                    bEspa = input.nextBoolean();
                                    if (bEspa == true) {
                                        System.out.println("Posible Diagnostico: Infeccion renal");
                                    } else {
                                        System.out.println("Le duele al orinar o lo hace con mas frecuencia?");
                                        boolean bOrina;
                                        
                                        bOrina = input.nextBoolean();
                                        if (bOrina == true) {
                                            System.out.println("Posible Diagnostico: Infeccion del tracto urinario");
                                        } else {
                                            System.out.println("Haz pasado el dia en el sol o con mucho calor?");
                                            boolean bCalor;
                                            
                                            bCalor = input.nextBoolean();
                                            if (bCalor == true) {
                                                System.out.println("Posible Diagnostico: Golpe de calor");
                                            } else {
                                                System.out.println("No se dispone d einformacion suficiente para un diagnostico");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("Le duele la cabeza?");
                boolean bCabeza;
                
                bCabeza = input.nextBoolean();
                if (bCabeza == true) {
                    System.out.println("Tiene alguno de los siguientes sintomas: dolor cuando inclina la cabeza hacia delante, nauceas, vomitos, somnolencia o confusion?");
                    boolean bSinto;
                    
                    bSinto = input.nextBoolean();
                    if (bSinto == true) {
                        System.out.println("Posible Diagnostico: Tiene Meningilitis");
                    } else {
                        System.out.println("Vomita o tiene diarrea?");
                        boolean bDiarrea;
                        
                        bDiarrea = input.nextBoolean();
                        if (bDiarrea == true) {
                            System.out.println("Posible Diagnostico: Infeccion del tracto digestivo");
                        } else {
                            System.out.println("Le duelen los huesos o las articulaciones?");
                            boolean bArti;
                            
                            bArti = input.nextBoolean();
                            if (bArti == true) {
                            }
                        }
                    }
                } else {
                    System.out.println("Vomita o tiene diarrea?");
                }
            }
        } else {
            System.out.println("No se dispone de la informacion suficiente para realizar un diagnostico");
        }
        
    }
    
}
