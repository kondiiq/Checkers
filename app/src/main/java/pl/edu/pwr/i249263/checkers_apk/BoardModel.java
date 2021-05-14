package pl.edu.pwr.i249263.checkers_apk;

public class BoardModel {

//   Variables


    private final int WIDTH_AREA = 8;
    private final int HEIGHT_AREA = 8;
    private final int SIZE_SINGLE_BLOCK = 25;
    private int moves;
    private int Board[][];


    //    Construtor
    public BoardModel() {
        Board = new int[getWidthArea()][getHeightArea()];
        clearBoard();
        moves = 0;
    }

//    Methods

    public int getWidthArea() {
        return this.WIDTH_AREA;
    }

    public int getHeightArea() {
        return this.HEIGHT_AREA;
    }

    public int getSizeSingleArea() {
        return this.SIZE_SINGLE_BLOCK;
    }

    public int getMoves() {
        return this.moves;
    }

    public int plusOneMove() {
        return this.moves++;
    }

    public void clearBoard() {
        for (int height = 0; height < getHeightArea(); ++height) {
            for (int width = 0; width < getWidthArea(); ++width) {
                Board[width][height] = 0; // 0 -> no checker 1 -> checker
            }
        }
    }
}
