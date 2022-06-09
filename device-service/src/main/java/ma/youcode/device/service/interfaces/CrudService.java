package ma.youcode.device.service.interfaces;

import ma.youcode.device.model.Device;

import java.util.List;

public interface CrudService {
    Device add(Device device);
    boolean remove(Long deviceId);
    Device update(Device device);
    Device getById(Long deviceId);
    List<Device> getAll();
}
