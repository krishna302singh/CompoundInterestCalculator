package compound_interest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame{
	JPanel p1,p2;
	JButton b;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	class B implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				String s4=t4.getText();
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				int n3=Integer.parseInt(s3);
				int n4=Integer.parseInt(s4);
				int x=n3*n4;
				double y=n4*100;
				
				double A=n1*(Math.pow((1+n2/y),x));
				l5.setText(String.valueOf(A));
				//l5.setText(n+" ");
			}
			catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "Invalid Number!");
			}
		}
	}
	A(){
		setTitle("COMPOUND INTEREST");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,600);
		setLocationRelativeTo(null);
		getContentPane().setBackground(new Color(20, 102, 17));
		setLayout(null);
		
		Font font1=new Font(Font.MONOSPACED,Font.BOLD,20);
		Font font2=new Font(Font.SANS_SERIF,Font.BOLD,20);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(245, 31, 7));
		p1.setBounds(25,20,435,385);
		add(p1);
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(11, 218, 222));
		p2.setBounds(25,420,435,100);
		add(p2);
		
		l1=new JLabel("Principle:");
		l1.setFont(font1);
		l1.setBounds(30,20,140,50);
		p1.add(l1);
		l2=new JLabel("Rate:");
		l2.setFont(font1);
		l2.setBounds(30,90,140,50);
		p1.add(l2);
		l3=new JLabel("Time:");
		l3.setFont(font1);
		l3.setBounds(30,160,140,50);
		p1.add(l3);
		l6=new JLabel("Number:");
		l6.setFont(font1);
		l6.setBounds(30,230,140,50);
		p1.add(l6);
		
		t1=new JTextField();
		t1.setForeground(Color.BLACK);
		t1.setFont(font2);
		t1.setBounds(190,30,200,30);
		p1.add(t1);
		t2=new JTextField();
		t2.setForeground(Color.BLACK);
		t2.setFont(font2);
		t2.setBounds(190,100,200,30);
		p1.add(t2);
		t3=new JTextField();
		t3.setForeground(Color.BLACK);
		t3.setFont(font2);
		t3.setBounds(190,170,200,30);
		p1.add(t3);
		t4=new JTextField();
		t4.setForeground(Color.BLACK);
		t4.setFont(font2);
		t4.setBounds(190,240,200,30);
		p1.add(t4);
		
		b=new JButton("FIND");
		b.addActionListener(new B());
		b.setFont(font2);
		b.setForeground(Color.BLACK);
		b.setBackground(Color.WHITE);
		b.setBounds(170,300,190,70);
		p1.add(b);
		
		l4=new JLabel("CI:");
		l4.setFont(font1);
		l4.setBounds(30,20,50,50);
		p2.add(l4);
		l5=new JLabel("---------");
		l5.setHorizontalAlignment(JLabel.CENTER);
		l5.setFont(font2);
		l5.setBounds(100,20,370,50);
		p2.add(l5);
		}
}
public class CompoundInterest {
	public static void main(String[] args) {
		A a=new A();
		a.setVisible(true);
	}

}

