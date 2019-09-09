package com.mycompany.sepeda;

/**
 * Fungsi relasi class sepedaSport && sepeda
 * @author RianBtk
 */
public class sepedaSport {
    public static void main(String[] args) 
    {
        sepeda spx = new sepeda();
        sepeda spk = new sepeda();
        sepedaBalap spt = new sepedaBalap();
        
        spx.pmlkNama(" Agus Salim Hadjrianto");/*######*/spk.pmlkNama(" Agus Salim Hadjrianto");
        spx.idNim( 1941723007); /*##########*/ spk.idNim( 1941723007);
        spx.setBrand(" Honda CBR 250"); /*#####*/ spk.setBrand(" Yamaha R25");
        spx.maxSpeed(200);/*##############*/ spk.xSpeed(160);
        spx.xSpeed(150);/*################*/  spk.maxSpeed(215);
        spx.cetakStatus();/*################*/ spk.cetakStatus();

    }
    
}
