package com.sparrowww.java.sololearn.myinterface;

public abstract class AbstractMachine implements InterfaceMachine, InterfaceEngine{
    AbstractMachine(){
        InterfaceMachineCreated();
        InterfaceEngineCreated();
    }
    @Override
    public void InterfaceMachineCreated(){
        System.out.println("InterfaceMachine created! ID = " + InterfaceMachineId);
    }
    @Override
    public void InterfaceEngineCreated(){
        System.out.println("InterfaceEngine created! ID = " + InterfaceEngineId);
    }
}
