import com.testing.AmusementParkTicketOffice;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TicketOfficeTest {

    @Test
    public void childTicketPurchaseTest() {
        AmusementParkTicketOffice fourYearOld = new AmusementParkTicketOffice(4);
        AmusementParkTicketOffice newBorn = new AmusementParkTicketOffice(0);
        AmusementParkTicketOffice teenager = new AmusementParkTicketOffice(13);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(fourYearOld.buyChildTicket(), "Child ticket bought!", "The age was wrong!");
        softAssert.assertEquals(newBorn.buyChildTicket(), "Impossible age for a child!", "The age was wrong!");
        softAssert.assertEquals(teenager.buyChildTicket(), "Older than 12!", "The age was wrong!");
        softAssert.assertAll();
    }

    @Test
    public void singleTicketPurchaseTest() {
        AmusementParkTicketOffice teenager = new AmusementParkTicketOffice(18);
        AmusementParkTicketOffice newBorn = new AmusementParkTicketOffice(0);
        AmusementParkTicketOffice oneLegHereOneLegThere = new AmusementParkTicketOffice(101);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(teenager.buySingleTicket(), "Single Ticket bought!", "The age was wrong!");
        softAssert.assertEquals(newBorn.buySingleTicket(), "Impossible age!", "The age was wrong!");
        softAssert.assertEquals(oneLegHereOneLegThere.buySingleTicket(), "Why do you need to go to an amusement park if you're older than 100? Stay at home!", "The age was wrong!");
        softAssert.assertAll();
    }

    @Test
    public void elderlyTicketPurchaseTest() {
        AmusementParkTicketOffice sixtyYearOld = new AmusementParkTicketOffice(60);
        AmusementParkTicketOffice newBorn = new AmusementParkTicketOffice(0);
        AmusementParkTicketOffice someonesDad = new AmusementParkTicketOffice(47);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(sixtyYearOld.buyElderlyTicket(), "Elderly Ticket bought!", "The age was wrong!");
        softAssert.assertEquals(newBorn.buyElderlyTicket(), "Impossible age!", "The age was wrong!");
        softAssert.assertEquals(someonesDad.buyElderlyTicket(),"You do not qualify for an elderly ticket!", "The age was wrong!");
        softAssert.assertAll();
    }

    @Test
    public void spendingAllTheMoneyTest() {
        AmusementParkTicketOffice familyMember = new AmusementParkTicketOffice();
        Assert.assertEquals(familyMember.spendTheBudgetOnFamilyTickets(), "Your budget was enough for 3 tickets.", "Three tickets did not get bought!");
    }

    @Test
    public void areYouBrokeTest() {
        AmusementParkTicketOffice freeEater = new AmusementParkTicketOffice();
        freeEater.spendTheBudgetOnFamilyTickets();
        Assert.assertTrue(freeEater.isBudgetZero(), "You don't have exactly zero dollars!");
    }
}
