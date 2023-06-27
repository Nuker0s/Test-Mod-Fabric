package nuker0s.testmod;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class UsefulMethods
{
    public static Vec3d lookDirEntity(Entity entity)
    {
        double degrees = entity.getHeadYaw() - 90;
        double radians = Math.toRadians(degrees);
        double x = Math.cos(radians);
        double y = Math.sin(radians);

        //I can't find anything for the vertical camera
        return new Vec3d((float) x, 0, (float) y);
    }
}
