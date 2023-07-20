package com.spring.project.mvc;




import com.spring.project.mvc.validation.CheckEmail;
import com.spring.project.mvc.validation.CheckSalary;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must be more than 2 symbols")
    private String name;
    @NotBlank(message = "surname shouldn't be blank")
    private String surname;
    @CheckSalary
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String carModel;
    private Map<String,String> carModels;


private Map<String,String> languageList;
    private String [] languages;
    @CheckEmail
    private String email;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "use pattern xxx-xx-xx")
    private String phoneNumber;
    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Sales", "Sales");
        departments.put("Human resources", "HR");

        carModels = new HashMap<>();
        carModels.put("BMW", "BMW");
        carModels.put("Mercedes Benz", "MB");
        carModels.put("Audi", "Audi");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutsch", "DE");
        languageList.put("French", "FR");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getCarModels() {
        return carModels;
    }

    public void setCarModels(Map<String, String> carModels) {
        this.carModels = carModels;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
