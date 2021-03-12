/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

/**
 *
 * @author danie
 */
public class ContaSoma extends UnicastRemoteObject implements IOperacaoBinaria {

    public ContaSoma() throws RemoteException {
    }

    
    
    @Override
    public float calcula(float a, float b) throws RemoteException {
        return a + b;
    }
    
}
