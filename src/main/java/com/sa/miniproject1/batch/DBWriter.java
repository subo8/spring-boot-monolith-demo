package com.sa.miniproject1.batch;

import java.util.List;

import com.sa.miniproject1.model.Student;
import com.sa.miniproject1.repository.StudentRepository;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBWriter implements ItemWriter<Student> {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    public DBWriter(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void write(List<? extends Student> students) throws Exception {
        System.out.println("Data saved for Students: " + students);
        studentRepository.saveAll(students);
    }
}
