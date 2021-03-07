package com.ecodation.composition;

import java.io.Serializable;

//N
public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 569283357470006479L;

	// nesne değişkenleri
	private long ogrenciId;
	private String ogrenciAdi;
	private String ogrenciSoyadi;

	// composition
	private Ogretmen ogretmen;

	// parametresiz constructor
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public Ogrenci(long ogrenciId, String ogrenciAdi, String ogrenciSoyadi) {
		super();
		this.ogrenciId = ogrenciId;
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciSoyadi = ogrenciSoyadi;
	}

	// override
	@Override
	public String toString() {
		return "Ogrenci [ogrenciId=" + ogrenciId + ", ogrenciAdi=" + ogrenciAdi + ", ogrenciSoyadi=" + ogrenciSoyadi
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ogrenciAdi == null) ? 0 : ogrenciAdi.hashCode());
		result = prime * result + (int) (ogrenciId ^ (ogrenciId >>> 32));
		result = prime * result + ((ogrenciSoyadi == null) ? 0 : ogrenciSoyadi.hashCode());
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
		Ogrenci other = (Ogrenci) obj;
		if (ogrenciAdi == null) {
			if (other.ogrenciAdi != null)
				return false;
		} else if (!ogrenciAdi.equals(other.ogrenciAdi))
			return false;
		if (ogrenciId != other.ogrenciId)
			return false;
		if (ogrenciSoyadi == null) {
			if (other.ogrenciSoyadi != null)
				return false;
		} else if (!ogrenciSoyadi.equals(other.ogrenciSoyadi))
			return false;
		return true;
	}

	// getter and setter
	public long getOgrenciId() {
		return ogrenciId;
	}

	public void setOgrenciId(long ogrenciId) {
		this.ogrenciId = ogrenciId;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public String getOgrenciSoyadi() {
		return ogrenciSoyadi;
	}

	public void setOgrenciSoyadi(String ogrenciSoyadi) {
		this.ogrenciSoyadi = ogrenciSoyadi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

}
