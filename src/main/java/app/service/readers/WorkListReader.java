//package app.service.readers;
//
//import app.entity.Students;
//import app.service.StudentsListService;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class WorkListReader {
//    private static List<Students> workList = null;
//
//    public static List<Students> read() {
//        if (workList == null) {
//            workList = new ArrayList<>(new StudentsListService().create(new StudentListReader().readFile()));
//        }
//        return workList;
//    }
//}