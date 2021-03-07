package com.ecodation.composition;

import java.io.Serializable;

//1
public class Ogretmen implements Serializable {
	private static final long serialVersionUID = 1L;

	private long ogretmenId;
	private String ogretmenAdi;
	private String ogretmenSoyadi;

	// composition
	java.util.List<Ogrenci> ogrenciList;

	public Ogretmen() {
		// TODO Auto-generated constructor stub
	}

	public Ogretmen(long ogretmenId, String ogretmenAdi, String ogretmenSoyadi) {
		super();
		this.ogretmenId = ogretmenId;
		this.ogretmenAdi = ogretmenAdi;
		this.ogretmenSoyadi = ogretmenSoyadi;
	}

	@Override
	public String toString() {
		return "Ogretmen [ogretmenId=" + ogretmenId + ", ogretmenAdi=" + ogretmenAdi + ", ogretmenSoyadi="
				+ ogretmenSoyadi + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ogretmenAdi == null) ? 0 : ogretmenAdi.hashCode());
		result = prime * result + (int) (ogretmenId ^ (ogretmenId >>> 32));
		result = prime * result + ((ogretmenSoyadi == null) ? 0 : ogretmenSoyadi.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ogretmen other = (Ogretmen) obj;
		if (ogretmenAdi == null) {
			if (other.ogretmenAdi != null)
				return false;
		} else if (!ogretmenAdi.equals(other.ogretmenAdi))
			return false;
		if (ogretmenId != other.ogretmenId)
			return false;
		if (ogretmenSoyadi == null) {
			if (other.ogretmenSoyadi != null)
				return false;
		} else if (!ogretmenSoyadi.equals(other.ogretmenSoyadi))
			return false;
		return true;
	}

	public long getOgretmenId() {
		return ogretmenId;
	}

	public void setOgretmenId(long ogretmenId) {
		this.ogretmenId = ogretmenId;
	}

	public String getOgretmenAdi() {
		return ogretmenAdi;
	}

	public void setOgretmenAdi(String ogretmenAdi) {
		this.ogretmenAdi = ogretmenAdi;
	}

	public String getOgretmenSoyadi() {
		return ogretmenSoyadi;
	}

	public void setOgretmenSoyadi(String ogretmenSoyadi) {
		this.ogretmenSoyadi = ogretmenSoyadi;
	}

	public java.util.List<Ogrenci> getOgrenciList() {
		return ogrenciList;
	}

	public void setOgrenciList(java.util.List<Ogrenci> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
