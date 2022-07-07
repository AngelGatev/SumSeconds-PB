package JavaBasics.ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeCompetitor1 = Integer.parseInt(scanner.nextLine());
        int timeCompetitor2 = Integer.parseInt(scanner.nextLine());
        int timeCompetitor3 = Integer.parseInt(scanner.nextLine());
        int totalTime = timeCompetitor1 + timeCompetitor2 + timeCompetitor3;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
