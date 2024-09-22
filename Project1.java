package FirstProject;
import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;

//set window parameters at 1200 * 800

import java.awt.event.*;
import java.util.Random;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Project1 extends Applet implements ActionListener{
	Button shape,scrollbar,windmill,tictac,calc,ball;
	Frame f1,f2,f3,f4,f5,f6;
	
	
	
	public void init()
	{
		setLayout(null);
		
		shape =new Button("Shapes");
		scrollbar=new Button("ScrollBar");
		windmill=new Button("Windmill");
		tictac=new Button("Tic-Tac-Toe");
		calc=new Button("Calculator");
		ball=new Button("Ball");
		
		shape.setBounds(700,50,70,40);
		scrollbar.setBounds(800,50,70,40);
		windmill.setBounds(900,50,70,40);
		tictac.setBounds(1000,50,70,40);
		calc.setBounds(1100,50,70,40);
		ball.setBounds(1200,50,70,40);
		
		shape.setBackground(Color.GRAY);
		scrollbar.setBackground(Color.GRAY);
		windmill.setBackground(Color.GRAY);
		tictac.setBackground(Color.GRAY);
		calc.setBackground(Color.GRAY);
		ball.setBackground(Color.GRAY);
		
		add(shape);
		add(scrollbar);
		add(windmill);
		add(tictac);
		add(calc);
		add(ball);
		
		setBackground(Color.BLACK);
		shape.addActionListener(this);
		scrollbar.addActionListener(this);
		windmill.addActionListener(this);
		tictac.addActionListener(this);
		calc.addActionListener(this);
		ball.addActionListener(this);
	}
	
	public void start()
	{
	repaint();	
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Shapes"))
		{
			f1=new Sha("SHAPE");
			f1.setSize(900,500);
			f1.setLocation(200,200);
			f1.setVisible(true);
		}
		 if(ae.getActionCommand().equals("ScrollBar"))
		{
			f2=new Scro("SCROLLBAR");
			f2.setSize(1000,800);
			f2.setLocation(200,200);
			f2.setVisible(true);
		}
		if(ae.getActionCommand().equals("Windmill"))
		{
			f3=new Wind("WINDMILL");
			f3.setSize(1000,800);
			f3.setLocation(200,200);
			f3.setVisible(true);
		}
		 if(ae.getActionCommand().equals("Tic-Tac-Toe"))
		{
			f4=new TicTac("TICTAC");
			f4.setSize(400,400);
			f4.setLocation(600,400);
			f4.setVisible(true);
		}
		if(ae.getActionCommand().equals("Calculator"))
		{
			f5=new Calc("CALCULATOR");
			f5.setSize(470,600);
			f5.setLocation(700,300);
			f5.setVisible(true);
		}
		 if(ae.getActionCommand().equals("Ball"))
		{
			f6=new Ball("BALL");
			f6.setSize(800,400);
			f6.setLocation(700,300);
			f6.setVisible(true);
		}
		
		
	}
	

	public void paint(Graphics g)
	{
		Font f=new Font("Courier",Font.ITALIC,50);
		Font f1=new Font("Arial",Font.PLAIN,30);
		Font f2=new Font("Arial",Font.PLAIN,20);
		g.setFont(f);
		g.setColor(Color.RED);
		g.drawString("AWT-GUI",100,100);
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("Information About The Project : ",100,300);
		g.drawLine(100,310,500,310);
		
		Label l1=new Label(" Shapes Button    : It's having the different types of shapes and also you can select different colors. ");	
		Label l2=new Label(" ScrollBar Button  : It's having 3- Scrollbars of RGB Colors and also you can select different colors. ");	
		Label l3=new Label(" Windmill Button   : It's having the Start and Stop Button to Rotate the windmill by pressing button.");	
		Label l4=new Label(" Tic-Tac Button    : It's having the Tic-Tac-Toe Game.");	
		Label l5=new Label(" Calculator Button : It's having Calculator. ");	
		Label l6=new Label(" Ball Button          : It's like a Dinosore game.");	
		l1.setBackground(Color.yellow);
		l2.setBackground(Color.yellow);
		l3.setBackground(Color.yellow);
		l4.setBackground(Color.yellow);
		l5.setBackground(Color.yellow);
		l6.setBackground(Color.yellow);
		l1.setFont(f2);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		l6.setFont(f2);
		l1.setBounds(100,370,1000,30);
		l2.setBounds(100,420,1000,30);
		l3.setBounds(100,470,1000,30);
		l4.setBounds(100,520,1000,30);
		l5.setBounds(100,570,1000,30);
		l6.setBounds(100,620,1000,30);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
	}
	
	public void update(Graphics g)
	{
		paint(g);
	}
	public void stop()
	{
		if(f1!=null)f1.setVisible(false); // if i do not write this condition then when you minimized the applet window and reopened it then it becomes blank
		if(f2!=null)f2.setVisible(false);
		if(f3!=null)f3.setVisible(false);
		if(f4!=null)f4.setVisible(false);
		if(f5!=null)f5.setVisible(false);
		if(f6!=null)f6.setVisible(false);
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////


class Scro extends Frame implements AdjustmentListener
{
	Scrollbar h1,h2,h3;
	Color c;
	
	Scro(String title)
	{
		super(title);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
		});
		
		perform();
	}
	
	
	 void perform()
	{
		 
		h1=new Scrollbar(0,80,2,0,255);
		h2=new Scrollbar(0,0,2,0,255);
		h3=new Scrollbar(0,0,2,0,255);
		
		setLayout(null);
		h1.setBounds(100,100,700,50);
		h2.setBounds(100,200,700,50);
		h3.setBounds(100,300,700,50);
		add(h1);
		add(h2);
		add(h3);
		
		h1.addAdjustmentListener(this);
		h2.addAdjustmentListener(this);
		h3.addAdjustmentListener(this);
		
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		repaint();
	}
	
	public void paint(Graphics g)
	{
		c=new Color(h1.getValue(),h2.getValue(),h3.getValue());
		setBackground(c);
	}
}



///////////////////////////////////////////////////////////////////////////////////////////////////////


 class Sha extends Frame implements ItemListener
{
	Checkbox r,c,l;
	Choice color1,color2,color3;
	Sha(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
			public void windowDeiconified(WindowEvent we)
			{
				setVisible(true);
				repaint();
			}
		});
		init();
	}
	
	public void init()
	{
		setLayout(null);
		
		color1 =new Choice();		
		color1.add("RED");
		color1.add("GREEN");
		color1.add("BLUE");
		
		color2 =new Choice();		
		color2.add("RED");
		color2.add("GREEN");
		color2.add("BLUE");
		
		color3 =new Choice();
		color3.add("RED");
		color3.add("GREEN");
		color3.add("BLUE");
		
		r=new Checkbox("Rectangle",null,false);
		c=new Checkbox("Circle",null,false);
		l=new Checkbox("Line",null,false);
		
		r.setBounds(70,50,70,30);
		c.setBounds(70,200,70,30);
		l.setBounds(70,350,70,30);
		color1.setBounds(70,100,70,30);
		color2.setBounds(70,250,70,30);
		color3.setBounds(70,390,70,30);
		
		add(r);
		add(color1);
		add(c);
		add(color2);
		add(l);
		add(color3);
		
		r.addItemListener(this);
		c.addItemListener(this);
		l.addItemListener(this);
		color1.addItemListener(this);
		color2.addItemListener(this);
		color3.addItemListener(this);
		
	}

	public void itemStateChanged(ItemEvent e) {
		repaint();
		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2=(Graphics2D) g;//cast graphics to 2d
		Font f=new Font("Arial",Font.BOLD,20);
			g2.setStroke(new BasicStroke(5));
			g2.setFont(f);
	        g.drawString("Rectangle", 500, 100);
	        g.drawString("Circle", 500, 270);
	        g.drawString("Line", 500, 400);

	        g.fillRect(300, 50, 100, 70);
	        g.fillOval(300, 200, 100, 100);
	        g.drawLine(300, 400, 400, 400);
	        Color co1=new Color(0,0,0);;
	        Color co2=new Color(0,0,0);;
	        Color co3=new Color(0,0,0);;
	        if((color1.getSelectedItem()).equals("RED"))
	        	co1=new Color(255,0,0);
	        if((color1.getSelectedItem()).equals("GREEN"))
	        	co1=new Color(0,255,0);
	        if((color1.getSelectedItem()).equals("BLUE"))
	        	co1=new Color(0,0,255);
	        if((color2.getSelectedItem()).equals("RED"))
	        	co2=new Color(255,0,0);
	        if((color2.getSelectedItem()).equals("GREEN"))
	        	co2=new Color(0,255,0);
	        if((color2.getSelectedItem()).equals("BLUE"))
	        	co2=new Color(0,0,255);
	        if((color3.getSelectedItem()).equals("RED"))
	        	co3=new Color(255,0,0);
	        if((color3.getSelectedItem()).equals("GREEN"))
	        	co3=new Color(0,255,0);
	        if((color3.getSelectedItem()).equals("BLUE"))
	        	co3=new Color(0,0,255);
	        
	        if(r.getState())
	        {
	        	g2.setColor(co1);
	        	 g2.fillRect(700, 50, 100, 70);	 
	        }
	        if(c.getState())
	        {
	        	g2.setColor(co2);
	        	  g2.fillOval(700, 200, 100, 100);
	        }
	        if(l.getState())
	        {
	        	g2.setColor(co3);
	        	 g2.drawLine(700, 400, 800, 400);
	        }
	}

}

 
 
 ////////////////////////////////////////////////////////////////////////////////////////////////////
 

 class Wind extends Frame implements Runnable , ActionListener
{
	Thread th;
	int a;
	Button bs;
	String s="Start";
	boolean b=false;
	Checkbox cbs,cbm,cbf;
	CheckboxGroup cbg;
	Wind(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
			public void windowDeiconified(WindowEvent we)
			{
				setVisible(true);
				repaint();
			}
		});
		
		init();
	}
	public void init()
	{
		setLayout(null);
		th = new Thread(this);
		a=120;
		setBackground(Color.LIGHT_GRAY);
		th.start();
		
		bs=new Button("Start");
		bs.setBounds(200,200,150,50);
	
		bs.addActionListener(this);
		add(bs);
	}
	public void actionPerformed(ActionEvent ae)
	 {
		 s = ae.getActionCommand();  
		 if(s.equals("Start"))
		 {
			 b=true;
			 bs.setLabel("Stop");
		 }
		 else
		 {
			 b=false;
			 bs.setLabel("Start");
		 }
		 

			repaint();
	 }
	public void run()
	{
		while(true)
		{
			if(b)
			{
			a++;
			repaint();
			try { Thread.sleep(5); }
			catch(Exception e)
			{ }
			}	
			
		}
	}
	
	public void paint(Graphics g)
	{
		
		g.setColor(Color.gray);
		g.fillRect(500,500, 200, 20);
		g.setColor(Color.white);
		g.fillRect(590,250,20,250);
		
		g.setColor(Color.red);
		g.fillArc(475, 125, 250, 250, a, 30);
		g.setColor(Color.green);
		g.fillArc(475, 125, 250, 250, a+120,30);
		g.setColor(Color.blue);
		g.fillArc(475, 125, 250, 250, a+240,30);
		
	}
	
}
 
 
//////////////////////////////////////////////////////////////////////////////////////////
 
 
class TicTac extends Frame implements ActionListener
{
    Button[] buttons = new Button[9];
    boolean playerX = true;
    Label messageLabel = new Label("Player X's turn");

	TicTac(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
				resetGame();
			}
			public void windowDeiconified(WindowEvent we)
			{
				setVisible(true);
			}
		});
		
        init();
    }
		
			public void init()
			{
				        setLayout(new BorderLayout());
				        messageLabel.setAlignment(Label.CENTER);
				        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
				        add(messageLabel, BorderLayout.NORTH);
		
				        // Panel for the Tic-Tac-Toe grid
				        Panel gridPanel = new Panel();
				        gridPanel.setLayout(new GridLayout(3, 3));
				        for (int i = 0; i < 9; i++) {
				            buttons[i] = new Button("");
				            buttons[i].setFont(new Font("Arial", Font.BOLD, 60));
				            buttons[i].addActionListener(this);
				            gridPanel.add(buttons[i]);
				        }
		
				        // Add the grid panel to the center of the frame
				        add(gridPanel, BorderLayout.CENTER);
		
			}

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Handle button clicks
		        Button clickedButton = (Button) e.getSource();
		        if (clickedButton.getLabel().equals("")) {
		            if (playerX) {
		                clickedButton.setLabel("X");
		                messageLabel.setText("Player O's turn");
		            } else {
		                clickedButton.setLabel("O");
		                messageLabel.setText("Player X's turn");
		            }
		            playerX = !playerX;
		            checkWinner();
		        }
		    }

		    public void checkWinner() {
		        // Winning conditions (rows, columns, diagonals)
		        int[][] winConditions = {
		            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // rows
		            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // columns
		            {0, 4, 8}, {2, 4, 6} // diagonals
		        };

		        for (int[] condition : winConditions) {
		            String b1 = buttons[condition[0]].getLabel();
		            String b2 = buttons[condition[1]].getLabel();
		            String b3 = buttons[condition[2]].getLabel();

		            if (!b1.equals("") && b1.equals(b2) && b2.equals(b3)) {
		                announceWinner(b1);
		                resetGame();
		                return;
		            }
		        }

		        // Check for a draw
		        boolean draw = true;
		        for (Button button : buttons) {
		            if (button.getLabel().equals("")) {
		                draw = false;
		                break;
		            }
		        }
		        if (draw) {
		            announceDraw();
		            resetGame();
		        }
		    }

		    public void announceWinner(String winner) {
		        // Announce the winner in the frame
		        messageLabel.setText("Player " + winner + " wins!");
		    }

		    public void announceDraw() {
		        // Announce a draw in the frame
		        messageLabel.setText("It's a draw!");
		    }

		    public void resetGame() {
		        // Reset the buttons for a new game
		        for (Button button : buttons) {
		            button.setLabel("");
		        }
		        playerX = true;
		    }

	}

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Calc extends Frame implements ActionListener
{
	
	Label display=new Label("");
	Button b[]=new Button[20];
	double ans;
	
	Calc(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
				reset();
			}
			public void windowDeiconified(WindowEvent we)
			{
				setVisible(false);
			}
		});
		init();
	}
	
	void init()
	{
		setLayout(new BorderLayout());
		display.setAlignment(Label.RIGHT);
		display.setFont(new Font("Arial",Font.BOLD,50));
		display.setPreferredSize(new Dimension(400,100));
		Panel p1=new Panel();
		p1.add(display);
		p1.setPreferredSize(new Dimension(400,100));
		add(p1,BorderLayout.NORTH);
		
		Panel p=new Panel();
		p.setLayout(new GridLayout(5,4));
		
		b[0]=new Button("C");
		b[1]=new Button("CE");
		b[2]=new Button("Del");
		b[3]=new Button("+");
		b[4]=new Button("7");
		b[5]=new Button("8");
		b[6]=new Button("9");
		b[7]=new Button("-");
		b[8]=new Button("4");
		b[9]=new Button("5");
		b[10]=new Button("6");
		b[11]=new Button("*");
		b[12]=new Button("1");
		b[13]=new Button("2");
		b[14]=new Button("3");
		b[15]=new Button("/");
		b[16]=new Button("0");
		b[17]=new Button("pi");
		b[18]=new Button("%");
		b[19]=new Button("=");
		
		for(int i=0;i<20;i++)
		{
			b[i].setFont(new Font("Arial",Font.BOLD,30));
			p.add(b[i]);
			b[i].addActionListener(this);
		}
		
		add(p,BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Button c= (Button)e.getSource();
		if((c.getLabel()).equals("0")) display.setText(display.getText()+"0");
		if((c.getLabel()).equals("1")) display.setText(display.getText()+"1");
		if((c.getLabel()).equals("2")) display.setText(display.getText()+"2");
		if((c.getLabel()).equals("3")) display.setText(display.getText()+"3");
		if((c.getLabel()).equals("4")) display.setText(display.getText()+"4");
		if((c.getLabel()).equals("5")) display.setText(display.getText()+"5");
		if((c.getLabel()).equals("6")) display.setText(display.getText()+"6");
		if((c.getLabel()).equals("7")) display.setText(display.getText()+"7");
		if((c.getLabel()).equals("8")) display.setText(display.getText()+"8");
		if((c.getLabel()).equals("9")) display.setText(display.getText()+"9");
		
		
		if((c.getLabel()).equals("+")) display.setText(display.getText()+"+");
		if((c.getLabel()).equals("-")) display.setText(display.getText()+"-");
		if((c.getLabel()).equals("*")) display.setText(display.getText()+"*");
		if((c.getLabel()).equals("/")) display.setText(display.getText()+"/");
		if((c.getLabel()).equals("%")) display.setText(display.getText()+"%");
		if((c.getLabel()).equals("pi")) display.setText(display.getText()+"3.14");
		if((c.getLabel()).equals("C")) reset();
		if((c.getLabel()).equals("CE")) reset();
		if((c.getLabel()).equals("Del")) display.setText((display.getText().substring(0,(display.getText()).length()-1)));
		if((c.getLabel()).equals("%")) display.setText(display.getText()+"%");
		if((c.getLabel()).equals("=")) 
			{
				ans=calculate(display.getText());
				display.setText(Double.toString(ans));
			}
		
		
	}
	
	

	    public static double calculate(String input) {
	        // Remove spaces from the input
	        input = input.replaceAll("\\s", "");

	        // Handle square root operation
	        if (input.contains("root")) {
	            return handleRoot(input);
	        }

	        // Create a stack to store numbers and operators
	        Stack<Double> numbers = new Stack<>();
	        Stack<Character> operators = new Stack<>();

	        // Pattern to match numbers (including decimals) and operators
	        Pattern pattern = Pattern.compile("([0-9]*\\.?[0-9]+|[+\\-*/%])");
	        Matcher matcher = pattern.matcher(input);

	        while (matcher.find()) {
	            String token = matcher.group();

	            if (isNumber(token)) {
	                numbers.push(Double.parseDouble(token));
	            } else if (isOperator(token.charAt(0))) {
	                while (!operators.isEmpty() && hasPrecedence(token.charAt(0), operators.peek())) {
	                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
	                }
	                operators.push(token.charAt(0));
	            }
	        }

	        // Apply remaining operations
	        while (!operators.isEmpty()) {
	            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
	        }

	        return numbers.pop();
	    }

	    private static boolean isNumber(String token) {
	        try {
	            Double.parseDouble(token);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	    private static boolean isOperator(char ch) {
	        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
	    }

	    private static boolean hasPrecedence(char op1, char op2) {
	        if ((op1 == '*' || op1 == '/' || op1 == '%') && (op2 == '+' || op2 == '-')) {
	            return false;
	        }
	        return true;
	    }

	    private static double applyOperation(char op, double b, double a) {
	        switch (op) {
	            case '+':
	                return a + b;
	            case '-':
	                return a - b;
	            case '*':
	                return a * b;
	            case '/':
	                if (b == 0) {
	                    throw new ArithmeticException("Cannot divide by zero");
	                }
	                return a / b;
	            case '%':
	                return a % b;
	            default:
	                return 0;
	        }
	    }

	    private static double handleRoot(String input) {
	        input = input.replace("root", "");
	        double number = Double.parseDouble(input);
	        if (number < 0) {
	            throw new ArithmeticException("Cannot compute square root of a negative number");
	        }
	        return Math.sqrt(number);
	    }

	
	    void reset()
	    {
	    	display.setText("");
	    }

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Ball extends Frame implements KeyListener ,Runnable,ActionListener,MouseListener
{
	int flag=0,loc,hei=200,score=0;
	Button reset;
	String ans="";
	Random r=new Random();
	Thread th;

	Ball(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
				reset();
			}
			public void windowDeiconified(WindowEvent we)
			{
				setVisible(false);
			}
		});
		init();
	}
	void init()
	{
		setLayout(null);
		reset=new Button("RESET");
		
		reset.setBounds(50,50,70,40);
		add(reset);
		reset.addActionListener(this);
		th=new Thread(this);	
		
		addKeyListener(this);	
		addMouseListener(this);
		
		th.start();
	}
	
	
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		if(flag==0)
			g.fillOval(50,hei,70,70);
		else 
			g.fillOval(50,hei,70,70);
			
		g.drawString("score  :  "+score,600,100);
		g.setColor(Color.red);
		g.fillRect(loc,230,20,40);
		g.drawLine(50,270,800,270);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP || e.getKeyCode()==32) {flag=1;repaint();hei=150;}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		flag=0;
		hei=200;
		repaint();
	}
	
	@Override 
	public void run() {
		
		ans="";
		xyz:while(true)
		{
			loc=r.nextInt(590)+190;
			while(loc>=50)
			{
				repaint();  
				try {
					Thread.sleep(5);
				}catch(Exception e) {}
				if(loc==120 && hei==200) break xyz;
				loc--;
				score++;
			}
		}
		ans="EXITED";
		System.out.println("EXITED");
	}
	
	void reset()
	{
		flag=0;hei=200;score=0;
		ans="";
		init();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("RESET") && ans.equals("EXITED"))
		reset();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.setFocusable(true);
        this.requestFocus();
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}




