package com.example.app.dao;

import com.example.app.entity.Transact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@CrossOrigin(
    methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT },
    maxAge = 3600)
@Repository
public interface TransactRepository extends JpaRepository<Transact, Integer> {

}
