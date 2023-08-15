package ModelElements;

import java.util.List;

import Stuff.Angle3D;
import Stuff.Point3D;

public class Camera {

    public List<Point3D> Location;
    public List<Angle3D> Angle;

    public Camera(List<Point3D> Location, List<Angle3D> Angle){
        this.Location = Location;
        this.Angle = Angle;
    }

    public void Rotade(List<Angle3D> Angle3D) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }

    public void Move(List<Point3D> Point3D) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }
}
