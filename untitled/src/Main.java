import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SummonRift summonRifts = new SummonRift();

        System.out.println("TEAM SKT");
        for (int i = 1; i <= 5; i++) {
            System.out.println("nhập tên người chơi "+i);
            String name = scanner.nextLine();
            ArrayList<Figure> figures = new ArrayList<>();
            System.out.println("nhập tên tướng của người chơi "+i);
            String figure = scanner.nextLine();
            System.out.println("nhập position của tướng");
            int position = Integer.parseInt(scanner.nextLine());
            figures.add(new Figure(figure, position));
            SummonRift.addSkt(name, figures);
        }

        System.out.println("TEAM G2");
        for (int i = 1; i <= 5; i++) {
            System.out.println("nhập tên người chơi "+i);
            String name = scanner.nextLine();
            ArrayList<Figure> figures = new ArrayList<>();
            System.out.println("nhập tên tướng của người chơi "+i);
            String figure = scanner.nextLine();
            System.out.println("nhập position của tướng");
            int position = Integer.parseInt(scanner.nextLine());
            figures.add(new Figure(figure, position));
            SummonRift.addG2(name, figures);
        }

        System.out.println(summonRifts);

    }
}