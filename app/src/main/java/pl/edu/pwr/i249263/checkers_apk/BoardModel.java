package pl.edu.pwr.i249263.checkers_apk;

import android.content.Context;

import java.util.ArrayList;

import static android.drm.DrmStore.Playback.PAUSE;
import static android.drm.DrmStore.Playback.STOP;

public class BoardModel {

//   Variables
    private static final int WIDTH_AREA = 8;
    private static final int HEIGHT_AREA = 8;
    private final int SIZE_SINGLE_BLOCK = 25;
    private  final int EMPTY = 0;
    private  final  int CHECKER = 1;
    private int white_move;
    private int black_move;
    private int moves;
    private int Board[][];
    private int numberWhitePiece, numberBlackPiece;
    private enum gameState {PAUSE, PLAYING, BLACK_WIN, WHITE_WIN};
    private gameState Status;
    private ArrayList<PawnModel> white, black;
    Context context;
    BoardView view;
    PawnModel pawnModel;
    //    Construtor
    public BoardModel() {
        this.white_move = 0;
        this.black_move = 0;
        gameState Status = gameState.PAUSE;
        this.white = new ArrayList<PawnModel>();
        this.black = new ArrayList<PawnModel>();
        Board = new int[HEIGHT_AREA][WIDTH_AREA];
        clearBoard();
        moves = 0;
        this.Status = gameState.PLAYING;
        setNumberBlackPiece();
        setNumberWhitePiece();
        view = new BoardView(context);

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

    public int getWhite_move() {
        return this.white_move;
    }

    public int getBlack_move(){
        return this.black_move;
    }

    public int plusOneMove() {
        return this.moves ++;
    }

    public int plusWhiteMove(){
        return  this.white_move ++;
    }

    public int plusBlackMove(){
        return this.black_move ++;
    }
    public gameState getGameState()
    {
        return this.Status;
    }

    public boolean isLegalMove(){
        if(this.pawnModel.getWidth_cordinate() > 0 && this.pawnModel.getWidth_cordinate() < WIDTH_AREA && this.pawnModel.getHeight_cordinate() >= 0 && this.pawnModel.getHeight_cordinate()< HEIGHT_AREA){
            return true;
        }
        return false;
    }

    public int [][] getBoard() {
        return this.Board.clone();
    }

    public void clearBoard() {
        for (int height = 0; height < getHeightArea(); ++height) {
            for (int width = 0; width < getWidthArea(); ++width) {
                this.Board[width][height] = EMPTY; // 0 -> no checker 1 -> checker
            }
        }
    }

    public  void setBlackPawns(){
    }

    public void setWhitePawns(){
    }

    public int getNumberWhitePiece(){
        return this.numberWhitePiece;
    }

    public int getNumberBlackPiece(){
        return this.numberBlackPiece;
    }

    public int setNumberWhitePiece(){
        this.numberWhitePiece = 12;
        return this.numberWhitePiece;
    }

    public int setNumberBlackPiece(){
        this.numberBlackPiece = 12;
        return this.numberBlackPiece;
    }

    public boolean isFieldEmpty(int width, int height){
        if(Board[height][width] == 0)
            return true;
        else
            return false;
    }

    public int minusBlackPawn(){
        return this.numberBlackPiece - 1 ;
    }

    public int minusWhitePawn(){
        return this.numberWhitePiece - 1 ;
    }

    gameState setGameStatus(){
        if(this.numberBlackPiece == 0)
            return gameState.WHITE_WIN;
        if(this.numberWhitePiece == 0);
            return gameState.BLACK_WIN;
    }
}
