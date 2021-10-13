package application;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow implements Swingable
{

    private JButton clickMeButton;
    private JFrame  windowFrame;
    private String  windowName;
    private final String BUTTON_TEXT = "CLICK ME";
    public MainWindow(String windowName)
    {
        this.windowName = windowName;
        this.windowFrame = new JFrame(windowName); 
        this.clickMeButton = new JButton(BUTTON_TEXT);
        this.clickMeButton.setBounds(130,100,100,40);
        this.windowFrame.add(this.clickMeButton);
        this.windowFrame.setSize(400,500);
        this.windowFrame.setLayout(null);
    }

    public void runMe()
    {
        this.windowFrame.setVisible(true);
    }

    public void killMe()
    {
        this.windowFrame.setVisible(false);
    }

}
