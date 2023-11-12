package property;

import java.util.Objects;
public class Property {

    public static enum PropertyType {Apartment, Townhouse, House};

    private String Location, Description;
    private double Price;
    private PropertyType Type;

    public Property(String location, String description, double price, PropertyType type) {
        this.Location = location;
        this.Description = description;
        this.Price = price;
        this.Type = type;
    }

    // Getter methods
    public String getLocation() {
        return Location;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public PropertyType getType() {
        return Type;
    }

    // Setter methods
    public void setLocation(String location) {
        this.Location = location;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setType(PropertyType type) {
        this.Type = type;
    }

    // Equals and HashCode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Property property = (Property) obj;
        return Double.compare(property.Price, Price) == 0 &&
                Location.equals(property.Location) &&
                Description.equals(property.Description) &&
                Type == property.Type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Location, Description, Price, Type);
    }

    // Additional Constructor
    public Property(String location, double price) {
        this(location, "", price, PropertyType.House);
    }

    // Additional Methods
    public boolean isValid() {
        return !Location.isEmpty() && Price >= 0;
    }

    public Property copy() {
        return new Property(this.Location, this.Description, this.Price, this.Type);
    }
    @Override
    public String toString() {
        return "Type: " + Type + "\n" +
               "Location: " + Location + "\n" +
               "Description: " + Description + "\n" +
               "Price: R" + Price;
    }
    // toString method as previously provided

    // Other methods as needed

}