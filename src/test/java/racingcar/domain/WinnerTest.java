package racingcar.domain;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {

    //우승자 판별 기능
    @Test
    void 단독_우승자() {
        List<Car> cars = List.of(
                new Car("pobi", 5),
                new Car("woni", 3),
                new Car("jun", 2)
        );

        Winner winner = new Winner(cars);

        assertThat(winner.getWinners())
                .containsExactly("pobi");
    }

    @Test
    void 공동_우승자인_경우_모두_포함해야_한다() {
        List<Car> cars = List.of(
                new Car("pobi", 5),
                new Car("woni", 5),
                new Car("jun", 2)
        );

        Winner winner = new Winner(cars);

        assertThat(winner.getWinners())
                .containsExactly("pobi", "woni");
    }

    @Test
    void 모두_같은_위치인_경우_전원_우승자() {
        List<Car> cars = List.of(
                new Car("pobi", 5),
                new Car("woni", 5),
                new Car("jun", 5)
        );

        Winner winner = new Winner(cars);

        assertThat(winner.getWinners())
                .containsExactly("pobi", "woni", "jun");

    }

}
