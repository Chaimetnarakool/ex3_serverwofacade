/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverwofacade;

/**
 *
 * @author Nai
 */

public class Facade_Design {
    private static Facade_Design Facade_DesignObj = null;
        private Facade_Design() {}
        public static Facade_Design getFacade_DesignObj(){
        if (Facade_DesignObj == null){
            Facade_DesignObj = new Facade_Design();
        }
        return Facade_DesignObj;
    }
    public void startBooting(){
        ScheduleServer obj = new ScheduleServer();
        obj.startBooting();
    }
    public void readSystemConfigFile(){
        ScheduleServer obj = new ScheduleServer();
        obj.readSystemConfigFile();
    }
    public void init(){
	ScheduleServer obj = new ScheduleServer();
        obj.init();
    }
    public void initializeContext(){
	ScheduleServer obj = new ScheduleServer();
        obj.initializeContext();
    }
    public void initializeListeners(){
	ScheduleServer obj = new ScheduleServer();
        obj.initializeListeners();    }
    
    public void createSystemObjects(){
        ScheduleServer obj = new ScheduleServer();
        obj.createSystemObjects();    }
    
    public void releaseProcesses(){
        ScheduleServer obj = new ScheduleServer();
        obj.releaseProcesses();    }
    
    public void destory(){
        ScheduleServer obj = new ScheduleServer();
        obj.destory();    }
    
    public void destroySystemObjects(){
	ScheduleServer obj = new ScheduleServer();
        obj.destroySystemObjects();    }
    
    public void destoryListeners(){
        ScheduleServer obj = new ScheduleServer();
        obj.destoryListeners();    }
    
    public void destoryContext(){
        ScheduleServer obj = new ScheduleServer();
        obj.destoryContext();
    }
    public void shutdown(){
        ScheduleServer obj = new ScheduleServer();
        obj.shutdown();
    }
    
}