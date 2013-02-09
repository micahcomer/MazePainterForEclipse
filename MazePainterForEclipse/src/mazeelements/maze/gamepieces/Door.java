package mazeelements.maze.gamepieces;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Door implements Externalizable{    
    public int id;
    
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
    }
}
