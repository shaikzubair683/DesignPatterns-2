package Practice.BridgePattern.Example2;

public class Netflix implements Platform {
    @Override
    public void playHD() {
        System.out.println("playing HD in netflix");
    }

    @Override
    public void playFullHD() {
        System.out.println("playing FullHD in netflix");

    }

    @Override
    public void play4K() {
        System.out.println("playing 4k in netflix");
    }
}

    /*
    *   FreeUser user  = new FreeUser(new Netflix());
        user.playHD();

        PremiumUser premiumUser = new PremiumUser(new Prime());
        premiumUser.play4k();
    * */