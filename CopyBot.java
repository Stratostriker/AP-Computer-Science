public class CopyBot implements RPSLSBot {
    //instance variable, initially a random number from 0 to 4, inclusive
    private int lastMove = (int)(Math.random() * 5);

    public CopyBot() {
        reset();
    }
    public String getBotName() {
        return "CopyBot";
    }
    public String getCoderName() {
        return "Alan Gu";
    }
    public void reset() {
        lastMove = (int)(Math.random() * 5);
    }
    public int getMove() {
        //returns the last move of the opponent
        return lastMove;
    }
    public void opponentsLastMove(int move) {
        //saves the opponent's last move
        lastMove = move;
    }
}