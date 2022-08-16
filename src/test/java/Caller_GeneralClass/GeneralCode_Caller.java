package Caller_GeneralClass;

import org.testng.annotations.Test;

import GeneralCode.AddtionTwoNumbers;

public class GeneralCode_Caller {
  @Test
  public void Additon() {
	int a =   AddtionTwoNumbers.Add(20, 30);
	System.out.println(a);
  }
}
