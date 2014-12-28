/**
 * Created by Christoph on 12/28/14.
 */
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Drawing one asterisk");
        triangle.drawOneAsterisk();
        System.out.println("Drawing 8 asterisks on a line");
        triangle.drawHorizontalLine(8);
        System.out.println("Drawing 3 asterisks vertically");
        triangle.drawVerticalLine(3);
    }

    private void drawVerticalLine(int lineHeight) {
        for(int i = 0; i < lineHeight; i++){
            System.out.println("*");
        }
    }

    private void drawHorizontalLine(int lineLength) {
        for(int i = 0; i < lineLength; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private void drawOneAsterisk() {
        System.out.println("*");
    }
}
