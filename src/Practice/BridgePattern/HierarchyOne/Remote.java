package Practice.BridgePattern.HierarchyOne;

import Practice.BridgePattern.HierarchyTwo.Device;

public class Remote {
    protected Device device;
    public Remote(Device device){
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }
    public void turnOff(){
        device.turnOff();
    }
}
/*
        Remote remote = new Remote(new SonyTv());
        remote.turnOff();
        AdvancedRemote advancedRemote = new AdvancedRemote(new SonyTv());
        advancedRemote.setChannel(9);*
* */
