package solid.open_closed;

/**
 * Класс не зависит от типа фигуры, значит его не придется изменять при добавлении расчета оббъема еще какой либо
 * геометрической фигуры
 */
public class Application {

    public double
    getTotalVolume(GeoObjects[] geoObjects) {

        double volSum = 0;

        for (GeoObjects geoObj : geoObjects) {
            volSum += geoObj.getVolume();
        }

        return volSum;
    }
}

