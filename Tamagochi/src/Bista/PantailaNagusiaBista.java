package Bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PantailaNagusiaBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JPanel panel_2;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JPanel panel_3;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JPanel panel_6;
	private JLabel lblNewLabel_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantailaNagusiaBista frame = new PantailaNagusiaBista();
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
	public PantailaNagusiaBista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(), BorderLayout.NORTH);
		contentPane.add(getPanel_2(), BorderLayout.WEST);
		contentPane.add(getPanel_3(), BorderLayout.SOUTH);
		contentPane.add(getPanel_6(), BorderLayout.CENTER);
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setLayout(new GridLayout(4, 1, 0, 0));
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_3());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/hungry.png")));
		}
		return lblNewLabel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(0, 0, 0));
			panel_1.setLayout(new GridLayout(0, 4, 0, 0));
			panel_1.add(getLblNewLabel_4());
			panel_1.add(getLblNewLabel_5());
			panel_1.add(getLblNewLabel_6());
			panel_1.add(getLblNewLabel_7());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/hungry.png")));
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/hungry.png")));
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/hungry.png")));
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Egg");
			lblNewLabel_4.setBackground(new Color(0, 0, 0));
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Score:");
			lblNewLabel_5.setForeground(new Color(255, 255, 255));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel(" 0");
			lblNewLabel_6.setForeground(new Color(255, 255, 255));
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("exit");
			lblNewLabel_7.setForeground(new Color(255, 255, 255));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_7;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(new Color(0, 0, 0));
			panel_2.setLayout(new GridLayout(4, 1, 0, 0));
			panel_2.add(getLblNewLabel_8());
			panel_2.add(getLblNewLabel_9());
			panel_2.add(getLblNewLabel_10());
			panel_2.add(getLblNewLabel_11());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setBackground(new Color(0, 0, 0));
			lblNewLabel_8.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/heart.png")));
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("");
			lblNewLabel_9.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/heart.png")));
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("");
			lblNewLabel_10.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/heart.png")));
		}
		return lblNewLabel_10;
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("");
			lblNewLabel_11.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/heart.png")));
		}
		return lblNewLabel_11;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBackground(new Color(0, 0, 0));
			panel_3.setLayout(new GridLayout(0, 2, 0, 0));
			panel_3.add(getLblNewLabel_12());
			panel_3.add(getLblNewLabel_13());
			panel_3.add(getPanel_4_1());
			panel_3.add(getPanel_5());
		}
		return panel_3;
	}
	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("Candy");
			lblNewLabel_12.setForeground(new Color(255, 255, 255));
			lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_12;
	}
	private JLabel getLblNewLabel_13() {
		if (lblNewLabel_13 == null) {
			lblNewLabel_13 = new JLabel("Soup");
			lblNewLabel_13.setForeground(new Color(255, 255, 255));
			lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_13;
	}
	private JPanel getPanel_4_1() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setBorder(new LineBorder(new Color(255, 255, 255)));
			panel_4.setForeground(new Color(255, 255, 255));
			panel_4.setBackground(new Color(0, 0, 0));
			panel_4.setLayout(new GridLayout(0, 3, 0, 0));
			panel_4.add(getLblNewLabel_14());
			panel_4.add(getLblNewLabel_15());
			panel_4.add(getLblNewLabel_16());
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setBorder(new LineBorder(new Color(255, 255, 255)));
			panel_5.setBackground(new Color(0, 0, 0));
			panel_5.setLayout(new GridLayout(0, 3, 0, 0));
			panel_5.add(getLblNewLabel_17());
			panel_5.add(getLblNewLabel_18());
			panel_5.add(getLblNewLabel_19());
		}
		return panel_5;
	}
	private JLabel getLblNewLabel_14() {
		if (lblNewLabel_14 == null) {
			lblNewLabel_14 = new JLabel("");
			lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_14.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/candy.png")));
		}
		return lblNewLabel_14;
	}
	private JLabel getLblNewLabel_15() {
		if (lblNewLabel_15 == null) {
			lblNewLabel_15 = new JLabel("");
			lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_15.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/candy.png")));
		}
		return lblNewLabel_15;
	}
	private JLabel getLblNewLabel_16() {
		if (lblNewLabel_16 == null) {
			lblNewLabel_16 = new JLabel("");
			lblNewLabel_16.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/candy.png")));
		}
		return lblNewLabel_16;
	}
	private JLabel getLblNewLabel_17() {
		if (lblNewLabel_17 == null) {
			lblNewLabel_17 = new JLabel("");
			lblNewLabel_17.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_17.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/spoon.png")));
		}
		return lblNewLabel_17;
	}
	private JLabel getLblNewLabel_18() {
		if (lblNewLabel_18 == null) {
			lblNewLabel_18 = new JLabel("");
			lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_18.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/spoon.png")));
		}
		return lblNewLabel_18;
	}
	private JLabel getLblNewLabel_19() {
		if (lblNewLabel_19 == null) {
			lblNewLabel_19 = new JLabel("");
			lblNewLabel_19.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/spoon.png")));
		}
		return lblNewLabel_19;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setBackground(new Color(0, 0, 0));
			panel_6.setLayout(null);
			panel_6.add(getLblNewLabel_20());
		}
		return panel_6;
	}
	private JLabel getLblNewLabel_20() {
		if (lblNewLabel_20 == null) {
			lblNewLabel_20 = new JLabel("");
			lblNewLabel_20.setIcon(new ImageIcon(PantailaNagusiaBista.class.getResource("/Bista/Gudetama1.png")));
			lblNewLabel_20.setBounds(126, 37, 144, 107);
		}
		return lblNewLabel_20;
	}
}
