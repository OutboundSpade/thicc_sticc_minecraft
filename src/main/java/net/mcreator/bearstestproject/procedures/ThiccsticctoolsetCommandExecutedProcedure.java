package net.mcreator.bearstestproject.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.bearstestproject.item.Thiccsticc_toolsSwordItem;
import net.mcreator.bearstestproject.item.Thiccsticc_toolsShovelItem;
import net.mcreator.bearstestproject.item.Thiccsticc_toolsPickaxeItem;
import net.mcreator.bearstestproject.item.Thiccsticc_toolsHoeItem;
import net.mcreator.bearstestproject.item.Thiccsticc_toolsAxeItem;
import net.mcreator.bearstestproject.item.ThiccsticcItem;
import net.mcreator.bearstestproject.block.StickoreBlock;
import net.mcreator.bearstestproject.ThiccSticcModElements;

import java.util.Map;

@ThiccSticcModElements.ModElement.Tag
public class ThiccsticctoolsetCommandExecutedProcedure extends ThiccSticcModElements.ModElement {
	public ThiccsticctoolsetCommandExecutedProcedure(ThiccSticcModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ThiccsticctoolsetCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Thiccsticc_toolsSwordItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Thiccsticc_toolsPickaxeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Thiccsticc_toolsAxeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Thiccsticc_toolsShovelItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(Thiccsticc_toolsHoeItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ThiccsticcItem.block, (int) (1));
			_setstack.setCount((int) 64);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(StickoreBlock.block, (int) (1));
			_setstack.setCount((int) 64);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
