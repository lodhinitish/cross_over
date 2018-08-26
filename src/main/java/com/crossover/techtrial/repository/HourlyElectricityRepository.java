package com.crossover.techtrial.repository;

import com.crossover.techtrial.model.HourlyElectricity;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * HourlyElectricity Repository is for all operations for HourlyElectricity.
 * @author Crossover
 */
@Repository
public interface HourlyElectricityRepository 
    extends PagingAndSortingRepository<HourlyElectricity,Long> {
  Page<HourlyElectricity> findAllByPanelIdOrderByReadingAtDesc(Long panelId,Pageable pageable);
}
