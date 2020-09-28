/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Marcel.Lindinger
 */
public class HalloJavamitForEach {

    List<String> liste = new ArrayList<>();

    public void listForEach() {
        liste.forEach((s) -> {
            System.out.println(s);
        });
    }

}
