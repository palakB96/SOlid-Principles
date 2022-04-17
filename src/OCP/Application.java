package OCP;

public class Application {
    public static void main(String args[]) {
        Cuboid cuboid1 = new Cuboid(2, 3, 4);
        Cuboid cuboid2 = new Cuboid(8, 9, 7);
        Cube cube1 = new Cube(2);
        Cube cube2 = new Cube(3);
        GeometryObjects[] geometryObjects = new GeometryObjects[4];
        geometryObjects[0] = cuboid1;
        geometryObjects[1] = cuboid2;
        geometryObjects[2] = cube1;
        geometryObjects[3] = cube2;
        TotalVolume totalVolume = new TotalVolume();
        System.out.print(totalVolume.total(geometryObjects));

    }
}
