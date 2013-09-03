package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

import java.awt.BorderLayout;

import javax.swing.SpringLayout;
import javax.swing.JProgressBar;

public class MediaPlayer {

	private JFrame frame;
	private SwingWorker<Object,Object> musicPlayer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		System.out.println("starting music player worker thread");
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MediaPlayer window = new MediaPlayer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MediaPlayer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JProgressBar progressBar = new JProgressBar();
		
		sl_panel.putConstraint(SpringLayout.NORTH, progressBar, 69, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, progressBar, 71, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, progressBar, 353, SpringLayout.WEST, panel);
		panel.add(progressBar);
	}
}
