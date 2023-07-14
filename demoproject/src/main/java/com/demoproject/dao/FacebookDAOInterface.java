package com.demoproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demoproject.entity.FacebookRevature;

@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookRevature, Long>{

}
