import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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
        
        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        
        JMenu menuFichero = new JMenu("Fichero");
        barraMenu.add(menuFichero);
        
        JMenuItem itemMostrar = new JMenuItem("Mostrar");
        menuFichero.add(itemMostrar);

        JMenuItem itemSalir = new JMenuItem("Salir");
        menuFichero.add(itemSalir);
        
        JTabbedPane panelPestanas = new JTabbedPane();
        add(panelPestanas, BorderLayout.CENTER);
        
        panelPestanas.addTab("Datos Personales", new JPanel());
        panelPestanas.add("Informacion", new JPanel());
        panelPestanas.add("Comentarios", new JPanel());
	}

	public static void main(String[] args) {
		VentanaSwingGit VentanaSwingGit = new VentanaSwingGit();
		VentanaSwingGit.setVisible(true);
	}

}

