package com.concent.StudentDetails.repo;

import com.concent.StudentDetails.model.Student;
import com.concent.StudentDetails.model.Student1;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student1,Integer> {
}
