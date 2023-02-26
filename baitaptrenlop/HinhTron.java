package baitaptrenlop;

public class HinhTron {
	private double banKinh;

	public HinhTron(double banKinh) {
		if (banKinh > 0) {
			this.banKinh = banKinh;
		}
	}

	public double getR() {
		return this.banKinh ;
	}

	public void setR(double banKinh) {
		if (banKinh > 0) {
			this.banKinh = banKinh;
		}
	}
	
}
