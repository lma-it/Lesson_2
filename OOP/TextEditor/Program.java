package TextEditor;
import static print_module.print_library.println;

import java.util.Scanner;

public class Program implements UIMenu{
    public static void main(String[] args) {
        String filePath = "README";
        Scanner scanner = new Scanner(System.in);
        println("Введите ваш текст, который вы хотите сохранить в файл: ");
        String text = scanner.nextLine();
        char[] textForFile = text.toCharArray();

        println("Выберете в каком формате вы хотите сохранить Ваш файл: ");
        println("1. .doc format.");
        println("2. .md format.");
        println("3. .txt format.");
        int value = scanner.nextInt();
        Program program = new Program();
        program.MainMenu(value, textForFile, filePath);
        scanner.close();
    }

    @Override
    public void MainMenu(int value, char[] text, String filePath) {
        switch (value) {
            case 1:
                FileToDoc fileToDoc = new FileToDoc();
                fileToDoc.saveFile(text, filePath);
                break;
            case 2:
                FileToMd fileToMd = new FileToMd();
                fileToMd.saveFile(text, filePath);
                break;
            case 3:
                FileToTxt fileToTxt = new FileToTxt();
                fileToTxt.saveFile(text, filePath);
            default:
                break;
        }
    }
}
