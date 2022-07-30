package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the DataStore type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "DataStores", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class DataStore implements Model {
  public static final QueryField ID = field("DataStore", "id");
  public static final QueryField HEART_RATE = field("DataStore", "HEART_RATE");
  public static final QueryField LOCATION = field("DataStore", "LOCATION");
  public static final QueryField SPO2 = field("DataStore", "SPO2");
  public static final QueryField VO2 = field("DataStore", "VO2");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="Float") Double HEART_RATE;
  private final @ModelField(targetType="Location") Location LOCATION;
  private final @ModelField(targetType="Float") Double SPO2;
  private final @ModelField(targetType="Float") Double VO2;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public Double getHeartRate() {
      return HEART_RATE;
  }
  
  public Location getLocation() {
      return LOCATION;
  }
  
  public Double getSpo2() {
      return SPO2;
  }
  
  public Double getVo2() {
      return VO2;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private DataStore(String id, Double HEART_RATE, Location LOCATION, Double SPO2, Double VO2) {
    this.id = id;
    this.HEART_RATE = HEART_RATE;
    this.LOCATION = LOCATION;
    this.SPO2 = SPO2;
    this.VO2 = VO2;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      DataStore dataStore = (DataStore) obj;
      return ObjectsCompat.equals(getId(), dataStore.getId()) &&
              ObjectsCompat.equals(getHeartRate(), dataStore.getHeartRate()) &&
              ObjectsCompat.equals(getLocation(), dataStore.getLocation()) &&
              ObjectsCompat.equals(getSpo2(), dataStore.getSpo2()) &&
              ObjectsCompat.equals(getVo2(), dataStore.getVo2()) &&
              ObjectsCompat.equals(getCreatedAt(), dataStore.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), dataStore.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getHeartRate())
      .append(getLocation())
      .append(getSpo2())
      .append(getVo2())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("DataStore {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("HEART_RATE=" + String.valueOf(getHeartRate()) + ", ")
      .append("LOCATION=" + String.valueOf(getLocation()) + ", ")
      .append("SPO2=" + String.valueOf(getSpo2()) + ", ")
      .append("VO2=" + String.valueOf(getVo2()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static DataStore justId(String id) {
    return new DataStore(
      id,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      HEART_RATE,
      LOCATION,
      SPO2,
      VO2);
  }
  public interface BuildStep {
    DataStore build();
    BuildStep id(String id);
    BuildStep heartRate(Double heartRate);
    BuildStep location(Location location);
    BuildStep spo2(Double spo2);
    BuildStep vo2(Double vo2);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private Double HEART_RATE;
    private Location LOCATION;
    private Double SPO2;
    private Double VO2;
    @Override
     public DataStore build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new DataStore(
          id,
          HEART_RATE,
          LOCATION,
          SPO2,
          VO2);
    }
    
    @Override
     public BuildStep heartRate(Double heartRate) {
        this.HEART_RATE = heartRate;
        return this;
    }
    
    @Override
     public BuildStep location(Location location) {
        this.LOCATION = location;
        return this;
    }
    
    @Override
     public BuildStep spo2(Double spo2) {
        this.SPO2 = spo2;
        return this;
    }
    
    @Override
     public BuildStep vo2(Double vo2) {
        this.VO2 = vo2;
        return this;
    }
    
    /** 
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, Double heartRate, Location location, Double spo2, Double vo2) {
      super.id(id);
      super.heartRate(heartRate)
        .location(location)
        .spo2(spo2)
        .vo2(vo2);
    }
    
    @Override
     public CopyOfBuilder heartRate(Double heartRate) {
      return (CopyOfBuilder) super.heartRate(heartRate);
    }
    
    @Override
     public CopyOfBuilder location(Location location) {
      return (CopyOfBuilder) super.location(location);
    }
    
    @Override
     public CopyOfBuilder spo2(Double spo2) {
      return (CopyOfBuilder) super.spo2(spo2);
    }
    
    @Override
     public CopyOfBuilder vo2(Double vo2) {
      return (CopyOfBuilder) super.vo2(vo2);
    }
  }
  
}
