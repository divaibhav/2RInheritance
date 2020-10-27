/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 22-Oct-20
 *  Time: 11:40 AM
 */
package main;

import base.Person;
import derived.Employee;
import derived.Student;

public class MyMain {
    public static void main(String[] args) {
        Person obj = new Student("vaibhav","diva",11,"BE",4,7);
        obj.display();


        Person emp = new Employee();
        emp.display();
    }
}
