/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod10_Agus_Salim_H_1941723007.Tester1;

/**
 *
 * @author rian
 */
public class ElectricityBill_AgusSalimH_1941723007 implements Payable_AgusSalimH_1941723007{
    
    private int kwh;
    private String category;

    public ElectricityBill_AgusSalimH_1941723007(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwh_AgusSalimH_1941723007() {
        return kwh;
    }

    public void setKwh_AgusSalimH_1941723007(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory_AgusSalimH_1941723007() {
        return category;
    }

    public void setCategory_AgusSalimH_1941723007(String category) {
        this.category = category;
    }
    
    @Override
    public int getPaymentAmount_AgusSalimH_1941723007() {
        return kwh*getBasePrice_AgusSalimH_1941723007();
    }
    public int getBasePrice_AgusSalimH_1941723007(){
        int bPrice = 0;
        switch(category){
            case "R-1"  : bPrice = 200;break;
            case "R-2"  : bPrice = 100;break;
        }return bPrice;
        
    }
    public String getBillInfo_AgusSalimH_1941723007(){
        return "KWH = "+kwh+"\n"+"Category  = "+category+"("+getBasePrice_AgusSalimH_1941723007()+"per KWH)\n";
    }
    
}
