// Data Transfer Object for API responses
public class PropertyDTO 
{
    private int id;
    private String type;
    private double price;
    private String location;
    private String status;
    private String description;
    
    public PropertyDTO(Property property) 
    {
        this.id = property.getPropertyId();
        
        if (property instanceof ResidentialProperty) 
        {
            this.type = "Residential: " + ((ResidentialProperty) property).getType();
        } 
        else if (property instanceof CommercialProperty) 
        {
            this.type = "Commercial: " + ((CommercialProperty) property).getType();
        } 
        else if (property instanceof Land) 
        {
            this.type = "Land: " + ((Land) property).getType();
        } 
        else 
        {
            this.type = "Unknown";
        }
        
        this.price = property.getPrice();
        this.location = property.getAddress().getCity() + ", " + property.getAddress().getState();
        this.status = property.getStatus().toString();
        this.description = property.getDescription();
    }
    
    public int getId() 
    {
        return id;
    }
    
    public String getType() 
    {
        return type;
    }
    
    public double getPrice() 
    {
        return price;
    }
    
    public String getLocation() 
    {
        return location;
    }
    
    public String getStatus() 
    {
        return status;
    }
    
    public String getDescription() 
    {
        return description;
    }
}