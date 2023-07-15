package com.driver.model;

import com.sun.tools.javac.jvm.Gen;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
public class Cab{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int perKmRate;

    private boolean available;

    @OneToOne(cascade = CascadeType.ALL)
    Driver driver;

    public Cab(int perKmRate, boolean available, Driver driver){
        this.perKmRate = perKmRate;
        this.available = available;
        this.driver = driver;
    }

    public Cab() {
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}