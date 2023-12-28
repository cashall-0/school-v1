package com.laxcodes.schoolv1.repository;

import com.laxcodes.schoolv1.entities.StaffProfile;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StaffProfileRepo extends JpaRepository<StaffProfile, Long> {
}
