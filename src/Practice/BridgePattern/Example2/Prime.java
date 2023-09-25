package Practice.BridgePattern.Example2;

public class Prime implements Platform {
    @Override
    public void playHD() {
        System.out.println("playing HD in Prime");
    }

    @Override
    public void playFullHD() {
        System.out.println("playing FullHD in Prime");
    }

    @Override
    public void play4K() {
        System.out.println("playing 4k in Prime");
    }
}

    /*
    *   FreeUser user  = new FreeUser(new Netflix());
        user.playHD();

        PremiumUser premiumUser = new PremiumUser(new Prime());
        premiumUser.play4k();
    * */