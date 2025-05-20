
package com.luiswiederhold;

import com.google.gson.Gson;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        String gstring = gson.toJson(new int[]{1,2,3});
        System.out.println(gstring);
        System.out.println(new App().getGreeting());
    }
}
