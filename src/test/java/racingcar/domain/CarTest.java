package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void 자동차는_랜덤값이_4이상이면_전진한다() {
        Car car = new Car("pobi");
        car.moveIfPossible(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}