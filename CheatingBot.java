import java.util.*;

public class CheatingBot implements RPSLSBot {
   int counterStrategy = -1;
   int lastMove = 0;
   int opponentMove = 0;
   int fixedMove = 1;
   ArrayList<Integer> opponentMoves = new ArrayList<Integer>();
   ArrayList<Integer> myMoves = new ArrayList<Integer>();

   public String getBotName() {
      return "CheatingBot";
   }

   public String getCoderName() {
      return "Alan Gu";
   }

   public void reset() {
      counterStrategy = -1;
      lastMove = 0;
      opponentMove = 0;
      fixedMove = 1;
      opponentMoves.clear();
      myMoves.clear();
   }

   public int getMove() {
      if (counterStrategy == -1) {
         // try to find strategy in first 10 moves
         int move = (int) (Math.random() * 5);
         myMoves.add(move);
         if (opponentMoves.size() == 10) {
            botBeater();
         }
         return move;
      } else if (counterStrategy == 0) {
         // against player play random
         return (int) (Math.random() * 5);
      } else if (counterStrategy == 1) {
         int[] fixedBeater = {1, 2, 5, 4, 0};
         return fixedBeater[fixedMove];
      } else if (counterStrategy == 2) {
         // beat CopyBot (stay one move ahead)
         if (lastMove == 0) {
            lastMove = 1;
            return 1;
         } else if (lastMove == 1) {
            lastMove = 2;
            return 2;
         } else if (lastMove == 2) {
            lastMove = 0;
            return 0;
         }
         // beat RepeatUntiLossBot (find what it will play next)
      } else if (counterStrategy == 3) {
         if (judgeMatch(lastMove, opponentMove) != 1) {
            for (int i = 0; i < 5; i++) {
               if (judgeMatch(i, opponentMove) == 1) {
                  lastMove = i;
                  return i;
               }
            }
         } else {
            for (int i = 0; i < 5; i++) {
               if (judgeMatch(i, (opponentMove + 1) % 5) == 1) {
                  lastMove = i;
                  return i;
               }
            }
         }
      }
      return (int) (Math.random() * 5);
   }

   public void opponentsLastMove(int move) {
      if (counterStrategy == -1) {
         opponentMoves.add(move);
      }
      if (counterStrategy == 3) {
         opponentMove = move;
      }
   }

   void botBeater() {
      // check for fixed move bot
      int rockCount = 0;
      int paperCount = 0;
      int scissorsCount = 0;
      int lizardCount = 0;
      int spockCount = 0;
      for (int i = 0; i < opponentMoves.size(); i++) {
         if (opponentMoves.get(i) == 0) {
            rockCount++;
         }
         else if (opponentMoves.get(i) == 1) {
            paperCount++;
         }
         else if (opponentMoves.get(i) == 2) {
            scissorsCount++;
         }
         else if (opponentMoves.get(i) == 3) {
            lizardCount++;
         }
         else if (opponentMoves.get(i) == 4) {
            spockCount++;
         }
      }
      int[] fixed = {rockCount, paperCount, scissorsCount, lizardCount, spockCount};
      for(int i = 0; i < 5; i++) {
         if (rockCount == opponentMoves.size()) {
            counterStrategy = 1;
            fixedMove = i;
            return;
         }
      }
      // check for CopyBot
      int copyCount = 0;
      for (int i = 0; i < opponentMoves.size() - 1; i++) {
         if (myMoves.get(i) == opponentMoves.get(i + 1)) {
            copyCount++;
         }
      }
      if (copyCount == opponentMoves.size() - 1) {
         counterStrategy = 2;
         return;
      }
      // check for RepeatUntilLossBot
      int repeatCount = 0;
      for (int i = 0; i < opponentMoves.size() - 1; i++) {
         if (judgeMatch(myMoves.get(i), opponentMoves.get(i)) == 1) {
            if ((opponentMoves.get(i) + 1) % 5 == opponentMoves.get(i + 1)) {
               repeatCount++;
            }
         } 
         else {
            if (opponentMoves.get(i) == opponentMoves.get(i + 1)) {
               repeatCount++;
            }
         }
      }
      if (repeatCount == opponentMoves.size() - 1) {
         counterStrategy = 3;
         return;
      }
   }

   static int judgeMatch(int player1move, int player2move) {
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
}