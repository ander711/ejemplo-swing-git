import javax.swing.JFrame;

public class VentanaSwingGit extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public VentanaSwingGit() {
		setTitle("Ejemplo Swing + Git");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		VentanaSwingGit VentanaSwingGit = new VentanaSwingGit();
		VentanaSwingGit.setVisible(true);
	}

}
