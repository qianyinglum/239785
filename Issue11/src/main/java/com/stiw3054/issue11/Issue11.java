/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stiw3054.issue11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Issue11 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File dir = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Git-Command\\239785_A1_Test\\target");
        File[] filesInDir = dir.listFiles();
        ArrayList list = new ArrayList();
        //File dir = new File("C:");
        String[] children = dir.list(filter);
        if (children == null) {
            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i < children.length; i++) {
                String filename = children[i];
                System.out.println(filename);
            }
        }
    }
    FilenameFilter filter = new FilenameFilter() {
        public boolean accept(File dir, String name) {
            return name.endsWith(".class");
        }
    };

}
