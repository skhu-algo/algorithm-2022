package sinhyuk;

public class programmers67256 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] numberPositions = {{3, 1}, {0, 0}, {0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
        int[][] handPositions = {{3, 0}, {3, 2}};

        for (int number : numbers) {
            char usedHand = getUsedHand(numberPositions[number], handPositions, hand);
            moveHand(usedHand, numberPositions[number], handPositions);
            answer += usedHand;
        }
        return answer;
    }

    public char getUsedHand(int[] numberPosition, int[][] handPositions, String hand) {
        if (numberPosition[1] != 1) {
            return numberPosition[1] == 2 ? 'R' : 'L';
        }
        int leftToNumber = getDistance(numberPosition, handPositions[0]);
        int rightToNumber = getDistance(numberPosition, handPositions[1]);

        if (leftToNumber == rightToNumber) {
            return (hand.equals("right")) ? 'R' : 'L';
        }
        return (leftToNumber > rightToNumber) ? 'R' : 'L';
    }

    public int getDistance(int[] numberPosition, int[] handPosition) {
        return Math.abs(handPosition[0] - numberPosition[0]) + Math.abs(handPosition[1] - numberPosition[1]);
    }

    public void moveHand(char usedHand, int[] numberPosition, int[][] handPosition) {
        int handIndex = usedHand == 'L' ? 0 : 1;
        handPosition[handIndex][0] = numberPosition[0];
        handPosition[handIndex][1] = numberPosition[1];
    }
}
