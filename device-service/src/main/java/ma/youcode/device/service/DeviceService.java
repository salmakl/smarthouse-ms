package ma.youcode.device.service;

import lombok.RequiredArgsConstructor;
import ma.youcode.device.model.Device;
import ma.youcode.device.repository.DeviceRepository;
import ma.youcode.device.service.interfaces.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceService implements CrudService {

    private final DeviceRepository deviceRepository;

    @Override
    public Device add(Device device) {
        return this.deviceRepository.save(device);
    }

    @Override
    public boolean remove(Long deviceId) {
        if(this.getById(deviceId) != null) {
            this.deviceRepository.deleteById(deviceId);
            return true;
        }
        return false;
    }

    @Override
    public Device update(Device device) {
        return this.deviceRepository.save(device);
    }

    @Override
    public Device getById(Long deviceId) {
        return this.deviceRepository.findById(deviceId).get();
    }

    @Override
    public List<Device> getAll() {
        return this.deviceRepository.findAll();
    }
}
