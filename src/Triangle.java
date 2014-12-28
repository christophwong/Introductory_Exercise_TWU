/**
 * Created by Christoph on 12/28/14.
 */
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.drawOneAsterisk();
        triangle.drawHorizontalline(8);
    }

    private void drawHorizontalline(int lineLength) {
        for(int i = 0; i < lineLength; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private void drawOneAsterisk() {
        System.out.println("*");
    }
}
