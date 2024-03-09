package com.java.design.patterns;

public class File implements FileSystem {

  String name;

  public File(String name) {
    this.name = name;
  }

  @Override
  public void Is() {
    System.out.println("File name " + name);
  }
}
