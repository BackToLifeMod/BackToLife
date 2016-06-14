package com.github.backtolifemod.backtolife.core;

import net.minecraftforge.fml.common.registry.EntityRegistry;

import com.github.backtolifemod.backtolife.BackToLife;
import com.github.backtolifemod.backtolife.entity.EntityFossil;
import com.github.backtolifemod.backtolife.enums.EnumPrehistoricType;

public class ModEntities {

	public static void init() {
		for (EnumPrehistoricType prehistoric : EnumPrehistoricType.values()) {
			if (prehistoric.entityClass != null) {
				EntityRegistry.registerModEntity(prehistoric.entityClass, prehistoric.toString().toLowerCase(), prehistoric.ordinal() + 20, BackToLife.INSTANCE, 80, 3, true, prehistoric.colorA, prehistoric.colorB);
			}
		}
		EntityRegistry.registerModEntity(EntityFossil.class, "fossil", 200, BackToLife.INSTANCE, 80, 3, true, 0, 0);
	}
}
