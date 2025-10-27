package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class OutputView {

    public static void printResultIntro() {
        System.out.println("\n실행 결과");
    }

    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            String name = car.getName();
            int position = car.getPosition();

            String moveSymbol = "-".repeat(position);
            System.out.println(name + " : " + moveSymbol);
        }
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
