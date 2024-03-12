package model;

import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Employee {

    String position;
    Date startDate;
    Date endDate;
    float salary;

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", salary=" + salary +
                '}';
    }
}
