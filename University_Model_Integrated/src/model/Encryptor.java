/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author yuga
 */
public class Encryptor {
     public String encryptString(String input) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte [] messagedigest = md.digest(input.getBytes());
        BigInteger bigInt = new BigInteger(1,messagedigest);
        return bigInt.toString(16);
    }
}