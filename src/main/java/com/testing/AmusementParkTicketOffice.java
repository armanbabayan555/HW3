package com.testing;

public class AmusementParkTicketOffice {

    final int singlePrice = 50;
    final int familyPrice = 70;
    final int childPrice = 10;
    final int elderlyPrice = 15;
    int familyBudget = 210;
    int age;
    String ticketType;

    public AmusementParkTicketOffice(int age) {
        this.age = age;
    }

    public AmusementParkTicketOffice() {

    }

    public String buyChildTicket() {
        if (familyBudget >= childPrice) {
            if (age < 1) {
                return "Impossible age for a child!";
            } else if (age >= 1 && age <= 12) {
                familyBudget = familyBudget - childPrice;
                return ticketType = "Child ticket bought!";
            } else {
                return "Older than 12!";
            }
        }
        return "You don't have enough money";
    }

    // Please note that nobody will be against if an elderly or child person decides to buy a single ticket instead of an elderly ticket as it is good for business!
    public String buySingleTicket() {
        if (familyBudget >= singlePrice) {
            if (age < 1) {
                return "Impossible age!";
            } else if (age > 100) {
                return "Why do you need to go to an amusement park if you're older than 100? Stay at home!";
            } else {
                familyBudget = familyBudget - singlePrice;
                return ticketType = "Single Ticket bought!";
            }
        }
        return "You don't have enough money";
    }


    public String spendTheBudgetOnFamilyTickets() {
        int k = 0;
        while (familyBudget != 0) {
            familyBudget = familyBudget - familyPrice;
            k++;
        }
        return "Your budget was enough for " + k + " tickets.";
    }

    public String buyElderlyTicket() {
        if (familyBudget >= elderlyPrice) {
            if (age > 55) {
                familyBudget = familyBudget - elderlyPrice;
                return ticketType = "Elderly Ticket bought!";
            } else if (age < 1) {
                return "Impossible age!";
            } else {
                return "You do not qualify for an elderly ticket!";
            }
        }
        return "You don't have enough money";
    }

    public boolean isBudgetZero() {
        return familyBudget == 0;
    }
}
