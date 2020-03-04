package sample.lab4_2.exceptions;

public class ModelPriceOutOfBoundsException extends IndexOutOfBoundsException {

    public ModelPriceOutOfBoundsException() {
        super("Цена не может быть меньше 0");
    }

    public ModelPriceOutOfBoundsException(String msg) {
        super(msg);
    }
}