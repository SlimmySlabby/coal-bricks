package com.slimmyslabby.cb;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.item.Item;

@Mod.EventBusSubscriber
public class FuelHandler {

    @SubscribeEvent
    public static void onFurnaceFuelBurnTime(FurnaceFuelBurnTimeEvent event) {
        final Item fuel = event.getItemStack().getItem();
        final short ticksPerItem = 200;
        if (fuel == ModItems.COAL_BRICK) {
            event.setBurnTime(ticksPerItem * 32);
        }
    }
}