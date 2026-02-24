package eva1_18_factorial;

public class EVA1_18_FACTORIAL {
    public static void main(String[] args) {
        // TODO code application logic here
        //Factorial(5) = 5 * 4 * 3 * 2 * 1
        System.out.println("El factorial de 5 es: " + factorial(5));
    } 

    
    // Calcula la potencia usando recursividad
    public static int factorial(int val) {
        // Caso base
        if (val != 1)
            return val * factorial(val - 1); //resuelve el problem, llamada recursiva
        else
            return val;
    }
}
