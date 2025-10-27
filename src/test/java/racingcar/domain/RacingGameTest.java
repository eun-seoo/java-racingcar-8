package racingcar.domain;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @Test
    void 자동차_이름_목록으로_Car_객체들을_생성한다() {
        List<String> names = List.of("pobi", "woni", "jun");
        RacingGame racingGame = new RacingGame(names, 5);
        assertThat(racingGame.getCars()).hasSize(3);
        assertThat(racingGame.getCars())
                .extracting("name")
                .containsExactly("pobi", "woni", "jun");
    }

    @Test
    void 자동차들은_시도횟수만큼_이동한다() {
        List<String> names = List.of("pobi");
        RacingGame racingGame = new RacingGame(names, 3);
        racingGame.start();
        assertThat(racingGame.getCars().get(0).getPosition())
                .isBetween(0, 3);
    }

    @Test
    void 이동_결과가_저장된다() {
        List<String> names = List.of("pobi", "woni");
        RacingGame racingGame = new RacingGame(names, 2);
        racingGame.start();
        List<Car> cars = racingGame.getCars();
        for (Car car : cars) {
            assertThat(car.getPosition()).isGreaterThanOrEqualTo(0);
        }
    }
}
