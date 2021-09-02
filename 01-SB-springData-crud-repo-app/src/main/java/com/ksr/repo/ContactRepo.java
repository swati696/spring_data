package com.ksr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ksr.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
