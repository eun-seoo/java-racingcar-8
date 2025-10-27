package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import racingcar.random.RandomUtils;
import racingcar.view.OutputView;

public class RacingGame {

    private List<Car> cars;
    private int tryCount;

    public RacingGame(List<String> carNames, int tryCount) {
        this.tryCount = tryCount;
        cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public void start() {
        OutputView.printResultIntro();
        for (int i = 0; i < tryCount; i++) {
            moveCarsOnce();
            OutputView.printRoundResult(cars);
            System.out.println();
        }
    }

    public void moveCarsOnce() {
        for (Car car : cars) {
            int randomNumber = RandomUtils.generateNumber();
            car.moveIfPossible(randomNumber);
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
