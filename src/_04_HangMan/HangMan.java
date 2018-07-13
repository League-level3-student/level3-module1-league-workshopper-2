package _04_HangMan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

import javax.swing.JOptionPane;

public class HangMan{
	static String filename="src/_04_HangMan/dictionary.txt";
	public static void main(String[] args) {
	HangMan hang = new HangMan();
	Utilities u = new Utilities();
	String Num = JOptionPane.showInputDialog("Choose A Number From 1 To 266");
	int num = Integer.parseInt(Num);
	Stack<String> string = new Stack<String>();
	for (int i = 0; i < num; i++) {
		string.push(u.readRandomLineFromFile(filename));
	}
	
	}
	
	
}
