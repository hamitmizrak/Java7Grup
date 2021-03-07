package com.ecodation.innerclass;

public class DisClass {

	private String disClassAdi;

	public String getDisClassAdi() {
		return disClassAdi;
	}

	public void setDisClassAdi(String disClassAdi) {
		this.disClassAdi = disClassAdi;
	}

	public static class IcClass {
		private String icClassAdi;

		public String getIcClassAdi() {
			return icClassAdi;
		}

		public void setIcClassAdi(String icClassAdi) {
			this.icClassAdi = icClassAdi;
		}

	}

}
