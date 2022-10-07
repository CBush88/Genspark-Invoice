package com.genspark.invoiceAPI.Dao;

import com.genspark.invoiceAPI.Entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemDao extends JpaRepository<LineItem, Integer> {
}
