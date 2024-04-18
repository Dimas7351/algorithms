package tinkoff_contest;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C {



        public static Directory buildDirectoryStructure(String[] directories) {
            Directory root = null;
            for (String directory : directories) {
                String[] parts = directory.split("/");
                if (root == null) {
                    root = new Directory(parts[0]);
                }
                Directory currentDir = root;
                for (int i = 1; i < parts.length; i++) {
                    if (parts[i].isEmpty()) {
                        continue;
                    }
                    currentDir.subdirectories.putIfAbsent(parts[i], new Directory(parts[i]));
                    currentDir = currentDir.subdirectories.get(parts[i]);
                }
            }
            return root;
        }

        public static void printDirectories(Directory directory, int indent) {
            if (directory == null) {
                return;
            }
            System.out.println(" ".repeat(indent) + directory.name);
            for (Directory subdirectory : directory.subdirectories.values()) {
                printDirectories(subdirectory, indent + 2);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            String[] directories = new String[n];
            for (int i = 0; i < n; i++) {
                directories[i] = scanner.nextLine();
            }

            Directory directoryStructure = buildDirectoryStructure(directories);
            printDirectories(directoryStructure, 0);
        }


    static class Directory {
        String name;
        Map<String, Directory> subdirectories;

        Directory(String name) {
            this.name = name;
            this.subdirectories = new TreeMap<>();
        }
    }
    }

