package com.javacourse.project.hibernateAndJpa.Entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="activity")
public class Activity {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="baslik")
	private String baslik;
	
	@Column(name="icerik")
	private String icerik;
	
	@Column(name="tarih")
	private Date tarih;
	
	@Column(name="durum")
	private boolean durum;
	
	public Activity(int id, String baslik, String icerik, Date tarih, boolean durum) {
		super();
		this.id = id;
		this.baslik = baslik;
		this.icerik = icerik;
		this.tarih = tarih;
		this.durum = durum;
	}
	
	public Activity() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public boolean isDurum() {
		return durum;
	}

	public void setDurum(boolean durum) {
		this.durum = durum;
	}
	
	
}
