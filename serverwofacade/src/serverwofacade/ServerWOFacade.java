/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
public class ServerWOFacade {
    public static void main(String[] args) {
        Facade_Design obj = Facade_Design.getFacade_DesignObj();
        obj.startBooting();
        obj.readSystemConfigFile();
        obj.init();
        obj.initializeContext();
        obj.initializeListeners();
        obj.createSystemObjects();
        System.out.println("Start working......");
	System.out.println("After work done.........");
        obj.releaseProcesses();
	obj.destory();
	obj.destroySystemObjects();
	obj.destoryListeners();
	obj.destoryContext();
	obj.shutdown();  
    }
    
}
