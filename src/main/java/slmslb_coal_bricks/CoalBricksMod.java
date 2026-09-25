package slmslb_coal_bricks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CoalBricksMod.MODID, name = CoalBricksMod.NAME, version = CoalBricksMod.VERSION)
public class CoalBricksMod {

    public static final String MODID = "slmslb_coal_bricks";
    public static final String NAME = "Coal Bricks";
    public static final String VERSION = "1.2";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.initializeItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.addCraftingRecipes();
    }
}