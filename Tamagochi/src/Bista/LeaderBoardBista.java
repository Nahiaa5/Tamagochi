package Bista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class LeaderBoardBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JPanel panel_4;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl21;
	private JLabel lbl22;
	private JLabel lbl31;
	private JLabel lbl32;
	private JLabel lbl41;
	private JLabel lbl42;
	private JLabel lbl51;
	private JLabel lbl61;
	private JLabel lbl52;
	private JLabel lbl62;
	private JLabel lbl13;
	private JLabel lbl23;
	private JLabel lbl33;
	private JLabel lbl43;
	private JLabel lbl53;
	private JLabel lbl63;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaderBoardBista frame = new LeaderBoardBista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LeaderBoardBista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 404);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getLblNewLabel(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.CENTER);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon(LeaderBoardBista.class.getResource("/Bista/MainTitle.png")));
		}
		return lblNewLabel;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setPreferredSize(new Dimension(5, 5));
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel.add(getLblNewLabel_1());
			panel.add(getTextField());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(0, 0, 0));
			panel_1.setPreferredSize(new Dimension(20, 230));
			panel_1.setLayout(new GridLayout(0, 2, 0, 0));
			panel_1.add(getPanel_2());
			panel_1.add(getPanel_3());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Your Name:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setForeground(new Color(255, 0, 0));
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Play");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton.setBackground(new Color(255, 0, 0));
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setPreferredSize(new Dimension(60, 25));
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Exit");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_1.setPreferredSize(new Dimension(60, 25));
			btnNewButton_1.setBackground(new Color(255, 0, 0));
		}
		return btnNewButton_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(new Color(0, 0, 0));
			panel_2.setLayout(new BorderLayout(0, 0));
			panel_2.add(getLblNewLabel_4(), BorderLayout.NORTH);
			panel_2.add(getPanel_4(), BorderLayout.SOUTH);
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBackground(new Color(0, 0, 0));
			FlowLayout fl_panel_3 = new FlowLayout(FlowLayout.CENTER, 5, 5);
			panel_3.setLayout(fl_panel_3);
			panel_3.add(getLblNewLabel_2());
			panel_3.add(getLblNewLabel_3());
		}
		return panel_3;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNewLabel_2.setPreferredSize(new Dimension(60, 200));
			lblNewLabel_2.setIcon(new ImageIcon(LeaderBoardBista.class.getResource("/Bista/gudetama1.gif")));
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNewLabel_3.setPreferredSize(new Dimension(100, 200));
			lblNewLabel_3.setIcon(new ImageIcon(LeaderBoardBista.class.getResource("/Bista/Marutchi4.png")));
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("LeaderBoard");
			lblNewLabel_4.setPreferredSize(new Dimension(57, 30));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
		}
		return lblNewLabel_4;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setBackground(new Color(0, 0, 0));
			panel_4.setPreferredSize(new Dimension(10, 200));
			panel_4.setLayout(new GridLayout(6, 3, 0, 0));
			panel_4.add(getLbl11());
			panel_4.add(getLbl12());
			panel_4.add(getLbl13());
			panel_4.add(getLbl21());
			panel_4.add(getLbl22());
			panel_4.add(getLbl23());
			panel_4.add(getLbl31());
			panel_4.add(getLbl32());
			panel_4.add(getLbl33());
			panel_4.add(getLbl41());
			panel_4.add(getLbl42());
			panel_4.add(getLbl43());
			panel_4.add(getLbl51());
			panel_4.add(getLbl52());
			panel_4.add(getLbl53());
			panel_4.add(getLbl61());
			panel_4.add(getLbl62());
			panel_4.add(getLbl63());
		}
		return panel_4;
	}
	private JLabel getLbl11() {
		if (lbl11 == null) {
			lbl11 = new JLabel("Rank");
			lbl11.setHorizontalAlignment(SwingConstants.CENTER);
			lbl11.setForeground(new Color(255, 0, 0));
			lbl11.setFont(new Font("Tahoma", Font.BOLD, 15));
		}
		return lbl11;
	}
	private JLabel getLbl12() {
		if (lbl12 == null) {
			lbl12 = new JLabel("Name");
			lbl12.setHorizontalAlignment(SwingConstants.CENTER);
			lbl12.setForeground(new Color(255, 0, 0));
			lbl12.setFont(new Font("Tahoma", Font.BOLD, 15));
		}
		return lbl12;
	}
	private JLabel getLbl21() {
		if (lbl21 == null) {
			lbl21 = new JLabel("");
		}
		return lbl21;
	}
	private JLabel getLbl22() {
		if (lbl22 == null) {
			lbl22 = new JLabel("");
		}
		return lbl22;
	}
	private JLabel getLbl31() {
		if (lbl31 == null) {
			lbl31 = new JLabel("");
		}
		return lbl31;
	}
	private JLabel getLbl32() {
		if (lbl32 == null) {
			lbl32 = new JLabel("");
		}
		return lbl32;
	}
	private JLabel getLbl41() {
		if (lbl41 == null) {
			lbl41 = new JLabel("");
		}
		return lbl41;
	}
	private JLabel getLbl42() {
		if (lbl42 == null) {
			lbl42 = new JLabel("");
		}
		return lbl42;
	}
	private JLabel getLbl51() {
		if (lbl51 == null) {
			lbl51 = new JLabel("");
		}
		return lbl51;
	}
	private JLabel getLbl61() {
		if (lbl61 == null) {
			lbl61 = new JLabel("");
		}
		return lbl61;
	}
	private JLabel getLbl52() {
		if (lbl52 == null) {
			lbl52 = new JLabel("");
		}
		return lbl52;
	}
	private JLabel getLbl62() {
		if (lbl62 == null) {
			lbl62 = new JLabel("");
		}
		return lbl62;
	}
	private JLabel getLbl13() {
		if (lbl13 == null) {
			lbl13 = new JLabel("Score");
			lbl13.setForeground(new Color(255, 0, 0));
			lbl13.setFont(new Font("Tahoma", Font.BOLD, 15));
			lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lbl13;
	}
	private JLabel getLbl23() {
		if (lbl23 == null) {
			lbl23 = new JLabel("");
		}
		return lbl23;
	}
	private JLabel getLbl33() {
		if (lbl33 == null) {
			lbl33 = new JLabel("");
		}
		return lbl33;
	}
	private JLabel getLbl43() {
		if (lbl43 == null) {
			lbl43 = new JLabel("");
		}
		return lbl43;
	}
	private JLabel getLbl53() {
		if (lbl53 == null) {
			lbl53 = new JLabel("");
		}
		return lbl53;
	}
	private JLabel getLbl63() {
		if (lbl63 == null) {
			lbl63 = new JLabel("");
		}
		return lbl63;
	}
}
