package com.khrulov;
/**
 * Java. My first program on Spark
 *
 * @author Oleg Khrulov
 * @version dated 05.08.2019
 */

import static spark.Spark.get;
public class App 
{
    public static void main( String[] args )
    {
        get("/hello", (req, res) -> "Hello World");
    }
}
