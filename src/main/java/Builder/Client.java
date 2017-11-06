package Builder;

public class Client {
  private Algorithm algorithm1;
  private Algorithm algorithm2;
  
  public Client() {
    algorithm1 = new Algorithm("QuickSort", 10, 10, 20, "Sum");
    
    algorithm2 = new AlgorithmBuilder()
        .setName("MergeSort")
        .setMaximumNumbersOfEvaluations(10)
        .setmemoryRequirement(10)
        .setOperator("Sum")
        .build(); 
  }
}
