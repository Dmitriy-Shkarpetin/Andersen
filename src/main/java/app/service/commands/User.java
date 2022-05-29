package app.service.commands;

//Invoker
public class User {
    Command allStudent;
    Command teamInfo;
    Command studentById;
    Command sort;
    Command start;

    public User(Command getAllStudent, Command getTeamInfo, Command getStudentById, Command sortStudent, Command getStart) {
        this.allStudent = getAllStudent;
        this.teamInfo = getTeamInfo;
        this.studentById = getStudentById;
        this.sort = sortStudent;
        this.start = getStart;
    }

    public void getAllStudents() {
        allStudent.execute();
    }

    public void getTeamInfo() {
        teamInfo.execute();
    }

    public void getStudentById() {
        studentById.execute();
    }

    public void sortStudent() {
        sort.execute();
    }

    public void startSurvive() {
        start.execute();
    }
}