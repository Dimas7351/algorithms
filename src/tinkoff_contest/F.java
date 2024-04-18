package tinkoff_contest;

import java.util.*;

public class F {
    static int n;
    static char[][] board;
    static int[] start, end;

    static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1]});
        Set<String> visited = new HashSet<>();
        visited.add(Arrays.toString(start));
        int dist = 0;
        int[][] direction = {
                {-2, -1}, {-1, -2}, {1, -2}, {2, -1},
                {2, 1}, {1, 2}, {-1, 2}, {-2, 1}
        };

        while (!queue.isEmpty()) {
            dist++;
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] pos = queue.poll();
                int cur_i = pos[0];
                int cur_j = pos[1];
                for (int[] dir : direction) {
                    int i = cur_i + dir[0];
                    int j = cur_j + dir[1];
                    if (i < 0 || i >= n || j < 0 || j >= n || visited.contains(Arrays.toString(new int[]{i, j}))) {
                        continue;
                    }
                    if (i == end[0] && j == end[1]) {
                        return dist;
                    } else if (board[i][j] != '.' && board[i][j] != 'S') {
                        queue.offer(new int[]{i, j});
                        visited.add(Arrays.toString(new int[]{i, j}));
                    } else {
                        queue.offer(new int[]{i, j});
                        visited.add(Arrays.toString(new int[]{i, j}));
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String row = scanner.next();
            for (int j = 0; j < n; j++) {
                board[i][j] = row.charAt(j);
                if (board[i][j] == 'S') {
                    start = new int[]{i, j};
                } else if (board[i][j] == 'F') {
                    end = new int[]{i, j};
                }
            }
        }

        int result = bfs();
        System.out.println(result);
    }
}
