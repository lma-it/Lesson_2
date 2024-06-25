package TextEditor;

import static print_module.print_library.println;

import java.io.FileWriter;
import java.io.IOException;

public class FileToMd implements TextEditor{

    @Override
    public void saveFile(char[] text, String name) {
        String fileName = name + ".md";
        FileWriter fr = null;

        try {
            fr = new FileWriter(fileName);
            fr.write(text);
            fr.close();
        } catch (IOException e) {
            println("Файл, который вы пытаетесь сохранить не существует");
            println(e.getMessage());
        }finally{
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
        }
    }
    
}
