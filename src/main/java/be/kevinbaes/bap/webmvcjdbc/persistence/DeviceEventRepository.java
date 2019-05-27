package be.kevinbaes.bap.webmvcjdbc.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceEventRepository extends CrudRepository<DeviceEvent, Integer> {

  @Query(value = "select * from device_event limit :limit", nativeQuery = true)
  List<DeviceEvent> findAllWithLimit(int limit);

}
