package adya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;;

public class game {


    public class Game extends JFrame implements ActionListener {

        private JButton rockButton, paperButton, scissorsButton;
        private JLabel userChoiceLabel, computerChoiceLabel, resultLabel;

        public Game() {
            setTitle("Stone Paper Scissors Game");
            setSize(400, 300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new GridLayout(5, 1));

            // Title
            JLabel titleLabel = new JLabel("Stone Paper Scissors", JLabel.CENTER);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
            add(titleLabel);

            // Buttons
            JPanel buttonPanel = new JPanel();
            rockButton = new JButton("Stone");
            paperButton = new JButton("Paper");
            scissorsButton = new JButton("Scissors");

            rockButton.addActionListener(this);
            paperButton.addActionListener(this);
            scissorsButton.addActionListener(this);

            buttonPanel.add(rockButton);
            buttonPanel.add(paperButton);
            buttonPanel.add(scissorsButton);
            add(buttonPanel);

            // Labels
            userChoiceLabel = new JLabel("Your choice: ", JLabel.CENTER);
            computerChoiceLabel = new JLabel("Computer's choice: ", JLabel.CENTER);
            resultLabel = new JLabel("Result: ", JLabel.CENTER);

            add(userChoiceLabel);
            add(computerChoiceLabel);
            add(resultLabel);

            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String userChoice = "";
            if (e.getSource() == rockButton) {
                userChoice = "Stone";
            } else if (e.getSource() == paperButton) {
                userChoice = "Paper";
            } else if (e.getSource() == scissorsButton) {
                userChoice = "Scissors";
            }

            String[] options = {"Stone", "Paper", "Scissors"};
            String computerChoice = options[new Random().nextInt(3)];

            userChoiceLabel.setText("Your choice: " + userChoice);
            computerChoiceLabel.setText("Computer's choice: " + computerChoice);
            resultLabel.setText("Result: " + getWinner(userChoice, computerChoice));
        }

        private String getWinner(String user, String computer) {
            if (user.equals(computer)) {
                return "It's a Tie!";
            } else if ((user.equals("Stone") && computer.equals("Scissors")) ||
                    (user.equals("Scissors") && computer.equals("Paper")) ||
                    (user.equals("Paper") && computer.equals("Stone"))) {
                return "You Win!";
            } else {
                return "You Lose!";
            }
        }

        public void main(String[] args) {
            new Game();
        }
    }

}
