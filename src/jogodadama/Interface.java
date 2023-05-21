package jogodadama;

import java.awt.Color;
import javax.swing.*;

public class Interface extends javax.swing.JFrame {

    public Interface() {
        initComponents();
        setResizable(false);
        setTitle("Jogo da Dama");
        Color corDeFundo = new Color(46, 40, 42);
        getContentPane().setBackground(corDeFundo);
        tabuleiroEscondido.iniciarTabuleiro();
        tabuleiroEscondido.atualizarCasas();
        definirMatrizJLabel();
        definirInterface();
    }
    
    private JLabel[][] matrizTabuleiro = new JLabel[8][8];
    private Tabuleiro tabuleiroEscondido = new Tabuleiro();
    private Verificacao verificar = new Verificacao();
    private ImageIcon pecaPreta = new ImageIcon(getClass().getResource("/imagensDama/pecaPreta.png"));
    private ImageIcon pecaPretaApertada = new ImageIcon(getClass().getResource("/imagensDama/pecaPretaApertada.png"));
    private ImageIcon rainhaPreta = new ImageIcon(getClass().getResource("/imagensDama/rainhaPreta.png"));
    private ImageIcon rainhaPretaApertada = new ImageIcon(getClass().getResource("/imagensDama/rainhaPretaApertada.png"));
    private ImageIcon pecaBranca = new ImageIcon(getClass().getResource("/imagensDama/pecaBranca.png"));
    private ImageIcon pecaBrancaApertada = new ImageIcon(getClass().getResource("/imagensDama/pecaBrancaApertada.png"));
    private ImageIcon rainhaBranca = new ImageIcon(getClass().getResource("/imagensDama/rainhaBranca.png"));
    private ImageIcon rainhaBrancaApertada = new ImageIcon(getClass().getResource("/imagensDama/rainhaBrancaApertada.png"));
    private ImageIcon posicaoFutura = new ImageIcon(getClass().getResource("/imagensDama/posicaoFutura.png"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        b4 = new javax.swing.JLabel();
        branca6 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        branca2 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        branca5 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        branca3 = new javax.swing.JLabel();
        branca4 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        branca7 = new javax.swing.JLabel();
        branca9 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        branca10 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        branca11 = new javax.swing.JLabel();
        b11 = new javax.swing.JLabel();
        branca12 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        b13 = new javax.swing.JLabel();
        branca13 = new javax.swing.JLabel();
        b14 = new javax.swing.JLabel();
        branca14 = new javax.swing.JLabel();
        b15 = new javax.swing.JLabel();
        branca15 = new javax.swing.JLabel();
        b16 = new javax.swing.JLabel();
        branca16 = new javax.swing.JLabel();
        branca17 = new javax.swing.JLabel();
        b17 = new javax.swing.JLabel();
        branca18 = new javax.swing.JLabel();
        b18 = new javax.swing.JLabel();
        branca19 = new javax.swing.JLabel();
        b19 = new javax.swing.JLabel();
        branca20 = new javax.swing.JLabel();
        b20 = new javax.swing.JLabel();
        b21 = new javax.swing.JLabel();
        branca21 = new javax.swing.JLabel();
        b22 = new javax.swing.JLabel();
        branca22 = new javax.swing.JLabel();
        b23 = new javax.swing.JLabel();
        branca23 = new javax.swing.JLabel();
        b24 = new javax.swing.JLabel();
        branca24 = new javax.swing.JLabel();
        branca25 = new javax.swing.JLabel();
        b25 = new javax.swing.JLabel();
        branca26 = new javax.swing.JLabel();
        b26 = new javax.swing.JLabel();
        branca27 = new javax.swing.JLabel();
        b27 = new javax.swing.JLabel();
        branca28 = new javax.swing.JLabel();
        b32 = new javax.swing.JLabel();
        branca31 = new javax.swing.JLabel();
        b31 = new javax.swing.JLabel();
        branca30 = new javax.swing.JLabel();
        branca29 = new javax.swing.JLabel();
        b30 = new javax.swing.JLabel();
        b29 = new javax.swing.JLabel();
        branca1 = new javax.swing.JLabel();
        b28 = new javax.swing.JLabel();
        branca32 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        branca8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        vezDoJogador = new javax.swing.JLabel();
        txtComidaObrigatoria = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(814, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(814, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b4.setBackground(new java.awt.Color(1, 0, 0));
        b4.setName("b4"); // NOI18N
        b4.setOpaque(true);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 80, 80));

        branca6.setBackground(new java.awt.Color(255, 255, 255));
        branca6.setOpaque(true);
        getContentPane().add(branca6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 80, 80));

        b6.setBackground(new java.awt.Color(1, 0, 0));
        b6.setName("b6"); // NOI18N
        b6.setOpaque(true);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 80, 80));

        b1.setBackground(new java.awt.Color(1, 0, 0));
        b1.setName("b1"); // NOI18N
        b1.setOpaque(true);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 80, 80));

        branca2.setBackground(new java.awt.Color(255, 255, 255));
        branca2.setOpaque(true);
        getContentPane().add(branca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 80, 80));

        b5.setBackground(new java.awt.Color(0, 0, 0));
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setName("b5"); // NOI18N
        b5.setOpaque(true);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, 80));

        branca5.setBackground(new java.awt.Color(255, 255, 255));
        branca5.setOpaque(true);
        getContentPane().add(branca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 80, 80));

        b2.setBackground(new java.awt.Color(1, 0, 0));
        b2.setName("b2"); // NOI18N
        b2.setOpaque(true);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 80, 80));

        b7.setBackground(new java.awt.Color(1, 0, 0));
        b7.setName("b7"); // NOI18N
        b7.setOpaque(true);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 80, 80));

        branca3.setBackground(new java.awt.Color(255, 255, 255));
        branca3.setOpaque(true);
        getContentPane().add(branca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 80, 80));

        branca4.setBackground(new java.awt.Color(255, 255, 255));
        branca4.setOpaque(true);
        getContentPane().add(branca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 80, 80));

        b8.setBackground(new java.awt.Color(1, 0, 0));
        b8.setName("b8"); // NOI18N
        b8.setOpaque(true);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 80, 80));

        b3.setBackground(new java.awt.Color(1, 0, 0));
        b3.setName("b3"); // NOI18N
        b3.setOpaque(true);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, 80));

        branca7.setBackground(new java.awt.Color(255, 255, 255));
        branca7.setOpaque(true);
        getContentPane().add(branca7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, 80));

        branca9.setBackground(new java.awt.Color(255, 255, 255));
        branca9.setOpaque(true);
        getContentPane().add(branca9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 80, 80));

        b9.setBackground(new java.awt.Color(0, 0, 0));
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setName("b9"); // NOI18N
        b9.setOpaque(true);
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 80, 80));

        branca10.setBackground(new java.awt.Color(255, 255, 255));
        branca10.setOpaque(true);
        getContentPane().add(branca10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 80, 80));

        b10.setBackground(new java.awt.Color(1, 0, 0));
        b10.setName("b10"); // NOI18N
        b10.setOpaque(true);
        b10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b10MouseClicked(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 80, 80));

        branca11.setBackground(new java.awt.Color(255, 255, 255));
        branca11.setOpaque(true);
        getContentPane().add(branca11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, 80));

        b11.setBackground(new java.awt.Color(1, 0, 0));
        b11.setName("b11"); // NOI18N
        b11.setOpaque(true);
        b11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b11MouseClicked(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 80, 80));

        branca12.setBackground(new java.awt.Color(255, 255, 255));
        branca12.setOpaque(true);
        getContentPane().add(branca12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 80, 80));

        b12.setBackground(new java.awt.Color(1, 0, 0));
        b12.setName("b12"); // NOI18N
        b12.setOpaque(true);
        b12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b12MouseClicked(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 80, 80));

        b13.setBackground(new java.awt.Color(1, 0, 0));
        b13.setName("b13"); // NOI18N
        b13.setOpaque(true);
        b13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b13MouseClicked(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 80, 80));

        branca13.setBackground(new java.awt.Color(255, 255, 255));
        branca13.setOpaque(true);
        getContentPane().add(branca13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, 80));

        b14.setBackground(new java.awt.Color(1, 0, 0));
        b14.setText(".");
        b14.setName("b14"); // NOI18N
        b14.setOpaque(true);
        b14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b14MouseClicked(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 80, 80));

        branca14.setBackground(new java.awt.Color(255, 255, 255));
        branca14.setOpaque(true);
        getContentPane().add(branca14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 80, 80));

        b15.setBackground(new java.awt.Color(1, 0, 0));
        b15.setName("b15"); // NOI18N
        b15.setOpaque(true);
        b15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b15MouseClicked(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 80, 80));

        branca15.setBackground(new java.awt.Color(255, 255, 255));
        branca15.setOpaque(true);
        getContentPane().add(branca15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 80, 80));

        b16.setBackground(new java.awt.Color(1, 0, 0));
        b16.setName("b16"); // NOI18N
        b16.setOpaque(true);
        b16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b16MouseClicked(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 80, 80));

        branca16.setBackground(new java.awt.Color(255, 255, 255));
        branca16.setOpaque(true);
        getContentPane().add(branca16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 80, 80));

        branca17.setBackground(new java.awt.Color(255, 255, 255));
        branca17.setOpaque(true);
        getContentPane().add(branca17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 80, 80));

        b17.setBackground(new java.awt.Color(0, 0, 0));
        b17.setForeground(new java.awt.Color(255, 255, 255));
        b17.setName("b17"); // NOI18N
        b17.setOpaque(true);
        b17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b17MouseClicked(evt);
            }
        });
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 80, 80));

        branca18.setBackground(new java.awt.Color(255, 255, 255));
        branca18.setOpaque(true);
        getContentPane().add(branca18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 80, 80));

        b18.setBackground(new java.awt.Color(1, 0, 0));
        b18.setName("b18"); // NOI18N
        b18.setOpaque(true);
        b18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b18MouseClicked(evt);
            }
        });
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 80, 80));

        branca19.setBackground(new java.awt.Color(255, 255, 255));
        branca19.setOpaque(true);
        getContentPane().add(branca19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 80, 80));

        b19.setBackground(new java.awt.Color(1, 0, 0));
        b19.setName("b19"); // NOI18N
        b19.setOpaque(true);
        b19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b19MouseClicked(evt);
            }
        });
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 80, 80));

        branca20.setBackground(new java.awt.Color(255, 255, 255));
        branca20.setOpaque(true);
        getContentPane().add(branca20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 80, 80));

        b20.setBackground(new java.awt.Color(1, 0, 0));
        b20.setName("b20"); // NOI18N
        b20.setOpaque(true);
        b20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b20MouseClicked(evt);
            }
        });
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 80, 80));

        b21.setBackground(new java.awt.Color(1, 0, 0));
        b21.setName("b21"); // NOI18N
        b21.setOpaque(true);
        b21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b21MouseClicked(evt);
            }
        });
        getContentPane().add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 80, 80));

        branca21.setBackground(new java.awt.Color(255, 255, 255));
        branca21.setOpaque(true);
        getContentPane().add(branca21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 80, 80));

        b22.setBackground(new java.awt.Color(1, 0, 0));
        b22.setName("b22"); // NOI18N
        b22.setOpaque(true);
        b22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b22MouseClicked(evt);
            }
        });
        getContentPane().add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 80, 80));

        branca22.setBackground(new java.awt.Color(255, 255, 255));
        branca22.setOpaque(true);
        getContentPane().add(branca22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 80, 80));

        b23.setBackground(new java.awt.Color(1, 0, 0));
        b23.setName("b23"); // NOI18N
        b23.setOpaque(true);
        b23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b23MouseClicked(evt);
            }
        });
        getContentPane().add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 80, 80));

        branca23.setBackground(new java.awt.Color(255, 255, 255));
        branca23.setOpaque(true);
        getContentPane().add(branca23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 80, 80));

        b24.setBackground(new java.awt.Color(1, 0, 0));
        b24.setName("b24"); // NOI18N
        b24.setOpaque(true);
        b24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b24MouseClicked(evt);
            }
        });
        getContentPane().add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 80, 80));

        branca24.setBackground(new java.awt.Color(255, 255, 255));
        branca24.setOpaque(true);
        getContentPane().add(branca24, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 80, 80));

        branca25.setBackground(new java.awt.Color(255, 255, 255));
        branca25.setOpaque(true);
        getContentPane().add(branca25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 80, 80));

        b25.setBackground(new java.awt.Color(0, 0, 0));
        b25.setForeground(new java.awt.Color(255, 255, 255));
        b25.setName("b25"); // NOI18N
        b25.setOpaque(true);
        b25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b25MouseClicked(evt);
            }
        });
        getContentPane().add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 80, 80));

        branca26.setBackground(new java.awt.Color(255, 255, 255));
        branca26.setOpaque(true);
        getContentPane().add(branca26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 80, 80));

        b26.setBackground(new java.awt.Color(1, 0, 0));
        b26.setName("b26"); // NOI18N
        b26.setOpaque(true);
        b26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b26MouseClicked(evt);
            }
        });
        getContentPane().add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 80, 80));

        branca27.setBackground(new java.awt.Color(255, 255, 255));
        branca27.setOpaque(true);
        getContentPane().add(branca27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 80, 80));

        b27.setBackground(new java.awt.Color(1, 0, 0));
        b27.setName("b27"); // NOI18N
        b27.setOpaque(true);
        b27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b27MouseClicked(evt);
            }
        });
        getContentPane().add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 80, 80));

        branca28.setBackground(new java.awt.Color(255, 255, 255));
        branca28.setOpaque(true);
        getContentPane().add(branca28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 80, 80));

        b32.setBackground(new java.awt.Color(1, 0, 0));
        b32.setName("b32"); // NOI18N
        b32.setOpaque(true);
        b32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b32MouseClicked(evt);
            }
        });
        getContentPane().add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 670, 80, 80));

        branca31.setBackground(new java.awt.Color(255, 255, 255));
        branca31.setOpaque(true);
        getContentPane().add(branca31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 670, 80, 80));

        b31.setBackground(new java.awt.Color(1, 0, 0));
        b31.setName("b31"); // NOI18N
        b31.setOpaque(true);
        b31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b31MouseClicked(evt);
            }
        });
        getContentPane().add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 80, 80));

        branca30.setBackground(new java.awt.Color(255, 255, 255));
        branca30.setOpaque(true);
        getContentPane().add(branca30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, 80, 80));

        branca29.setBackground(new java.awt.Color(255, 255, 255));
        branca29.setOpaque(true);
        getContentPane().add(branca29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 670, 80, 80));

        b30.setBackground(new java.awt.Color(1, 0, 0));
        b30.setName("b30"); // NOI18N
        b30.setOpaque(true);
        b30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b30MouseClicked(evt);
            }
        });
        getContentPane().add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, 80, 80));

        b29.setBackground(new java.awt.Color(1, 0, 0));
        b29.setName("b29"); // NOI18N
        b29.setOpaque(true);
        b29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b29MouseClicked(evt);
            }
        });
        getContentPane().add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, 80, 80));

        branca1.setBackground(new java.awt.Color(255, 255, 255));
        branca1.setEnabled(false);
        branca1.setOpaque(true);
        getContentPane().add(branca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, 80));

        b28.setBackground(new java.awt.Color(1, 0, 0));
        b28.setName("b28"); // NOI18N
        b28.setOpaque(true);
        b28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b28MouseClicked(evt);
            }
        });
        getContentPane().add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 80, 80));

        branca32.setBackground(new java.awt.Color(255, 255, 255));
        branca32.setOpaque(true);
        getContentPane().add(branca32, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 670, 80, 80));

        jSeparator1.setBackground(new java.awt.Color(67, 40, 24));
        jSeparator1.setForeground(new java.awt.Color(67, 40, 24));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 40, 24), 2));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 110, 3, 642));

        jSeparator3.setBackground(new java.awt.Color(67, 40, 24));
        jSeparator3.setForeground(new java.awt.Color(67, 40, 24));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 40, 24), 2));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 3, 642));

        branca8.setBackground(new java.awt.Color(255, 255, 255));
        branca8.setOpaque(true);
        getContentPane().add(branca8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 80, 80));

        jSeparator2.setBackground(new java.awt.Color(67, 40, 24));
        jSeparator2.setForeground(new java.awt.Color(67, 40, 24));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 40, 24), 2));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 107, 646, 3));

        jSeparator4.setBackground(new java.awt.Color(67, 40, 24));
        jSeparator4.setForeground(new java.awt.Color(67, 40, 24));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 40, 24), 2));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 750, 646, 3));

        vezDoJogador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vezDoJogador.setForeground(new java.awt.Color(255, 255, 255));
        vezDoJogador.setText("Vez do jogador: Branco");
        getContentPane().add(vezDoJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        txtComidaObrigatoria.setForeground(new java.awt.Color(255, 255, 51));
        txtComidaObrigatoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtComidaObrigatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 150, 20));

        jMenu3.setText("Ajuda");

        jMenu4.setText("jMenu4");
        jMenu3.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");
        jMenu3.add(jMenuItem1);

        menu.add(jMenu3);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 0, (byte) 1), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 0, (byte) 3), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 0, (byte) 5), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b3MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 0, (byte) 7), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 1, (byte) 0), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 1, (byte) 2), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b6MouseClicked

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 1, (byte) 4), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b7MouseClicked

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 1, (byte) 6), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b8MouseClicked

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 2, (byte) 1), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b9MouseClicked

    private void b10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b10MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 2, (byte) 3), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b10MouseClicked

    private void b11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b11MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 2, (byte) 5), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b11MouseClicked

    private void b12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b12MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 2, (byte) 7), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b12MouseClicked

    private void b13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b13MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 3, (byte) 0), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b13MouseClicked

    private void b14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b14MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 3, (byte) 2), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b14MouseClicked

    private void b15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b15MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 3, (byte) 4), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b15MouseClicked

    private void b16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b16MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 3, (byte) 6), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b16MouseClicked

    private void b17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b17MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 4, (byte) 1), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b17MouseClicked

    private void b18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b18MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 4, (byte) 3), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b18MouseClicked

    private void b19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b19MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 4, (byte) 5), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b19MouseClicked

    private void b20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b20MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 4, (byte) 7), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b20MouseClicked

    private void b21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b21MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 5, (byte) 0), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b21MouseClicked

    private void b22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b22MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 5, (byte) 2), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b22MouseClicked

    private void b23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b23MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 5, (byte) 4), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b23MouseClicked

    private void b24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b24MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 5, (byte) 6), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b24MouseClicked

    private void b25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b25MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 6, (byte) 1), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b25MouseClicked

    private void b26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b26MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 6, (byte) 3), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b26MouseClicked

    private void b27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b27MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 6, (byte) 5), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b27MouseClicked

    private void b28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b28MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 6, (byte) 7), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b28MouseClicked

    private void b29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b29MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 7, (byte) 0), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b29MouseClicked

    private void b30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b30MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 7, (byte) 2), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b30MouseClicked

    private void b31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b31MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 7, (byte) 4), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b31MouseClicked

    private void b32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b32MouseClicked
        verificar.checarInteracao(tabuleiroEscondido.getCasa((byte) 7, (byte) 6), tabuleiroEscondido);
        tabuleiroEscondido.atualizarCasas();
        definirInterface();
        definirVez();
        definirObrigatoriedade();
        if(verificar.verificarVitoria(vezDoJogador,txtComidaObrigatoria, tabuleiroEscondido)){
            definirInterface();
        }
    }//GEN-LAST:event_b32MouseClicked

    private void definirInterface() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiroEscondido.getCasa((byte) i, (byte) j) != null && tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca() != null) {
                    if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 2) {
                        matrizTabuleiro[i][j].setIcon(pecaPreta);
                        System.out.print(" p ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 1) {
                        matrizTabuleiro[i][j].setIcon(pecaBranca);
                        System.out.print(" b ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 3) {
                        matrizTabuleiro[i][j].setIcon(pecaBrancaApertada);
                        System.out.print(" Y ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 4) {
                        matrizTabuleiro[i][j].setIcon(pecaPretaApertada);
                        System.out.print(" X ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 9) {
                        matrizTabuleiro[i][j].setIcon(posicaoFutura);
                        System.out.print(" O ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 5) {
                        matrizTabuleiro[i][j].setIcon(rainhaBranca);
                        System.out.print(" B ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 6) {
                        matrizTabuleiro[i][j].setIcon(rainhaPreta);
                        System.out.print(" P ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 7) {
                        matrizTabuleiro[i][j].setIcon(rainhaBrancaApertada);
                        System.out.print(" 7 ");
                    } else if (tabuleiroEscondido.getCasa((byte) i, (byte) j).getPeca().getCor() == (byte) 8) {
                        matrizTabuleiro[i][j].setIcon(rainhaPretaApertada);
                        System.out.print(" 8 ");
                    }
                } else {
                    matrizTabuleiro[i][j].setIcon(null);
                    System.out.print(" - ");
                }
            }
            System.out.print("\n");
        }
    }

    private void definirMatrizJLabel() {
        matrizTabuleiro[0][0] = branca1;
        matrizTabuleiro[0][1] = b1;
        matrizTabuleiro[0][2] = branca2;
        matrizTabuleiro[0][3] = b2;
        matrizTabuleiro[0][4] = branca3;
        matrizTabuleiro[0][5] = b3;
        matrizTabuleiro[0][6] = branca4;
        matrizTabuleiro[0][7] = b4;
        matrizTabuleiro[1][0] = b5;
        matrizTabuleiro[1][1] = branca5;
        matrizTabuleiro[1][2] = b6;
        matrizTabuleiro[1][3] = branca6;
        matrizTabuleiro[1][4] = b7;
        matrizTabuleiro[1][5] = branca7;
        matrizTabuleiro[1][6] = b8;
        matrizTabuleiro[1][7] = branca8;
        matrizTabuleiro[2][0] = branca9;
        matrizTabuleiro[2][1] = b9;
        matrizTabuleiro[2][2] = branca10;
        matrizTabuleiro[2][3] = b10;
        matrizTabuleiro[2][4] = branca11;
        matrizTabuleiro[2][5] = b11;
        matrizTabuleiro[2][6] = branca12;
        matrizTabuleiro[2][7] = b12;
        matrizTabuleiro[3][0] = b13;
        matrizTabuleiro[3][1] = branca13;
        matrizTabuleiro[3][2] = b14;
        matrizTabuleiro[3][3] = branca14;
        matrizTabuleiro[3][4] = b15;
        matrizTabuleiro[3][5] = branca15;
        matrizTabuleiro[3][6] = b16;
        matrizTabuleiro[3][7] = branca16;
        matrizTabuleiro[4][0] = branca17;
        matrizTabuleiro[4][1] = b17;
        matrizTabuleiro[4][2] = branca18;
        matrizTabuleiro[4][3] = b18;
        matrizTabuleiro[4][4] = branca19;
        matrizTabuleiro[4][5] = b19;
        matrizTabuleiro[4][6] = branca20;
        matrizTabuleiro[4][7] = b20;
        matrizTabuleiro[5][0] = b21;
        matrizTabuleiro[5][1] = branca21;
        matrizTabuleiro[5][2] = b22;
        matrizTabuleiro[5][3] = branca22;
        matrizTabuleiro[5][4] = b23;
        matrizTabuleiro[5][5] = branca23;
        matrizTabuleiro[5][6] = b24;
        matrizTabuleiro[5][7] = branca24;
        matrizTabuleiro[6][0] = branca25;
        matrizTabuleiro[6][1] = b25;
        matrizTabuleiro[6][2] = branca26;
        matrizTabuleiro[6][3] = b26;
        matrizTabuleiro[6][4] = branca27;
        matrizTabuleiro[6][5] = b27;
        matrizTabuleiro[6][6] = branca28;
        matrizTabuleiro[6][7] = b28;
        matrizTabuleiro[7][0] = b29;
        matrizTabuleiro[7][1] = branca29;
        matrizTabuleiro[7][2] = b30;
        matrizTabuleiro[7][3] = branca30;
        matrizTabuleiro[7][4] = b31;
        matrizTabuleiro[7][5] = branca31;
        matrizTabuleiro[7][6] = b32;
        matrizTabuleiro[7][7] = branca32;
    }

    public void definirVez(){
        if(verificar.getVez()){
            vezDoJogador.setText("Vez do jogador: Preto");
        }else{
            vezDoJogador.setText("Vez do jogador: Branco");
        }
    }    
    
    public void definirObrigatoriedade(){
        if(verificar.getObrigatoriedade()){
            txtComidaObrigatoria.setText("Comida Obrigatória!");
        }else{
            txtComidaObrigatoria.setText("");
        }
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b11;
    private javax.swing.JLabel b12;
    private javax.swing.JLabel b13;
    private javax.swing.JLabel b14;
    private javax.swing.JLabel b15;
    private javax.swing.JLabel b16;
    private javax.swing.JLabel b17;
    private javax.swing.JLabel b18;
    private javax.swing.JLabel b19;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b20;
    private javax.swing.JLabel b21;
    private javax.swing.JLabel b22;
    private javax.swing.JLabel b23;
    private javax.swing.JLabel b24;
    private javax.swing.JLabel b25;
    private javax.swing.JLabel b26;
    private javax.swing.JLabel b27;
    private javax.swing.JLabel b28;
    private javax.swing.JLabel b29;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b30;
    private javax.swing.JLabel b31;
    private javax.swing.JLabel b32;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JLabel branca1;
    private javax.swing.JLabel branca10;
    private javax.swing.JLabel branca11;
    private javax.swing.JLabel branca12;
    private javax.swing.JLabel branca13;
    private javax.swing.JLabel branca14;
    private javax.swing.JLabel branca15;
    private javax.swing.JLabel branca16;
    private javax.swing.JLabel branca17;
    private javax.swing.JLabel branca18;
    private javax.swing.JLabel branca19;
    private javax.swing.JLabel branca2;
    private javax.swing.JLabel branca20;
    private javax.swing.JLabel branca21;
    private javax.swing.JLabel branca22;
    private javax.swing.JLabel branca23;
    private javax.swing.JLabel branca24;
    private javax.swing.JLabel branca25;
    private javax.swing.JLabel branca26;
    private javax.swing.JLabel branca27;
    private javax.swing.JLabel branca28;
    private javax.swing.JLabel branca29;
    private javax.swing.JLabel branca3;
    private javax.swing.JLabel branca30;
    private javax.swing.JLabel branca31;
    private javax.swing.JLabel branca32;
    private javax.swing.JLabel branca4;
    private javax.swing.JLabel branca5;
    private javax.swing.JLabel branca6;
    private javax.swing.JLabel branca7;
    private javax.swing.JLabel branca8;
    private javax.swing.JLabel branca9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel txtComidaObrigatoria;
    private javax.swing.JLabel vezDoJogador;
    // End of variables declaration//GEN-END:variables
}
