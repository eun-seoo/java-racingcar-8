package racingcar.domain;

import java.util.List;

public class Winner {

    private List<Car> winners;

    public Winner(List<Car> cars) {
        int maxPosition = findMaxPosition(cars);
        this.winners = extractWinners(cars, maxPosition);
    }

    private int findMaxPosition(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }

    private List<Car> extractWinners(List<Car> cars, int maxPosition) {
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
    }

    public List<String> getWinners() {
        return winners.stream()
                .map(Car::getName)
                .toList();
    }
}



