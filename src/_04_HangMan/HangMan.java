package _04_HangMan;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangMan implements KeyListener {
	static String filename = "src/_04_HangMan/dictionary.txt";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel lives = new JLabel();
	static String last = "";
	static int cha;
	public static void main(String[] args) {
		HangMan hang = new HangMan();
		
		String Num = JOptionPane.showInputDialog("Choose A Number From 1 To 266");
		int num = Integer.parseInt(Num);
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < num; i++) {
			String words = Utilities.readRandomLineFromFile(filename);
			if (stack.contains(words)) {
				i--;
			} else {
				stack.push(words);
			}

		}
		System.out.println(stack);
		last = stack.pop();
		cha = last.length();
		System.out.println(last);
		System.out.println(cha);
		hang.stuff();
	
	}
	public void stuff() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		panel.add(label);
		panel.add(lives);
		label.setVisible(true);
		String blanks = "";
		for (int i = 0; i < cha; i++) {
			blanks += " __ ";
		}
		label.setFont(new Font("Serif", Font.PLAIN,20));
		label.setText(blanks);
		lives.setText("       You Have 10 Lives");
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cha; i++) {
			char c = last.charAt(i);
			if (e.getKeyChar()==c) {
				label.setText();
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
