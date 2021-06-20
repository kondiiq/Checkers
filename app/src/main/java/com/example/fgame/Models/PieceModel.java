package com.example.fgame.Models;

import android.graphics.Paint;

public class PieceModel {

    private Paint white, color;
        private int cordinates [][];
    private float radius;

    PieceModel(){

    }

    public int[][] getCordinates() {
        return cordinates;
    }

    public Paint getWhite() {
        return white;
    }

    public Paint getColor() {
        return color;
    }

    public float getRadius() {
        return radius;
    }
}
