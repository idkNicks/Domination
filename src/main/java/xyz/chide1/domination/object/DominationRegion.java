package xyz.chide1.domination.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;

import java.sql.Time;

@AllArgsConstructor
@Getter
@Setter
public class DominationRegion {
    private String name;
    private Location center;
    private Group owner;
    private Time ownedTime;
}
