package DataStructures.Applications;

import DataStructures.Implementation.DoubleLinkedListImpl;
import DataStructures.Showroom;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ShowroomImpl implements Showroom {
    private DoubleLinkedListImpl data;

    @Override
    public void init(Car[] cars) {
    }

    @Override
    public void iterateList() {

    }

    @Override
    public void activateCar(Long id) {

    }

    @Override
    public void deactivateCar(Long id) {

    }

    @Override
    public BigDecimal getPriceOfAllCars() {
        return null;
    }

    @Override
    public BigDecimal getPriceById(Long id) {
        return null;
    }
}
