package pictureLab;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {

    /**
     * Method to test zeroBlue
     */
    public static void testBlur(int x, int y, int w, int h, int n){
        Picture redMoto = new Picture("redMotorcycle.jpg");
        for (int i = 0; i < n; i++) {
            redMoto.blur(x, y, w, h);  
        }
        redMoto.explore();
    }

    public static void testZeroBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    public static void testKeepOnlyBlue() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.keepOnlyBlue();
        beach.explore();
    }

    public static void testNegate() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.negate();
        beach.explore();
    }

    public static void testGrayscale() {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.grayscale();
        beach.explore();
    }

    public static void testFixUnderwater() {
        Picture beach = new Picture("water.jpg");
        beach.explore();
        beach.fixUnderwater();
        beach.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture redMotorcycle = new Picture("redMotorcycle.jpg");
        redMotorcycle.explore();
        redMotorcycle.mirrorVertical();
        redMotorcycle.explore();
    }

    public static void testMirrorVerticalRightToLeft() {
        Picture redMotorcycle = new Picture("redMotorcycle.jpg");
        redMotorcycle.explore();
        redMotorcycle.mirrorVerticalRightToLeft();
        redMotorcycle.explore();
    }

    public static void testMirrorHorizontalTopToBottom() {
        Picture redMotorcycle = new Picture("redMotorcycle.jpg");
        redMotorcycle.explore();
        redMotorcycle.mirrorHorizontalTopToBottom();
        redMotorcycle.explore();
    }

    public static void testMirrorHorizontalBottomToTop() {
        Picture redMotorcycle = new Picture("redMotorcycle.jpg");
        redMotorcycle.explore();
        redMotorcycle.mirrorHorizontalBottomToTop();
        redMotorcycle.explore();
    }

    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    public static void testMirrorArms() {
        Picture temple = new Picture("snowman.jpg");
        temple.explore();
        temple.mirrorArms();
        temple.explore();
    }

    public static void testMirrorDiagonal() {
        Picture temple = new Picture("beach.jpg");
        temple.explore();
        temple.mirrorDiagonal();
        temple.explore();
    }

    public static void testMirrorGull() {
        Picture temple = new Picture("seagull.jpg");
        temple.explore();
        temple.mirrorGull();
        temple.explore();
    }

    public static void testCopyTwo() {
        Picture first = new Picture("seagull.jpg");
        Picture second = new Picture("snowman.jpg");
        first.explore();
        first.copyTwo(second, 78, 298, 102, 295, 170, 387);
        first.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    public static void testMyCollage() {
        Picture first = new Picture("seagull.jpg");
        first.explore();
        first.myCollage();
        first.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture robot = new Picture("robot.jpg");
        robot.edgeDetection(10);
        robot.explore();
    }

    public static void testEdgeDetection2() {
        Picture robot = new Picture("robot.jpg");
        robot.explore();
        robot.edgeDetectionTwo(10);
        robot.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorVerticalRightToLeft();
        //testMirrorHorizontalTopToBottom();
        //testMirrorHorizontalBottomToTop();
        //testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testMyCollage();
        //testCopyTwo();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
        testBlur(194,171,25,25,10); 
    }
}
