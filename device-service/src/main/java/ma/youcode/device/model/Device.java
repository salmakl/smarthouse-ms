package ma.youcode.device.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ma.youcode.device.enums.DeviceStatus;

import javax.persistence.*;

@Table(name = "devices")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String deviceName;
    private DeviceStatus deviceStatus;
    private Long userId;
}
