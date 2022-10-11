package com.genspark.invoiceAPI.Dao;

import com.genspark.invoiceAPI.Entity.Billable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillableDao extends JpaRepository<Billable, Integer> {
}
