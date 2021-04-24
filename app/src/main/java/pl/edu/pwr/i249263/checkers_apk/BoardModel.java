package pl.edu.pwr.i249263.checkers_apk;

public class BoardModel {

//   Variables
    private final int WidthArea = 10;
    private final int HeightArea = 10;
    private  final  int SizeSingleArea = 25;

//    Construtor
    public BoardModel()
    {
        int[][] Board;
        Board = new int[getWidthArea()][getHeightArea()];
    }

//    Others Methods
    public void CreateBoard()
    {

    }

    public int getWidthArea()
    {
        return this.WidthArea;
    }

    public int getHeightArea()
    {
        return this.HeightArea;
    }

    public int getSizeSingleArea()
    {
        return this.SizeSingleArea;
    }
}
