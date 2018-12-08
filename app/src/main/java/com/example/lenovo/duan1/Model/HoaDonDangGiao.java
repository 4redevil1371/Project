package com.example.lenovo.duan1.Model;

import java.util.ArrayList;

public class HoaDonDangGiao {
    public String tenNguoiNhan;
    public String soDienThoai;
    public String diaChiNhanHang;
    public String chuThichDatHang;
    public ArrayList<GioHang> gioHang;
    public String user;
    public String keyHoaDonDangGiao;
    public String ngayDangGiao;
    public String thangDangGiao;
    public String namDangGiao;
    public String gioDangGiao;

    public HoaDonDangGiao() {
    }

    public HoaDonDangGiao(String tenNguoiNhan, String soDienThoai, String diaChiNhanHang, String chuThichDatHang, ArrayList<GioHang> gioHang, String user) {
        this.tenNguoiNhan = tenNguoiNhan;
        this.soDienThoai = soDienThoai;
        this.diaChiNhanHang = diaChiNhanHang;
        this.chuThichDatHang = chuThichDatHang;
        this.gioHang = gioHang;
        this.user = user;
    }

    public HoaDonDangGiao(String tenNguoiNhan, String soDienThoai, String diaChiNhanHang, String chuThichDatHang, ArrayList<GioHang> gioHang, String user, String ngayDangGiao, String gioDangGiao) {
        this.tenNguoiNhan = tenNguoiNhan;
        this.soDienThoai = soDienThoai;
        this.diaChiNhanHang = diaChiNhanHang;
        this.chuThichDatHang = chuThichDatHang;
        this.gioHang = gioHang;
        this.user = user;
        this.ngayDangGiao = ngayDangGiao;
        this.gioDangGiao = gioDangGiao;
    }

    public HoaDonDangGiao(String tenNguoiNhan, String soDienThoai, String diaChiNhanHang, String chuThichDatHang, ArrayList<GioHang> gioHang, String user, String ngayDangGiao, String thangDangGiao, String namDangGiao, String gioDangGiao) {
        this.tenNguoiNhan = tenNguoiNhan;
        this.soDienThoai = soDienThoai;
        this.diaChiNhanHang = diaChiNhanHang;
        this.chuThichDatHang = chuThichDatHang;
        this.gioHang = gioHang;
        this.user = user;
        this.ngayDangGiao = ngayDangGiao;
        this.thangDangGiao = thangDangGiao;
        this.namDangGiao = namDangGiao;
        this.gioDangGiao = gioDangGiao;
    }

    public String getKeyHoaDonDangGiao() {
        return keyHoaDonDangGiao;
    }

    public void setKeyHoaDonDangGiao(String keyHoaDonDangGiao) {
        this.keyHoaDonDangGiao = keyHoaDonDangGiao;
    }
}
