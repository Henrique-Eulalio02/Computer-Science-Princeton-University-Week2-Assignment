public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int x = 0;
        int y = 0;
        int totalSteps = 0;
        int i = 0;
        double average = 0.0;
        double finalAverage;

        while (i < trials) {
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
            }

            average += totalSteps;

            i++;
        }

        finalAverage = average/trials;
        System.out.println("average number of steps = " + finalAverage);
    }
}
