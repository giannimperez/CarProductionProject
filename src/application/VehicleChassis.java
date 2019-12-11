package application;

public class VehicleChassis implements Chassis {

private String chassisName;
//private Chassis chassis;

public VehicleChassis() {
this.chassisName = CHASSIS;
};

public VehicleChassis(String chassisName) {

  this.chassisName = chassisName;
  //
  // this.chassis = chassis;
}

  @Override
  public Chassis getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
  this.chassisName = vehicleChassis;
  }

  @Override
  public String toString() {
  return "Chassis Name : " + chassisName;
  }
}
