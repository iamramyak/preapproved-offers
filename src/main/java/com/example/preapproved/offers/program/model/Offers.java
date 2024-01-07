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
@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Offers {
    @Id
    @GeneratedValue
    private Long id;
    private BigDecimal price;
    private Boolean productAvailble;
    private String productName;

    @Override
    public String toString() {
        return "Offers{" +
                "id=" + id +
                ", price=" + price +
                ", productAvailble=" + productAvailble +
                ", productName='" + productName + '\'' +
                '}';
    }
}
