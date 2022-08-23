package designpatterns._01_creational_patterns._02_factory_method._04_molly;

import java.util.Date;

public class SubscriptionKlassTicket implements KlassTicket {

    private Long id;

    private String title;

    private Date date;

    public SubscriptionKlassTicket(Long id, String title, Date date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }
}
