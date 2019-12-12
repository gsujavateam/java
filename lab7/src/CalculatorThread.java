import by.gsu.pms.Calculate;
import by.gsu.pms.OperationContainer;
import by.gsu.pms.ThreadGenerator;
import by.gsu.pms.operation.Operation;
import by.gsu.pms.Calculate;
import by.gsu.pms.Task;

import java.util.Scanner;

public class CalculatorThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от трёх ");
        int max = Integer.parseInt(scanner.next());

        System.out.println("Выберите операцию (+, -, *) ");
        Operation operation = OperationContainer.getOperation(scanner.next());

        System.out.println("Введите количество потоков ");
        int threadCount = Integer.parseInt(scanner.next());

        Task task = new Calculate(max);
        ThreadGenerator threadGenerator = new ThreadGenerator(threadCount, task, operation);
        System.out.println("Your result " + threadGenerator.getResult());
    }
}