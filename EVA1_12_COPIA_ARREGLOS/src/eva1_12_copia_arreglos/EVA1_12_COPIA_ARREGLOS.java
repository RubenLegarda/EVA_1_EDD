package eva1_12_copia_arreglos;

public class EVA1_12_COPIA_ARREGLOS {

    public static void main(String[] args) {
        Ejemplo [] arreglo = new Ejemplo[2];
        System.out.println(arreglo);
        //arreglo. --> nos permite accederal arreglo
        //creamos cada objeto en las posiciones del arreglo
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        //Imprimimos las direcciones
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        
        System.out.println(arreglo[0].val);
        System.out.println(arreglo[1].val);
        
        //Ejemplo[] copia = arreglo; //NO FUNCIONA CREO UN DUPLICADO DE LA DIRECCION
        Ejemplo[]copia = new Ejemplo[2];
        System.out.println("Copia = " + copia);
        // posicion por posicion copiar de un arreglo al otro:
        //ESTO NO SIRVE TAMPOCO
        //copia[0] = arreglo[0]; //no duplico el objeto, duplique la direccion
        //copia[1] = arreglo[1];
        //CREAR UN "BACKUP" DE UN OBJETO IMPLICA "CREAR" O INSTANCIAR OTRO OBJETO QUE SERVIRA DE RESPALDO
        copia[0] = new Ejemplo();
        copia[1] = new Ejemplo();
        System.out.println("Copia[0]=" + copia[0]);
        System.out.println("Copia[1]=" + copia[1]);
        //ahora si, hay que transferir la info de un objeto a aotro (siempre y cuando esa info no sean objetos tambien)
        copia[0].val = arreglo[0].val;
        copia[1].val = arreglo[1].val;
    }
    
}

class Ejemplo{
int val = 5;
}

        
        