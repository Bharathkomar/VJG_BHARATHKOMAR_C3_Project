package com.SweetHome.BookingApplication.DAO;

import com.SweetHome.BookingApplication.Entity.BookingInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface BookingDAO<BookingInfoEntity,Integer> extends JpaRepository {
}
