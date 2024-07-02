package org.example;
public class MyArrayDataException extends Exception {
    private final int row;
    private final int col;
    private final String invalidValue;

    public MyArrayDataException(int row, int col, String invalidValue) {
        super("Invalid data at row " + row + ", column " + col + ": " + invalidValue);
        this.row = row;
        this.col = col;
        this.invalidValue = invalidValue;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getInvalidValue() {
        return invalidValue;
    }
}
