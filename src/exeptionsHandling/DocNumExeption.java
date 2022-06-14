package src.exeptionsHandling;

public class DocNumExeption extends Exception {

    @Override
    public String getMessage() {
        return "Don't start with \"docnum\" ";
    }
}
