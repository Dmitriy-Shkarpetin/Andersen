//package app.service;
//
//import app.entity.Students;
//import app.service.readers.StudentListReader;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
///*
//Class contains only one method. Responsible for *List<Students>* creation.
// */
//public class StudentsListService {
//    StudentListReader studentListReader = new StudentListReader();
//    List<Students> workList = new ArrayList<>();
//    /*
//    Method converts from *List<String>* from a file to *List<E>*.
//    Recognizes the element and distributes to the appropriate *Student.class* field
//     */
//    public List<Students> create(List<String> list) {
//        for (int i = 0; i < list.size(); i++) {
//            String[] subStr = list.get(i).split(" {2}");
//
//            workList.add(
//                    new Students(
//                            i,
//                            subStr[0],
//                            Integer.parseInt(subStr[1]),
//                            subStr[2]));
//        }
//        return workList;
//    }
//
//    public void save(List<Students> students) throws IOException {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Constants.PATH_TO_STUDENTS_FILE))) {
//            deleteStudentFile();
//            students.forEach(value ->
//                    {
//                        try {
//                            bw.write(String.format("%s  %d  %.1f \n", value.getName(), value.getTeamNumber(), value.getScore()).replace(',', '.'));
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    }
//            );
//        }
//    }
//
//    private void deleteStudentFile() {
//        File file = new File(Constants.PATH_TO_STUDENTS_FILE);
//        if (file.exists()) {
//            file.delete();
//        }
//    }
//}