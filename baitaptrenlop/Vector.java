package baitaptrenlop;

public class Vector {
	private double x, y, z;

	public Vector() {
	}

	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector congVecTor(Vector v) {
		return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);

	}

	public Vector truVecTor(Vector v) {
		return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
	}

	public void nhanVoiHangSo(double hangSo) {
		double a = this.x * hangSo;
		double b = this.y * hangSo;
		double c = this.z * hangSo;
		System.out.println("Sau khi vector nhân với 1 hằng số :");
		System.out.println("Vector (" + a + "," + b + "," + c + ")");
	}

	public double tichVoHuongHaiVector(Vector v) {
		double tong = ((this.x * v.x) + (this.y * v.y) + (this.z * v.z));
		return tong;
	}
}