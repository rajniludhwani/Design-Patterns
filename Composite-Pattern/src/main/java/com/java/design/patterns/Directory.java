package com.java.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

  String name;
  List<FileSystem> fileSystemlist = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  public void add(FileSystem fs) {
    fileSystemlist.add(fs);
  }

  @Override
  public void Is() {
    System.out.println("Directory name " + name);
    for (FileSystem fileObj : fileSystemlist) {
      fileObj.Is();
    }
  }
}
