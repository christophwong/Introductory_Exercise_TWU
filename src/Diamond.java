/**
 * Created by Christoph on 12/28/14.
 */
abstract class Diamond {
    public static void main(String[] args) {
        Diamond.drawDiamond(3);
    }

    public static void drawDiamond(int triangleHeight) {
        int height = triangleHeight * 2 - 1;
        for (int i = 0; i < triangleHeight; i++) {
            int offset = height - i - 1;
            Triangle.drawHorizontalLine(offset, " ");
            Triangle.drawHorizontalLine(2 * i + 1, "*");
            System.out.println("");
        }

        for (int i = triangleHeight; i < height; i++){
            int bottomOffset = i;
            int bottomStarCount = 2 * (height - i - 1) + 1;
            Triangle.drawHorizontalLine(bottomOffset, " ");
            Triangle.drawHorizontalLine(bottomStarCount, "*");
            System.out.println("");
        }
    }


}