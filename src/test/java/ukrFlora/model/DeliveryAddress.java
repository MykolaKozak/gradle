package ukrFlora.model;

public class DeliveryAddress {
  private final String name;
  private final String city;
  private final String index;
  private final String address;

  public DeliveryAddress(String name, String city, String index, String address) {
    this.name = name;
    this.city = city;
    this.index = index;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public String getIndex() {
    return index;
  }

  public String getAddress() {
    return address;
  }
}
