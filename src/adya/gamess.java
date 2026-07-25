package adya;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



class gamess extends JFrame implements ActionListener {

    private JButton rockButton, paperButton, scissorsButton;
    private JLabel statusLabel;

    public gamess() {
        setTitle("Rock Paper Scissors");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create buttons
        JPanel buttonPanel = new JPanel();
        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");

        rockButton.addActionListener(this);
        paperButton.addActionListener(this);
        scissorsButton.addActionListener(this);

        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);

        // Status label
        statusLabel = new JLabel("Choose Rock, Paper, or Scissors", SwingConstants.CENTER);

        add(buttonPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userChoice = "";
        if (e.getSource() == rockButton) {
            userChoice = "rock";
        } else if (e.getSource() == paperButton) {
            userChoice = "paper";
        } else if (e.getSource() == scissorsButton) {
            userChoice = "scissors";
        }

        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice = choices[new Random().nextInt(3)];

        String result;
        if (userChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else if (
                (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock"))
        ) {
            result = "You win!";
        } else {
            result = "You lose!";
        }

        statusLabel.setText("Computer chose: " + computerChoice + " — " + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            gamess game = new gamess();
            game.setVisible(true);
        });
    }
}



