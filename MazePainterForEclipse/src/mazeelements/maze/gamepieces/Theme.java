package mazeelements.maze.gamepieces;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Theme implements Externalizable{
    
    public int id;
    public String name;    

    
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);        
        out.writeObject(name);
     
    }

    
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();        
        name = (String) in.readObject();
     
        
        
    }
}
