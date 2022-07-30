package com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import java.util.Objects;
import java.util.List;

/** This is an auto generated class representing the Location type in your schema. */
public final class Location {
  private final Double Longitude;
  private final Double Latitude;
  public Double getLongitude() {
      return Longitude;
  }
  
  public Double getLatitude() {
      return Latitude;
  }
  
  private Location(Double Longitude, Double Latitude) {
    this.Longitude = Longitude;
    this.Latitude = Latitude;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Location location = (Location) obj;
      return ObjectsCompat.equals(getLongitude(), location.getLongitude()) &&
              ObjectsCompat.equals(getLatitude(), location.getLatitude());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getLongitude())
      .append(getLatitude())
      .toString()
      .hashCode();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(Longitude,
      Latitude);
  }
  public interface BuildStep {
    Location build();
    BuildStep longitude(Double longitude);
    BuildStep latitude(Double latitude);
  }
  

  public static class Builder implements BuildStep {
    private Double Longitude;
    private Double Latitude;
    @Override
     public Location build() {
        
        return new Location(
          Longitude,
          Latitude);
    }
    
    @Override
     public BuildStep longitude(Double longitude) {
        this.Longitude = longitude;
        return this;
    }
    
    @Override
     public BuildStep latitude(Double latitude) {
        this.Latitude = latitude;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(Double longitude, Double latitude) {
      super.longitude(longitude)
        .latitude(latitude);
    }
    
    @Override
     public CopyOfBuilder longitude(Double longitude) {
      return (CopyOfBuilder) super.longitude(longitude);
    }
    
    @Override
     public CopyOfBuilder latitude(Double latitude) {
      return (CopyOfBuilder) super.latitude(latitude);
    }
  }
  
}
