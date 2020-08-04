package net.mcreator.bearstestproject.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.bearstestproject.ThiccSticcModElements;

import java.util.Map;

@ThiccSticcModElements.ModElement.Tag
public class KillmeCommandExecutedProcedure extends ThiccSticcModElements.ModElement {
	public KillmeCommandExecutedProcedure(ThiccSticcModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure KillmeCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Okee dokie"), (false));
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getMaxHealth() : -1));
	}
}
