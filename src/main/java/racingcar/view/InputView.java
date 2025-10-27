package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String[] readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] cars = Console.readLine().split(",");
        // 글자수 검증
        for (String name : cars) {
            String trimmed = name.trim();
            if (trimmed.isEmpty() || trimmed.length() > 5)
                throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다: " + trimmed);
        }
        return cars;
    }

    public static int readNumberOfRounds() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        int number = Integer.parseInt(Console.readLine().trim());
        if (number <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야 합니다.");
        }
        return number;
    }
}
