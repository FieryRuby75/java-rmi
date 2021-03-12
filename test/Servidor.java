/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author danie
 */
public class Servidor {
    public static void main(String[] args) {
        try
        {
            Registry registo = LocateRegistry.createRegistry(10000);
            registo.rebind("Soma", new ContaSoma());
            registo.rebind("Subtrai", new ContaSubtrai());
            System.out.println("Servidor a correr");
            System.out.println("Porta 10000\nOperaçoes disponiveis são Soma e Subtrai");
        } catch (Exception e)
        {
            System.out.println("Erro");
        }
    }
}
