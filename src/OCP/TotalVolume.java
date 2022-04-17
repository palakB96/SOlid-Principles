package OCP;

public class TotalVolume {

    double totalSum = 0;
    public double total(GeometryObjects[] Go)
    {

        for(GeometryObjects geometryObjects : Go)
        {
            totalSum = totalSum + geometryObjects.getVolume();
        }
        return totalSum;
    }
}
