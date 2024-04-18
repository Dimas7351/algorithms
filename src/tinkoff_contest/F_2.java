package tinkoff_contest;

import java.util.*;

public class F_2 {

    static final int MAX_N = 100;
    static final int INF = (int) 1e9;
    static int boardSize;
    static int[][][] distanceMatrix = new int[MAX_N][MAX_N][2];
    static String[] board;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = 1;
        // numTestCases = scanner.nextInt();
        while (numTestCases-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    static boolean inBoard(int x, int y) {
        return x >= 0 && y >= 0 && x < boardSize && y < boardSize;
    }

    static void bfs(int startX, int startY) {
        for (int i = 0; i < boardSize; ++i) {
            for (int j = 0; j < boardSize; ++j) {
                distanceMatrix[i][j][0] = distanceMatrix[i][j][1] = INF;
            }
        }
        distanceMatrix[startX][startY][1] = 0;
        PriorityQueue<Pair<Pair<Integer, Integer>, Pair<Integer, Integer>>> queue = new PriorityQueue<>(
                Comparator.comparing(p -> p.getKey().getKey()));
        queue.offer(new Pair<>(new Pair<>(0, 1), new Pair<>(startX, startY)));

        int[] dxG = {0, 0, 1, 1, 1, -1, -1, -1};
        int[] dyG = {1, -1, 0, 1, -1, 0, 1, -1};

        int[] dxK = {1, 1, 2, 2, -1, -1, -2, -2};
        int[] dyK = {2, -2, 1, -1, 2, -2, 1, -1};

        while (!queue.isEmpty()) {
            Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> current = queue.poll();
            int type = current.getKey().getValue();
            int posX = current.getValue().getKey();
            int posY = current.getValue().getValue();

            if (type == 0) {
                for (int i = 0; i < dxG.length; ++i) {
                    int newX = posX + dxG[i];
                    int newY = posY + dyG[i];
                    if (!inBoard(newX, newY)) {
                        continue;
                    }
                    int newType = 0;
                    if (board[newX].charAt(newY) == 'K') {
                        newType = 1;
                    }
                    if (distanceMatrix[newX][newY][newType] > distanceMatrix[posX][posY][type] + 1) {
                        queue.remove(new Pair<>(new Pair<>(distanceMatrix[newX][newY][newType], newType), new Pair<>(newX, newY)));
                        distanceMatrix[newX][newY][newType] = distanceMatrix[posX][posY][type] + 1;
                        queue.offer(new Pair<>(new Pair<>(distanceMatrix[newX][newY][newType], newType), new Pair<>(newX, newY)));
                    }
                }
            } else {
                for (int i = 0; i < dxK.length; ++i) {
                    int newX = posX + dxK[i];
                    int newY = posY + dyK[i];

                    if (!inBoard(newX, newY)) {
                        continue;
                    }
                    int newType = 1;
                    if (board[newX].charAt(newY) == 'G') {
                        newType = 0;
                    }

                    if (distanceMatrix[newX][newY][newType] > distanceMatrix[posX][posY][type] + 1) {
                        queue.remove(new Pair<>(new Pair<>(distanceMatrix[newX][newY][newType], newType), new Pair<>(newX, newY)));
                        distanceMatrix[newX][newY][newType] = distanceMatrix[posX][posY][type] + 1;
                        queue.offer(new Pair<>(new Pair<>(distanceMatrix[newX][newY][newType], newType), new Pair<>(newX, newY)));
                    }
                }
            }
        }
    }

    static void solve(Scanner scanner) {
        boardSize = scanner.nextInt();
        int startX = 0, startY = 0;
        int endX = 0, endY = 0;
        scanner.nextLine(); // Consume newline
        board = new String[boardSize];
        for (int i = 0; i < boardSize; ++i) {
            board[i] = scanner.nextLine();
            for (int j = 0; j < boardSize; ++j) {
                if (board[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                }
                if (board[i].charAt(j) == 'F') {
                    endX = i;
                    endY = j;
                }
            }
        }

        bfs(startX, startY);
        int minDistance = Math.min(distanceMatrix[endX][endY][0], distanceMatrix[endX][endY][1]);
        System.out.println(minDistance == INF ? -1 : minDistance);
    }
}
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return key.equals(pair.key) && value.equals(pair.value);
    }

    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}