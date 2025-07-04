/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.VoucherDAO;
import DTO.Voucher;
import java.util.ArrayList;
import java.util.List;

public class VoucherBUS implements IBussAccess<Voucher,String>{
    private final VoucherDAO voucherDAO =new VoucherDAO();
    @Override
    public Voucher get(String maVoucher) {
        return voucherDAO.select(maVoucher);
    }

    @Override
    public List<Voucher> getAll() {
        return voucherDAO.selectAll();
    }

    @Override
    public boolean add(Voucher vouncher) {
        return  voucherDAO.insert(vouncher);
    }

    @Override
    public boolean edit(String maVoucher, Voucher voucher) {
        return voucherDAO.update(maVoucher, voucher);
    }

    @Override
    public boolean remove(String maVoucher) {
        return voucherDAO.delete(maVoucher);
    }

    @Override
    public Voucher getNewest() {
       List<Voucher> list=getAll();
       return list== null ? null : list.get(list.size()-1);
    }

    public String[][] convertToStringList(){
        List<Voucher> lsVoucher = getAll();
        if (lsVoucher == null || lsVoucher.isEmpty()) return null;
        String[][] datas = new String[lsVoucher.size()][];
        List<String> data = new ArrayList<>();
        
        int i = 0;
        for(Voucher voucher : lsVoucher){
            data.clear();
            data.add(voucher.getSoVoucher()+"");
            data.add(voucher.getMaVoucher());
            data.add(voucher.getPtGiam()+"");
            data.add(voucher.getSoLuotSD()+"");
            datas[i] = data.toArray(String[] :: new);
            i++;
        }
        
        return datas;
    }
   
}
