package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ProductBenMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodBenId;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
    @JoinColumn(name = "prodBenBenId")
    private BeneficiaryMaster beneficiary;
    
    @OneToOne(fetch = FetchType.EAGER, cascade =  CascadeType.ALL)
    @JoinColumn(name = "prodBenProductId")
    private ProductMaster product;
    
    private double prodBenPercentage=5;

	public Long getProdBenId() {
		return prodBenId;
	}

	public void setProdBenId(Long prodBenId) {
		this.prodBenId = prodBenId;
	}

	public BeneficiaryMaster getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(BeneficiaryMaster beneficiary) {
		this.beneficiary = beneficiary;
	}

	public ProductMaster getProduct() {
		return product;
	}

	public void setProduct(ProductMaster product) {
		this.product = product;
	}

	public double getProdBenPercentage() {
		return prodBenPercentage;
	}

	public void setProdBenPercentage(double prodBenPercentage) {
		this.prodBenPercentage = prodBenPercentage;
	}
    
    // Getter and setter methods
    
}