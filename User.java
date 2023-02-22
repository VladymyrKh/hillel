package com.packag;

public class User {
    private String name;
    private int dayBirth;
    private String monthBirth;
    private int yearBirth;
    private String email;
    private String number;
    private String surname;

    private int weight;

    private int pressure;

    private int steps;

    private int age;

    public User(String name, int dayBirth, String monthBirth, int yearBirth, String email, String number, String surname, int weight, int pressure, int steps) {
        this.name = name;

        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;

        this.email = email;

        this.number = number;

        this.surname = surname;

        this.weight = weight;

        this.pressure = pressure;

        this.steps = steps;

        this.age = 2020 - yearBirth;

    }

    public String getName() {
        return name;

    }

    public int getDayBirth() {
        return dayBirth;
    }

    public String getMonthBirthBirth() {
        return monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setName(String userName) {
        name = userName;
    }

    public void setWeight(int userWeight) {
        weight = userWeight;
    }

    public void setPressure(int userPresure) {
        pressure = userPresure;
    }

    public void setSteps(int userSteps) {
        steps = userSteps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);

        System.out.println("Surname: " + surname);

        System.out.println("Birth  day: " + dayBirth);
        System.out.println("Birth  month: " + monthBirth);
        System.out.println("Birth  year: " + yearBirth);

        System.out.println("Age: " + age);

        System.out.println("Email: " + email);

        System.out.println("Phone: " + number);

        System.out.println("Weight: " + weight);

        System.out.println("Pressure: " + pressure);

        System.out.println("Steps: " + steps);
    }

    public static void main(String[] args) {
        User user1 = new User("Jon", 03, "April", 1991, "fhgjgj@gmail.com", "+35090909", "Jackson", 80, 110, 10000);
        User user2 = new User("Jack", 30, "September", 1987, "wwwwwqj@gmail.com", "+35965432909", "Smith", 69, 110, 12000);
        User user3 = new User("Lilli", 16, "January", 2000, "qwertwqj@gmail.com", "+35841234", "Parkinson", 46, 110, 14000);

        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();

        user1.setName("Bob");
        user1.setPressure(134);
        user1.setWeight(77);
        user1.setSteps(9000);
        System.out.println();

        user2.setName("Charlie");
        user2.setPressure(124);
        user2.setWeight(87);
        user2.setSteps(5000);

        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
    }

}

