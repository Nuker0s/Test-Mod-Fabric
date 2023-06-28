package nuker0s.testmod;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class UsefulMethods
{
    public static Vec3d lookDirEntity(Entity entity)
    {
        double degrees = entity.getYaw() - 90;
        double radians = Math.toRadians(degrees);
        double x = Math.cos(radians);
        double z = Math.sin(radians);
        double y = entity.getPitch() / -90;
        //I don't know if pitch works correctly
        return new Vec3d((float) x, y, (float) z);
    }
}
