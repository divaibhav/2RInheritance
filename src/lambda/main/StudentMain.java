/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 27-Oct-20
 *  Time: 3:49 PM
 */
package lambda.main;

import lambda.databean.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Comparator rollNo = (o1, o2) -> {
            Student s1 = (Student) o1;
            Student s2= (Student) o2;
            return s1.getRollNo() - s2.getRollNo();
        };

        //new lambda expression to sort by name


        Student[] arr = new Student[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            arr[i].setName(sc.nextLine());
            arr[i].setRollNo(sc.nextInt());
            sc.nextLine();
        }
        System.out.println("arrays");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,rollNo );
        System.out.println(" sorted arrays");
        System.out.println(Arrays.toString(arr));

    }
}
