package net.vexn.prodigium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vexn.prodigium.ProdigiumMod;

public class ModItemGroups {

    public static ItemGroup Prodigium_Group;

    public static void registerItemGroups() {

        ProdigiumMod.LOGGER.info("Registering Item Groups for " + ProdigiumMod.MOD_ID);

        Prodigium_Group = FabricItemGroup.builder(new Identifier(ProdigiumMod.MOD_ID, "prodigium"))
                .displayName(Text.literal("Prodigium"))
                .icon(() -> new ItemStack(ModItems.ATHAME))

                .build();
    }
}
