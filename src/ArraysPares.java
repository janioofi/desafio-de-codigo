public class ArraysPares {
    public static void main(String[] args){
        int[] array = { 2, 3, 5, 7, 11, 13, 18, 34};
        int tamanho = array.length;

        for(int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
