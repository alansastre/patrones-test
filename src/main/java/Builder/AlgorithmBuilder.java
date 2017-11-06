package Builder;

public class AlgorithmBuilder {
  private String name;
  private int maximumNumbersOfEvaluations;
  private int maximumComputingTime;
  private int memoryRequirement;
  private String operator;
  
  public AlgorithmBuilder(){
  }
  
  public AlgorithmBuilder setName(String name) {
    this.name = name;
    return this;
  }
  
  public AlgorithmBuilder setMaximumNumbersOfEvaluations(int maximumNumbersOfEvaluations) {
    this.maximumNumbersOfEvaluations = maximumNumbersOfEvaluations;
    return this;
  }
  
  public AlgorithmBuilder setMaximumComputingTime(int maximumComputingTime) {
    this.maximumComputingTime = maximumComputingTime;
    return this;
  }
  
  public AlgorithmBuilder setmemoryRequirement(int memoryRequirement) {
    this.memoryRequirement = memoryRequirement;
    return this;
  }
  
  public AlgorithmBuilder setOperator(String operator) {
    this.operator = operator;
    return this;
  }
  
  public Algorithm build() {
    return new Algorithm(name, maximumNumbersOfEvaluations, maximumComputingTime, memoryRequirement, operator);
  }
}
