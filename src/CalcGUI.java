import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CalcGUI implements ActionListener {
	private int width;
	private int height;
	private JButton button;
	private JFrame jf;
	JTextField calcDisplay;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23;
	double num1=0,num2=0,result=0;

	char operator;
	
	public CalcGUI(int w, int h) {
		width=w;
		height=h;
		button=new JButton("CLICK ME");
			
	}
	//SetUpGUI method will initiate the GUI properties of the Calculator window, declaring panels and frames, 
	//this method will add buttons to the panels
	//and will initial action listener events
	public void setUpGUI() {
		jf=new JFrame();
		jf.setSize(width, height);
		jf.setTitle("Calculator");
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
		panelBottom.setBounds(0,75,400,325);
		
		panelBottom.setBackground(Color.DARK_GRAY);
		jf.add(panelBottom);
	 calcDisplay=new JTextField(35);
		

		calcDisplay.setEditable(false);
		panelTop.add(calcDisplay);
		//b0 = new JButton("0");
		
        b1 = new JButton("1");
       
        b2 = new JButton("2");
        
        b3 = new JButton("3");
        b4 = new JButton("+");
        b5 = new JButton("<<");
        b6 = new JButton("4");
         
        b7 = new JButton("5");
        
        b8 = new JButton("6");
        b9 = new JButton("-");
        b10 = new JButton("C");
        b11 = new JButton("7");
        b12 = new JButton("8");
        b13 = new JButton("9");
        b14= new JButton("*");
        b15= new JButton("(");
        b16 = new JButton("+/-");
        b17= new JButton("0");
        b18= new JButton(".");
        b19= new JButton(")");
        b20= new JButton("/");
        b21= new JButton("=");
        b21.setBounds(0,350, 400,325);
        b22= new JButton("!");
        b23= new JButton("OFF");

        
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

        panelBottom.add(b14);
        panelBottom.add(b15);
        panelBottom.add(b16);
        panelBottom.add(b17);
        panelBottom.add(b18);
        panelBottom.add(b20);
        panelBottom.add(b19);
        panelBottom.add(b21);
        panelBottom.add(b22);
        panelBottom.add(b23);

        panelBottom.setLayout(new GridLayout(5,5,5,5));
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);


		
		//tf.setBounds(50,100, 200,30);
		//tf.setFont(tf.getFont().deriveFont(50f));
		
		
		jf.setVisible(true);
	
		
	}
	// Main method will initiate the calcultor window with size of the frame
	public static void main(String[] args) {
		CalcGUI c= new CalcGUI(400, 450);
		c.setUpGUI();
	}
//This method will perofrm the actions whenever any button is clicked in the Calculator window
public void actionPerformed(ActionEvent e) {		

			if(e.getSource() == b1) {

				calcDisplay.setText(calcDisplay.getText().concat("1"));

			}
			if(e.getSource() == b2) {

				calcDisplay.setText(calcDisplay.getText().concat("2"));

			}
			if(e.getSource() == b3) {

				calcDisplay.setText(calcDisplay.getText().concat("3"));

			}
			if(e.getSource() == b6) {

				calcDisplay.setText(calcDisplay.getText().concat("4"));

			}
			if(e.getSource() == b7) {

				calcDisplay.setText(calcDisplay.getText().concat("5"));

			}
			if(e.getSource() == b8) {

				calcDisplay.setText(calcDisplay.getText().concat("6"));

			}
			
			if(e.getSource() == b11) {

				calcDisplay.setText(calcDisplay.getText().concat("7"));

			}
			if(e.getSource() == b12) {

				calcDisplay.setText(calcDisplay.getText().concat("8"));

			}
			if(e.getSource() == b13) {

				calcDisplay.setText(calcDisplay.getText().concat("9"));

			}
			if(e.getSource() == b17) {

				calcDisplay.setText(calcDisplay.getText().concat("0"));

			}
			
			if(e.getSource()==b5) {
				
				String ch=calcDisplay.getText();
				String sh1=ch.substring(0,ch.length() - 1);
				calcDisplay.setText(sh1);

			}
			
			if(e.getSource()==b4) {

				num1 = Double.parseDouble(calcDisplay.getText());

				operator ='+';

				calcDisplay.setText("");

			}

			if(e.getSource()==b9) {

				num1 = Double.parseDouble(calcDisplay.getText());

				operator ='-';

				calcDisplay.setText("");

			}

			if(e.getSource()==b14) {

				num1 = Double.parseDouble(calcDisplay.getText());

				operator ='*';

				calcDisplay.setText("");

			}

			if(e.getSource()==b20) {

				num1 = Double.parseDouble(calcDisplay.getText());

				operator ='/';

				calcDisplay.setText("");

			}

			if(e.getSource()==b21) {

				num2=Double.parseDouble(calcDisplay.getText());

				

				switch(operator) {

				case'+':

					result=num1+num2;

					break;

				case'-':

					result=num1-num2;

					break;

				case'*':

					result=num1*num2;

					break;

				case'/':

					result=num1/num2;

					break;

				}

				calcDisplay.setText(String.valueOf(result));

				num1=result;

			}

			if(e.getSource()==b10) {

				calcDisplay.setText("");

			}
			if(e.getSource()==b23) {

				jf.dispose();
			}
			if(e.getSource()==b23) {
				int i, fact=1;
				num1 = Double.parseDouble(calcDisplay.getText());
				for(i=1;i<=num1;i++){    
				      fact=fact*i;    
				  }
				calcDisplay.setText(String.valueOf(fact));
			}

			

			

		}

	}


