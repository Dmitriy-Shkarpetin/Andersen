//package app.service.commands;
//
//import java.io.IOException;
//
//public class StartSurveyCommand implements Command {
//    StudentsService service;
//    public StartSurveyCommand(StudentsService service) {
//        this.service = service;
//    }
//
//    @Override
//    public void execute()  {
//        try {
//            service.startSurvey();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}