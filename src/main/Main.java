package main;

import java.io.*;
import lexer.*;
import parser.*;

public class Main {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("C:/Users/mahes/Documents/test.txt"));
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		parse.program();
		System.out.write('\n');
	}

}
