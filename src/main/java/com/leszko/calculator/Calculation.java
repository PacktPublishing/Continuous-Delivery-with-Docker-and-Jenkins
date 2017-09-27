package com.leszko.calculator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Calculation entity.
 */
@Entity
public class Calculation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String a;
    private String b;
    private String sum;
    private Timestamp createdAt;

    protected Calculation() {}

    public Calculation(String a, String b, String sum, Timestamp createdAt) {
        this.a = a;
        this.b = b;
        this.sum = sum;
        this.createdAt = createdAt;
    }

    public String getSum() {
        return sum;
    }
}
