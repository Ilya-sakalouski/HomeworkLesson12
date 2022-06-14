package src.exeptionsHandling;

public class ContractExeption extends Exception {
    @Override
    public String getMessage() {
        return "Don't start with \"contract\" ";
    }
}
