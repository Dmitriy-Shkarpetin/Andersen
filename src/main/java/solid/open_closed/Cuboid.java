package solid.open_closed;

/**
 * Все геометрические объекты имеют набор размеров и метод getVolume (оба метода различны для каждого типа объекта).
 */
class Cuboid extends GeoObjects {

    public double length;
    public double breadth;
    public double height;

    @Override
    public double getVolume() {
        return length * breadth * height;
    }
}

