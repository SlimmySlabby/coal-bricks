package com.slimmyslabby.cb;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@Mod(modid = CoalBricksMod.MODID, name = CoalBricksMod.NAME, version = CoalBricksMod.VERSION)
public class CoalBricksMod {

    public static final String MODID = "cb";
    public static final String NAME = "Coal Bricks";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.initializeItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        final ResourceLocation registryName = new ResourceLocation(MODID, "coal_brick_recipe");
        final ResourceLocation recipeGroup = new ResourceLocation(MODID, "recipes");
        final ItemStack output = new ItemStack(ModItems.COAL_BRICK);
        GameRegistry.addShapedRecipe(registryName, recipeGroup, output, "CC", "CC", 'C', Items.COAL);
    }
}