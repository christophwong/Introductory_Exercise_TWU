/**
 * Created by Christoph on 12/28/14.
 */
abstract class Diamond {
    public static void main(String[] args) {
        System.out.println("draw Diamond with n = 3");
        Diamond.drawDiamond(3);
        System.out.println("draw diamond with name");
        Diamond.drawDiamondWithName(3);
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

    public static void drawDiamondWithName(int triangleHeight) {
        int height = triangleHeight * 2 - 1;
        for (int i = 0; i < triangleHeight - 1; i++) {
            int offset = height - i - 1;
            Triangle.drawHorizontalLine(offset, " ");
            Triangle.drawHorizontalLine(2 * i + 1, "*");
            System.out.println("");
        }

        System.out.println("Christoph");

        for (int i = triangleHeight; i < height; i++){
            int bottomOffset = i;
            int bottomStarCount = 2 * (height - i - 1) + 1;
            Triangle.drawHorizontalLine(bottomOffset, " ");
            Triangle.drawHorizontalLine(bottomStarCount, "*");
            System.out.println("");
        }
    }


}