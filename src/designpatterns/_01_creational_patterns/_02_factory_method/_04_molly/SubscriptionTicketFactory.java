package designpatterns._01_creational_patterns._02_factory_method._04_molly;

import java.util.Date;

public class SubscriptionTicketFactory implements KlassTicketFactory{
    @Override
    public KlassTicket createTicket(Long id, String title, Date date) {
        return new SubscriptionKlassTicket(id, title, date);
    }
}
