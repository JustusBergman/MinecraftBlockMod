package net.justus.firstmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.justus.firstmod.FirstMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup STENAR = FabricItemGroupBuilder.build(
            new Identifier(FirstMod.MOD_ID, "stenar"), () -> new ItemStack(ModItems.MIN_STEN));
}
