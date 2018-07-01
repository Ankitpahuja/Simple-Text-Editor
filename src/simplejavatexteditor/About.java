

/*
This flie tells about the project
available in about section of the  JavaTextEditor
ABOUT.java file

Group Members
AYUSH DOSAJH
ANKIT PAHUJA
CHINMAYA KUMAR BANSAL

made by @CHINMAYA.
last updated
date@13/11/2017
time @5:50AM




*/
package simplejavatexteditor;

import javax.swing.*;
import java.awt.FlowLayout;

public class About  
{
    private final JFrame frame;
    private final JPanel panel;
    private String contentText;
    private final JLabel text;

    public About(UI ui) 
    {
        panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,300);
        frame.setLocationRelativeTo(ui);
        text = new JLabel();
    }

   
    public void software()
    {
        frame.setTitle("About Me - " + SimpleJavaTextEditor.NAME);
        contentText ="<html><body><p>" +"Name: " + SimpleJavaTextEditor.NAME + "<br />" +
        "Version: " + SimpleJavaTextEditor.VERSION +"</p></body></html>";

        text.setText(contentText);
        panel.add(text);
        frame.add(panel);
    }

}
