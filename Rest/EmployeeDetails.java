package com.Final_assignment;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

//Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.
    public class EmployeeDetails {
//        private int id;
//        private String name;
//        private int age;
        @Positive
        @NotBlank(message = "id is mandatory")
        private int id;

        @Size(min = 4)
        private String name;

        @NotBlank(message = "age is mandatory")
        private int age;


        public EmployeeDetails() {

        }


        public EmployeeDetails(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


