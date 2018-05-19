package com.ubs.dao;

import com.ubs.model.Company;

public interface CompanyDao {

	public void addCompany(Company wh);

	public void updateCompany(Company wh);

	public void deleteCompany(Company wh);

	public void getInfoAboutCompany(String name);
}
