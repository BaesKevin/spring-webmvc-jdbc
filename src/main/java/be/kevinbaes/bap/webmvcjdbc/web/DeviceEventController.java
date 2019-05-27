package be.kevinbaes.bap.webmvcjdbc.web;

import be.kevinbaes.bap.webmvcjdbc.persistence.DeviceEvent;
import be.kevinbaes.bap.webmvcjdbc.persistence.DeviceEventRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class DeviceEventController {
  private final DeviceEventRepository deviceRepository;

  public DeviceEventController(DeviceEventRepository deviceRepository) {
    this.deviceRepository = deviceRepository;
  }

  @GetMapping("")
  public Iterable<DeviceEvent> findAll(@RequestParam(value = "limit", required = false) Integer limit) {
    if(limit == null) {
      return deviceRepository.findAll();
    }

    return deviceRepository.findAllWithLimit(limit);
  }

}
