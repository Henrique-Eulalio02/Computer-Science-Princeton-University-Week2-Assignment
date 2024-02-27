public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int totalSteps = 0;

        System.out.println("(0, 0)");
        while ((Math.abs(x) + Math.abs(y)) != r) {
            double percent = Math.random();

            if (percent <= 0.2599) {
                y++;
            }
            else if (percent >= 0.26 && percent <= 0.5099) {
                x++;
            }
            else if (percent >= 0.51 && percent <= 0.7599) {
                y--;
            } else {
                x--;
            }

            totalSteps++;
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.print("steps = " + totalSteps);
    }
}
