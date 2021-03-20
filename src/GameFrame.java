import javax.swing.JFrame;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

    public GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();  //Will pack the components nicely
        this.setVisible(true);
        this.setLocationRelativeTo(null); //Creates the window in the middle of the screen
    }
    
}
