public class CheckElements {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 8, 5, 3, 7, 8, 8, 4, 4, 5, 6, 2};
        System.out.println(uniqueElements(array));
    }
    public static int uniqueElements(int[]array){
        int uniqueChar = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            uniqueChar++;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return uniqueChar - count;
    }
}
