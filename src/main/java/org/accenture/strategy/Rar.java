package org.accenture.strategy;

public class Rar implements Compressor {
  public Data compress(Data data) {
    return new Data("RAR - " + data.getData());
  }

}
