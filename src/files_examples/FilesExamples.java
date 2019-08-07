package files_examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesExamples {


    public static void main(String[] args) {
//        String folderPath = "./data";
//        Path dataFile = Paths.get(folderPath,"betelgeuse.txt");
//        List<String> lines;
//        try {
////            if (Files.notExists(Paths.get(folderPath)))
////                Files.createDirectory(Paths.get(folderPath));
//            if (Files.exists(dataFile)) {
//                lines = Files.readAllLines(dataFile);
//                for (String line : lines) {
//                    System.out.println(line);
//                }
//
//                lines.add("Started: May 28, 2019");
//                lines.add("Graduated: October 8, 2019");
//
//                Files.write(dataFile, lines, StandardOpenOption.APPEND);
//
//            }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        System.out.println("Finished");
////        if (Files.exists(dataFile))
////            System.out.println("Lookie there");
////        else System.out.println("No file found");



// Create a list and write its contents to a file
//        List<String> ourList = new ArrayList<>();
//        ourList.add(...)
//        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//        Path filepath = Paths.get("data", "groceries.txt");
        List<String> groceryListObj = new ArrayList<>();
        try {
//            Files.write(filepath, groceryList);

//            Path groceriesPath = Paths.get("data", "groceries.txt");
//            groceryListObj = Files.readAllLines(groceriesPath);
//            for (String item : groceryListObj)
//                System.out.println(item);
//

//// Add a line to existing file
//            for (int i = 0; i < groceryListObj.size(); i += 1) {
//                System.out.println((i + 1) + ": " + groceryListObj.get(i));
//            }
//
//            Files.write(
//                    Paths.get("data", "groceries.txt"),
//                    Arrays.asList("eggs"), // list with one item
//                    StandardOpenOption.APPEND
//            );


// Replace "milk" with "cream"
        List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }

        Files.write(Paths.get("data", "groceries.txt"), newList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
