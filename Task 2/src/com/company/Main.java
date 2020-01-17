package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	    2. Design a class User
        properties
            - username
            - password
            - role ( enum -> ADMIN, CUSTOMER)

        Password should contain at least one uppercase character at least 3 numbers and at least one
        special character (“#”, “!”, or “%”) . If password is not valid, do not set it to user

        Create 10 users in main,
        2 administrators and 8 customers
        Store them in an array

	 */

        User user1 = new User("Nathaniel Welch", "B#456popopo", Role.ADMIN);
        User user2 = new User("Cecil Brewer", "A!nitro123", Role.ADMIN);
        User user3 = new User("Jordan Ruiz", "A%tudut563", Role.CUSTOMER);
        User user4 = new User("Bobby Carpenter", "A#8749butterfly#", Role.CUSTOMER);
        User user5 = new User("Crystal Garrett", "A!umbrella457", Role.CUSTOMER);
        User user6 = new User("Lance Cook", "A!876close", Role.CUSTOMER);
        User user7 = new User("Cory May", "A!sun454", Role.CUSTOMER);
        User user8 = new User("Bonnie Bradley", "A!pol876", Role.CUSTOMER);
        User user9 = new User("Peyton Sims", "A%589mother", Role.CUSTOMER);
        User user10 = new User("Nelson Mitchell", "A!Earth7293", Role.CUSTOMER);

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        System.out.println("_______Presenting you our Admins and Costomers________" + "\n");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUsername() + " **** " + users.get(i).getRole() + " **** " + users.get(i).getPassword());
        }

    }
}
