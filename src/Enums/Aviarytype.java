package Enums;

public enum Aviarytype {
    FIRST(10, 10),
    SECOND(11, 11),
    THIRD(12, 12),
    FOURTH(13, 13);

    private int  length, width;

     Aviarytype(int length, int width) {
        this.width = width;
        this.length = length;
    }

    public int getSquare() {
      return this.length*this.width;
    }

}
