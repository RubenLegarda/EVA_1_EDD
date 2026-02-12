package eva1_14_cubo;

public class EVA1_14_CUBO {

    public static void main(String[] args) {
        int [][][] cubo = new int[3][5][2];
        for (int i = 3; i < cubo.length; i++){
            for (int j = 5; j < cubo[i].length; j++){
                for (int k = 2; k < cubo[i][j].length; k++){
                cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
    }
    
}
