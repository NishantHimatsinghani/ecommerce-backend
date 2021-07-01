package com.luv2code.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;


    @Column(name = "category_id")
    private UUID categoryId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = ProductCategory.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private Integer active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Instant dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Instant lastUpdated;
}
