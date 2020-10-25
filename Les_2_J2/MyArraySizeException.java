package Lesson_2;

public class MyArraySizeException extends IllegalArgumentException {

    private int size;

    public int getNumber() {
        return size;
    }

    public MyArraySizeException(int number) {
        this.size = number;
    }

    public MyArraySizeException(String s, int size) {
        super(s);
        this.size = size;
    }
}
