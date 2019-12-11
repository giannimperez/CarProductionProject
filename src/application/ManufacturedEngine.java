package application;

import java.sql.Timestamp;
import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine() {

    this.engineManufacturedDate = new Date();
    this.engineManufacturer = "Generic";
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "Generic";
    this.driveTrain = "Generic";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;

  }



  public String toString() {
    return "Engine Manufacturer : " + engineManufacturer + "\nEngine Manufactured : "
        + engineManufacturedDate + "\nEngine Make : " + engineMake + "\nEngine Model : "
        + engineModel + "\nEngine Type : " + engineType + "\nEngine Cylinders : "
        + engineCylinders + "\nDrive Train : " + driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = engineType;
  }
}
