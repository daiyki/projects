import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        String player1 = JOptionPane.showInputDialog("Player 1, Enter your move\t       Rock   Paper   Scissors");
        String player2 = JOptionPane.showInputDialog("Player 2, Enter your move\t       Rock   Paper   Scissors");

        if(player1.equalsIgnoreCase(player2)){
            JOptionPane.showMessageDialog(null, "Its a tie");
        } else if(player1.equalsIgnoreCase("Rock") && player2.equalsIgnoreCase("Scissors")){
            JOptionPane.showMessageDialog(null, "Player 1 wins");
        } else if(player1.equalsIgnoreCase("Paper") && player2.equalsIgnoreCase("Rock")){
            JOptionPane.showMessageDialog(null, "Player 1 wins");
        } else if(player1.equalsIgnoreCase("Scissors") && player2.equalsIgnoreCase("Paper")){
            JOptionPane.showMessageDialog(null, "Player 1 wins");
        } else{
            JOptionPane.showMessageDialog(null, "Player 2 wins");
        }
    }
}