package baitaptrenlop;

private String tenNhanVien;
private double luongCoBan, heSoLuong, Luong_Max;

public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double Luong_Max) {
	if (luongCoBan > 0) {
		this.luongCoBan = luongCoBan;
	}
	if (Luong_Max > 0) {
		this.Luong_Max = Luong_Max;
	}
	this.tenNhanVien = tenNhanVien;
	if (heSoLuong > 0) {
		this.heSoLuong = heSoLuong;
	}
}

public void setLuongCoBan(double luongCoBan) {
	if (luongCoBan > 0) {
		this.luongCoBan = luongCoBan;
	}
}

public double getLuongCoBan(double luongCoBan) {
	return this.luongCoBan;
}

public void setHeSoLuong(double HSL) {
	if (HSL > 0) {
		this.heSoLuong = HSL;
	}
}

public double getHeSoLuong(double HSL) {
	return this.heSoLuong = HSL;
}

public void setLuongMax(double LM) {
	if (LM > 0) {
		this.Luong_Max = LM;
	}
}

public double getLuongMax(double LM) {
	return this.Luong_Max = LM;
}

public double tinhLuong() {
	return this.luongCoBan * this.heSoLuong;
}

boolean tangLuong(double heSoLuong) {
	if (heSoLuong * this.luongCoBan > this.Luong_Max) {
		System.out.println("Không cho phép thay đổi mức lương này");
		return false;
	}
	return true;
}

public void inTTin() {
	System.out.println("Họ và tên : " + this.tenNhanVien);
	System.out.println("Lương cơ bản : " + this.luongCoBan);
	System.out.println("Hệ số lương : " + this.heSoLuong);
	System.out.println("Lương : " + tinhLuong());
	System.out.println("Lương tối đa cho phép : " + this.Luong_Max);
	System.out.println("Có được tăng lương không : " + tangLuong(10));
}
}