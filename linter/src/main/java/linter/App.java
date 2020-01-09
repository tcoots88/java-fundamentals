
package linter;


import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        App application = new App();

        Path filePath = Paths.get("resources/gates.js");

        String errorMessages = application.javascriptLinter(filePath);
        System.out.println(errorMessages);
    }

    public String javascriptLinter(Path pathName) {

        String displayError = "";

        try {

            int currentLine = 1;

            Scanner scLinter = new Scanner(new File(pathName.toUri()));

            while (scLinter.hasNext()) {

                String nextLine = scLinter.nextLine();

                if (hasError(nextLine)) {
                    displayError += String.format("Line %d: Missing semicolon.\n", currentLine);
                }

                currentLine++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return displayError;

    }

    public boolean hasError(String lineNumber) {

        boolean errorValue = true;

        if (lineNumber.isEmpty()) {
            errorValue = false;
        }

        if (!lineNumber.isEmpty()) {

            if (lineNumber.endsWith(";")) {
                errorValue = false;
            }

            if (lineNumber.startsWith("//")) {
                errorValue = false;
            }

            if (lineNumber.endsWith("{")) {
                errorValue = false;
            }

            if (lineNumber.endsWith("}")) {
                errorValue = false;
            }

            if (lineNumber.contains("if")) {
                errorValue = false;
            }

            if (lineNumber.contains("else")) {
                errorValue = false;
            }
        }

        return errorValue;
    }
}
