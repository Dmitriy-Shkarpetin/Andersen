package app.service.readers;

import app.service.Constants;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
This class has only one method *readFile()* which parses and returns *List<String>* from *txt* file
 */
public class StudentListReader {
    /*
    Returns List of Strings
     */
    public List<String> readFile() {
        List<String> studentList = new ArrayList<>();
        try (RandomAccessFile file =
                     new RandomAccessFile(Constants.PATH_TO_STUDENTS_FILE, "r")) {
            while (file.read() != -1) {
                file.seek(file.getFilePointer() - 1);
                studentList.add(file.readLine());
            }
        } catch (IOException e) {
            System.out.println("There isn't the file in the folder");
        }
        return studentList;
    }
}