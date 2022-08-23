package designpatterns._01_creational_patterns._02_factory_method._04_molly;

import java.util.Date;

public class Client {

    public static void main(String[] args) throws Exception {
        KlassTicket klassTicket = new IndividualKlassTicketFactory().getKlassTicket(1L, "몰리의 클래스", new Date());
        KlassTicket subscriptionKlassTicket = new SubscriptionTicketFactory().getKlassTicket(2L, "몰리의 구독 클래스", new Date());
    }

}
