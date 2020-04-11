package pl.juniorjavadeveloper.java.arrays.lists;

import java.util.Arrays;

public class PaintShop {
    private String[] colors;

    private String blackPaint;
    private String whitePaint;
    private String greenPaint;
    // etc.
    // getter/setter
    // toString

    public String getBlackPaint() {
        return blackPaint;
    }

    public void setBlackPaint(String blackPaint) {
        this.blackPaint = blackPaint;
    }

    public String getWhitePaint() {
        return whitePaint;
    }

    public void setWhitePaint(String whitePaint) {
        this.whitePaint = whitePaint;
    }

    public String getGreenPaint() {
        return greenPaint;
    }

    public void setGreenPaint(String greenPaint) {
        this.greenPaint = greenPaint;
    }

    @Override
    public String toString() {
        return "PaintShop{" +
                "blackPaint='" + blackPaint + '\'' +
                ", whitePaint='" + whitePaint + '\'' +
                ", greenPaint='" + greenPaint + '\'' +
                '}';
    }
}
