/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jflexdemo;

import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author comsci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new Lexer(new FileReader("input.txt")).yylex();
    }
}
