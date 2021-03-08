package Animal;

public enum Enum {
    first(3, 3),
    second(4, 4),
    third(5, 5),
    fourth(6, 6);

    private int a, b;

    Enum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSquare() {
      return this.a*this.b;
    }


}
