public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Color) {
            Color otherColor = (Color) obj;
            return this.red == otherColor.red &&
                    this.green == otherColor.green &&
                    this.blue == otherColor.blue;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
    }

    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 0);
        Color color2 = new Color(255, 0, 0);
        Color color3 = new Color(0, 255, 0);
        System.out.println("color1: " + color1);
        System.out.println("color2: " + color2);
        System.out.println("color3: " + color3);
        System.out.println("color1 equals color2: " + color1.equals(color2));
        System.out.println("color1 equals color3: " + color1.equals(color3));
    }
}
