/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.KhachHangDAO;
import DTO.KhachHang;
import java.util.List;

public class KhachHangBUS implements IBussAccess<KhachHang,Integer>{
    private final KhachHangDAO khDAO = new KhachHangDAO();
    
    @Override
    public KhachHang get(Integer maKhachHang) {
       return khDAO.select(maKhachHang);
    }

    @Override
    public List<KhachHang> getAll() {
       return khDAO.selectAll();
    }

    @Override
    public boolean add(KhachHang kh) {
        return khDAO.insert(kh);
    }

    @Override
    public boolean edit(Integer maKhachHang, KhachHang kh) {
        return khDAO.update(maKhachHang, kh);
    }

    @Override
    public boolean remove(Integer maKhachHang) {
       return khDAO.delete(maKhachHang);
    }

    @Override 
    public KhachHang getNewest() {
        List<KhachHang> list = getAll();
        return list == null ? null : list.get(list.size()-1);
//        or
//        return khDAO.getNewestKey();
//      Va trong KhachHangDAO
//      public KhachHang getNewestKey(){
//          return executeQuery("SELECT * FROM KHACHHANG ORDER BY MAKH DESC LIMIT 1")
//      }
    }
    
}
