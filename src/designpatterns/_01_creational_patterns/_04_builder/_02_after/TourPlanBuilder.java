package designpatterns._01_creational_patterns._04_builder._02_after;

import designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    // 두 인자가 반드시 같이 쓰여야 하는 경우
    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    // 여기에 검증 로직을 추가할 수 있습니다.
    // ex) plan 에 꼭 필요한 정보가 있는지 판단
    TourPlan getPlan();
}
