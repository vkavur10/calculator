import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
public class CalcGUI extends JFrame {
	private int width;
	private int height;
	private JButton button;
	private JFrame jf;
	
	
	
	public CalcGUI(int w, int h) {
		width=w;
		height=h;
		button=new JButton("CLICK ME");
			
	}
	
	public void setUpGUI() {
		jf=new JFrame();
		jf.setSize(width, height);
		jf.setTitle("My Java APP");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.add(button);
		jf.setBackground(Color.BLUE);
		jf.setVisible(true);
		//Container c=jf.getContentPane();
		jf.setLayout(null);
		
		
		JPanel panelTop =new JPanel(new GridBagLayout());
		panelTop.setBounds(0,0,400,75);
		panelTop.setBackground(Color.LIGHT_GRAY);
		jf.add(panelTop);
		
		JPanel panelBottom =new JPanel();
		panelBottom.setBounds(0,25,400,325);
		panelBottom.setLayout(new GridLayout(6,6,8,8));
		panelBottom.setBackground(Color.DARK_GRAY);
		jf.add(panelBottom);
		JTextField calcDisplay=new JTextField(20);
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,b10,b11,b12,b13;
		panelTop.add(calcDisplay);
		//b0 = new JButton("0");
		
        b1 = new JButton("1");
       
        b2 = new JButton("2");
        
        b3 = new JButton("3");
        b4 = new JButton("+");
        b4 = new JButton("<<");
        b4 = new JButton("4");
         
        b5 = new JButton("5");
        
        b6 = new JButton("6");
        b6 = new JButton("-");
        b6 = new JButton("C");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b9 = new JButton("*");
        b9 = new JButton("(");
        b10 = new JButton("+/-");
        b11= new JButton("0");
        b12= new JButton(".");
        b13= new JButton(")");
        
        //panelBottom.add(b0);
        panelBottom.add(b1);
        panelBottom.add(b2);
        panelBottom.add(b3);
        panelBottom.add(b4);
        panelBottom.add(b5);
        panelBottom.add(b6);
        panelBottom.add(b7);
        panelBottom.add(b8);
        panelBottom.add(b9);
        panelBottom.add(b10);
        panelBottom.add(b11);
        panelBottom.add(b12);
        panelBottom.add(b13);
		

		
		//tf.setBounds(50,100, 200,30);
		//tf.setFont(tf.getFont().deriveFont(50f));
		
		
		jf.setVisible(true);
	
		
	}
	
	public static void main(String[] args) {
		CalcGUI c= new CalcGUI(400, 400);
		c.setUpGUI();
	}

}
