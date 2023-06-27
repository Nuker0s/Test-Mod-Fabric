package nuker0s.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import nuker0s.testmod.UsefulMethods;
import nuker0s.testmod.sound.ModSounds;
import nuker0s.testmod.testmod;


public  class Moaiitem
{

    public static final Item MOAI = registerItem("moai");

    public static class MOAIItem extends ModItems {
        public MOAIItem() {
            super(new FabricItemSettings().maxCount(1));
        }

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
            if (!world.isClient) {
                world.playSound(null, player.getBlockPos(), ModSounds.MOAISOUND, SoundCategory.PLAYERS, 1.0f, 1.0f);
            }

            return super.use(world, player, hand);
        }

        @Override
        public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
            if(target != null) {
               target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2, 1));
            }


            assert target != null;
            //couldn't find any method to easily get players look dir in Vec3d, so I made it
            target.takeKnockback(10, UsefulMethods.lookDirEntity(attacker).x,UsefulMethods.lookDirEntity(attacker).z);

            if (!target.world.isClient) {
                target.world.playSound(null, target.getBlockPos(), ModSounds.MOAISOUND, SoundCategory.PLAYERS, 1.0f, 1.0f);
            }

            return super.postHit(stack, target, attacker);
        }

    }
    public static Item registerItem(String name) {
        Moaiitem.MOAIItem item = new Moaiitem.MOAIItem();
        return Registry.register(Registries.ITEM, new Identifier(testmod.MOD_ID, name), item);
    }
}
