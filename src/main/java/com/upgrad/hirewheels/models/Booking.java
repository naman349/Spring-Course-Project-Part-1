package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

public class Booking {
    @Id
    private int bookingId;

    @Column(nullable = false)
    private Date pickupDate;

    @Column(nullable = false)
    private Date dropoffDate;

    @Column(nullable = false)
    private Date bookingDate;

    @Column(nullable = false)
    private float amount;

    @Column(nullable = false)
    private int locationId;

    @Column(nullable = false)
    private int vehicleId;

    @Column(nullable = false)
    private int UserId;


    public Booking(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId &&
                Float.compare(booking.amount, amount) == 0 &&
                locationId == booking.locationId &&
                vehicleId == booking.vehicleId &&
                UserId == booking.UserId &&
                Objects.equals(pickupDate, booking.pickupDate) &&
                Objects.equals(dropoffDate, booking.dropoffDate) &&
                Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, pickupDate, dropoffDate, bookingDate, amount, locationId, vehicleId, UserId);
    }
}







