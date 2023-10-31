/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CopyFile;

import java.io.File;
import java.util.Properties;
/**
 *
 * @author HI
 */
public class FileManagerController {
    private FileManagerModel model;
    private FileManagerView view;

    public FileManagerController(FileManagerModel model, FileManagerView view) {
        this.model = model;
        this.view = view;
    }

    public static boolean checkFileConfig(File propertiesFile, Properties prop) {
        return true; // 
    }

    public void run() {
        Properties prop = new Properties();
        boolean fileConfigExists = model.readFileConfig(prop);

        if (fileConfigExists) {
            String copyFolder = prop.getProperty("COPY_FOLDER");
            String path = prop.getProperty("PATH");

            view.displayMessage("Copy Folder: " + copyFolder);
            view.displayMessage("Path: " + path);

            File f1 = new File(copyFolder);
            File f2 = new File(path);

            if (checkInformationConfig(f1, f2)) {
                model.copyFile(copyFolder, path);
                view.displayMessage("Copy is finished...");
            } else {
                view.displayMessage("System shutdown");
            }
        } else {
            view.displayMessage("File configure is not found!");
            view.displayMessage("System shutdown");
        }
    }

    public boolean checkInformationConfig(File f1, File f2) {
        return true; 
    }
}
