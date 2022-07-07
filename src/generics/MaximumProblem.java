package generics;

import java.util.Scanner;

public class MaximumProblem
{

    public static void main(String[] darsh)
    {
        System.out.println("---------Find Maximum Problem using Generics-----------");
        Operation operation = new Operation();
        operation.getInputForInteger();
        operation.testMaximumInteger(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
        System.out.println(operation.max1+" is maximum amongst integer numbers");
        System.out.println("-----------------------------");
        operation.getInputForFloat();
        operation.testMaximumFloat(operation.number1,operation.number2,operation.number3);
        System.out.println(operation.max2+" is maximum amongst float numbers");
        System.out.println("-----------------------------");
    }

}
