package com.khrulov;
/**
 * Java. My first program on Spark
 *
 * @author Oleg Khrulov
 * @version dated 05.08.2019
 */

/*
    Создать веб приложение с использованием Spark framework,
    которое по запросу http://localhost:4567/time вернёт текущее время на сервере
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import static spark.Spark.get;

public class App {
    public static void main(String[] args) {


        get("/hello", (req, res) -> "Hello World");
        get("/time1", (req, res) -> DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now()));
//        get("/time1", (req, res) -> LocalDateTime.now());

        get("/time2", (req, res) -> Calendar.getInstance().getTime());


    }
}
