public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        if (n >= 0 && width >= 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int distanceToDiagonal = Math.abs(i - j);
                    if (distanceToDiagonal <= width) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("0  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
