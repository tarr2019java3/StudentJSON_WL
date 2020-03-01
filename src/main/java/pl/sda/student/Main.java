package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan", "Kowalski", 32);
        Student student1 = new Student("Tomasz","Nowak", 28);
        Student student2 = new Student("Iwona", "Toruńska", 25);
        Student student3 = new Student("Krzysztof", "Sekielski", 36);
        Student student4 = new Student("Katarzyna","Słoik", 29);
        Student student5 = new Student("Władysław", "Woś", 41);

        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        JSONUtils jsonUtils = new JSONUtils();
        jsonUtils.writeList("lista.json", studentList);
        jsonUtils.readList("lista.json");

    }

}
