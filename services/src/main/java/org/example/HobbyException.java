package org.example;

public class HobbyException extends Exception{
    public HobbyException(){
    }

    public HobbyException(String msg){
        super(msg);
    }

    public HobbyException(String msg, Throwable cause){
        super(msg, cause);
    }
}
