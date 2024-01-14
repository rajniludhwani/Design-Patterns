package com.java.design.patterns;

public class Main {
    public static void main(String[] args) {
        Directory parentDir = new Directory("parentDir");
        FileSystem fileObj1 = new File("fileObj1");
        parentDir.add(fileObj1);

        Directory childDir = new Directory("childDir");
        FileSystem fileObj2 = new File("fileObj2");
        childDir.add(fileObj2);

        parentDir.add(childDir);

        parentDir.Is();

    }
}