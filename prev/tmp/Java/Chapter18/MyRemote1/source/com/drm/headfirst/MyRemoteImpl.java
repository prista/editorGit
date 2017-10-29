package com.drm.headfirst;

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

		public String sayHello() {
			return "Server said: 'Hello'";
		}

		public MyRemoteImpl() throws RemoteException {}

		public static void main (String[] args) {
			try {
				MyRemote service = new MyRemoteImpl();
				Naming.rebind("Remote hello", service);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

}