public class RandoBot implements RPSLSBot {
    public String getBotName() {
        return "RandoBot";
    }
    public String getCoderName() {
        return "Alan Gu";
    }
    public void reset() {
    }
    public int getMove() {
        //returns a random number from 0 to 4, inclusive
        return (int)(Math.random() * 5);
    }
    public void opponentsLastMove(int move) {
    }
}