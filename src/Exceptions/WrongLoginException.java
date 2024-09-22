package Exceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super("Ошибка логина");
    }
}
