package com.wfs.customer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "closed_account_product",schema = "ddms")
@Getter
@Setter
public class ClosedAccountProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="customer_number")
    private long customerNumber;
    @Column(name="customer_key")
    private String customerKey;
    @Column(name="title_code")
    private String titleCode;
    @Column(name="first_middle_name_initial")
    private String firstMiddleNameInitial;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="account_status")
    private String accountStatus;
    @Column(name="wfs_account_no")
    private long wfsAccountNo;
    @Column(name="product_id")
    private String productId;
    @Column(name="date_closed")
    private Date dateClosed;
    @Column(name="identity_no")
    private String identityNo;


}
