package application;

import java.sql.Timestamp;
import java.util.Date;

public class Vehicle implements Engine, Chassis{

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame; // Chassis or VehicleChassis?
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  Vehicle() {

    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();

  }

  Vehicle(ManufacturedEngine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine) {

    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;

  }

  public String toString() {
    return
        "Manufacturer Name : " + vehicleManufacturer +
            "\nManufactured Date : " + vehicleManufacturedDate +
            "\nVehicle Make : " + vehicleMake +
            "\nVehicle Model : " + vehicleModel +
            "\nVehicle Type : " + vehicleType +
            "\n" + vehicleEngine;
  }

  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  @Override
  public void setChassisType(String chassis) {
    vehicleFrame = vehicleFrame;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    date = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    vehicleManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    vehicleModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {
    vehicleType = fuel;
  }
}
