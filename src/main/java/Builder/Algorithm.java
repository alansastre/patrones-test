package Builder;

public class Algorithm {
  private String name;
  private int maximumNumbersOfEvaluations;
  private int maximumComputingTime;
  private int memoryRequirement;
  private String operator;


  public Algorithm(String name, int maximumNumbersOfEvaluations, int maximumComputingTime,
      int memoryRequirement, String operator) {
    this.name = name;
    this.maximumNumbersOfEvaluations = maximumNumbersOfEvaluations;
    this.maximumComputingTime = maximumComputingTime;
    this.memoryRequirement = memoryRequirement;
    this.operator = operator;
  }
}
