package Practice.BridgePattern.HierarchyTwo;

public class SonyTv implements Device{
    @Override
    public void turnOn() {
        System.out.println("turning on SonyTv");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off sonyTv");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("SonyTv set channel "+ channel);
    }
}

/*
        Remote remote = new Remote(new SonyTv());
        remote.turnOff();
        AdvancedRemote advancedRemote = new AdvancedRemote(new SonyTv());
        advancedRemote.setChannel(9);*
* */