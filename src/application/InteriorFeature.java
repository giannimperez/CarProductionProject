package application;

public class InteriorFeature implements Feature {

  String interiorFeature;

  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String toString() {
    return "Interior [" + interiorFeature + "]";
  }

  @Override
  public String getFeature() {
    return interiorFeature;
  }

  @Override
  public void setFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }
}