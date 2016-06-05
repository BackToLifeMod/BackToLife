package com.github.backtolifemod.backtolife.entity.living;

import com.github.backtolifemod.backtolife.enums.EnumPrehistoricType;

import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityVelociraptor extends EntityLandPrehistoric {

	public EntityVelociraptor(World worldIn) {
		super(worldIn, EnumPrehistoricType.VELOCIRAPTOR, 1, 3, 6, 18, 0.10000000149011612D, 0.4D);
		this.setSize(1.9F, 1.7F);
		this.maximumModelSize = 0.6F;
		this.minimumModelSize = 0.2F;
	}

	protected void initEntityAI(){
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
	}


	@Override
	public int getGrownAge() {
		return 5;
	}

}