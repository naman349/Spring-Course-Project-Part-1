package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int requestId;

    @OneToOne
    private Activity activity;

    private String userComments;
    private String adminComments;

    @OneToOne
    private RequestStatus requestStatusId;

    @OneToOne
    private Vehicle vehicle;

    @OneToOne
    private User user;

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

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

    public Request() {
    }

    public Request(String userComments, String adminComments) {
        this.userComments = userComments;
        this.adminComments = adminComments;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", userComments='" + userComments + '\'' +
                ", adminComments='" + adminComments + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return requestId == request.requestId &&
                Objects.equals(activity, request.activity) &&
                Objects.equals(userComments, request.userComments) &&
                Objects.equals(adminComments, request.adminComments) &&
                Objects.equals(requestStatusId, request.requestStatusId) &&
                Objects.equals(vehicle, request.vehicle) &&
                Objects.equals(user, request.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, activity, userComments, adminComments, requestStatusId, vehicle, user);
    }
}