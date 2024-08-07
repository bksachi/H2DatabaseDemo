package h2databasedemo.h2databasedemo.entity;


import jakarta.persistence.*;

@Entity
@Table
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String firstName;
    private double marks;


}
