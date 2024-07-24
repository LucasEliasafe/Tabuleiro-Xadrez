import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.channels.Pipe;


public class TabuleiroXadrez extends JFrame {
    private static final int LINHAS = 8;

    private static final int COLUNAS = 8;

    private static final int TAMANHO_CELULA = 60;

    private final JPanel[][] celulas = new JPanel[LINHAS][COLUNAS];

    private final Piece[][] pecas = new Piece[LINHAS][COLUNAS];

    public TabuleiroXadrez() {
        setTitle("Tabuleiro Xadrez");
        setSize(COLUNAS*TAMANHO_CELULA, LINHAS*TAMANHO_CELULA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelTabuleiro = new JPanel(new GridLayout(LINHAS,COLUNAS));
        boolean
    }
}
