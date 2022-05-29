//package app.service.commands;
//
//import app.entity.Students;
//import app.service.MainService;
//import app.service.readers.WorkListReader;
//
//import java.io.IOException;
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class StudentsService {
//    private static final Scanner console = new Scanner(System.in);
//    private final List<Students> workList = WorkListReader.read();
//    private final List<Students> ask = new ArrayList<>(workList);
//    private final List<Students> answer = new ArrayList<>(workList);
//    private static String stop;
//
//    public StudentsService() {
//    }
//
//    void getAllStudents() {
//        System.out.println(workList);
//    }
//
//    void getTeamInfo() {
//        while (true) {
//            System.out.println("Please select the team ID ( 1 to 10 ) or 'back' to back previous menu.");
//            String select = console.next();
//            if ("back".equalsIgnoreCase(select))
//                break;
//            try {
//                if (Integer.parseInt(select) > 0 && Integer.parseInt(select) <= 10) {
//                    System.out.println(workList.stream().filter(e -> e.getTeamNumber() == Integer.parseInt(select)).collect(Collectors.toList()));
//                } else System.out.println("Incorrect command.Please select the team ID ( 1 to 10 )");
//            } catch (NumberFormatException e) {
//                System.out.println("Incorrect command.You have to put digits from '1' till '10'");
//            }
//        }
//    }
//
//    void sortStudentListInfo() {
//        String option = console.next();
//
//        if ("ls-n".equals(option))
//            System.out.println(workList.stream().sorted(Comparator.comparing(Students::getName)).collect(Collectors.toList()));
//
//        else if ("ls-s".equals(option))
//            System.out.println(workList.stream().sorted(Comparator.comparing(Students::getScore)).collect(Collectors.toList()));
//    }
//
//    void getStudentById() {
//        while (true) {
//            System.out.println("Please type the ID:");
//            String id = console.next();
//            try {
//                if (Integer.parseInt(id) >= 0 && Integer.parseInt(id) <= (workList.size() - 1)) {
//                    System.out.println(workList.stream().filter(e -> e.getId() == Integer.parseInt(id)).collect(Collectors.toList()));
//                    setScore(Integer.parseInt(id));
//                    break;
//                } else {
//                    System.out.println("This ID doesn't exist");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Incorrect command. Please put down Please type the ID: from '0' till " + "'" + workList.size() + "'");
//            }
//        }
//    }
//
//    private void setScore(int id) {
//        while (true) {
//            System.out.println("Do you want to set the score this student?:");
//            System.out.println("Please put down Y- yes: N- no");
//
//            switch (console.next().toLowerCase()) {
//                case "y":
//                    System.out.println("Please type a score volume:");
//                    float point = console.nextFloat();
//                    workList.get(id).setScore(workList.get(id).getScore() + point);
//                    System.out.println(workList.get(id).getName() + " have got " + point + " points");
//                case "n":
//                    break;
//                default:
//                    System.out.println("Incorrect command");
//                    continue;
//            }
//            break;
//        }
//    }
//
//    public void startSurvey() throws IOException {
//        while ("y".equalsIgnoreCase(stop)) {
//
//            Students askStudent = getRandomStudent(ask);
//            Students answerStudent = getRandomStudent(answer);
//
//            if (!askStudent.equals(answerStudent) && askStudent.getTeamNumber() != answerStudent.getTeamNumber()) {
//                printAskAndAnswer(workList, askStudent, answerStudent);
//            } else {
//                if (askStudent.getTeamNumber() == answerStudent.getTeamNumber() && ask.size() == 1 && answer.size() == 1) {
//                    printAskAndAnswer(workList, askStudent, answerStudent);
//                }
//                startSurvey();
//            }
//            continueOrNot();
//        }
//    }
//
//    private Students getRandomStudent(List<Students> studentsList) {
//        Random random = new Random();
//        if (!studentsList.isEmpty()) {
//            int i = random.nextInt(studentsList.size());
//            return studentsList.get(i);
//        } else {
//            System.out.println("No students");
//            try {
//                MainService.doApplication();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
//
//    private void continueOrNot() {
//        while (true) {
//            System.out.println("Do you want to continue?");
//            System.out.println("Please put down Y- yes: N- no");
//            stop = console.next();
//            if ("y".equalsIgnoreCase(stop) || ("n".equalsIgnoreCase(stop))) {
//                break;
//            } else System.out.println("You have to put down Y- yes: N- no");
//        }
//    }
//
//    private void printAskAndAnswer(List<Students> studentsList, Students askStudent, Students answerStudent) {
//        System.out.println("Ask [" + askStudent.getName() + "]\n" + "Answer [" + answerStudent.getName() + "]");
//
//        printPoint(studentsList, askStudent);
//        printPoint(studentsList, answerStudent);
//    }
//
//
//    public void printPoint(List<Students> studentsList, Students student) {
//        while (true) {
//            System.out.println("Please mark " + student.getName() + " answer:");
//            try {
//                float score = Float.parseFloat(console.next());
//                studentsList.get(student.getId()).setScore(studentsList.get(student.getId()).getScore() + score);
//            } catch (NumberFormatException e) {
//                System.out.println("Incorrect command");
//                continue;
//            }
//            System.out.println(student.getName() + " has got " + studentsList.get(student.getId()).getScore() + " points");
//            answer.remove(student);
//            break;
//        }
//    }
//
//    public static void setStop(String stop) {
//        StudentsService.stop = stop;
//    }
//}