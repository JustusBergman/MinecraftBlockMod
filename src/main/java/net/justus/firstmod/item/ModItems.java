package net.justus.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.justus.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MIN_STEN = registerItem("min_sten",
            new Item(new FabricItemSettings().group(ModItemGroup.STENAR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.debug("Registering Mod Items for " + FirstMod.MOD_ID);
    }
}
