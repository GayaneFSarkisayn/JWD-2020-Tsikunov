package by.tsikunov.day1.exception;

public class ProjectIllegalDataException extends Exception {
    public ProjectIllegalDataException(String errorMessage) {
        super(errorMessage);
    }
    public ProjectIllegalDataException(String errorMessage, Throwable error) {
        super(errorMessage, error);
    }
}
