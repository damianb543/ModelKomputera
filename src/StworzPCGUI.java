import javax.swing.*;

public class StworzPCGUI {
    private JPanel panelPC;
    private JButton okButton;
    private JFrame closeFrame;

    public StworzPCGUI(){

        okButton.addActionListener(e -> {
            closeFrame.dispose();
        });

    }

    public void wyswietlPCGUI(){
        JFrame frame = new JFrame("Kreator PC");
        StworzPCGUI stworzPCGUI = new StworzPCGUI();
        frame.setContentPane(stworzPCGUI.panelPC);
        stworzPCGUI.closeFrame = frame;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

