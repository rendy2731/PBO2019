class Lamp{
   Boolean blueIsOn = false;
   Boolean redIsOn = false;

  public void turnOn(){
    if(!blueIsOn && !redIsOn){
      blueIsOn=true;
    }else if(blueIsOn==true && redIsOn ==false){
      blueIsOn=false;
      redIsOn=true;
    }else{
      blueIsOn=true;
      redIsOn=false;
    }
  }
  public void turnOff(){
    blueIsOn=false;
    redIsOn=false;
  }
  public void getState(){
  System.out.println(blueIsOn ? "lampu biru : on": "lamp biru : off");
  System.out.println(redIsOn ? "Lampu merah : on" : "Lampu merah : off");
  }
}
