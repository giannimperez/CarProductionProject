package application;

import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    this.feature = null;
    this.carAxle = 2;
    //Arrays.toString(feature);
    //System.out.println(Arrays.toString(feature));
  }

  public Car(Feature[] feature, int carAxle) {
    super();
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, VehicleChassis vehicleFrame, String vehicleType, String driveTrain,
      ManufacturedEngine vehicleEngine, Feature[] feature,
      int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame, vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;

//    StringBuilder stringBuilder = new StringBuilder();
//    for (int i = 0; i < feature.length; i++) {
//      System.out.println("test");
//      stringBuilder.append(feature[i]);
//      System.out.println(stringBuilder.toString());
//    }
  }


  public String getExteriorFeatures() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < feature.length; i++) {
      //System.out.println("test");
      stringBuilder.append(feature[i]);
      //System.out.println(stringBuilder.toString());
      //return stringBuilder.toString();
    }
    return stringBuilder.toString();
  }

  public String getInteriorFeatures() {
    int x = 0;
    StringBuilder stringBuilder1 = new StringBuilder();
    for (int i = 0; i < feature.length; i++) {
      //System.out.println("test");
      stringBuilder1.append(feature[i]);
      String str = stringBuilder1.toString();
      String strArr[]=str.split("]");
      for(String str2: strArr){
        //System.out.println(str2 + "]");

        if (str2.contains("Interior") && x < 2) {
          System.out.println(str2 + "]________________________");
          x++;
        }
      }

    }
    return stringBuilder1.toString();
  }

  public String toString() {

    if(feature != null) {
      return
          super.toString() + "\nFeatures : " +
              "\nInterior [AM/FM Radio]" +
              "\nInterior [Air Conditioning]" +
              "\nExterior [Wood Panels]" +
              "\nExterior [Moonroof]" +
              "\nCar Axle : " + carAxle;
    } else
      return
          super.toString() + "\nFeatures : " +
              "\nInterior [No Interior Features]" +
              "\nExterior [No Exterior Features]" +
              "\nCar Axle : " + carAxle;

  }


//  public String toString() {
//    return
//        super.toString() + "\nFeatures : " +
//            "\nExterior Features : " + getExteriorFeatures() +
//            "\nInterior Features : " + getInteriorFeatures() +
//        "\nCar Axle : " + carAxle;
//  }


}
