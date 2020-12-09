import javax.swing.*;
/**
 * 프레임을 만드는 클래스
 * 
 * (2017315013 이권효, 2018315023 야기시타 토시유키)
 * 2020-12-09
 */
public class TextFieldFrame extends JFrame
{
    
    public TextFieldFrame()
    {
        this.setTitle("과제#3(2017315013 이권효, 2018315023 야기시타 토시유키)");
        this.setSize(330, 300);
        MyPanel mp = new MyPanel();
        this.add(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
