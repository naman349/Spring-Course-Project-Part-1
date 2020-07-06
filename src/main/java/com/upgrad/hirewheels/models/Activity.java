package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

public class Activity {


    @Id
    private int activityId;
    @Column(nullable = false)
    private String activityType;


public Activity(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return activityId == activity.activityId &&
                Objects.equals(activityType, activity.activityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId, activityType);
    }
}
