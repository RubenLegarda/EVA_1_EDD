package eva1_20_potencia;

public class EVA1_20_POTENCIA {

    public static void main(String[] args) {
        System.out.println("2 elevado a la 5 = " + potencia(2,3));
    } 

    
    // Calcula la potencia usando recursividad
    public static int potencia(int base, int exp) {
        // Caso base
        if (exp == 1)
            return base * potencia(base, exp - 1); //resuelve el problem, llamada recursiva
        else
            return base;
    }
}