package com.slimmyslabby.cb;

import net.minecraft.item.Item;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Mod.EventBusSubscriber
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(ModItems.COAL_BRICK);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        final ModelResourceLocation rlCoalBrickModel = new ModelResourceLocation(ModItems.COAL_BRICK.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(ModItems.COAL_BRICK, 0, rlCoalBrickModel);
    }
}