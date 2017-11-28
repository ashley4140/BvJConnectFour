import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;


public class StartScreen {

    static MyBoard gb;

    public static void main(String args[]) {

        JFrame frame = new JFrame("Connect Four");
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Player");
        menuBar.add(fileMenu);
        JMenu fileMenu1 = new JMenu("About");
        menuBar.add(fileMenu1);
        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
        frame.setResizable(false);


        fileMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                String name1 = JOptionPane.showInputDialog("Player 1 - Please enter your Name");

                JOptionPane.showInputDialog("Player 1 - Please enter your Age");
                String name2 = JOptionPane.showInputDialog("Player 2 - Please Enter Your Name");
                JOptionPane.showInputDialog("Player 2 - Please enter your Age");
                JOptionPane.showMessageDialog(null,"Welcome "+ name1 +" You are Batman! \n\nWelcome "+name2+" You are the Joker! \n\n Press Yes to start the game");
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {
                JOptionPane.showMessageDialog(null,"GoodBye!");
            }
        });

        fileMenu1.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                JOptionPane.showMessageDialog(null,"How To Play \n\nThis is a Batman Vs The Joker Connect Four Game " +
                        "\n\nThe Riddler has elaborated a plan to figure out if Batman is really better than The Joker" +
                        "\n\nPlayer One Is Batman and Player Two is The Joker ");
                JOptionPane.showMessageDialog(null,"\n\nThe Board can be won in the following ways " +
                        "\n\nVertical Win             Horizontal Win " +
                        "\n\nxxxxxxx                  xxxxxxx" +
                        "\n\nxxxxxxx                  xxxxxxx" +
                        "\n\nxxxOxxx                  xxxxxxx" +
                        "\n\nxxxOxxx                  xOOOOxx" +
                        "\n\nxxxOxxx                  xxxxxxx" +
                        "\n\nxxxOxxx                  xxxxxxx" +

                        "\n\nDiagonal Left Win        Diagonal Right Win " +
                        "\n\nxxxxxxx                  xxxxxxx" +
                        "\n\nxxxxxxx                  xxxxxxx" +
                        "\n\nxOxxxxx                  xxxxxOx" +
                        "\n\nxxOxxxx                  xxxxOxx" +
                        "\n\nxxxOxxx                  xxxOxxx" +
                        "\n\nxxxxOxx                  xxOxxxx" );








            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });



        //yes/no actionbuttons
        JButton yes = new JButton();
        JButton no = new JButton("CLOSE");

        yes.setBackground(Color.white);
        no.setBackground(Color.white);

        yes.setText("YES");
        no.setText("NO");

        panel.add(yes);
        panel.add(no);
        //Size and Style
        yes.setFont(new Font("Arial", Font.BOLD, 20));
        no.setFont(new Font("Arial", Font.BOLD, 20));

        //open command
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                gb = new MyBoard();

                //gb.setVisible(false);


            }
        });
        //Close command
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Leaving so soon are we Batman I guess the Joker really is better than you \n\n                         Come Back when you really want to fight!");
                System.exit(0);
            }
        });

        //start image
        JLabel front = new JLabel();
        front.setIcon(new ImageIcon("Front Screen3.jpg"));
        panel.add(front);

        frame.add(panel);
        frame.setSize(945, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    public static MyBoard getGameBoard()
    {
        return gb;

    }

}

