package OCP;

public class Cuboid extends GeometryObjects {

    public double length;
    public double height;
    public double breadth;
    public double volume;

    public Cuboid(double length, double height, double breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public double getVolume() {
        volume = length * breadth * height;
        return volume;
    }
}
