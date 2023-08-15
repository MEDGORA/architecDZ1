package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Angle3D;
import Stuff.Color;
import Stuff.Point3D;

public class Flash {

    public List<Point3D> Location;
    public List<Angle3D> Angle = new ArrayList<>();
    public Color Color;
    public float Power;

    public Flash(List<Point3D> Location, List<Angle3D> Angle, Color Color, float Power){
        this.Location = Location;
        this.Angle = Angle;
        this.Color = Color;
        this.Power = Power;
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
