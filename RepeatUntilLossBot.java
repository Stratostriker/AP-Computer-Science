public class RepeatUntilLossBot implements RPSLSBot {
  private int myLastMove;
  private int oppLastMove;
  
  public RepeatUntilLossBot() {
    reset();
  }
  
  //Returns the name of the bot.
  public String getBotName() {
    return "RepeatUntilLossBot";
  }
  
  //Returns the name of the coder (your full name).
  public String getCoderName() {
    return "Mr. W";
  }
  
  //Informs the bot that a new match is going to start, allowing it to
  //reset or reinstantiate any necessary instance variables.
  public void reset() {
    myLastMove = 0;  //may as well start with rock
    oppLastMove = 2; //use scissors so it appears I won last round
  }
  
  //Returns the choice of move for the next turn of the bot.
  //Note: this method MUST return a value between 0 and 4, inclusive.
  //0 = rock, 1 = paper, 2 = scissors, 3 = lizard, 4 = Spock
  public int getMove() {
    if (RPSLSArena.judgeRPSLS(myLastMove, oppLastMove) == 2) {  //if I lost
      myLastMove = (myLastMove + 1) % 5;                   //go to next move in rotation
    }
    return myLastMove;
  }
  
  //Informs the bot of the move just made by the bot's opponent.
  //This information can be used to guide the bot's choice of next move.
  public void opponentsLastMove(int move) {
    oppLastMove = move;
  }
}