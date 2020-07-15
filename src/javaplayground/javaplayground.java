public class javaplayground {

    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(isEmployee(manager));
    }

    //Returns true if the given object is an Employee object or a subclass of it.
    static boolean isEmployee(Object o) {
        return o instanceof Employee;
    }
        
    static boolean isManager(Object o) {
    //Returns true if the given object is a Manager object.
        return o instanceof Manager;
    }
        
    static boolean isCustomer(Object o) {
    //Returns true if the given object is a Customer object.
        return o instanceof Customer;
    }
        
    static boolean isComparable(Object o) { 
    //Returns true if the class of the given object implements the Comparable interface.
        return o instanceof Comparable;
    }

}

class User /*implements Comparable, Cloneable*/ {
}

class Employee extends User {
}

class Manager extends Employee {
}

class Customer extends User {
}

