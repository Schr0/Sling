package schr0.slingblock.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.registries.IForgeRegistry;
import schr0.slingblock.SlingBlock;

public class SlingBlockRecipes
{

	public static final String KEY_RES = SlingBlock.MOD_ID;
	public static final ResourceLocation RES_SLING_NORMAL = new ResourceLocation(KEY_RES, "sling_normal");

	public void registerRecipes(IForgeRegistry<IRecipe> registry)
	{
		registry.register(getItemSlingNormal());
	}

	// TODO /* ======================================== MOD START =====================================*/

	private static IRecipe getItemSlingNormal()
	{
		return new ShapedOreRecipe(RES_SLING_NORMAL, new ItemStack(SlingBlockItems.SLING_NORMAL), new Object[]
		{
				"X  ",
				"YX ",
				"   ",

				'X', new ItemStack(Items.STRING),
				'Y', new ItemStack(Items.LEATHER),

		}).setRegistryName(RES_SLING_NORMAL);
	}

}
