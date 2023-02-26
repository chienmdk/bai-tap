package baitaptrenlop;

public class HinhVuong {
	private double canhA;

	public HinhVuong(double canhA) {
		if (canhA > 0) {
			this.canhA = canhA;
		}
	}

	public double getA() {
		return this.canhA;
	}

	public void setA(double canhA) {
		if (canhA > 0) {
			this.canhA = canhA;
		}
	}
}
