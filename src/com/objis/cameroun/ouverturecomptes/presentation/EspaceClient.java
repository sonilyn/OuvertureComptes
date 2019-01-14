package com.objis.cameroun.ouverturecomptes.presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class EspaceClient extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public EspaceClient() {
		setTitle("Espace Client");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMessage = new JLabel("Bienvenue dans votre Espace Personnel");
		lblMessage.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 18));
		lblMessage.setForeground(new Color(204, 0, 204));
		lblMessage.setBounds(46, 80, 342, 101);
		contentPane.add(lblMessage);
	}

}
