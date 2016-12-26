package com.stock.tp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stock.tp.model.BrandDetails;
import com.stock.tp.dao.BrandDetailsDao;

@Service("brandDetailsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BrandDetailsServiceImpl implements BrandDetailsService {

	@Autowired
	private BrandDetailsDao brandDetailsDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addBrandDetails(BrandDetails cDetails) {
		brandDetailsDao.addBrandDetails(cDetails);
	}
	
	public List<BrandDetails> listBrandDetails() {
		return brandDetailsDao.listBrandDetails();
	}
	
	public BrandDetails getBrandDetails(int stockid) {
		return brandDetailsDao.getBrandDetails(stockid);
	}	
	
	public void deleteBrandDetails(BrandDetails cdetails) {
		brandDetailsDao.deleteBrandDetails(cdetails);
	}

}
