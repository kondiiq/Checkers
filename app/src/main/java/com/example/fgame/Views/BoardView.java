package com.example.fgame.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.fgame.Models.BoardModel;

public class BoardView extends View {
    Paint colorBlock, whiteBlock;
    BoardModel model;

    public BoardView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        colorBlock = new Paint();
        whiteBlock = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        super.onDraw(canvas);
        this.whiteBlock = new Paint();
        this.colorBlock.setColor(Color.parseColor("#fff8dc"));
        this.whiteBlock.setStyle(Paint.Style.FILL);
        this.colorBlock = new Paint();
        this.colorBlock.setColor(Color.parseColor("#964B00"));
        this.colorBlock.setStyle(Paint.Style.FILL);

        for (float height = 1; height <= this.model.getHEIGHT(); height++) {
            float temp = 180f;
            for (float width = 1; width <= this.model.getWIDTH(); width++) {
                if (height == 1 || height == 3 || height == 5 || height == 7) {
                    if (width == 1 || width == 3 || width == 5 || width == 7) {
                        canvas.drawRect(temp * width - temp, temp * height - temp, temp * width, temp * height, whiteBlock);
                    }
                } else if (height == 2 || height == 4 || height == 6 || height == 8) {
                    if (width == 2 || width == 4 || width == 6 || width == 8)
                        canvas.drawRect(temp * width - temp, temp * height - temp, temp * width, temp * height, whiteBlock);
                }
                if (height == 1 || height == 3 || height == 5 || height == 7) {
                    if (width == 2 || width == 4 || width == 6 || width == 8) {
                        canvas.drawRect(temp * width - temp, temp * height - temp, temp * width, temp * height, colorBlock);
                    }
                } else if (height == 2 || height == 4 || height == 6 || height == 8) {
                    if (width == 1 || width == 3 || width == 5 || width == 7)
                        canvas.drawRect(temp * width - temp, temp * height - temp, temp * width, temp * height, colorBlock);
                }
            }
        }
    }
}
