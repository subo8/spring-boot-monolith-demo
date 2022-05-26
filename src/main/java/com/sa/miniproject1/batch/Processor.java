package com.sa.miniproject1.batch;

import java.util.Calendar;
import java.util.Date;

import com.sa.miniproject1.model.Student;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {

        // Current minus age calculation
        // Calendar calendar = Calendar.getInstance();
        // calendar.add(Calendar.YEAR, -(student.getAge()));
        // calendar.set(Calendar.MONTH, 1);
        // calendar.set(Calendar.DAY_OF_MONTH, 1);
        // student.setAge(calendar.get(Calendar.DATE));
        student.setDOB(10);
        // System.out.println("Some calculation happens here ");
        return student;
    }

}
