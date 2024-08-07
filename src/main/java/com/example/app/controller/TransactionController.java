package com.example.app.controller;

import com.example.app.dao.TransactRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class TransactionController {
  private final TransactRepository repo;

  public TransactionController(TransactRepository repo) {
    this.repo = repo;
  }

  @GetMapping("/transacts/name/@name")
  public String getAllTransactions() {
    return repo.findAll().stream().toList().toString();
  }
}
