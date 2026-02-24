package eva1_21_sumatoria;

public class EVA1_21_SUMATORIA {

    public static void main(String[] args) {
        // TODO code application logic here
        //SUMATORIA(5) = 5+ 4 + 3 + 2 + 1
                System.out.println("La sumatoria de 5 es: " + sumatoria(5));
    } 

    
    // Calcula la sumatoria usando recursividad
    public static int sumatoria(int val) {
        // Caso base
        if (val != 1)
            return val + sumatoria(val - 1); //resuelve el problema, llamada recursiva
        else
            return val;
    }
    }
    
