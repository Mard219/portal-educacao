/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDeProvas;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import ssh.SSH;

/**
 *
 * @author umcan
 */
public class Modelo extends javax.swing.JPanel {

    /**
     * Creates new form Modelo
     */
    public Modelo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Topo = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        container = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        BotaoNovoArquivo = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        BotaoAtualizaCarometro = new javax.swing.JButton();

        Topo.setBackground(new java.awt.Color(1, 87, 155));

        jToolBar1.setBackground(new java.awt.Color(1, 87, 155));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        javax.swing.GroupLayout TopoLayout = new javax.swing.GroupLayout(Topo);
        Topo.setLayout(TopoLayout);
        TopoLayout.setHorizontalGroup(
            TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopoLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopoLayout.setVerticalGroup(
            TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopoLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setMaximumSize(new java.awt.Dimension(1024, 516));
        Home.setMinimumSize(new java.awt.Dimension(1024, 516));
        Home.setLayout(null);

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(0, 102, 255));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Modelos de Provas e Trabalhos");
        Home.add(LabelTitulo);
        LabelTitulo.setBounds(0, 29, 1024, 44);

        BotaoNovoArquivo.setBackground(new java.awt.Color(255, 255, 255));
        BotaoNovoArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modeloDeProvas/botaoNovoArquivo.PNG"))); // NOI18N
        BotaoNovoArquivo.setBorder(null);
        BotaoNovoArquivo.setBorderPainted(false);
        BotaoNovoArquivo.setContentAreaFilled(false);
        BotaoNovoArquivo.setFocusPainted(false);
        BotaoNovoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoArquivoActionPerformed(evt);
            }
        });
        Home.add(BotaoNovoArquivo);
        BotaoNovoArquivo.setBounds(210, 130, 206, 44);

        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modeloDeProvas/botaoEditar.PNG"))); // NOI18N
        BotaoExcluir.setBorder(null);
        BotaoExcluir.setBorderPainted(false);
        BotaoExcluir.setContentAreaFilled(false);
        BotaoExcluir.setFocusPainted(false);
        BotaoExcluir.setFocusable(false);
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });
        Home.add(BotaoExcluir);
        BotaoExcluir.setBounds(530, 130, 270, 45);

        BotaoAtualizaCarometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modeloDeProvas/botaoAtualizaCarometro.PNG"))); // NOI18N
        BotaoAtualizaCarometro.setBorderPainted(false);
        BotaoAtualizaCarometro.setContentAreaFilled(false);
        BotaoAtualizaCarometro.setFocusPainted(false);
        BotaoAtualizaCarometro.setFocusable(false);
        BotaoAtualizaCarometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtualizaCarometroActionPerformed(evt);
            }
        });
        Home.add(BotaoAtualizaCarometro);
        BotaoAtualizaCarometro.setBounds(330, 210, 290, 51);

        container.add(Home, "Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Topo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void EscondeOuInsereComponentes(boolean define) {
            BotaoExcluir.setVisible(define);
            BotaoNovoArquivo.setVisible(define);
            BotaoAtualizaCarometro.setVisible(define);
            LabelTitulo.setVisible(define);       
    }
    
    private void BotaoNovoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoArquivoActionPerformed
        File pastaCarometro = new File("C:/carometro");

        if(pastaCarometro.exists() == false) {
            EscondeOuInsereComponentes(false);
            LabelTitulo.setText("Baixando arquivos necessários. Aguarde...");
            LabelTitulo.setVisible(true);
            revalidate();
            repaint();

            JOptionPane.showMessageDialog(null, "Baixando arquivos necessários. Aguarde...");

            SSH.baixarDiretorio("cefet-inf-2015.ddns.net", "root", "apenasinf-2015", "/carometro", "C:/");

            File[] fotos = pastaCarometro.listFiles();
            for (int i = 0; i < fotos.length; i++) {

                if (fotos[i].isFile()) {
                    BufferedImage imagem = null;
                    try {
                        imagem = ImageIO.read(new File(fotos[i].getPath().replace("\\", "/")));
                        } catch (IOException ex) {
                            //Logger.getLogger(ImagePanel2.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        BufferedImage new_img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
                        Graphics2D g2 = new_img.createGraphics();
                        g2.drawImage(imagem, 0, 0, 100, 100, null);
                        try {
                            ImageIO.write(new_img, "JPG", new File(fotos[i].getPath()));
                        } catch (IOException ex) {
                            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }

            PainelNovoArquivo painelNovoArq = new PainelNovoArquivo();

            EscondeOuInsereComponentes(false);
            Home.revalidate();

            painelNovoArq.setBounds(Home.getBounds());
            Home.add(painelNovoArq);
            Home.revalidate();
            Home.repaint();
    }//GEN-LAST:event_BotaoNovoArquivoActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        Home.removeAll();
        Home.revalidate();
        Home.repaint();
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoAtualizaCarometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizaCarometroActionPerformed
        File pastaCarometro = new File("C:/carometro");

        EscondeOuInsereComponentes(false);
        LabelTitulo.setText("Baixando arquivos necessários. Aguarde...");
        LabelTitulo.setVisible(true);
        revalidate();
        repaint();

        JOptionPane.showMessageDialog(null, "Baixando arquivos necessários. Aguarde...");

        SSH.baixarDiretorio("cefet-inf-2015.ddns.net", "root", "apenasinf-2015", "/carometro", "C:/");

        File[] fotos = pastaCarometro.listFiles();
        for (int i = 0; i < fotos.length; i++) {

            if (fotos[i].isFile()) {
                BufferedImage imagem = null;
                try {
                    imagem = ImageIO.read(new File(fotos[i].getPath().replace("\\", "/")));
                    } catch (IOException ex) {
                        //Logger.getLogger(ImagePanel2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    BufferedImage new_img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
                    Graphics2D g2 = new_img.createGraphics();
                    g2.drawImage(imagem, 0, 0, 100, 100, null);
                    try {
                        ImageIO.write(new_img, "JPG", new File(fotos[i].getPath()));
                    } catch (IOException ex) {
                        Logger.getLogger(PainelNovoArquivo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            LabelTitulo.setText("Modelos de provas e trabalhos");
            EscondeOuInsereComponentes(true);
            revalidate();
            repaint();
    }//GEN-LAST:event_BotaoAtualizaCarometroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAtualizaCarometro;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoNovoArquivo;
    private javax.swing.JPanel Home;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JPanel Topo;
    private javax.swing.JPanel container;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}