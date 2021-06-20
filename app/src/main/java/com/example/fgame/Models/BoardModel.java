package com.example.fgame.Models;

import java.util.ArrayList;

public class BoardModel {

    private static final int WIDTH = 8;
    private static final int HEIGHT = 8;
    private final int EMPTY = 0;
    private final int PIECE = 1;

    private ArrayList<PieceModel> whitePawns;
    private ArrayList<PieceModel> colorPawns;
    private int repeatedMoves;
    private int whitePieces, colorPieces;
    private int moves;
    private int colorMoves;
    private int whiteMoves;
    private boolean LegalMoves[][];
    private int Board[][];

    private enum gameStatus {PAUSE, IN_GAME, BLACK_WIN, WHITE_WIN}


    private gameStatus status;

    private enum MOVE {
        VALID_MOVE, WRONG_NUM_STEPS, MOVING_WRONG_PIECE, MOVE_OUT_OF_BOUND, WRONG_DIRECTION,
        NOT_KILLING_MOVE
    }

    public BoardModel() {
        this.repeatedMoves = 0;
        this.status = gameStatus.PAUSE;
        this.colorMoves = 0;
        this.whiteMoves = 0;
        this.moves = 0;
        clearBoard();
        whitePawns = new ArrayList<PieceModel>();
        colorPawns = new ArrayList<PieceModel>();
        this.whitePieces = 12;
        this.colorPieces = 12;
        status = gameStatus.IN_GAME;
    }

    public void clearBoard() {
        for (int row = 0; row < WIDTH; row++) {
            for (int col = 0; col < HEIGHT; col++) {
                this.Board[row][col] = EMPTY;
            }
        }
    }

    public int addWhiteMove() {
        return this.whiteMoves + 1;
    }

    public int addColorMove() {
        return this.colorMoves + 1;
    }

    public int addMove() {
        if (getColorMoves() == getWhiteMoves())
            this.moves = getColorMoves();
        return this.moves;
    }



//    Getters&Setters

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public int[][] getBoard() {
        return Board;
    }

    public void setBoard(int[][] board) {
        Board = board;
    }

    public int getMoves() {
        return moves;
    }

    public int getColorMoves() {
        return colorMoves;
    }

    public int getWhiteMoves() {
        return whiteMoves;
    }

    public int getWhitePieces() {
        return whitePieces;
    }

    public int getColorPieces() {
        return colorPieces;
    }

    public int getRepeatedMoves() {
        return repeatedMoves;
    }
}
