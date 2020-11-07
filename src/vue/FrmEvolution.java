package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Controle;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmEvolution extends JFrame {

	private JPanel contentPane;
	private JTextField txtPopInit;
	private JTextField txtBirthRate;
	private JTextField txtDeathRate;
	private JTextField txtIterations;
	private JLabel lblEndPop;
	private Controle controle;


	/* Click bouton go */
	public void cmdbtnGo() {
		controle.demandeFrmEvolutionValeurs(Integer.parseInt(txtPopInit.getText()),Integer.parseInt(txtBirthRate.getText()),Integer.parseInt(txtDeathRate.getText()),Integer.parseInt(txtIterations.getText()));
	}
	
	/* Click bouton raz */
	public void cmdbtnRaz() {
		
	}

	/* Display end pop */
	
	public void displayEndPopulation(int endPop) {
		lblEndPop.setText(""+endPop);
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public FrmEvolution(Controle controle) {
		this.controle=controle;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPopInit = new JTextField();
		txtPopInit.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPopInit.setText("100");
		txtPopInit.setBounds(138, 30, 113, 20);
		contentPane.add(txtPopInit);
		txtPopInit.setColumns(10);
		
		txtBirthRate = new JTextField();
		txtBirthRate.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBirthRate.setText("30");
		txtBirthRate.setColumns(10);
		txtBirthRate.setBounds(138, 68, 113, 20);
		contentPane.add(txtBirthRate);
		
		txtDeathRate = new JTextField();
		txtDeathRate.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDeathRate.setText("20");
		txtDeathRate.setColumns(10);
		txtDeathRate.setBounds(138, 107, 113, 20);
		contentPane.add(txtDeathRate);
		
		JLabel lblNewLabel = new JLabel("Initial population");
		lblNewLabel.setBounds(10, 30, 118, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblBirthRate = new JLabel("Birth rate");
		lblBirthRate.setBounds(10, 71, 118, 17);
		contentPane.add(lblBirthRate);
		
		JLabel lblDeathRate = new JLabel("Death rate");
		lblDeathRate.setBounds(10, 110, 118, 17);
		contentPane.add(lblDeathRate);
		
		JLabel lblIterations = new JLabel("Iterations");
		lblIterations.setBounds(10, 149, 118, 17);
		contentPane.add(lblIterations);
		
		JButton btnGo = new JButton("Go !");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdbtnGo();
			}
		});
		btnGo.setBounds(282, 29, 89, 23);
		contentPane.add(btnGo);
		
		JButton btnRaz = new JButton("RAZ");
		btnRaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdbtnRaz();
			}
		});
		btnRaz.setBounds(282, 67, 89, 23);
		contentPane.add(btnRaz);
		
		txtIterations = new JTextField();
		txtIterations.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIterations.setText("100");
		txtIterations.setColumns(10);
		txtIterations.setBounds(138, 147, 113, 20);
		contentPane.add(txtIterations);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 177, 414, 202);
		contentPane.add(scrollPane);
		
		JList lstIterations = new JList();
		scrollPane.setViewportView(lstIterations);
		
		JLabel lblNewLabel_1 = new JLabel("End Pop");
		lblNewLabel_1.setBounds(302, 110, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblEndPop = new JLabel("");
		lblEndPop.setBounds(358, 110, 46, 14);
		contentPane.add(lblEndPop);
	}
}
