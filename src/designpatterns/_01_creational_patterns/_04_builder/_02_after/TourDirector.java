package designpatterns._01_creational_patterns._04_builder._02_after;

import designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private final TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 30))
                .whereToStay("리조트")
                .addPlan(0, "check in")
                .addPlan(0, "dinner")
                .addPlan(1, "etc ...")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2022, 9, 4))
                .getPlan();
    }
}
