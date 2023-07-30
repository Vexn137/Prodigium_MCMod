package net.vexn.prodigium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vexn.prodigium.ProdigiumMod;
import net.vexn.prodigium.item.custom.AthameItem;

public class ModItems {

    public static final Item GRIMOIRE = registerItem("grimoire", new Item(new FabricItemSettings()));
    public static final Item ATHAME = registerItem("athame",
            new AthameItem(ModToolMaterials.SILVER_MATERIAL,
            1,
            1.5f,
            new FabricItemSettings().maxDamage(75)
    ));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_SILVER);
        entries.add(SILVER_NUGGET);
        entries.add(SILVER_INGOT);
    }
    private static void addItemsToProdigiumTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(GRIMOIRE);
        entries.add(ATHAME);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ProdigiumMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ProdigiumMod.LOGGER.info("Registering Mod Items For " + ProdigiumMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.Prodigium_Group).register(ModItems::addItemsToProdigiumTabItemGroup);
    }
}
