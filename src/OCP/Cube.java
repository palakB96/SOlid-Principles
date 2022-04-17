package OCP;

public class Cube extends GeometryObjects
{
    public double length;
    public double volume;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double getVolume() {
        volume = Math.pow(length,3);
        return volume;
    }
}
