
package net.mcreator.bearstestproject.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bearstestproject.ThiccSticcModElements;

@ThiccSticcModElements.ModElement.Tag
public class Thiccsticc_toolsSwordItem extends ThiccSticcModElements.ModElement {
	@ObjectHolder("thicc_sticc:thiccsticc_tools_sword")
	public static final Item block = null;
	public Thiccsticc_toolsSwordItem(ThiccSticcModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 20;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 118f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ThiccsticcingotItem.block, (int) (1)), new ItemStack(ThiccsticcItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("thiccsticc_tools_sword"));
	}
}
