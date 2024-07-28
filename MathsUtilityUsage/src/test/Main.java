package test;

import ArithmeticOperation.CustomMath;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        CustomMath customMath = new CustomMath();
        int ans = customMath.max(23,34);

        System.out.println(ans);

        String jsonStr = "{\"a\": \"A\"}";

        Gson gson = new Gson();

    }
}
