public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Printing elements in order: ");
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
        reverse(array);
        System.out.println("\nPrinting elements in reverse-order: ");
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");
    }
    private static void reverse(int[] array){
        int temp;
        int arrEnd = array.length-1;
        for(int i=0; i<(array.length)/2; i++){
            temp = array[i];
            array[i] = array[arrEnd-i];
            array[arrEnd-i] = temp;
        }

    }
}