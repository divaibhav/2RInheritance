/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 27-Oct-20
 *  Time: 3:35 PM
 */
package lambda.main;

import lambda.myinterface.MyFunctionalInterface;

public class MyMain {
    public static void main(String[] args) {
        //we will write lambda expression
        MyFunctionalInterface reference = (x,y) -> {
            return x + y;
        };
        int result = reference.operation(10,20);
        System.out.println("result = " + result);
    }
}
