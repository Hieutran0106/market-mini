/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS.BusAccessor;

import DAL.DataAcessObject.ChucVuDAO;
import DTO.ChucVu;

public class ChucVuBUS extends AbstractBUSAccessor<ChucVu, Integer, ChucVuDAO>{

    public ChucVuBUS() {
        setDao(new ChucVuDAO());
    }
   
}
