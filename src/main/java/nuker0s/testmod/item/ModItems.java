package nuker0s.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import nuker0s.testmod.testmod;

public class ModItems extends Item {
    public ModItems(Settings settings) {
        super(settings);
    }

    public static void additemstogroup(ItemGroup group, Item item)
    {
        ItemGroupEvents.MODIFY_ENTRIES_ALL.register(((group1, items) ->
        {
            if (group1.equals(group))
            {
                items.add(item);
            }
        }));
    }
    public static void reglogitems(Item item)
    {

        testmod.LOGGER.info("Regis mod items"+testmod.MOD_ID);
        ModItems.additemstogroup(AddItemGroup.TESTMOD,item);
    }

}
