package com.microservices.account_microservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {
    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;

    @Column(name = "customer_id")
    private Long customerId;
}
