/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CopyFile;

import java.util.Properties;
import java.io.File;
/**
 *
 * @author HI
 */
public class Main {
    public static void main(String[] args) {
        FileManagerModel model = new FileManagerModel();
        FileManagerView view = new FileManagerView();
        FileManagerController controller = new FileManagerController(model, view);

        controller.run();
    }
}
