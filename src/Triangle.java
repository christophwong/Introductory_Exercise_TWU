/**
 * Created by Christoph on 12/28/14.
 */
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Drawing one asterisk");
        triangle.drawOneAsterisk();
        System.out.println("Drawing 8 asterisks on a line");
        triangle.drawHorizontalLine(8, "*");
        System.out.println("");
        System.out.println("Drawing 3 asterisks vertically");
        triangle.drawVerticalLine(3);
        System.out.println("Drawing triangle with sides of 3 asterisks");
        triangle.drawTriangle(3);

        System.out.println("print isosceles triangle");
        triangle.drawIsosTriangle(3);



    }

    private void drawIsosTriangle(int height) {
        for (int i = 0; i < height; i++) {
            int offset = height - i - 1;
            drawHorizontalLine(offset, " ");
            drawHorizontalLine(2 * i + 1, "*");
            System.out.println("");
        }
    }

    private void drawTriangle(int sideLength) {
        for (int i = 1; i <= sideLength; i++) {
            drawHorizontalLine(i, "*");
            System.out.println("");
        }
    }

    private void drawVerticalLine(int lineHeight) {
        for(int i = 0; i < lineHeight; i++){
            System.out.println("*");
        }
    }

    private void drawHorizontalLine(int lineLength, String output) {
        for(int i = 0; i < lineLength; i++) {
            System.out.print(output);
        }
    }

    private void drawOneAsterisk() {
        System.out.println("*");
    }
}
