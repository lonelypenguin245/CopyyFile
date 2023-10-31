/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
/**
 *
 * @author HI
 */
public class FileManagerModel {
    public boolean readFileConfig(Properties prop) {
        File propertiesFile = new File("config.properties");

        if (propertiesFile.exists()) {
            return FileManagerController.checkFileConfig(propertiesFile, prop);
        }
        return false;
    }

    public void copyFile(String file, String folder) {
        File f1 = new File(file);
        File f2 = new File(folder);
        if (f1.exists() && f1.isFile() && f2.exists() && f2.isDirectory()) {
            try {
                FileInputStream fis = new FileInputStream(f1);
                FileOutputStream fos = new FileOutputStream(folder + "/" + f1.getName());
                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
                fis.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
