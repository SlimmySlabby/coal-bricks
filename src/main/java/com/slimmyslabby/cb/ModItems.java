package com.slimmyslabby.cb;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ModItems {
    
    public static Item COAL_BRICK;

    public static void initializeItems() {
        COAL_BRICK = new Item();
        COAL_BRICK.setRegistryName(CoalBricksMod.MODID, "coal_brick");
        COAL_BRICK.setUnlocalizedName(CoalBricksMod.MODID + ".coal_brick");
        COAL_BRICK.setCreativeTab(CreativeTabs.MATERIALS);
    }

}