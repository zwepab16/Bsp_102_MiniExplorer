
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


public class Datei extends File{
protected String str;


    public Datei(String string) {
        super(string);
       
    }
    public String toString(){
        
       return this.getName();
    }
    
  

}
