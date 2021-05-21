package pl.edu.pwr.i249263.checkers_apk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.Rectangle;

public class BoardView extends View  {
    BoardModel model;
    Paint paint;
    int [][] Field;

    public BoardView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Rectangle board = new Rectangle();
        board.height = model.getSizeSingleArea();
        board.width = model.getSizeSingleArea();
    }
}
