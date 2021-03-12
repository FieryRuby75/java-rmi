/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author danie
 */
public interface IOperacaoBinaria extends Remote {
    public float calcula(float a, float b) throws RemoteException;
}
