package Project;

public class GuessGame {

    public void game() {
        Player player1 = new Player("Максим");
        Player player2 = new Player("Андрей");
        Player player3 = new Player("Даня");

        String name = player1.name;
        String name2 = player2.name;
        String name3 = player3.name;

        int guess = 0;
        int guess2 = 0;
        int guess3 = 0;

        boolean plusUgadal = false;
        boolean plusUgadal2 = false;
        boolean plusUgadal3 = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Организатор загаздывает число от 0 до 9..");
        while (true) {

            player1.guess();
            player2.guess();
            player3.guess();
            guess = player1.number;
            System.out.printf("%s думает что это число %d\n", name, guess);
            guess2 = player2.number;
            System.out.printf("%s думает что это число %d\n", name2, guess2);
            guess3 = player3.number;
            System.out.printf("%s думает что это число %d\n", name3, guess3);
            if (targetNumber == guess) {
                plusUgadal = true;
            }
            if (targetNumber == guess2) {
                plusUgadal2 = true;
            }
            if (targetNumber == guess3) {
                plusUgadal3 = true;
            }
            if (plusUgadal || plusUgadal2 || plusUgadal3) {
                System.out.println("У нас есть победитель!!!");
                System.out.printf("%s угадал число? %b\n", name, plusUgadal);
                System.out.printf("%s угадал число? %b\n", name2, plusUgadal2);
                System.out.printf("%s угадал число? %b\n", name3, plusUgadal3);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз.");
            }
        }
    }
}