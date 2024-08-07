package com.example.app.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "transact")
public class Transact {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(columnDefinition = "DATE")
  private LocalDate date;
  private String description;
  private String variance;
  private float price;

  public Transact() {
  }

  public Transact(LocalDate date, String description, String variance, float price) {
    this.date = date;
    this.description = description;
    this.variance = variance;
    this.price = price;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getVariance() {
    return variance;
  }

  public void setVariance(String variance) {
    this.variance = variance;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Transact{" +
        "id=" + id +
        ", description=" + description +
        ", variance=" + variance +
        ", price=" + price;
  }
}
