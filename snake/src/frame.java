import javax.swing.*;

public class frame extends JFrame {
    frame(){
    this.add(new panel()); //
        this.setTitle("Snake Game");
        this.setResizable(false); //for good experience of user//prevent user resize
        this.setVisible(true); //make frame appear
        this.pack();  // size the frame accor to window

    }

}
