public class Waterbottle {
    private int volume;

    public Waterbottle(){
        this.volume = 100;
    }

    public int volumeIs(){
        return this.volume;
    }

    public int drink10ml(){
        return this.volume -= 10;
    }

    public int getEmpty(){
        return this.volume = 0;
    }

    public int getFilledUp(){
        return this.volume = 100;
    }

}

