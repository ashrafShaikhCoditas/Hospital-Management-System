package com.springboot.hospitalmanagement.repository;

import com.springboot.hospitalmanagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    Optional<Doctor> findByEmail(String email);

    List<Doctor> findByIsDeletedFalse();


}
