package designpatterns._01_creational_patterns._02_factory_method._04_molly;

import java.util.Date;

public interface KlassTicketFactory {

    KlassTicket createTicket(Long id, String title, Date date);

    default KlassTicket getKlassTicket(Long id, String title, Date date) throws Exception {
        validation(id, title, date);
        return createTicket(id, title, date);
    }

    private void validation(Long id, String title, Date date) throws Exception {
        if (id != null && title != null && date != null) {
            return;
        }
        throw new Exception("Err");
    }
}
