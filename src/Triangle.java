/**
 * Created by Christoph on 12/28/14.
 */
abstract class Triangle {
    public static void main(String[] args) {
        System.out.println("Drawing one asterisk");
        Triangle.drawOneAsterisk();
        System.out.println("Drawing 8 asterisks on a line");
        Triangle.drawHorizontalLine(8, "*");
        System.out.println("");
        System.out.println("Drawing 3 asterisks vertically");
        Triangle.drawVerticalLine(3);
        System.out.println("Drawing Triangle with sides of 3 asterisks");
        Triangle.drawTriangle(3);

        System.out.println("print isosceles Triangle");
        Triangle.drawIsosTriangle(3);



    }

    public static void drawIsosTriangle(int height) {
        for (int i = 0; i < height; i++) {
            int offset = height - i - 1;
            drawHorizontalLine(offset, " ");
            drawHorizontalLine(2 * i + 1, "*");
            System.out.println("");
        }
    }

    private static void drawTriangle(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            drawHorizontalLine(i, "*");
            System.out.println("");
        }
    }

    private static void drawVerticalLine(int lineHeight) {
        for(int i = 0; i < lineHeight; i++){
            System.out.println("*");
        }
    }

    public static void drawHorizontalLine(int lineLength, String output) {
        for(int i = 0; i < lineLength; i++) {
            System.out.print(output);
        }
    }

    private static void drawOneAsterisk() {
        System.out.println("*");
    }
}
