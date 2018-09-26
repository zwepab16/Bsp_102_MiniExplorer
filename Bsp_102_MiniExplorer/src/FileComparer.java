
import java.util.ArrayList;
import java.util.Collections;

public class FileComparer {

    private ArrayList<Datei> ordner = new ArrayList<Datei>();
    private ArrayList<Datei> files = new ArrayList<Datei>();

    public ArrayList order(ArrayList<Datei> list) {
        for (Datei d : list) {
            if (d.isDirectory()) {
                ordner.add(d);
            } else {
                files.add(d);

            }
            
        }
      Collections.sort(ordner);
        Collections.sort(files);
        ordner.addAll(files);
        return ordner;
    }
}
