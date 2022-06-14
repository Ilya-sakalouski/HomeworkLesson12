package src.task1;

import src.exeptionsHandling.ContractExeption;
import src.exeptionsHandling.DocNumExeption;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public void ReadFile() throws DocNumExeption, ContractExeption, IOException {
        Scanner scanner = new Scanner(System.in);

        File file = new File(scanner.next());
        FileReader fr;                                   //  src/resources/numbers.txt
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader reader = new BufferedReader(fr);

        File file2 = new File("src/resources/approved.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(file2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter writer = new BufferedWriter(fw);

        File file3 = new File("src/resources/notApproved.txt");
        FileWriter fw2;
        try {
            fw2 = new FileWriter(file3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter writer2 = new BufferedWriter(fw2);

        String str = reader.readLine();

        while (str != null) {
            if (((str.startsWith("docnum") || str.startsWith("contract")) && !str.contains(" ") && !str.contains("_"))) {
                writer.write(str + "\n");
                System.out.println(str);
            }else if (!str.startsWith("docnum")) {
                    try {
                        writer2.write(str + "Don't start with \"docnum\" \n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (!str.startsWith("contract")) {
                    try {
                        writer2.write(str + "Don't start with \"contract\" \n ");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (str.contains(" ")) {
                    try {
                        writer2.write(str + "Contains \" \" \n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if (str.contains("_")) {
                    try {
                        writer2.write(str + "Contains \"_\" \n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            str = reader.readLine();
        }
        writer.close();
        writer2.close();
    }
}