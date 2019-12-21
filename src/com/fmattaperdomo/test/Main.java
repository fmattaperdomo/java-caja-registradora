/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmattaperdomo.test;

import com.fmattaperdomo.controllers.Register;
import com.fmattaperdomo.objects.Product;
import com.fmattaperdomo.storage.Database;
import com.fmattaperdomo.views.View;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        /*
        Database database = new Database();
        Product product = database.getByIndex(0);
        System.out.println(product);
        
        product.setName("Pastusa");
        product.setAmount(10);
        product.setPrice(1000);
        
        Product[] products = database.getAll();
        for (Product v: products){
            System.out.println(v);
        }
        */
        /*
        View.showHeaderPrincipal();
        View.showMenuPrincipal();
        View.showGetOption();
        int option = View.getOption();
        System.out.println("La opción digitada fue; " + option);
        */
        Register register = new Register();
        register.register();
        
    }
    
}
