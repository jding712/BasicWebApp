package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "dancing_dumpling";
        }
        if (query.toLowerCase().contains("name")) {
            return "MyTeam";
        }
        if (query.toLowerCase().contains("dumpling")) {
            return "a small, fat person.";
        } 
        if (query.toLowerCase().contains("test")) {
            return "";
        }

        if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            int num1 = Integer.parseInt(parts[2]);
            int num2 = Integer.parseInt(parts[4]); 
            return Integer.toString(num1+num2);
        }

        if (query.toLowerCase().contains("largest")) {
            String[] parts = query.split(" ");
            int res = Integer.parseInt(parts[8]);
            for (int i = 9; i < parts.length; i++) {
                if (Integer.parseInt(parts[i]) > res) {
                    res = Integer.parseInt(parts[i]);
                }
            }

            return Integer.toString(res);
        }
        
        return "";
    }
}
