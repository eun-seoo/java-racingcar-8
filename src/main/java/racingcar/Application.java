package racingcar;

import java.util.*;
import racingcar.domain.RacingGame;
import racingcar.domain.Winner;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        try {
            String carNames = InputView.readCarNames();
            List<String> carNameList = Arrays.asList(carNames.split(","));
            int tryCount = InputView.readTryCount();

            RacingGame racingGame = new RacingGame(carNameList, tryCount);
            racingGame.start();

            Winner winner = new Winner(racingGame.getCars());
            OutputView.printWinners(winner.getWinners());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
