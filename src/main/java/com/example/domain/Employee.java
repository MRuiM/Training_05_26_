package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private Long id;
    private String employee_name;
    private String employee_salary;
    private int employee_age;
    private String profile_image;

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_salary='" + employee_salary + '\'' +
                ", employee_age=" + employee_age +
                ", profile_image='" + profile_image + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return (Objects.equals(id, employee.id) &&
                Objects.equals(employee_name, employee.employee_name) &&
                Objects.equals(employee_salary, employee.employee_salary) &&
                Objects.equals(employee_age, employee.employee_age) &&
                Objects.equals(profile_image, employee.profile_image));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id + employee_name + employee_salary + employee_age + profile_image);
    }
}

