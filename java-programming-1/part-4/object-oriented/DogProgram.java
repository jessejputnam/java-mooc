// import java.util.Scanner;

public class DogProgram {
    public static void main(String[] args) {
        // Dog luna = new Dog("Luna", "Dachsund/Pitbull", 6);

        // luna.printInfo();
        // System.out.println(luna.dog);
        // luna.printName();
        // System.out.println("Want a treat?");
        // Dog.speak(2);

        // Whistle duckWhistle = new Whistle("quack");
        // Whistle roosterWhistle = new Whistle("cock-a-doodle-doo");
        // duckWhistle.sound();
        // roosterWhistle.sound();

        // Door victorian = new Door();
        // victorian.knock();

        // Product product = new Product("banana", 1.10, 13);
        // product.printProduct();

        // DecreasingCounter counter = new DecreasingCounter(3);
        // counter.printValue();
        // counter.decrement();
        // counter.reset();
        // counter.printValue();

        // Debt debt = new Debt(120000.0, 1.01);
        // debt.printBalance();
        // debt.waitOneYear();
        // debt.printBalance();

        // for (int i = 0; i < 20; i++)
        // debt.waitOneYear();

        // debt.printBalance();]

        // Agent agent = new Agent("James", "Bond");
        // System.out.println(agent);

        // Scanner scanner = new Scanner(System.in);
        // Statistics all = new Statistics();
        // Statistics even = new Statistics();
        // Statistics odd = new Statistics();
        // System.out.println("Enter numbers: ");
        // while (true) {
        // int input = Integer.valueOf(scanner.nextLine());
        // if (input == -1)
        // break;

        // all.addNumber(input);
        // if (input % 2 == 0)
        // even.addNumber(input);
        // else
        // odd.addNumber(input);

        // }
        // scanner.close();

        // System.out.println("Sum: " + all.sum());
        // System.out.println("Sum of even numbers: " + even.sum());
        // System.out.println("Sum of odd numbers: " + odd.sum());

        PaymentCard card = new PaymentCard(10);
        System.out.println(card);

        card.addMoney(-15);
        System.out.println(card);
    }
}
