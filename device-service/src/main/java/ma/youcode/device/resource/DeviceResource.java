package ma.youcode.device.resource;

import lombok.RequiredArgsConstructor;
import ma.youcode.device.model.Device;
import ma.youcode.device.rabbitmq.model.CustomMessage;
import ma.youcode.device.rabbitmq.publisher.MessagePublisher;
import ma.youcode.device.service.DeviceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/device")
@RequiredArgsConstructor
public class DeviceResource {

    private final DeviceService deviceService;
    private final MessagePublisher messagePublisher;

    @GetMapping
    public ResponseEntity<List<Device>> getAll() {
        return ResponseEntity.ok(this.deviceService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Device> getById(@PathVariable("id") Long deviceId) {
        return ResponseEntity.ok(this.deviceService.getById(deviceId));
    }


    @PostMapping("/notify")
    public ResponseEntity<String> notify(@RequestBody CustomMessage msg) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.messagePublisher.publishMessage(msg));
    }

    @PostMapping
    public ResponseEntity<Device> add(@RequestBody Device device) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.deviceService.add(device));
    }

    @PutMapping
    public ResponseEntity<Device> update(@RequestBody Device device) throws Exception{
        if(this.deviceService.getById(device.getId()) != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(this.deviceService.add(device));
        }
        else {
            throw new Exception("Device with id: "+device.getId()+" Not Found!");
        }
    }

}
