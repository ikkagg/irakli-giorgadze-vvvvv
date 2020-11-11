package sample;

import java.io.File;
import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("შემოიტანეთ საძიებო სიტყვა :");
        userName = myObj.nextLine();

        System.out.println("შემოტანილი სიტყვაა: " + userName);
        File folder = new File("C:\\Users\\User\\IdeaProjects\\irakli-giorgadze-v2\\BTU_DOCUMENT");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("მოიძებნა " + listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}



