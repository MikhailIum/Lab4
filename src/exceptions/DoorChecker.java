package exceptions;
public class DoorChecker extends RuntimeException{

    @Override
    public String getMessage() {
        return "Ракета всё это время была открыта!? Это невозможно!";
    }

}
