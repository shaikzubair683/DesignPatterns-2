import Practice.BridgePattern.HierarchyOne.AdvancedRemote;
import Practice.BridgePattern.HierarchyOne.Remote;
import Practice.BridgePattern.HierarchyTwo.SonyTv;

public class Main {
    public static void main(String[] args) {

        Remote remote = new Remote(new SonyTv());
        remote.turnOff();
        AdvancedRemote advancedRemote = new AdvancedRemote(new SonyTv());
        advancedRemote.setChannel(9);
    }
}