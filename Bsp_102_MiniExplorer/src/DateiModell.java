
import java.io.File;
import java.util.ArrayList;
import javafx.print.Collation;
import javax.swing.AbstractListModel;



public class DateiModell extends AbstractListModel{
private ArrayList<Datei> dateien =new ArrayList<>();
    @Override
    public int getSize() {
    return dateien.size();
    }

    @Override
    public Object getElementAt(int i) {
    return dateien.get(i);
    }
    public void add(Datei d){
        dateien.add(d);
        fireIntervalAdded(this, dateien.size()-1, dateien.size()-1);
    }
    public void sort(){
  dateien=new FileComparer().order(dateien);
       
    }
    public void  clear(){
        
      dateien.clear();
        fireIntervalRemoved(this,0,0);
    }
    public File getFile(int i){
        return dateien.get(i);
    }
  
   
   
}
