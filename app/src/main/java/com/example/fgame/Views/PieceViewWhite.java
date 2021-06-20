package com.example.fgame.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class PieceViewWhite extends View {
    private Paint whitePiece;
    private  float radius = 60f;
    public PieceViewWhite(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.whitePiece = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.whitePiece.setColor(Color.GRAY);
        this.whitePiece.setStyle(Paint.Style.FILL);
        canvas.drawCircle(167.5f, 167.5f, this.radius, whitePiece);
    }
}

