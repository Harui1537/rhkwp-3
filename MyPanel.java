import javax.swing.*;
import java.awt.event.*;
/**
 * Panel에 필요한 컴포넌트를 추가하고 리스너를 겸용하는 클래스
 * 
 * (2017315013 이권효, 2018315023 야기시타 토시유키)
 * 2020-12-09
 */
public class MyPanel extends JPanel implements ActionListener
{   
    JTextField name;
    JTextField major;
    JTextField address;
    JComboBox<String> combo;
    JTextArea ta;
    JButton addBt;
    JButton clear;
    public MyPanel()
    {
        this.add(new JLabel("이름 "));
        name = new JTextField(25);
        this.add(name);

        this.add(new JLabel("학과 "));
        major = new JTextField("글로벌소프트웨어학과",25);
        this.add(major);

        this.add(new JLabel("주소 "));
        address = new JTextField("서울시",25);
        this.add(address);
        
        this.add(new JLabel("학년"));
        String[] grade = {"1학년", "2학년", "3학년", "4학년"};
        combo = new JComboBox<String>(grade);
        this.add(combo);
        
        addBt = new JButton("추가");
        this.add(addBt);
        clear = new JButton("Clear");
        this.add(clear);
        
        
        ta = new JTextArea(9,30);
        ta.append("이름 : 홍길동 \n");
        ta.append("학과 : 글로벌 소프트웨어학과 \n");
        ta.append("학년 : 3학년 \n");
        ta.append("주소 : 서울시 \n");
        ta.append("--------------------------------------------------- \n");
        this.add(new JScrollPane(ta));
        
        
        addBt.addActionListener(this);
        clear.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        JButton source = (JButton)e.getSource();
        if (source == addBt){
            ta.append("이름 : " + name.getText() + "\n");
            ta.append("학과 : " + major.getText() + "\n");
            ta.append("학년 : " + (String)combo.getSelectedItem() + "\n");
            ta.append("주소 : " + address.getText() + "\n");
            ta.append("--------------------------------------------------- \n");
        }
        else if (source == clear){
            name.setText("");
            major.setText("");
            address.setText("");
            ta.setText("");
        }
        
    }
}
