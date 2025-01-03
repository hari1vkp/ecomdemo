package com.ecom.webapp.model;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name = "product")
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private String category;
    private String brand;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;
    private double price;
    private int quantity;
}
