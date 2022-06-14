package src.runner;

import src.exeptionsHandling.ContractExeption;
import src.exeptionsHandling.DocNumExeption;
import src.task1.Task1;

import java.io.IOException;


public class Runner {
    public static void main(String[] args) {
        System.out.println("TASK 1: \nENTER WAY TO FILE  OR COPY THIS:  src/resources/numbers.txt");
        Task1 task1 = new Task1();
        try {
            task1.ReadFile();
        } catch (DocNumExeption | ContractExeption e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
