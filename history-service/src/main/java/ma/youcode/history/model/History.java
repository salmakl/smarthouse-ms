package ma.youcode.history.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import ma.youcode.history.enums.DeviceStatus;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Table(name = "history")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String stateDate;
    private DeviceStatus deviceStatus;
    private Long deviceId;

    @PrePersist
    private void onCreate() {
        stateDate = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(new Date());
    }
}
