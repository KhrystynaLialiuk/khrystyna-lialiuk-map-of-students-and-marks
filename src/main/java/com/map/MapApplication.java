package com.map;

import java.util.*;

public class MapApplication {

    public static void main(String[] args) {
        Student student1 = new Student("Jakub", "Kowalski", "20031614852");
        Student student2 = new Student("Krystyna", "Wysocka", "99030512462");
        Student student3 = new Student("Maruisz", "Kolaczek", "99051545898");

        LinkedList<Marks> marks1 = new LinkedList<>();
        marks1.add(new Marks(10, "Informatics", "First Semester"));
        marks1.add(new Marks(8, "Informatics", "Second Semester"));
        marks1.add(new Marks(7, "Informatics", "Exam"));
        marks1.add(new Marks(8, "Math", "First Semester"));
        marks1.add(new Marks(9, "Math", "Second Semester"));
        marks1.add(new Marks(8, "Math", "Exam"));

        LinkedList<Marks> marks2 = new LinkedList<>();
        marks2.add(new Marks(11, "Informatics", "First Semester"));
        marks2.add(new Marks(10, "Informatics", "Second Semester"));
        marks2.add(new Marks(8,  "Informatics", "Exam"));
        marks2.add(new Marks(10, "Math", "First Semester"));
        marks2.add(new Marks(9, "Math", "Second Semester"));
        marks2.add(new Marks(8, "Math", "Exam"));

        LinkedList<Marks> marks3 = new LinkedList<>();
        marks3.add(new Marks(7, "Informatics", "First Semester"));
        marks3.add(new Marks(5, "Informatics", "Second Semester"));
        marks3.add(new Marks(8,  "Informatics", "Exam"));
        marks3.add(new Marks(10, "Math", "First Semester"));
        marks3.add(new Marks(11, "Math", "Second Semester"));
        marks3.add(new Marks(12, "Math", "Exam"));

        HashMap<Student, LinkedList<Marks>> studentsMarks = new HashMap<Student, LinkedList<Marks>>();
        studentsMarks.put(student1, marks1);
        studentsMarks.put(student2, marks2);
        studentsMarks.put(student3, marks3);

        //  Calculating an average mark for a student
        System.out.println("Calculating an average mark for students:");
        for (Map.Entry<Student, LinkedList<Marks>> entry : studentsMarks.entrySet()) {
            double sumOfMarks = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sumOfMarks = sumOfMarks + entry.getValue().get(i).getTheMark();
            }
            double averageMark = sumOfMarks / entry.getValue().size();
            System.out.println("The average mark for " + entry.getKey() + " is " + averageMark);
        }
        System.out.println("");

        // Calculating an average mark in informatics for a student
        System.out.println("Calculating an average mark in informatics for students:");
        for (Map.Entry<Student, LinkedList<Marks>> entry : studentsMarks.entrySet()) {
            double sumOfMarksInformatics = 0;
            int numberOfMarksInformatics = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).getSubject() == "Informatics") {
                    sumOfMarksInformatics += entry.getValue().get(i).getTheMark();
                    numberOfMarksInformatics++;
                }
            }
            double averageMarkInformatics = sumOfMarksInformatics / numberOfMarksInformatics;
            System.out.println("The average mark for informatics of " + entry.getKey() + " is " + averageMarkInformatics);
        }
        System.out.println("");

        // Extracting exam marks
        System.out.println("Extracting exam marks of students:");
        for (Map.Entry<Student, LinkedList<Marks>> entry : studentsMarks.entrySet()) {
            for (Marks mark : entry.getValue()) {
                if (mark.getTypeOfMark() == "Exam") {
                    System.out.println("The exam mark of " + entry.getKey() + " for " + mark.getSubject() + " is " + mark.getTheMark());
                }
            }
        }
    }
}