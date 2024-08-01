package dev.annie.grace.service;



public class ErrorHandler {
    public void handleException(Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }

}
