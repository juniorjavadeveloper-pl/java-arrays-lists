package pl.juniorjavadeveloper.java.arrays.lists;

public class LocalPaintShop {
    public static void main(String[] args) {
        PaintShop paintShop = new PaintShop();

        paintShop.setBlackPaint("black");
        paintShop.setGreenPaint("green");
        paintShop.setWhitePaint("white");

        System.out.println("Colors in the Shop: " + paintShop);
    }
}
