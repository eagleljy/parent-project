package com.ljy.body1;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * desc
 *
 * @author lujunyu
 * date 2019/5/22
 */
@Component
public class Stream {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        intStream.forEach(System.out::println);
        ArrayList<Person> objects = new ArrayList<>();
        Person person = new Person();
        person.setName("一号");
        person.setAge(3);
        person.setBirthday(new Date());

        Person person1 = new Person();
        person.setName("二号");
        person.setAge(1);
        person.setBirthday(new Date(System.currentTimeMillis() - 1000*60*60*24*10));

        objects.add(person);
        objects.add(person1);
//        objects.stream().flatMap()
//        IntStream.range(1,10).forEach(System.out::println);

    }

    @Data
    static class Person{
        String name;
        Integer age;
        Date birthday;
    }

}
