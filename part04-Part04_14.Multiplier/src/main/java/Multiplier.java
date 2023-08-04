/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aolej
 */
public class Multiplier {

    private int var;

    public Multiplier(int number) {
        this.var = number;
    }

    public int multiply(int multiplyBy) {
        this.var *= multiplyBy;
        return this.var;
    }

}
