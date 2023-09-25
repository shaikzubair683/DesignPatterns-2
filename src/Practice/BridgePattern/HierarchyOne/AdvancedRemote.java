package Practice.BridgePattern.HierarchyOne;

import Practice.BridgePattern.HierarchyTwo.Device;

public class AdvancedRemote extends Remote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void setChannel(int channel){
        device.setChannel(channel);
    }
}
/*
        Remote remote = new Remote(new SonyTv());
        remote.turnOff();
        AdvancedRemote advancedRemote = new AdvancedRemote(new SonyTv());
        advancedRemote.setChannel(9);*
* */