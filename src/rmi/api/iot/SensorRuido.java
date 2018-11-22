/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.api.iot;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author andre
 */
public interface SensorRuido extends Remote{
    Double obtenerRuido() throws RemoteException;
}
