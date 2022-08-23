package designpatterns._01_creational_patterns._02_factory_method._04_molly;

import java.util.Date;

public class IndividualKlassTicketFactory implements KlassTicketFactory{

    @Override
    public KlassTicket createTicket(Long id, String title, Date date) {
        return new IndividualKlassTicket(id, title, date);
    }
}
