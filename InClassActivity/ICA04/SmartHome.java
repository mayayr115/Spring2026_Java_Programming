package InClassActivity.ICA04;

import java.util.ArrayList;

public class SmartHome {
  public static void printArrayList(ArrayList<SmartDevice> objList) {
    for (int i = 0; i < objList.size(); ++i) {
      (objList.get(i)).displayStatus();
      (objList.get(i)).turnOn();
      if (objList.get(i) instanceof SmartSpeaker) (objList.get(i)).adjustSettings(100);
      else (objList.get(i)).adjustSettings(68);
      (objList.get(i)).turnOff();
      System.out.println();
    }
  }
  public static void main(String[] args){
    ArrayList<SmartDevice> objList = new ArrayList<>();

    objList.add(new SmartThermostat("Bedroom Thermostat", 72));
    objList.add(new SmartSpeaker("Kitchen Speaker", 50));

    printArrayList(objList);
  }
}
