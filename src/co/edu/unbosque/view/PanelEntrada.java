package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel{
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton butJuego;
	private JButton butEscribir;
	private JButton butLeerReg;
	private JButton butEscribirReg;
	public static final String ESCRIBIR = "Escribir";
	public static final String JUEGO = "Juego";
	public static final String ESCRIBIR_REG = "EscribirReg";
	public static final String LEER_REG = "LeerReg";

	public PanelEntrada() {
		setLayout( new GridLayout(2,2) );//se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Sistema para jugadores");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("Digite un Valor");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		butJuego = new JButton("Juego");
		butJuego.setActionCommand(JUEGO);
		butEscribir = new JButton("Jugador");
		butEscribir.setActionCommand(ESCRIBIR);

		butLeerReg = new JButton("Partida");
		butLeerReg.setActionCommand(LEER_REG);

		butEscribirReg = new JButton("Jugadores");
		butEscribirReg.setActionCommand(ESCRIBIR_REG);
		//add(labEntrada);
		//add(txtNumero);
		add(butEscribir);
		add(butJuego);
		add(butEscribirReg);
		add(butLeerReg);
	}

	public static String getLeerReg() {
		return LEER_REG;
	}

	public JButton getButLeerReg() {
		return butLeerReg;
	}

	public void setButLeerReg(JButton butLeerReg) {
		this.butLeerReg = butLeerReg;
	}

	public JButton getButEscribirReg() {
		return butEscribirReg;
	}

	public void setButEscribirReg(JButton butEscribirReg) {
		this.butEscribirReg = butEscribirReg;
	}

	public static String getEscribirReg() {
		return ESCRIBIR_REG;
	}

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButLeer() {
		return butJuego;
	}

	public void setButLeer(JButton butLeer) {
		this.butJuego = butLeer;
	}

	public JButton getButEscribir() {
		return butEscribir;
	}

	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}
}
