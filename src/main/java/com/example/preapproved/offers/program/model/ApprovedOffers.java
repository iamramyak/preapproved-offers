package com.example.preapproved.offers.program.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApprovedOffers {
    @Id
    @GeneratedValue
    private long id;
    private BigDecimal price;
    private Boolean productAvalible;

    @Override
    public String toString() {
        return "ApprovedOffers{" +
                "id=" + id +
                ", price=" + price +
                ", productAvalible=" + productAvalible +
                ", productName='" + productName + '\'' +
                '}';
    }

    private String productName;
}
