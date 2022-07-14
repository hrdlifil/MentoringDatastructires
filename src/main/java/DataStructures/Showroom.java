package DataStructures;

import DataStructures.Applications.Car;

import java.math.BigDecimal;

public interface Showroom {
    // přijme pole aut, které vloží do spojového seznamu
    void init(Car[] cars);
    // projde spojový seznam a vypíše všechna auta
    void iterateList();
    // projde spojový seznam, najde auto s daným id a nastaví u něj property isActive na true
    void activateCar(Long id);
    // projde spojový seznam, najde auto s dnaným id a nastaví u něj property isActive na false
    void deactivateCar(Long id);
    // spočte cenu všech aut, které jsou ve spojovém seznamu a výsledek vrátí
    BigDecimal getPriceOfAllCars();
    // vrátí cenu auta s danným id
    BigDecimal getPriceById(Long id);
}
