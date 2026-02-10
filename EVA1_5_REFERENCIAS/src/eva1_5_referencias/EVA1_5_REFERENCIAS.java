package eva1_5_referencias;

public class EVA1_5_REFERENCIAS {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;
        Prueba prueba = new Prueba(); //CREANDO UNA INSTANCIA DE PRUEBA
        System.out.println(x);
        System.out.println(prueba);
        //En java, una variable que guarda una direccion (memoria) se llama REFERENCIA
        //En otros lenguajes ---> apuntadores
        //COMO DESTRUYO UN OBJETO:
        prueba = null;//esto solo desconecta la variable del objeto
    }
    
}

class Prueba{
 int y = 200;
}