public class SuperHotel {
    static int[] x = new int[1];

    public void reserver() {
        x[0] = 1;
    }

    public static void main(String args[]) {
        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}
