package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	double firstnum,secondnum,result;
	String operations,answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setForeground(Color.BLACK);
		frmCalculator.setBackground(Color.WHITE);
		frmCalculator.getContentPane().setBackground(Color.DARK_GRAY);
		frmCalculator.setFont(new Font("Baskerville Old Face", Font.BOLD, 12));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 320, 379);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 285, 39);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 126, 60, 47);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btnBs = new JButton("<-");
		btnBs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bs=null;
				if(textField.getText().length()>0){
					StringBuilder strb=new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length()-1);
					bs=strb.toString();
					textField.setText(bs);
				}
			}
		});
		btnBs.setForeground(Color.LIGHT_GRAY);
		btnBs.setBackground(Color.BLACK);
		btnBs.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBs.setBounds(160, 68, 60, 47);
		frmCalculator.getContentPane().add(btnBs);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				firstnum=0;
				operations="";
			}
		});
		btnClear.setForeground(Color.LIGHT_GRAY);
		btnClear.setBackground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(235, 68, 60, 47);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnMod = new JButton("x%y");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnMod.setForeground(Color.LIGHT_GRAY);
		btnMod.setBackground(Color.BLACK);
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMod.setBounds(10, 70, 60, 47);
		frmCalculator.getContentPane().add(btnMod);
		
		JButton btnPow = new JButton("x^y");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="^";
				
			}
		});
		btnPow.setForeground(Color.LIGHT_GRAY);
		btnPow.setBackground(Color.BLACK);
		btnPow.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPow.setBounds(85, 68, 60, 47);
		frmCalculator.getContentPane().add(btnPow);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer;
				secondnum=Double.parseDouble(textField.getText());
				if(operations=="+"){
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
				else if(operations=="-"){
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}else if(operations=="*"){
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}else if(operations=="/"){
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}else if(operations=="^"){
					result=Math.pow(firstnum, secondnum);
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}else if(operations=="%"){
					result=firstnum%secondnum;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
				}
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEq.setBounds(10, 283, 60, 47);
		frmCalculator.getContentPane().add(btnEq);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(85, 126, 60, 47);
		frmCalculator.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(160, 126, 60, 47);
		frmCalculator.getContentPane().add(btn9);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 231, 60, 47);
		frmCalculator.getContentPane().add(btn1);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(85, 283, 60, 47);
		frmCalculator.getContentPane().add(btn0);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(85, 231, 60, 47);
		frmCalculator.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(160, 231, 60, 47);
		frmCalculator.getContentPane().add(btn3);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(85, 179, 60, 47);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(Color.LIGHT_GRAY);
		btnDiv.setBackground(Color.BLACK);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv.setBounds(235, 283, 60, 47);
		frmCalculator.getContentPane().add(btnDiv);
		
		final JButton btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btnDec.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDec.setBounds(160, 283, 60, 47);
		frmCalculator.getContentPane().add(btnDec);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(160, 179, 60, 47);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btnMul = new JButton("x");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnMul.setForeground(Color.LIGHT_GRAY);
		btnMul.setBackground(Color.BLACK);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(235, 231, 60, 47);
		frmCalculator.getContentPane().add(btnMul);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnMin.setForeground(Color.LIGHT_GRAY);
		btnMin.setBackground(Color.BLACK);
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMin.setBounds(235, 179, 60, 47);
		frmCalculator.getContentPane().add(btnMin);
		
		
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnPlus.setForeground(Color.LIGHT_GRAY);
		btnPlus.setBackground(Color.BLACK);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(235, 126, 60, 47);
		frmCalculator.getContentPane().add(btnPlus);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 179, 60, 47);
		frmCalculator.getContentPane().add(btn4);
		
		
	}
}
