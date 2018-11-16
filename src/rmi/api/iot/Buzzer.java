/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.api.iot;

import java.rmi.RemoteException;

/**
 *
 * @author andre
 */
public interface Buzzer {
    void beep() throws RemoteException;
}
