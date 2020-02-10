package com.example.sampleRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sampleRest.dto.loginDto;

@Repository
public interface loginDao extends JpaRepository<loginDto, Integer> {

}
