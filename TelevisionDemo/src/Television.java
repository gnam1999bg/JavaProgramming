// The purpose of this class is to model a television
// Name: Nam Pham Giang

public class Television {
    private final String MANUFACTURER;
    private final int SCREEN_SIZE;
    private boolean powerOn;
    private int channel;
    private int volume;

    /**
     * The constructor creates a television with the given brand and size
     * @param brand The manufacturer of the television
     * @param size The size of the screen
     */
    public Television(String brand, int size){
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }

    /**
     * Mutator method accepts a value to be stored in the channel field
     * @param station The channel to be stored
     */

    public void setChannel(int station) {
        this.channel = station;
    }

    /**
     * Mutator method changes the current state of the television.
     */

    public void power(){ powerOn = !powerOn; }

    /**
     * Mutator method increases the volume of the television
     */

    public void increaseVolume(){ this.volume += 1; }

    /**
     * Mutator method decreases the volume of the television
     */

    public void decreaseVolume(){ this.volume -= 1; }

    /**
     * Accessor method returns the current channel
      * @return The current channel
     */

    public int getChannel(){ return channel; }

    /**
     * Accessor method returns the current volume
     * @return The current volume
     */

    public int getVolume(){ return volume; }

    /**
     * Accessor method returns the current manufacturer
     * @return The current manufacturer
     */

    public String getManufacturer(){ return MANUFACTURER; }

    /**
     * Accessor method returns the current screen size
     * @return The current screen size
     */

    public int getScreenSize(){ return SCREEN_SIZE; }
}
