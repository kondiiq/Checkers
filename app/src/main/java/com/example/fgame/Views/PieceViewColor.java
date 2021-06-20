package com.example.fgame.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class PieceViewColor extends View {
    private Paint colorPiece;
    private  float radius = 60f;
    public PieceViewColor(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.colorPiece = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.colorPiece.setColor(Color.GREEN);
        this.colorPiece.setStyle(Paint.Style.FILL);
        canvas.drawCircle(167.5f, 167.5f, this.radius, colorPiece);
    }
}
