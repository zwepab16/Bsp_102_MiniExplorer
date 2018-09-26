
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;



public class FileListRenderer implements ListCellRenderer<Datei>{

    @Override
    public Component getListCellRendererComponent(JList<? extends Datei> jlist, Datei e, int i, boolean bln, boolean bln1) {
        JLabel c=new JLabel(e.toString());
          c.setOpaque(true);
          if(e.isDirectory()){
              c.setBackground(Color.DARK_GRAY);
              c.setForeground(Color.red);
          }
          else{
               c.setBackground(Color.GRAY);
              c.setForeground(Color.blue);
              
          }
          return c;
        
        
        
    }

   

}
