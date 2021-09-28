package com.hvq.cmcglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hvq.cmcglobal.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
