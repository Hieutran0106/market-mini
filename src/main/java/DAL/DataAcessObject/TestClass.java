package DAL.DataAcessObject;

import DTO.NhaCungCap;
import DTO.HoaDon;
import DTO.Voucher;
import DTO.GiamGiaSP;
import DTO.LoaiSanPham;

import java.sql.Timestamp;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        PhieuNhapDAO nhapDAO = new PhieuNhapDAO();
//        List<PhieuNhap> list = nhapDAO.selectAndFilter("2", "", "2022/05/16", "2022/05/18");
//        for (PhieuNhap nhap:list){
//            System.out.println(nhap);
//        }
        System.out.println(nhapDAO.selectNewest());
    }

    public static void testHoaDon(){
        HoaDonDAO hoaDonDAO = new HoaDonDAO();

        List<HoaDon> list = hoaDonDAO.selectAll();
        for (HoaDon hoaDon : list) {
            System.out.println(hoaDon);
        }
    }

    public static void testMaKhuyenMai(){
        VoucherDAO maKhuyenMaiDAO = new VoucherDAO();
        Voucher mkm = new Voucher(
                1,"GIAMGIA","MOTA",2,new Timestamp(System.currentTimeMillis()),new Timestamp(System.currentTimeMillis()),
                10000,0,5000,10,200,false);

    }


    public static void testLoaiSanPham(){
        LoaiSanPhamDAO loaiSanPhamDAO = new LoaiSanPhamDAO();
        LoaiSanPham lsp = new LoaiSanPham(1,"Laptop","Laptop de nang cao",false);
        loaiSanPhamDAO.insert(lsp);
//        System.out.println(lsp);
//
//        if (loaiSanPhamDAO.insert(lsp)){
//            System.out.println("Insert success");
//        };
//
//        if (loaiSanPhamDAO.update(1,lsp)){
//            System.out.println("Update success");
//        } else {
//            System.out.println("Update fail");
//        }
//
//        if (loaiSanPhamDAO.delete(1)){
//            System.out.println("Delete success");
//        } else {
//            System.out.println("Delete fail");
//        }

        List<LoaiSanPham> list = loaiSanPhamDAO.selectAll();
        for (LoaiSanPham loaiSanPham : list) {
            System.out.println(loaiSanPham);
        }
    }

    public static void testNhaCungCap(){
        NhaCungCapDAO nhaCungCapDAO = new NhaCungCapDAO();
        NhaCungCap ncc = new NhaCungCap(1,"Duy","Ho Chi Minh","123","supply@gmail.com",false);
        System.out.println(ncc);

        if (nhaCungCapDAO.insert(ncc)){
            System.out.println("Insert success");
        }

        if (nhaCungCapDAO.update(1,ncc)){
            System.out.println("Update success");
        } else {
            System.out.println("Update fail");
        }

//        if (nhaCungCapDAO.delete(1)){
//            System.out.println("Delete success");
//        } else {
//            System.out.println("Delete fail");
//        }

        List<NhaCungCap> list = nhaCungCapDAO.selectAll();
        for (NhaCungCap nhaCungCap : list) {
            System.out.println(nhaCungCap);
        }
    }
    
    public static void testGiamGiaSP(){
        GiamGiaSPDAO giamGiaSPDAO = new GiamGiaSPDAO();
        GiamGiaSP giamGiaSP = new GiamGiaSP(0, new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),10,1,false);
        
        if(giamGiaSPDAO.insert(giamGiaSP))
            System.out.println("Insert success!");
        
        giamGiaSP.setPtGiam(20);
        if (giamGiaSPDAO.update(1,giamGiaSP)){
            System.out.println("Update success");
        } else {
            System.out.println("Update fail");
        }
        
        if (giamGiaSPDAO.delete(7)){
            System.out.println("Delete success");
        } else {
            System.out.println("Delete fail");
        }
        
        if (giamGiaSPDAO.select(7) != null){
            System.out.println("Selected!");
            System.out.println(giamGiaSPDAO.select(7));
        }else { System.out.println("Can't find!");}
        
        
        List<GiamGiaSP> list = giamGiaSPDAO.selectAll();
        for (GiamGiaSP gg : list){
            System.out.println(gg);
        }
    }
}
