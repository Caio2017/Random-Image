/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomimage;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author CAIO
 */
public class Carros2 extends javax.swing.JFrame {

    int i = 0;
    String[] namesImages;
    
    public Carros2() {
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

        lblImagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSortear = new javax.swing.JButton();
        btnRemoverImagem = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("transporte random v0.1 caio");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setText("imagem");
        lblImagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vai andar de quê?");

        btnSortear.setText("?");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        btnRemoverImagem.setText("X");
        btnRemoverImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverImagemActionPerformed(evt);
            }
        });

        jProgressBar1.setMaximum(150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSortear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemoverImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSortear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                    .addComponent(btnRemoverImagem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(379, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        if(!timer.isRunning())
            timer.start();

    }//GEN-LAST:event_btnSortearActionPerformed

    private void btnRemoverImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverImagemActionPerformed
        if(timer.isRunning()){
            timer.stop();
        }else{
            lblImagem.setIcon(null);
            jProgressBar1.setValue(i = 0);
        }
    }//GEN-LAST:event_btnRemoverImagemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        namesImages = getPackageFileNamesJar("randomimage.imgcarros");        
        if(namesImages.length < 1)                   
            namesImages = getPackageFileNames("randomimage.imgcarros");
        
    }//GEN-LAST:event_formWindowOpened

    //Obtêm todos nomes de arquivos que está em determinado pacote (FUNCIONAL SOMENTE quando abrir pelo JAR)
    private String[] getPackageFileNamesJar(String nomeDoPacote)
    {
        nomeDoPacote = nomeDoPacote.replace(".", "/");
        ArrayList<String> nameFiles = new ArrayList<String>();
        CodeSource src = getClass().getProtectionDomain().getCodeSource();
        if (src != null) {
            ZipInputStream zip = null;
            try {
                URL jar = src.getLocation();
                zip = new ZipInputStream(jar.openStream());
                while(true) {
                    ZipEntry e = zip.getNextEntry();
                    if (e == null)
                        break;
                    String name = e.getName();
                    System.out.println(e.getName());
                    if (name.startsWith(nomeDoPacote) && (name.endsWith(".jpg") || name.endsWith(".png") || name.endsWith(".img")|| name.endsWith(".gif"))) {
                        nameFiles.add(name.substring(name.lastIndexOf("/") + 1));                        
                    }
                }  } catch (IOException ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    zip.close();
                } catch (IOException ex) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                }
            }
       } 
       else {
         /* Fail... */
       }
       return nameFiles.toArray(new String[0]);
    }
    
    //Obtêm todos nomes de arquivos que está em determinado pacote (FUNCIONAL SOMENTE DEBUG)
    private String[] getPackageFileNames(String nomeDoPacote)
    {
        //se o pacote nao estiver dentro de outro pacote adicionar o "/" para voltar a pasta
        nomeDoPacote = nomeDoPacote.contains(".") ? nomeDoPacote.substring(nomeDoPacote.indexOf('.')+1) : "/"+nomeDoPacote;
        
        //Pego o caminho do pacote (pasta)
        String caminhoPasta = getClass().getResource(nomeDoPacote).getFile();//(obs: "/imgcarros")
        
        File file = new File(caminhoPasta); 

        //pego todos arquivos que contem dentro da pasta
        File[] files = file.listFiles(); 
        //armazeno cada nome no array
        
        ArrayList<String> nameFiles = new ArrayList<String>();
        for (File f : files)  
        {             
            nameFiles.add(f.getName());
        } 
        nameFiles.remove("photothumb.db");
        return nameFiles.toArray(new String[0]);
    }
    
    //Carrega uma imagem que está dentro do pacote do pacote na label
    private void loadPackageImageIntoLabel(JLabel lblImagem, String nomeDoPacote, String nomeDaImagem)
    {   //se contem 'ponto' sei que está dentro de outro pacote
        if(nomeDoPacote.contains("."))
        {
            //pego o nome depois do .
            nomeDoPacote =  nomeDoPacote.substring(nomeDoPacote.indexOf('.')+1);
        }
        else
        {   //adiciona uma barra para voltar a pasta
            nomeDoPacote = "/"+nomeDoPacote;
        }
        
        Image troca = Toolkit.getDefaultToolkit().getImage(getClass().getResource(nomeDoPacote+"/"+nomeDaImagem)); //"Imagens/Chrysanthemum.jpg"
        ImageIcon icone = new ImageIcon(troca);        
        icone.setImage(troca.getScaledInstance(lblImagem.getWidth(),lblImagem.getHeight(),Image.SCALE_FAST));
        //Largura, Altura, tipo de escala
        lblImagem.setIcon(icone);  
    }    
    
    public static byte[] getBytes(String resource) throws IOException {  
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();  
        InputStream input = Object.class.getResourceAsStream(resource);  
        int max = 4096;  
        byte[] buffer = new byte[max];  
        for (int lidos = -1; (lidos = input.read(buffer, 0, max)) != -1; bytes.write(buffer, 0, lidos)) {}  
        return bytes.toByteArray();  
    }
    
    //Inicio Timer
    private javax.swing.Timer timer = new javax.swing.Timer(1, new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent e){
            //random number
            int n = (int)(Math.random() * namesImages.length); //0 - 18          
            loadPackageImageIntoLabel(lblImagem, "randomimage.imgcarros", namesImages[n]); 

            jProgressBar1.setValue(i); 
            //auto stop timer gradually
            i += 2;
            timer.setDelay(i);
            if(i > 150)
            {
                timer.stop();
                i = 0;
                
            } 
        }     
    });
    //Fim Timer  
    
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
            java.util.logging.Logger.getLogger(Carros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carros2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carros2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoverImagem;
    private javax.swing.JButton btnSortear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}
