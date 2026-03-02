package InClassActivity.ICA04;

import java.util.ArrayList;

public class SmartHome {

  public static void printArrayList(ArrayList<Object> objList) {
    for (int i = 0; i < objList.size(); ++i) {
      System.out.println(objList.get(i));
    }
  }
  public static void main(String[] args){
    ArrayList<Object> objList = new ArrayList<>();

    objList.add(new SmartThermostat("Bedroom", 72));
    objList.add(new SmartSpeaker("Kitchen", 100));

    printArrayList(objList);
  }
}
