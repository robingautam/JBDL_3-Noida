package org.example;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String jsonStr = "{\"a\": \"A\"}";

        Gson gson = new Gson();
    }
}
