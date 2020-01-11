/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod12_javaapi_agus_salim_h_1941723007;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rian
 */
public class Mod12_JavaApi_Agus_Salim_H_1941723007_PerCobaan2 {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println(mListCountry);
        System.out.format("List index 0 = %s\n", mListCountry.get(0));
        System.out.format("List index 2 = %s\n", mListCountry.get(2));
    }
}