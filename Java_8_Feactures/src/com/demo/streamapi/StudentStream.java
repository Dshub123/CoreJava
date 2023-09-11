package com.demo.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStream {

	public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 22));
        students.add(new Student(3, "Charlie", 19));
        students.add(new Student(4, "David", 21));
        students.add(new Student(5, "Eve", 23));

        // Create a stream of Student objects
        Stream<Student> studentStream = students.stream();

        // Filter students who are older than 21
        List<Student> filteredStudents = studentStream
                .filter(student -> student.getAge() > 21)
                .collect(Collectors.toList());

        // Sort the filtered students by age
        List<Student> sortedStudents = filteredStudents
                .stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .collect(Collectors.toList());

        // Print the sorted students
        sortedStudents.forEach(System.out::println);
    }

}
