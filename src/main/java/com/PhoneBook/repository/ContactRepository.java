package com.PhoneBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.PhoneBook.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
