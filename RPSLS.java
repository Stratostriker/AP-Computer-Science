public class RPSLS {
   public static void main(String[] args) {
      //System.out.println(judgeRPSLS(1, 4));
      //System.out.println(judgeRPSLS(2, 2));
      //System.out.println(judgeRPSLS(3, 0));
      //test code
      playRPSLSMatch(new RandoBot(), new CopyBot(), 100, false);
      System.out.print("\n");
      playRPSLSMatch(new RandoBot(), new CopyBot(), 5, true);
   }

   public static int judgeRPSLS(int player1move, int player2move) {
      //throws exception is argument is out of range
      if ((player1move < 0 || player1move > 4) || (player2move < 0 || player2move > 4)) {
         throw new IllegalArgumentException();
      }
      //adjacency matrix indicating outcomes
      int[][] graph = {{0, 2, 1, 1, 2},
             {1, 0, 2, 2, 1},
             {2, 1, 0, 1, 2},
             {2, 1, 2, 0, 1},
             {1, 2, 1, 2, 0}};
      //returns result
      return graph[player1move][player2move];
   }

   public static void playRPSLSMatch(RPSLSBot player1, RPSLSBot player2, int numGames, boolean verbose) {
      //score accumulators
      int score1 = 0, score2 = 0;
      //name of the coder of each bot
      String coder1 = player1.getCoderName(), coder2 = player2.getCoderName();
      //name of each bot
      String bot1 = player1.getBotName(), bot2 = player2.getBotName();
   
      //resets both bots
      player1.reset();
      player2.reset();
   
      //repeat numGames times
      for (int i = 0; i < numGames; i++) {
         //asks each bot for their move
         int play1 = player1.getMove(), play2 = player2.getMove();
         String[] move = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
      
         //sends last move to each bot
         player2.opponentsLastMove(play1);
         player1.opponentsLastMove(play2);
      
         String moves = (i+1) + ": " + bot1 + ": " + move[play1] + " " + bot2 + ": " + move[play2] + " ";
      
         //judges winner and updates score
         int winner = judgeRPSLS(play1, play2);
         if(winner == 1) {
            score1 += 2;
            moves += bot1 + " wins!";
         }
         else if(winner == 2) {
            score2 += 2;
            moves += bot2 + " wins!";
         
         }
         else {
            score1++;
            score2++;
            moves += "It's a tie!";
         }
         if(verbose) {
            System.out.println(moves);
         }
      }
      //print final match results
      System.out.println("\n" + bot1 + " by " + coder1 + ": " + score1 + "\n" + bot2 + " by " + coder2 + ": " + score2);
      if(score1 > score2) {
         System.out.println(bot1 + " by " + coder1 + " wins!");
      }
      else if(score1 < score2) {
         System.out.println(bot2 + " by " + coder2 + " wins!");
      }
      else {
         System.out.println("It's a tie!");
      }
   }
}
