import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Usuario;
import org.hibernate.mapping.PrimaryKey;

import javax.swing.*;
import java.awt.*;

public class Gerenciador extends JFrame {
    private  CardLayout cardLayout;
    private JPanel mainPanel;
    private final String EMPTY_SCREEN = "EMPTY_SCREEN";

    public Gerenciador() {
        setTitle("gerenciador de projetos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.cardLayout = new CardLayout();
        this.mainPanel = new JPanel(cardLayout);
        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.add(new JLabel("bem-vindo! use o menu para navegar", SwingConstants.CENTER), BorderLayout.CENTER);
        this.mainPanel.add(emptyPanel, EMPTY_SCREEN);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("menu");
        JMenuItem listUserItem = new JMenuItem("Listar Usuarios");
        JMenuItem ExitItem = new JMenuItem("Sair");
        menu.add(listUserItem);
        menu.add(ExitItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        add(mainPanel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Gerenciador().setVisible(true);
        });
    }
}
