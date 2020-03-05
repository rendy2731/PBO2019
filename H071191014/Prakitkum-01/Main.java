class Main{
  public static void main(String[] args) {
    Lamp lampu = new Lamp();
    lampu.turnOn();
    lampu.getState();
    lampu.turnOff();
    lampu.getState();
    lampu.turnOn();
    lampu.getState();
  }
}
