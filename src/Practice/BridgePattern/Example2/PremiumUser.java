package Practice.BridgePattern.Example2;

public class PremiumUser extends FreeUser{
    public PremiumUser(Platform platform) {
        super(platform);
    }

    public void playFullHD(){
        platform.playFullHD();
    }
    public void play4k(){
        platform.play4K();
    }
}

    /*
    *   FreeUser user  = new FreeUser(new Netflix());
        user.playHD();

        PremiumUser premiumUser = new PremiumUser(new Prime());
        premiumUser.play4k();
    * */