package Enums;

public enum Enum {
    FIRST(3, 3),
    SECOND(4, 4),
    THIRD(5, 5),
    FOURTH(6, 6);

    private int a, b;

    Enum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSquare() {
      return this.a*this.b;
    }


}
