import java.util.*;

class RPS {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors Game");

        while(true){
        System.out.println("Enter your choice: (1) Rock, (2) Paper, (3) Scissors");
        int userMove = sc.nextInt();
        int computerMove = (int) (Math.random() * 3) + 1;
 
        System.out.println("You chose: " + getMoveName(userMove));
        System.out.println("Computer chose: " + getMoveName(computerMove));
        int winner = determineWinner(userMove, computerMove);

        if (winner == 0) {
            System.out.println("It's a Draw");
        } else if (winner == 1) {
            System.out.println("You win");
        } else {
            System.out.println("Computer wins");
        }
    }
}
    private static String getMoveName(int Move) {
        switch (Move) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
    
    private static int determineWinner(int userMove, int computerMove) {
        if (userMove == computerMove) {
            return 0;
        } else if ((userMove == 1 && computerMove == 3) ||
                (userMove == 2 && computerMove == 1) ||  (userMove == 3 && computerMove == 2));
        return computerMove;
        
    }
}
