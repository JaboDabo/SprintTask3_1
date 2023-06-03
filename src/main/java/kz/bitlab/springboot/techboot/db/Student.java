package kz.bitlab.springboot.techboot.db;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    Long id;
    String name;
    String surname;
    int exam;
    String mark;
}