package com.example.healthpi.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "Req_Message_DB_HealthPi")
public class RequestLaunchMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "username",nullable = false)
    private String username;
    @Column(name = "latitude_deg",nullable = false)
    private double latitudeDeg;
    @Column(name = "longitude_deg",nullable = false)
    private double  longitudeDeg;
    @Column(name="time_stamp",nullable = false)
    private Timestamp timeStamp;

}
