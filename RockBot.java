public class RockBot implements RPSLSBot {
    //Returns the name of the bot.
  public String getBotName() {
    return "RockBot";
  }
  
  //Returns the name of the coder (your full name).
  public String getCoderName() {
    return "Mr. W";
  }
  
  //Informs the bot that a new match is going to start, allowing it to
  //reset or reinstantiate any necessary instance variables.
  public void reset() { }
  
  //Returns the choice of move for the next turn of the bot.
  //Note: this method MUST return a value between 0 and 4, inclusive.
  //0 = rock, 1 = paper, 2 = scissors, 3 = lizard, 4 = Spock
  public int getMove() {
    return 0;  //Yyyyyyyep. It's a rock.
  }
  
  //Informs the bot of the move just made by the bot's opponent.
  //This information can be used to guide the bot's choice of next move.
  public void opponentsLastMove(int move) { }
}