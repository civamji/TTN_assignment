package com.example.Spring2.Controller;

import com.example.Spring2.DaoServices.UserService;
import com.example.Spring2.ModelClasses.Person1;
import com.example.Spring2.ModelClasses.Person2;
import com.example.Spring2.ModelClasses.User;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.List;
import java.util.Locale;

@RestController

@ApiModel(description="This is user controller class for URI's")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    MessageSource messageSource;

  @ApiOperation(value="Hello URI to print hello")
    @GetMapping("/hello")
    public String print() {
        return "Made by me!!!";
    }

  //=================>>>>>Versioning
    @GetMapping("v1/person")
    public Person1 person1(){
      return new Person1("Shivam",24);
    }
    @GetMapping("v2/person")
    public Person2 person2(){
      return new Person2("Shivam",24,1234321,3388588);
    }


//===========>Request header versioning
    @GetMapping(value = "person/param",params = "version=1")
    public Person1 param1(){
        return new Person1("Shivam",24);
    }
    @GetMapping(value = "person/param",params = "version=2")
    public Person2 param2(){
        return new Person2("Shivam",24,1234321,3388588);
    }

    @GetMapping(value = "person/header",headers = "X-API-VERSION=1")
    public Person1 paramApi1(){
        return new Person1("Shivam",24);
    }
    @GetMapping(value = "person/header",headers = "X-API-VERSION=2")
    public Person2 paramApi2(){
        return new Person2("Shivam",24,1234321,3388588);
    }

    @GetMapping(value = "person/produces",produces = "application/vnd.company.app-v1+json")
    public Person1 produces1(){
        return new Person1("Shivam",24);
    }
    @GetMapping(value = "person/produces",produces = "application/vnd.company.app-v2+json")
    public Person2 produces2(){
        return new Person2("Shivam",24,1234321,3388588);
    }

//
//
//
//
//
//
//
//
//
//
//
    //show all user
    @ApiOperation(value="To get all users")
    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getAll();
    }

    @ApiOperation(value="To ADD new users")

    //add user
    @PostMapping("/users")
    public void addUser(@RequestBody User usersModel) {
        User usersModel1 = userService.addUser(usersModel);
    }

//
//  // @ApiOperation(value="To get a specific user")
//
//    //Delete user
//
    @ApiOperation(value = "To delete a user,and also link to all employees using hateos")

    @GetMapping("/users/delete/{id}")
    public EntityModel<User> deleteOne(@PathVariable int id) {
        User usersModel = userService.deleteUser(id);
        EntityModel<User> entityModel=new EntityModel<>(usersModel);
        WebMvcLinkBuilder link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getUser());
        entityModel.add(link.withRel("All-Users"));
        return entityModel;
    }
//
//
//
////Internationalization
//
    @ApiOperation(value = "Internationalization Concept")
    @GetMapping("/i18nDemo")
    public String show(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("good.morning.message", null, locale);
    }
//
//
//
//    //Dynamic filtering
//
//
    @GetMapping("/filtering")
    public MappingJacksonValue retrieveUsersModel()
    {
        User user = new User(1001, "Shivam", 25, "asdf");
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "name");

        FilterProvider filters = new SimpleFilterProvider().addFilter("UsersModelFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(user);
        mapping.setFilters(filters);
        return mapping;


    }
}
