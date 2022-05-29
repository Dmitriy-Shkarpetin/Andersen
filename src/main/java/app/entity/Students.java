//package app.entity;
///*
//This class contains general information about Students
// */
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "students")
//@Data
//@NoArgsConstructor
//public class Students {
//
//    @Id
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "name")
//    private String name;
//
//    @Column(name = "teamNumber")
//    private int teamNumber;
//
//    @Column(name = "score")
//    private float score;
//
//    public Students(int id, String name, int teamNumber, String score) {
//        this.id = id;
//        this.name = name;
//        this.teamNumber = teamNumber;
//        this.score = Float.parseFloat(score);
//    }
//
//    @Override
//    public String toString() {
//        return "Students->" +
//                "[" + name + " is a " + "member of team № " + teamNumber +
//                "][ score = " + score + "] [id = " + id + "]\n";
//    }
//}