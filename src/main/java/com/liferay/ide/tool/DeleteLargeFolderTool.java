package com.liferay.ide.tool;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeleteLargeFolderTool
{

    public static void main( String[] args )
    {
        JFrame frame = new JFrame( "Delete Large Folder" );
        frame.setSize( 800, 200 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        JPanel panel = new JPanel();
        frame.add( panel );
        placeComponents( panel );

        frame.setVisible( true );
    }

    private static void placeComponents( JPanel panel )
    {
        panel.setLayout( null );

        JLabel userLabel = new JLabel( "Path" );
        userLabel.setBounds( 10, 20, 50, 25 );
        panel.add( userLabel );

        JTextField userText = new JTextField( 20 );
        userText.setBounds( 100, 20, 500, 25 );
        panel.add( userText );

        JLabel resultLabel = new JLabel( "status: wait for executing" );
        resultLabel.setBounds( 300, 60, 400, 25 );
        panel.add( resultLabel );

        JButton loginButton = new JButton( "delete" );
        loginButton.setBounds( 200, 60, 80, 25 );
        panel.add( loginButton );

        loginButton.addActionListener( new ActionListener()
        {

            @Override
            public void actionPerformed( ActionEvent e )
            {
                String command = "cmd /c rmdir /s /q " + "\"" + userText.getText() + "\"";
                // System.out.println( command );

                Command.exeCmd( command );

                resultLabel.setText( "status: delete success: " + userText.getText() );
            }
        } );
    }

}
