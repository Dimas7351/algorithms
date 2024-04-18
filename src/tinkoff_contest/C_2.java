package tinkoff_contest;

import java.util.*;

public class C_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Object> directories = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] path = scanner.nextLine().split("/");
            Map<String, Object> carry = directories;
            for (int j = 1; j < path.length; j++) {
                if (!carry.containsKey(path[j])) {
                    carry.put(path[j], new HashMap<>());
                }
                carry = (Map<String, Object>) carry.get(path[j]);
            }
        }

        showDir(directories, 0);
    }

    public static void showDir(Map<String, Object> directories, int indent) {
        List<String> sortedDirectories = new ArrayList<>(directories.keySet());
        Collections.sort(sortedDirectories);

        for (String directory : sortedDirectories) {
            System.out.print("  ".repeat(indent) + directory + "\n");
            if (directories.get(directory) instanceof Map) {
                showDir((Map<String, Object>) directories.get(directory), indent + 1);
            }
        }
    }
}

