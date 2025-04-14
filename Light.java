class Light {
    private boolean isOn = false;
    private int brightness = 50;

    public void turnOn(){
        isOn = true;
        System.out.println("[Light] Turning ON");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("[Light] Tirning OFF");
    }
    public void setBrightness(int level){
        brightness = level;
        System.out.println("[Light] Setting brightness to " + level + "%");
    }
}
