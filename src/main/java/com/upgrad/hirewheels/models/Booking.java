package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @Column(nullable = false)
    private Date pickupDate;

    @Column(nullable = false)
    private Date dropOffDate;

    @Column(nullable = false)
    private Date bookingDate;

    @Column(nullable = false)
    private float amount;

    @OneToOne
    private Location location;

    @OneToOne
    private Vehicle vehicle;

    @OneToOne
    private User userId;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Booking() {}

    public Booking(Date pickupDate, Date dropOffDate, Date bookingDate, float amount) {
        this.pickupDate = pickupDate;
        this.dropOffDate = dropOffDate;
        this.bookingDate = bookingDate;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", pickupDate=" + pickupDate +
                ", dropOffDate=" + dropOffDate +
                ", bookingDate=" + bookingDate +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId &&
                Float.compare(booking.amount, amount) == 0 &&
                Objects.equals(pickupDate, booking.pickupDate) &&
                Objects.equals(dropOffDate, booking.dropOffDate) &&
                Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, pickupDate, dropOffDate, bookingDate, amount);
    }
}