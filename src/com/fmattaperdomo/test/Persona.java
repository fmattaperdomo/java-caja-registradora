/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fmattaperdomo.test;

/**
 *
 * @author USER
 */
public class Persona implements Cloneable {
    public String nombre;
    public int edad;
    
    public Persona clone() throws CloneNotSupportedException {
        return (Persona) super.clone();
    }
    
}
