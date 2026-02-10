/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_variable;

/**
 *
 * @author RubLeg
 */
public class EVA_1_VARIABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES LOCALES: --> STACK
        //Cualquier variable declarada en un metodo
        int x = 100; // 4 bytes
        char caracter = 'c'; //2 bytes
        
        //VARIABLES DINAMICAS: --> HEAP
        //OBJETOS
        
        Persona per = new Persona();
    }

    private static class Persona {

        public Persona() {
        }
    }
    
}
