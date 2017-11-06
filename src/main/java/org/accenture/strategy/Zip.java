package org.accenture.strategy;

public class Zip implements Compressor {
  public Data compress(Data data) {
    return new Data("Zip - " + data.getData());
  }

}
