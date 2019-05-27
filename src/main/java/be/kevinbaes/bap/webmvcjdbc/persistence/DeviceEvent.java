package be.kevinbaes.bap.webmvcjdbc.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DeviceEvent {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private long receivedTime;
  private long lattitude;
  private long longitude;

}
