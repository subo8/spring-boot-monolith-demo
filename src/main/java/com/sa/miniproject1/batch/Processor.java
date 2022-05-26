package com.sa.miniproject1.batch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

import com.sa.miniproject1.model.Student;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) throws Exception {

        // Current minus age calculation
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -(student.getAge()));
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        LocalDate localDate = LocalDateTime.ofInstant(calendar.toInstant(), calendar.getTimeZone().toZoneId())
                .toLocalDate();
        student.setDOB(localDate);
        System.out.println("Some calculation happens here ");
        return student;
    }

}
