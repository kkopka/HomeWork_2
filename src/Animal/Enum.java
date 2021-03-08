package Animal;

public enum Enum {
    first(3, 3, 3, 3),
    second(4, 4, 4, 4),
    third(5, 5, 5, 5),
    fourth(6, 6, 6, 6);

    private int a, b, c, d;

    Enum(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }

    public int[] getSize() {
        int[] tmp = new int[]{this.a, this.b, this.c, this.d};
        return tmp;
    }


}
