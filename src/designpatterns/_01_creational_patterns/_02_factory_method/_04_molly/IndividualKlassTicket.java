package designpatterns._01_creational_patterns._02_factory_method._04_molly;

import java.util.Date;

public class IndividualKlassTicket implements KlassTicket {

    private Long id;

    private String title;

    private Date date;

    public IndividualKlassTicket(Long id, String title, Date date) {
        this.id = id;
        this.title = title;
        this.date = date;
    }
}
