package nuker0s.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nuker0s.testmod.testmod;

public class AddItemGroup {
    public static ItemGroup TESTMOD;
    public static void  registerIG()
    {
        TESTMOD = FabricItemGroup.builder(new Identifier(testmod.MOD_ID,""))
                .displayName(Text.literal("testmod"))
                .icon(()-> new ItemStack(Moaiitem.MOAI)).build();
    }
}
