package Bista;

import java.awt.EventQueue;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class TamaDigOutBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel squaresPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TamaDigOutBista frame = new TamaDigOutBista();
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
	public TamaDigOutBista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 449);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Izena");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("ooh.. Still For Away!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(0, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(8, 12, 0, 0));

		Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                label.setOpaque(true);
            }
        }

        Color Argia = new Color(255, 0, 0);
        Color Erdia = new Color(120, 0, 0); 
        Color Iluna = new Color(64, 0, 0);
		
        JLabel bat = new JLabel("");
        bat.setBackground(new Color(128, 0, 0));
		panel.add(bat);
		bat.setOpaque(true);
		bat.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		

		
		JLabel bi = new JLabel("");
		panel.add(bi);
		bi.setBackground(new Color(255, 0, 0));
		bi.setOpaque(true);
		bi.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ImageIcon icono = new ImageIcon("C:\\Users\\PC\\git\\nose tamagotchi\\Tamagochi\\Tamagochi\\src\\Bista\\dorayaki.png");
		bi.setIcon(icono);
		bi.setHorizontalAlignment(SwingConstants.CENTER);
		bi.setVerticalAlignment(SwingConstants.CENTER);
		
		
        JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setBackground(Argia);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_5 = new JLabel("");
		panel.add(lblNewLabel_5);	
		lblNewLabel_5.setBackground(Erdia);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_6 = new JLabel("");
		panel.add(lblNewLabel_6);
		lblNewLabel_6.setBackground(Iluna);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_7 = new JLabel("");
		panel.add(lblNewLabel_7);
		lblNewLabel_7.setBackground(Erdia);
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_8 = new JLabel("");
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setBackground(Argia);
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_49 = new JLabel("");
		panel.add(lblNewLabel_49);
		lblNewLabel_49.setBackground(Iluna);
		lblNewLabel_49.setOpaque(true);
		lblNewLabel_49.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_46 = new JLabel("");
		panel.add(lblNewLabel_46);
		lblNewLabel_46.setBackground(Erdia);
		lblNewLabel_46.setOpaque(true);
		lblNewLabel_46.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_37 = new JLabel("");
		panel.add(lblNewLabel_37);
		lblNewLabel_37.setBackground(Iluna);
		lblNewLabel_37.setOpaque(true);
		lblNewLabel_37.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_66 = new JLabel("");
		panel.add(lblNewLabel_66);
		lblNewLabel_66.setBackground(Argia);
		lblNewLabel_66.setOpaque(true);
		lblNewLabel_66.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_94 = new JLabel("");
		panel.add(lblNewLabel_94);
		lblNewLabel_94.setBackground(Erdia);
		lblNewLabel_94.setOpaque(true);
		lblNewLabel_94.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_95 = new JLabel("");
		panel.add(lblNewLabel_95);
		lblNewLabel_95.setBackground(Iluna);
		lblNewLabel_95.setOpaque(true);
		lblNewLabel_95.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_96 = new JLabel("");
		panel.add(lblNewLabel_96);
		lblNewLabel_96.setBackground(Iluna);
		lblNewLabel_96.setOpaque(true);
		lblNewLabel_96.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		label_1.setBackground(Erdia);
		label_1.setOpaque(true);
		label_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_100 = new JLabel("");
		panel.add(lblNewLabel_100);
		lblNewLabel_100.setBackground(Argia);
		lblNewLabel_100.setOpaque(true);
		lblNewLabel_100.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_74 = new JLabel("");
		panel.add(lblNewLabel_74);
		lblNewLabel_74.setBackground(Erdia);
		lblNewLabel_74.setOpaque(true);
		lblNewLabel_74.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_101 = new JLabel("");
		panel.add(lblNewLabel_101);
		lblNewLabel_101.setBackground(Erdia);
		lblNewLabel_101.setOpaque(true);
		lblNewLabel_101.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_16 = new JLabel("");
		panel.add(lblNewLabel_16);
		lblNewLabel_16.setBackground(Argia);
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_102 = new JLabel("");
		panel.add(lblNewLabel_102);
		lblNewLabel_102.setBackground(Iluna);
		lblNewLabel_102.setOpaque(true);
		lblNewLabel_102.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_18 = new JLabel("");
		panel.add(lblNewLabel_18);
		lblNewLabel_18.setBackground(Argia);
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_57 = new JLabel("");
		panel.add(lblNewLabel_57);
		lblNewLabel_57.setBackground(Iluna);
		lblNewLabel_57.setOpaque(true);
		lblNewLabel_57.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_11 = new JLabel("");
		panel.add(lblNewLabel_11);
		lblNewLabel_11.setBackground(Argia);
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_19 = new JLabel("");
		panel.add(lblNewLabel_19);
		lblNewLabel_19.setBackground(Erdia);
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_44 = new JLabel("");
		panel.add(lblNewLabel_44);
		lblNewLabel_44.setBackground(Erdia);
		lblNewLabel_44.setOpaque(true);
		lblNewLabel_44.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_20 = new JLabel("");
		panel.add(lblNewLabel_20);
		lblNewLabel_20.setBackground(Iluna);
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_63 = new JLabel("");
		panel.add(lblNewLabel_63);
		lblNewLabel_63.setBackground(Argia);
		lblNewLabel_63.setOpaque(true);
		lblNewLabel_63.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_97 = new JLabel("");
		panel.add(lblNewLabel_97);
		lblNewLabel_97.setBackground(Erdia);
		lblNewLabel_97.setOpaque(true);
		lblNewLabel_97.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_55 = new JLabel("");
		panel.add(lblNewLabel_55);
		lblNewLabel_55.setBackground(Argia);
		lblNewLabel_55.setOpaque(true);
		lblNewLabel_55.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_10 = new JLabel("");
		panel.add(lblNewLabel_10);
		lblNewLabel_10.setBackground(Iluna);
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_9 = new JLabel("");
		panel.add(lblNewLabel_9);
		lblNewLabel_9.setBackground(Argia);
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_45 = new JLabel("");
		panel.add(lblNewLabel_45);
		lblNewLabel_45.setBackground(Argia);
		lblNewLabel_45.setOpaque(true);
		lblNewLabel_45.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_67 = new JLabel("");
		panel.add(lblNewLabel_67);
		lblNewLabel_67.setBackground(Erdia);
		lblNewLabel_67.setOpaque(true);
		lblNewLabel_67.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_58 = new JLabel("");
		panel.add(lblNewLabel_58);
		lblNewLabel_58.setBackground(Erdia);
		lblNewLabel_58.setOpaque(true);
		lblNewLabel_58.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_82 = new JLabel("");
		panel.add(lblNewLabel_82);
		lblNewLabel_82.setBackground(Argia);
		lblNewLabel_82.setOpaque(true);
		lblNewLabel_82.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_75 = new JLabel("");
		panel.add(lblNewLabel_75);
		lblNewLabel_75.setBackground(Argia);
		lblNewLabel_75.setOpaque(true);
		lblNewLabel_75.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_86 = new JLabel("");
		panel.add(lblNewLabel_86);
		lblNewLabel_86.setBackground(Iluna);
		lblNewLabel_86.setOpaque(true);
		lblNewLabel_86.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_87 = new JLabel("");
		panel.add(lblNewLabel_87);
		lblNewLabel_87.setBackground(Erdia);
		lblNewLabel_87.setOpaque(true);
		lblNewLabel_87.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_88 = new JLabel("");
		panel.add(lblNewLabel_88);
		lblNewLabel_88.setBackground(Argia);
		lblNewLabel_88.setOpaque(true);
		lblNewLabel_88.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_81 = new JLabel("");
		panel.add(lblNewLabel_81);
		lblNewLabel_81.setBackground(Iluna);
		lblNewLabel_81.setOpaque(true);
		lblNewLabel_81.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_98 = new JLabel("");
		panel.add(lblNewLabel_98);
		lblNewLabel_98.setBackground(Erdia);
		lblNewLabel_98.setOpaque(true);
		lblNewLabel_98.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_85 = new JLabel("");
		panel.add(lblNewLabel_85);
		lblNewLabel_85.setBackground(Erdia);
		lblNewLabel_85.setOpaque(true);
		lblNewLabel_85.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_73 = new JLabel("");
		panel.add(lblNewLabel_73);
		lblNewLabel_73.setBackground(Iluna);
		lblNewLabel_73.setOpaque(true);
		lblNewLabel_73.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_83 = new JLabel("");
		panel.add(lblNewLabel_83);
		lblNewLabel_83.setBackground(Argia);
		lblNewLabel_83.setOpaque(true);
		lblNewLabel_83.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_80 = new JLabel("");
		panel.add(lblNewLabel_80);
		lblNewLabel_80.setBackground(Iluna);
		lblNewLabel_80.setOpaque(true);
		lblNewLabel_80.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_79 = new JLabel("");
		panel.add(lblNewLabel_79);
		lblNewLabel_79.setBackground(Erdia);
		lblNewLabel_79.setOpaque(true);
		lblNewLabel_79.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_76 = new JLabel("");
		panel.add(lblNewLabel_76);
		lblNewLabel_76.setBackground(Argia);
		lblNewLabel_76.setOpaque(true);
		lblNewLabel_76.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_65 = new JLabel("");
		panel.add(lblNewLabel_65);
		lblNewLabel_65.setBackground(Erdia);
		lblNewLabel_65.setOpaque(true);
		lblNewLabel_65.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_64 = new JLabel("");
		panel.add(lblNewLabel_64);
		lblNewLabel_64.setBackground(Argia);
		lblNewLabel_64.setOpaque(true);
		lblNewLabel_64.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_54 = new JLabel("");
		panel.add(lblNewLabel_54);
		lblNewLabel_54.setBackground(Erdia);
		lblNewLabel_54.setOpaque(true);
		lblNewLabel_54.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_77 = new JLabel("");
		panel.add(lblNewLabel_77);
		lblNewLabel_77.setBackground(Iluna);
		lblNewLabel_77.setOpaque(true);
		lblNewLabel_77.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_62 = new JLabel("");
		panel.add(lblNewLabel_62);
		lblNewLabel_62.setBackground(Iluna);
		lblNewLabel_62.setOpaque(true);
		lblNewLabel_62.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_99 = new JLabel("");
		panel.add(lblNewLabel_99);
		lblNewLabel_99.setBackground(Erdia);
		lblNewLabel_99.setOpaque(true);
		lblNewLabel_99.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_91 = new JLabel("");
		panel.add(lblNewLabel_91);
		lblNewLabel_91.setBackground(Argia);
		lblNewLabel_91.setOpaque(true);
		lblNewLabel_91.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_93 = new JLabel("");
		panel.add(lblNewLabel_93);
		lblNewLabel_93.setBackground(Erdia);
		lblNewLabel_93.setOpaque(true);
		lblNewLabel_93.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_92 = new JLabel("");
		panel.add(lblNewLabel_92);
		lblNewLabel_92.setBackground(Erdia);
		lblNewLabel_92.setOpaque(true);
		lblNewLabel_92.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_51 = new JLabel("");
		panel.add(lblNewLabel_51);
		lblNewLabel_51.setBackground(Iluna);
		lblNewLabel_51.setOpaque(true);
		lblNewLabel_51.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_78 = new JLabel("");
		panel.add(lblNewLabel_78);
		lblNewLabel_78.setBackground(Erdia);
		lblNewLabel_78.setOpaque(true);
		lblNewLabel_78.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_70 = new JLabel("");
		panel.add(lblNewLabel_70);
		lblNewLabel_70.setBackground(Argia);
		lblNewLabel_70.setOpaque(true);
		lblNewLabel_70.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_72 = new JLabel("");
		panel.add(lblNewLabel_72);
		lblNewLabel_72.setBackground(Argia);
		lblNewLabel_72.setOpaque(true);
		lblNewLabel_72.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_43 = new JLabel("");
		panel.add(lblNewLabel_43);
		lblNewLabel_43.setBackground(Erdia);
		lblNewLabel_43.setOpaque(true);
		lblNewLabel_43.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_68 = new JLabel("");
		panel.add(lblNewLabel_68);
		lblNewLabel_68.setBackground(Iluna);
		lblNewLabel_68.setOpaque(true);
		lblNewLabel_68.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_89 = new JLabel("");
		panel.add(lblNewLabel_89);
		lblNewLabel_89.setBackground(Iluna);
		lblNewLabel_89.setOpaque(true);
		lblNewLabel_89.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_17 = new JLabel("");
		panel.add(lblNewLabel_17);
		lblNewLabel_17.setBackground(Erdia);
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_56 = new JLabel("");
		panel.add(lblNewLabel_56);
		lblNewLabel_56.setBackground(Argia);
		lblNewLabel_56.setOpaque(true);
		lblNewLabel_56.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_61 = new JLabel("");
		panel.add(lblNewLabel_61);
		lblNewLabel_61.setBackground(Erdia);
		lblNewLabel_61.setOpaque(true);
		lblNewLabel_61.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_60 = new JLabel("");
		panel.add(lblNewLabel_60);
		lblNewLabel_60.setBackground(Erdia);
		lblNewLabel_60.setOpaque(true);
		lblNewLabel_60.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_25 = new JLabel("");
		panel.add(lblNewLabel_25);
		lblNewLabel_25.setBackground(Iluna);
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_24 = new JLabel("");
		panel.add(lblNewLabel_24);
		lblNewLabel_24.setBackground(Erdia);
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_12 = new JLabel("");
		panel.add(lblNewLabel_12);
		lblNewLabel_12.setBackground(Argia);
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_26 = new JLabel("");
		panel.add(lblNewLabel_26);
		lblNewLabel_26.setBackground(Argia);
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_53 = new JLabel("");
		panel.add(lblNewLabel_53);
		lblNewLabel_53.setBackground(Erdia);
		lblNewLabel_53.setOpaque(true);
		lblNewLabel_53.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_15 = new JLabel("");
		panel.add(lblNewLabel_15);
		lblNewLabel_15.setBackground(Iluna);
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_40 = new JLabel("");
		panel.add(lblNewLabel_40);
		lblNewLabel_40.setBackground(Argia);
		lblNewLabel_40.setOpaque(true);
		lblNewLabel_40.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_14 = new JLabel("");
		panel.add(lblNewLabel_14);
		lblNewLabel_14.setBackground(Argia);
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_23 = new JLabel("");
		panel.add(lblNewLabel_23);
		lblNewLabel_23.setBackground(Erdia);
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_36 = new JLabel("");
		panel.add(lblNewLabel_36);
		lblNewLabel_36.setBackground(Erdia);
		lblNewLabel_36.setOpaque(true);
		lblNewLabel_36.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_21 = new JLabel("");
		panel.add(lblNewLabel_21);
		lblNewLabel_21.setBackground(Iluna);
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_33 = new JLabel("");
		panel.add(lblNewLabel_33);
		lblNewLabel_33.setBackground(Erdia);
		lblNewLabel_33.setOpaque(true);
		lblNewLabel_33.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_41 = new JLabel("");
		panel.add(lblNewLabel_41);
		lblNewLabel_41.setBackground(Argia);
		lblNewLabel_41.setOpaque(true);
		lblNewLabel_41.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_38 = new JLabel("");
		panel.add(lblNewLabel_38);
		lblNewLabel_38.setBackground(Erdia);
		lblNewLabel_38.setOpaque(true);
		lblNewLabel_38.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ImageIcon icono2 = new ImageIcon("C:\\Users\\PC\\git\\nose tamagotchi\\Tamagochi\\Tamagochi\\src\\Bista\\MimitchiMini1.png");
		lblNewLabel_38.setIcon(icono2);
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_38.setVerticalAlignment(SwingConstants.CENTER);
		

		JLabel lblNewLabel_32 = new JLabel("");
		panel.add(lblNewLabel_32);
		lblNewLabel_32.setBackground(Argia);
		lblNewLabel_32.setOpaque(true);
		lblNewLabel_32.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_29 = new JLabel("");
		panel.add(lblNewLabel_29);
		lblNewLabel_29.setBackground(Iluna);
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_71 = new JLabel("");
		panel.add(lblNewLabel_71);
		lblNewLabel_71.setBackground(Argia);
		lblNewLabel_71.setOpaque(true);
		lblNewLabel_71.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_34 = new JLabel("");
		panel.add(lblNewLabel_34);
		lblNewLabel_34.setBackground(Iluna);
		lblNewLabel_34.setOpaque(true);
		lblNewLabel_34.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_27 = new JLabel("");
		panel.add(lblNewLabel_27);
		lblNewLabel_27.setBackground(Iluna);
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_13 = new JLabel("");
		panel.add(lblNewLabel_13);
		lblNewLabel_13.setBackground(Argia);
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_22 = new JLabel("");
		panel.add(lblNewLabel_22);
		lblNewLabel_22.setBackground(Erdia);
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_28 = new JLabel("");
		panel.add(lblNewLabel_28);
		lblNewLabel_28.setBackground(Erdia);
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_30 = new JLabel("");
		panel.add(lblNewLabel_30);
		lblNewLabel_30.setBackground(Argia);
		lblNewLabel_30.setOpaque(true);
		lblNewLabel_30.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_31 = new JLabel("");
		panel.add(lblNewLabel_31);
		lblNewLabel_31.setBackground(Iluna);
		lblNewLabel_31.setOpaque(true);
		lblNewLabel_31.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_39 = new JLabel("");
		panel.add(lblNewLabel_39);
		lblNewLabel_39.setBackground(Iluna);
		lblNewLabel_39.setOpaque(true);
		lblNewLabel_39.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_42 = new JLabel("");
		panel.add(lblNewLabel_42);
		lblNewLabel_42.setBackground(Argia);
		lblNewLabel_42.setOpaque(true);
		lblNewLabel_42.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_47 = new JLabel("");
		panel.add(lblNewLabel_47);
		lblNewLabel_47.setBackground(Erdia);
		lblNewLabel_47.setOpaque(true);
		lblNewLabel_47.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_48 = new JLabel("");
		panel.add(lblNewLabel_48);
		lblNewLabel_48.setBackground(Erdia);
		lblNewLabel_48.setOpaque(true);
		lblNewLabel_48.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JLabel lblNewLabel_35 = new JLabel("");
		panel.add(lblNewLabel_35);
		lblNewLabel_35.setBackground(Erdia);
		lblNewLabel_35.setOpaque(true);
		lblNewLabel_35.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		
	}

}
