package racingcar.random;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomUtils {
    public static int generateNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
