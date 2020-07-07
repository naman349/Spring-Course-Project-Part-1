package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Request {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int requestId;

    @Column(nullable = false)
    private int activityId;


    private String userComments;


    private String adminComments;


    @Column(nullable = false)
    private int vehicleId;

    @Column(nullable = false)
    private  int userId;

    public String getUserComments() {
        return userComments;
    }

    public void setUserComments(String userComments) {
        this.userComments = userComments;
    }

    public String getAdminComments() {
        return adminComments;
    }

    public void setAdminComments(String adminComments) {
        this.adminComments = adminComments;
    }

    public Request(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return requestId == request.requestId &&
                activityId == request.activityId &&
                vehicleId == request.vehicleId &&
                userId == request.userId &&
                Objects.equals(userComments, request.userComments) &&
                Objects.equals(adminComments, request.adminComments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, activityId, userComments, adminComments, vehicleId, userId);
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", activityId=" + activityId +
                ", userComments='" + userComments + '\'' +
                ", adminComments='" + adminComments + '\'' +
                ", vehicleId=" + vehicleId +
                ", userId=" + userId +
                '}';
    }
}
