package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        String[] cars = InputView.readCarNames();
        int rounds = InputView.readNumberOfRounds();
        Console.close();
    }
}