package com.sj.springbootforbeginners.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private String employeeID;
    private String employeeTitle;
    private String employeeDepartment;
    private String employeeCity;
    private String employeeCounty;

}
