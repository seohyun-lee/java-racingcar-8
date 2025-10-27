package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {
    // 레이싱 게임 실행
    public static void race(String[] cars, int rounds) {
        int[] moves = new int[cars.length];
        System.out.println("\n실행 결과");

        for (int i = 0; i < rounds; i++) {
            // 자동차 이동 기능
            for (int j = 0; j < cars.length; j++) {
                int rand = Randoms.pickNumberInRange(0, 9);
                if (rand >= 4) {
                    moves[j]++;
                }
                System.out.println(cars[j] + " : " + "-".repeat(moves[j]));
            }
            System.out.println();
        }

        String winners = findWinners(cars, moves);
        System.out.println("최종 우승자 : " + winners);
    }

    // 우승자 판별 기능
    private static String findWinners(String[] cars, int[] moves) {
        StringBuilder winners = new StringBuilder();
        int max = 0;
        for (int i = 0; i < cars.length; i++) {
            if (moves[i] > max) {
                max = moves[i];
                winners.setLength(0);
                winners.append(cars[i].trim());
            } else if (moves[i] == max) {
                winners.append(", ").append(cars[i].trim());
            }
        }
        return winners.toString();
    }
}
