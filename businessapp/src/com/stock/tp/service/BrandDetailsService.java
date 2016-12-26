package com.stock.tp.service;

import java.util.List;
import com.stock.tp.model.BrandDetails;

public interface BrandDetailsService {
	
	public void addBrandDetails(BrandDetails cDetails);

	public List<BrandDetails> listBrandDetails();
	
    public void deleteBrandDetails(BrandDetails cDetails);
	
    public BrandDetails getBrandDetails(int stockid);
	
	}
