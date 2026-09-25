package slmslb_coal_bricks;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
    public static void addCraftingRecipes() {
        final ResourceLocation registryName = new ResourceLocation(CoalBricksMod.MODID, "coal_brick_recipe");
        final ResourceLocation recipeGroup = new ResourceLocation(CoalBricksMod.MODID, "recipes");
        final ItemStack output = new ItemStack(ModItems.COAL_BRICK);
        GameRegistry.addShapedRecipe(registryName, recipeGroup, output, "CC", "CC", 'C', Items.COAL);
    }
}