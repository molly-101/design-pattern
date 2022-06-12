package designpatterns._01_creational_patterns._04_builder._02_after;

import designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        DefaultTourBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 30))
                .whereToStay("리조트")
                .addPlan(0, "check in")
                .addPlan(0, "dinner")
                .addPlan(1, "etc ...")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2022, 9, 4))
                .getPlan();

        // USE DIRECTOR!
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = tourDirector.cancunTrip();
        TourPlan longBeachTrip1 = tourDirector.longBeachTrip();
    }
}
