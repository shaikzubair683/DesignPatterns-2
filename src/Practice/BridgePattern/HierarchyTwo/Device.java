package Practice.BridgePattern.HierarchyTwo;

public interface Device {
    void turnOn();
    void turnOff();
    void setChannel(int channel);
}

/*
        Remote remote = new Remote(new SonyTv());
        remote.turnOff();
        AdvancedRemote advancedRemote = new AdvancedRemote(new SonyTv());
        advancedRemote.setChannel(9);*
* */