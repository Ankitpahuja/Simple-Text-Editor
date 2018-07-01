/**
 * @name        Java NotePad
 * @package     notepad
 * main @file        UI.java
 */

package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "........................";
    public final static String NAME = "html_PAD";
        public final static String EDITOR_EMAIL = "..................";
    public final static double VERSION = 3.0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}
