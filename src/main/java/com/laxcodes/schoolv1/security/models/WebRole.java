package com.laxcodes.schoolv1.security.models;

import com.swiftcodes.authsample.security.utils.AppRoles;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@RequiredArgsConstructor
public class WebRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private AppRoles role;
}
