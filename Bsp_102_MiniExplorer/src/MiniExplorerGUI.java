
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class MiniExplorerGUI extends javax.swing.JFrame {

    private DateiModell model = new DateiModell();

    private File dir = new File(".");

    public MiniExplorerGUI() {
        initComponents();

        model.add(new Datei(".."));
        for (File f : dir.listFiles()) {

            model.add(new Datei(f.getAbsolutePath()));

        }
        model.sort();
        this.setTitle(dir.getAbsolutePath());
        
        dir = new File(dir.getAbsolutePath());
        list.setModel(model);
          list.setCellRenderer(new FileListRenderer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        try {

            if (evt.getClickCount() > 1) {

                Datei d = (Datei) model.getFile(list.getSelectedIndex());

                if (d.getName().equals("..") && dir.getParent() != null) {

                    dir = dir.getParentFile();

                    model.clear();
                    model.add(new Datei(".."));
                    for (File f : dir.listFiles()) {

                        model.add(new Datei(f.getAbsolutePath()));

                    }
                    model.sort();
                    this.setTitle(dir.getAbsolutePath());

                }

                if (model.getFile(list.getSelectedIndex()).isDirectory()) {

                    dir = new File(dir.getAbsolutePath() + "//" + model.getFile(list.getSelectedIndex()).getName());
                    model.clear();
                    model.add(new Datei(".."));

                    for (File f : dir.listFiles()) {

                        model.add(new Datei(f.getAbsolutePath()));

                    }
                    model.sort();
                    this.setTitle(dir.getAbsolutePath());

                } else {
                    System.out.println("File nicht aufmachbar!");
                }
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_listMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniExplorerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Datei> list;
    // End of variables declaration//GEN-END:variables
}
