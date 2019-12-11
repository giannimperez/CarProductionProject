package application;

public class VehicleFrame implements Chassis {

  private String vehicleFrameType;
  VehicleChassis chassis = new VehicleChassis();

  public VehicleFrame() {
    this.vehicleFrameType = "unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;

  }

  @Override
  public Chassis getChassisType() {

    return chassis;
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() {
    return
        chassis+
        "\nVehicle Frame : " + vehicleFrameType;
  }
}
