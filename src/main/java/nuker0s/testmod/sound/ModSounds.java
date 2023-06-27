package nuker0s.testmod.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import nuker0s.testmod.testmod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static SoundEvent MOAISOUND=regsoundevent("moaisound");
    private static SoundEvent regsoundevent(String name)
    {
        Identifier id = new Identifier(testmod.MOD_ID,name);
        return Registry.register(Registries.SOUND_EVENT,id,SoundEvent.of(id));
    }
    public static void init()
    {
        testmod.LOGGER.debug("regsound");
    }
}
