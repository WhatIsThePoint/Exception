public class AddTable {
    public static void main(String[] args) {
        int[] array = new int[3];

        try {
            for (int i = 0; i < 4; ++i) {
                array[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("The array index is out of bounds.");
        }
    }
}
