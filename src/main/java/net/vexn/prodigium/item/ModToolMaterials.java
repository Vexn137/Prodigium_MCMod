package net.vexn.prodigium.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vexn.prodigium.ProdigiumMod;
import net.vexn.prodigium.item.custom.AthameItem;

public class ModToolMaterials {


    public static final ToolMaterial SILVER_MATERIAL = new ToolMaterial() {
        @Override
        public int getDurability() {
            return 450;
        }
        @Override
        public float getMiningSpeedMultiplier() {
            return 6.0f;
        }
        @Override
        public float getAttackDamage() {
            return 3;
        }
        @Override
        public int getMiningLevel() {
            return 2;
        }
        @Override
        public int getEnchantability() {
            return 17;
        }
        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModItems.SILVER_INGOT);
        }
    };
    public static void registerModMaterials() {
        ProdigiumMod.LOGGER.info("Registering Mod Materials For " + ProdigiumMod.MOD_ID);
    }
}
