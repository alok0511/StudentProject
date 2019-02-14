package com.capgemini.salesmanagement.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO {

	@Override
	public Sale insertSalesDetailsOfProducts(Sale sale)
	{
	
		return CollectionUtil.InsertDetailsOfProducts(sale);
		
	}

	}
	
	
	

