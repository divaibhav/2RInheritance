/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Oct-20
 *  Time: 11:11 AM
 */
package derived;

import base.Person;

public class Employee extends Person {
    private int empId;
    private long salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    /*public void display(){
        super.display();
        System.out.println(empId);
        System.out.println(salary);
    }*/
}
