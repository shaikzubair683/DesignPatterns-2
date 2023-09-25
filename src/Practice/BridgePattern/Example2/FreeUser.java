package Practice.BridgePattern.Example2;

public class FreeUser {
    protected Platform platform;
    public FreeUser(Platform platform){
        this.platform = platform;
    }
    public void playHD(){
        platform.playHD();
    }

    /*
    *   FreeUser user  = new FreeUser(new Netflix());
        user.playHD();

        PremiumUser premiumUser = new PremiumUser(new Prime());
        premiumUser.play4k();
    * */
}
