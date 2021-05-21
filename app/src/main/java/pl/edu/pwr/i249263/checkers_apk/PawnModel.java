package pl.edu.pwr.i249263.checkers_apk;

import androidx.dynamicanimation.animation.SpringAnimation;

public class PawnModel {
    BoardModel model;
    private boolean color;
    private int width_cordinate;
    private int height_cordinate;
    private int pawnCordinats[][];
    private enum pawnState {Piece, Queen};
    public PawnModel(){
        this.pawnCordinats = new int[this.height_cordinate][this.width_cordinate];
        pawnState pawnStatus = PawnModel.pawnState.Piece;
    }

    public int getHeight_cordinate() {
        return height_cordinate;
    }

    public int getWidth_cordinate() {
        return width_cordinate;
    }

    public boolean getColor(){
        return color;
    }

    public void move(){
        if(canMove()){

        }
        else{}
    }

    void CapturePawn() {

    }

    public boolean canMove(){
        return false;
    }

    public void moveLeftUp(){
        if(model.isLegalMove()){
            pawnCordinats[getHeight_cordinate()][getWidth_cordinate()] = 0;
            pawnCordinats[getHeight_cordinate() - 1][getWidth_cordinate() - 1] = 1;
        }
        else {}
    }

    public void moveLeftDown(){
        pawnCordinats[getHeight_cordinate()][getWidth_cordinate()] = 0;
        pawnCordinats[getHeight_cordinate() + 1][getWidth_cordinate() - 1] = 1;
    }

    public void moveRightUp(){
        pawnCordinats[getHeight_cordinate()][getWidth_cordinate()] = 0;
        pawnCordinats[getHeight_cordinate() - 1][getWidth_cordinate() + 1] = 1;
    }
    public void moveRightDown(){
        pawnCordinats[getHeight_cordinate()][getWidth_cordinate()] = 0;
        pawnCordinats[getHeight_cordinate() + 1][getWidth_cordinate() + 1] = 1;
    }

    pawnState getPawnState(){
        return pawnState.Piece;
    }
}
