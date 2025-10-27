package racingcar.domain;

import racingcar.exception.InvalidCarNameException;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    // 테스트용 생성자
    public Car(String name, int position) {
        validateName(name);
        this.name = name;
        this.position = position;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidCarNameException("자동차 이름은 비어있을 수 없습니다.");
        }
        if (name.length() > 5) {
            throw new InvalidCarNameException("자동차 이름은 5자 이하여야 합니다.");
        }
    }

    public void moveIfPossible(int randomNumber) {
        if (randomNumber >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}