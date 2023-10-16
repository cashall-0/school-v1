package com.laxcodes.schoolv1.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Data
@MappedSuperclass
public class BaseData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;

}
