package com.crossover.techtrial.repository;

import javax.annotation.Resource;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.crossover.techtrial.model.Panel;
/**
 * PanelRepository allows all operations to Panel Entity.
 * @author Crossover
 *
 */

@Repository
public interface PanelRepository extends PagingAndSortingRepository<Panel, Long> {
  Panel findBySerial(String serial);
}
