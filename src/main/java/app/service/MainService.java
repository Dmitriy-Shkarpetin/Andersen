//package app.service;
//
//import app.entity.Students;
//import app.service.commands.*;
//import app.service.readers.WorkListReader;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//public class MainService {
//    private static final StudentsListService studentService = new StudentsListService();
//    private static final List<Students> list = WorkListReader.read();
//    static StudentsService service = new StudentsService();
//    static User user = new User(
//
//            new AllStudentsCommand(service),
//            new TeamInfoCommand(service),
//            new StudentByIdCommand(service),
//            new SortStudentsCommand(service),
//            new StartSurveyCommand(service));
//
//    public static void doApplication() throws IOException {
//        Scanner console = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please select an option:");
//            System.out.println("Display the Student list [type 'ls-all']\n" +
//                    "Display Team list [type 'ls-t']");
//            System.out.println("Display the Student list sorted by Name/Score [type 'ls-n/ls-s]");
//            System.out.println("Display the particular Student [type 'get-s']");
//            System.out.println("********** If you want to start the survey [type 'start'] **********");
//            System.out.println("********** To finish the program type [exit] **********");
//            String command = console.next();
//
//            switch (command.toLowerCase()) {
//                case "ls-all":
//                    user.getAllStudents();
//                    continue;
//                case "ls-t":
//                    user.getTeamInfo();
//                case "ls-n":
//                    user.sortStudent();
//                    continue;
//                case "ls-s":
//                    user.sortStudent();
//                    continue;
//                case "get-s":
//                    user.getStudentById();
//                    continue;
//                case "start":
//                    StudentsService.setStop("y");
//                    user.startSurvive();
//                    continue;
//                case "exit":
//                    studentService.save(list);
//                    System.out.println(">>>>>>>>>> The program was closed <<<<<<<<<<");
//                    return;
//                default:
//                    System.out.println("Incorrect command");
//            }
//        }
//    }
//}