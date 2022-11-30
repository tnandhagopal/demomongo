package com.anandan.mongo.demomongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class MyData {

    private String id;
    private String name;
    private LocalDate dob;
    private BigDecimal salary;
    private Long account;
}

