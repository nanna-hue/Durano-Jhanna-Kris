import java.util.Scanner;
import java.util.InputMismatchException;

public class Attributes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter first name: ");
        person.setFirstName(sc.nextLine());

        System.out.print("Enter middle name: ");
        person.setMiddleName(sc.nextLine());

        System.out.print("Enter last name: ");
        person.setLastName(sc.nextLine());

        while (true) {
            System.out.print("Enter age: ");
            if (sc.hasNextInt()) {
                int age = sc.nextInt();
                if (age >= 0) {
                    person.setAge(age);
                    break;
                } else {
                    System.out.println("Invalid! Please enter a non-negative age.");
                }
            } else {
                System.out.println("Invalid! Please enter a valid age.");
                sc.next();
            }
        }
                
        sc.nextLine();
        
        int day, month, year;

        while (true) {
            try {
                System.out.print("Enter Birthday: ");
                day = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Birthmonth: ");
                month = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Birthyear: ");
                year = sc.nextInt();
                sc.nextLine();

                if (isValidDate(day, month, year)) {
                    break;
                } else {
                    System.out.println("Invalid! Please enter a valid date.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid! Please enter valid day, month, and year.");
                sc.nextLine();
            }
        }

        person.setBirthday(year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day));
        
        System.out.print("Enter address: ");
        person.setAddress(sc.nextLine());

        sc.close();

        System.out.println("\nFirst Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Birthday: " + person.getBirthday());
        System.out.println("Address: " + person.getAddress());
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            return false;
        }
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }
        return true;
    }
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
