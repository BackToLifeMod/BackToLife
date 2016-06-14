package com.github.backtolifemod.backtolife.client.model;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

import com.github.backtolifemod.backtolife.entity.EntityFossil;
import com.github.backtolifemod.backtolife.entity.living.EntityLandPrehistoric;
import com.github.backtolifemod.backtolife.entity.living.EntityPrehistoric;
import com.github.backtolifemod.backtolife.entity.living.EntityTarbosaurus;

public class ModelTarbosaurus extends ModelPrehistoric {
	public AdvancedModelRenderer Body;
	public AdvancedModelRenderer RightLeg1;
	public AdvancedModelRenderer LeftLeg1;
	public AdvancedModelRenderer Neck1;
	public AdvancedModelRenderer Body2;
	public AdvancedModelRenderer Tail1;
	public AdvancedModelRenderer RightArm1;
	public AdvancedModelRenderer LeftArm1;
	public AdvancedModelRenderer Head1;
	public AdvancedModelRenderer Head2;
	public AdvancedModelRenderer UpperJaw1;
	public AdvancedModelRenderer HeadFeathers1;
	public AdvancedModelRenderer HeadFeathers2;
	public AdvancedModelRenderer HeadFeathers3;
	public AdvancedModelRenderer LowerJaw1;
	public AdvancedModelRenderer LowerJaw2;
	public AdvancedModelRenderer LowerJaw4;
	public AdvancedModelRenderer Gums;
	public AdvancedModelRenderer LowerJaw3;
	public AdvancedModelRenderer UpperJaw2;
	public AdvancedModelRenderer Teeth1;
	public AdvancedModelRenderer UpperJaw3;
	public AdvancedModelRenderer Teeth2;
	public AdvancedModelRenderer Tail2;
	public AdvancedModelRenderer Tail3;
	public AdvancedModelRenderer TailFeathers;
	public AdvancedModelRenderer RightArm2;
	public AdvancedModelRenderer RightHand;
	public AdvancedModelRenderer RightArmFeathers;
	public AdvancedModelRenderer LeftArm2;
	public AdvancedModelRenderer LeftHand;
	public AdvancedModelRenderer LeftArmFeathers;
	public AdvancedModelRenderer RightLeg2;
	public AdvancedModelRenderer RightFeet;
	public AdvancedModelRenderer LeftLeg2;
	public AdvancedModelRenderer LeftFeet;
	public AdvancedModelRenderer headPivot;
	public ModelAnimator animator;

	public ModelTarbosaurus() {
		this.textureWidth = 256;
		this.textureHeight = 128;
		this.LowerJaw4 = new AdvancedModelRenderer(this, 45, 94);
		this.LowerJaw4.setRotationPoint(0.0F, 3.0F, -5.0F);
		this.LowerJaw4.addBox(-1.5F, -1.0F, -4.0F, 3, 1, 4, 0.0F);
		this.setRotateAngle(LowerJaw4, -0.05235987755982988F, 0.0F, 0.0F);
		this.Teeth2 = new AdvancedModelRenderer(this, 38, 35);
		this.Teeth2.setRotationPoint(0.0F, 0.0F, -4.0F);
		this.Teeth2.addBox(-2.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
		this.Head2 = new AdvancedModelRenderer(this, 0, 91);
		this.Head2.setRotationPoint(0.0F, 2.0F, 0.0F);
		this.Head2.addBox(-3.0F, 0.0F, -5.0F, 6, 3, 6, 0.0F);
		this.LeftArmFeathers = new AdvancedModelRenderer(this, 37, 0);
		this.LeftArmFeathers.setRotationPoint(0.4F, -0.5F, 1.0F);
		this.LeftArmFeathers.addBox(0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F);
		this.setRotateAngle(LeftArmFeathers, -0.045553093477052F, 0.0F, 0.0F);
		this.UpperJaw1 = new AdvancedModelRenderer(this, 24, 72);
		this.UpperJaw1.setRotationPoint(0.0F, -3.0F, -9.0F);
		this.UpperJaw1.addBox(-2.5F, 0.0F, -6.0F, 5, 5, 6, 0.0F);
		this.setRotateAngle(UpperJaw1, 0.1699950691442477F, 0.0F, 0.0F);
		this.LowerJaw3 = new AdvancedModelRenderer(this, 58, 91);
		this.LowerJaw3.setRotationPoint(0.0F, 2.0F, -5.0F);
		this.LowerJaw3.addBox(-1.5F, -2.0F, -4.0F, 3, 2, 4, 0.0F);
		this.setRotateAngle(LowerJaw3, -0.17523105690023066F, 0.0F, 0.0F);
		this.Body = new AdvancedModelRenderer(this, 78, 0);
		this.Body.setRotationPoint(0.0F, 2.0F, -1.0F);
		this.Body.addBox(-4.0F, -5.0F, -16.0F, 8, 12, 23, 0.0F);
		this.setRotateAngle(Body, -0.045553093477052F, 0.0F, 0.0F);
		this.LowerJaw1 = new AdvancedModelRenderer(this, 25, 93);
		this.LowerJaw1.setRotationPoint(0.0F, 0.0F, -4.0F);
		this.LowerJaw1.addBox(-2.5F, 0.0F, -5.0F, 5, 3, 4, 0.0F);
		this.RightHand = new AdvancedModelRenderer(this, 30, 14);
		this.RightHand.setRotationPoint(-0.3F, 2.5F, -1.0F);
		this.RightHand.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(RightHand, 0.5918411493512771F, 0.0F, -0.045553093477052F);
		this.Neck1 = new AdvancedModelRenderer(this, 63, 0);
		this.Neck1.setRotationPoint(0.0F, 0.2F, -14.6F);
		this.Neck1.addBox(-2.5F, -5.0F, -10.0F, 5, 10, 13, 0.0F);
		this.setRotateAngle(Neck1, -0.31869712141416456F, 0.0F, 0.0F);
		this.HeadFeathers2 = new AdvancedModelRenderer(this, 0, 63);
		this.HeadFeathers2.setRotationPoint(-1.6F, -4.0F, -4.0F);
		this.HeadFeathers2.addBox(0.0F, 0.0F, 0.0F, 0, 4, 8, 0.0F);
		this.setRotateAngle(HeadFeathers2, 0.18203784098300857F, -0.045553093477052F, -0.136659280431156F);
		this.Gums = new AdvancedModelRenderer(this, 74, 88);
		this.Gums.setRotationPoint(0.0F, 0.0F, -5.0F);
		this.Gums.addBox(-2.0F, -7.0F, 0.0F, 4, 7, 5, 0.0F);
		this.setRotateAngle(Gums, -0.5918411493512771F, 0.0F, 0.0F);
		this.RightArm2 = new AdvancedModelRenderer(this, 30, 7);
		this.RightArm2.setRotationPoint(0.1F, 2.5F, 0.0F);
		this.RightArm2.addBox(-0.5F, -0.5F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(RightArm2, -1.0016444577195458F, -0.136659280431156F, 0.0F);
		this.HeadFeathers3 = new AdvancedModelRenderer(this, 0, 63);
		this.HeadFeathers3.setRotationPoint(1.6F, -4.0F, -4.0F);
		this.HeadFeathers3.addBox(0.0F, 0.0F, 0.0F, 0, 4, 8, 0.0F);
		this.setRotateAngle(HeadFeathers3, 0.18203784098300857F, 0.045553093477052F, 0.136659280431156F);
		this.LeftFeet = new AdvancedModelRenderer(this, 0, 43);
		this.LeftFeet.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.LeftFeet.addBox(-2.0F, -1.0F, -5.0F, 4, 2, 6, 0.0F);
		this.setRotateAngle(LeftFeet, 0.136659280431156F, 0.0F, 0.045553093477052F);
		this.Tail1 = new AdvancedModelRenderer(this, 84, 35);
		this.Tail1.setRotationPoint(0.0F, -2.7F, 6.0F);
		this.Tail1.addBox(-3.0F, -2.0F, -2.0F, 6, 8, 22, 0.0F);
		this.setRotateAngle(Tail1, -0.045553093477052F, 0.0F, 0.0F);
		this.RightArm1 = new AdvancedModelRenderer(this, 30, 0);
		this.RightArm1.setRotationPoint(-4.0F, 6.0F, -13.0F);
		this.RightArm1.addBox(-0.5F, -1.0F, -1.0F, 1, 4, 2, 0.0F);
		this.setRotateAngle(RightArm1, 0.8196066167365371F, -0.27314402793711257F, -0.091106186954104F);
		this.RightLeg1 = new AdvancedModelRenderer(this, 0, 0);
		this.RightLeg1.setRotationPoint(-3.5F, 3.0F, 3.4F);
		this.RightLeg1.addBox(-2.0F, -3.0F, -3.0F, 4, 14, 8, 0.0F);
		this.setRotateAngle(RightLeg1, -0.31869712141416456F, 0.0F, 0.045553093477052F);
		this.RightFeet = new AdvancedModelRenderer(this, 0, 43);
		this.RightFeet.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.RightFeet.addBox(-2.0F, -1.0F, -5.0F, 4, 2, 6, 0.0F);
		this.setRotateAngle(RightFeet, 0.136659280431156F, 0.0F, -0.045553093477052F);
		this.Body2 = new AdvancedModelRenderer(this, 25, 1);
		this.Body2.setRotationPoint(0.0F, 7.0F, -14.0F);
		this.Body2.addBox(-1.5F, -9.0F, 0.0F, 3, 9, 23, 0.0F);
		this.setRotateAngle(Body2, -0.14713125594312196F, 0.0F, 0.0F);
		this.Tail3 = new AdvancedModelRenderer(this, 57, 46);
		this.Tail3.setRotationPoint(0.0F, -0.4F, 16.0F);
		this.Tail3.addBox(-1.5F, -1.0F, -2.0F, 3, 4, 20, 0.0F);
		this.setRotateAngle(Tail3, -0.091106186954104F, 0.0F, 0.0F);
		this.Tail2 = new AdvancedModelRenderer(this, 96, 65);
		this.Tail2.setRotationPoint(0.0F, 0.5F, 20.0F);
		this.Tail2.addBox(-2.0F, -2.0F, -2.0F, 4, 6, 18, 0.0F);
		this.setRotateAngle(Tail2, 0.091106186954104F, 0.0F, 0.0F);
		this.RightArmFeathers = new AdvancedModelRenderer(this, 37, 0);
		this.RightArmFeathers.setRotationPoint(-0.4F, -0.5F, 1.0F);
		this.RightArmFeathers.addBox(0.0F, 0.0F, -0.5F, 0, 4, 2, 0.0F);
		this.setRotateAngle(RightArmFeathers, -0.045553093477052F, 0.0F, 0.0F);
		this.LeftLeg2 = new AdvancedModelRenderer(this, 0, 24);
		this.LeftLeg2.setRotationPoint(0.0F, 7.0F, 5.0F);
		this.LeftLeg2.addBox(-1.5F, -1.0F, -2.5F, 3, 13, 4, 0.0F);
		this.setRotateAngle(LeftLeg2, 0.18203784098300857F, 0.0F, 0.0F);
		this.UpperJaw2 = new AdvancedModelRenderer(this, 48, 73);
		this.UpperJaw2.setRotationPoint(0.0F, 5.0F, -6.0F);
		this.UpperJaw2.addBox(-2.0F, -5.0F, -4.0F, 4, 5, 4, 0.0F);
		this.setRotateAngle(UpperJaw2, -0.136659280431156F, 0.0F, 0.0F);
		this.LeftArm2 = new AdvancedModelRenderer(this, 30, 7);
		this.LeftArm2.setRotationPoint(-0.1F, 2.5F, 0.0F);
		this.LeftArm2.addBox(-0.5F, -0.5F, -1.0F, 1, 3, 2, 0.0F);
		this.setRotateAngle(LeftArm2, -1.0016444577195458F, 0.136659280431156F, 0.0F);
		this.Teeth1 = new AdvancedModelRenderer(this, 18, 35);
		this.Teeth1.setRotationPoint(0.0F, 5.0F, -6.0F);
		this.Teeth1.addBox(-2.5F, 0.0F, 0.0F, 5, 2, 4, 0.0F);
		this.TailFeathers = new AdvancedModelRenderer(this, 93, 70);
		this.TailFeathers.setRotationPoint(0.0F, -1.0F, 3.0F);
		this.TailFeathers.addBox(0.0F, -2.5F, 0.0F, 0, 5, 23, 0.0F);
		this.HeadFeathers1 = new AdvancedModelRenderer(this, 0, 63);
		this.HeadFeathers1.setRotationPoint(0.0F, -4.0F, -5.0F);
		this.HeadFeathers1.addBox(0.0F, 0.0F, 0.0F, 0, 4, 8, 0.0F);
		this.setRotateAngle(HeadFeathers1, 0.27314402793711257F, 0.0F, 0.0F);
		this.LeftLeg1 = new AdvancedModelRenderer(this, 0, 0);
		this.LeftLeg1.setRotationPoint(3.5F, 3.0F, 3.4F);
		this.LeftLeg1.addBox(-2.0F, -3.0F, -3.0F, 4, 14, 8, 0.0F);
		this.setRotateAngle(LeftLeg1, -0.31869712141416456F, 0.0F, -0.045553093477052F);
		this.RightLeg2 = new AdvancedModelRenderer(this, 0, 24);
		this.RightLeg2.setRotationPoint(0.0F, 7.0F, 5.0F);
		this.RightLeg2.addBox(-1.5F, -1.0F, -2.5F, 3, 13, 4, 0.0F);
		this.setRotateAngle(RightLeg2, 0.18203784098300857F, 0.0F, 0.0F);
		this.LeftHand = new AdvancedModelRenderer(this, 30, 14);
		this.LeftHand.setRotationPoint(0.3F, 2.5F, -1.0F);
		this.LeftHand.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(LeftHand, 0.5918411493512771F, 0.0F, 0.045553093477052F);
		this.UpperJaw3 = new AdvancedModelRenderer(this, 57, 75);
		this.UpperJaw3.setRotationPoint(0.0F, -4.6F, -3.5F);
		this.UpperJaw3.addBox(-1.5F, -0.8F, 0.0F, 3, 1, 9, 0.0F);
		this.setRotateAngle(UpperJaw3, 0.09267698328089889F, 0.0F, 0.0F);
		this.Head1 = new AdvancedModelRenderer(this, 0, 75);
		this.Head1.addBox(-3.0F, -4.0F, -9.0F, 6, 6, 10, 0.0F);
		this.headPivot = new AdvancedModelRenderer(this, 0, 0);
		this.headPivot.setRotationPoint(0.0F, -1.1F, -9.0F);
		this.setRotateAngle(headPivot, 0.4553564018453205F, 0.0F, 0.0F);
		this.LeftArm1 = new AdvancedModelRenderer(this, 30, 0);
		this.LeftArm1.setRotationPoint(4.0F, 6.0F, -13.0F);
		this.LeftArm1.addBox(-0.5F, -1.0F, -1.0F, 1, 4, 2, 0.0F);
		this.setRotateAngle(LeftArm1, 0.8196066167365371F, 0.27314402793711257F, 0.091106186954104F);
		this.LowerJaw2 = new AdvancedModelRenderer(this, 40, 85);
		this.LowerJaw2.setRotationPoint(0.0F, 0.0F, -5.0F);
		this.LowerJaw2.addBox(-2.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F);
		this.setRotateAngle(LowerJaw2, 0.17523105690023066F, 0.0F, 0.0F);
		this.LowerJaw1.addChild(this.LowerJaw4);
		this.UpperJaw2.addChild(this.Teeth2);
		this.Head1.addChild(this.Head2);
		this.LeftArm2.addChild(this.LeftArmFeathers);
		this.Head1.addChild(this.UpperJaw1);
		this.LowerJaw2.addChild(this.LowerJaw3);
		this.Head2.addChild(this.LowerJaw1);
		this.RightArm2.addChild(this.RightHand);
		this.Body.addChild(this.Neck1);
		this.Head1.addChild(this.HeadFeathers2);
		this.LowerJaw1.addChild(this.Gums);
		this.RightArm1.addChild(this.RightArm2);
		this.Head1.addChild(this.HeadFeathers3);
		this.LeftLeg2.addChild(this.LeftFeet);
		this.Body.addChild(this.Tail1);
		this.Body.addChild(this.RightArm1);
		this.RightLeg2.addChild(this.RightFeet);
		this.Body.addChild(this.Body2);
		this.Tail2.addChild(this.Tail3);
		this.Tail1.addChild(this.Tail2);
		this.RightArm2.addChild(this.RightArmFeathers);
		this.LeftLeg1.addChild(this.LeftLeg2);
		this.UpperJaw1.addChild(this.UpperJaw2);
		this.LeftArm1.addChild(this.LeftArm2);
		this.UpperJaw1.addChild(this.Teeth1);
		this.Tail3.addChild(this.TailFeathers);
		this.Head1.addChild(this.HeadFeathers1);
		this.RightLeg1.addChild(this.RightLeg2);
		this.LeftArm2.addChild(this.LeftHand);
		this.UpperJaw2.addChild(this.UpperJaw3);
		this.Neck1.addChild(this.headPivot);
		this.headPivot.addChild(this.Head1);
		this.Body.addChild(this.LeftArm1);
		this.LowerJaw1.addChild(this.LowerJaw2);
		this.updateDefaultPose();
		animator = ModelAnimator.create();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
		this.Body.render(f5);
		this.RightLeg1.render(f5);
		this.LeftLeg1.render(f5);
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.resetToDefaultPose();
		animator.update(entity);
		setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
		animator.setAnimation(EntityLandPrehistoric.ANIMATION_SPEAK);
		animator.startKeyframe(10);
		rotate(animator, LowerJaw1, 25F, 0, 0);
		rotate(animator, Head1, -10F, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(10);
		animator.setAnimation(EntityPrehistoric.ANIMATION_EAT);
		animator.startKeyframe(5);
		rotate(animator, Neck1, 15F, 0, 0);
		rotate(animator, LowerJaw1, 15F, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.startKeyframe(5);
		rotate(animator, LowerJaw1, 15F, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.setAnimation(EntityTarbosaurus.ANIMATION_ATTACK);
		animator.startKeyframe(5);
		rotate(animator, Neck1, 18F, 0, 7F);
		rotate(animator, Head1, 26F, 0, -18F);
		rotate(animator, LowerJaw1, 31F, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.setAnimation(EntityTarbosaurus.ANIMATION_SHAKE);
		animator.startKeyframe(15);
		rotate(animator, Body, 10F, 0, 0);
		rotate(animator, Neck1, 2F, 0, 0);
		rotate(animator, Head1, 26F, 0, 0);
		rotate(animator, LowerJaw1, 21F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(10);
		rotate(animator, Body, -3F, 0, 0);
		rotate(animator, Neck1, 2F, -39F, 0);
		rotate(animator, Head1, 20F, -20F, 0);
		rotate(animator, LowerJaw1, 27F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(10);
		rotate(animator, Body, -3F, 0, 0);
		rotate(animator, Neck1, 2F, 39F, 0);
		rotate(animator, Head1, 20F, 20F, 0);
		rotate(animator, LowerJaw1, 27F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(10);
		rotate(animator, Body, -3F, 0, 0);
		rotate(animator, Neck1, 2F, -39F, 0);
		rotate(animator, Head1, 20F, -20F, 0);
		rotate(animator, LowerJaw1, 27F, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(10);
		rotate(animator, Body, -3F, 0, 0);
		rotate(animator, Neck1, 2F, 39F, 0);
		rotate(animator, Head1, 20F, 20F, 0);
		rotate(animator, LowerJaw1, 27F, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(10);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		float speed_walk = 0.2F;
		float speed_idle = 0.05F;
		float degree_walk = 0.5F;
		float degree_idle = 0.5F;
		AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{Neck1, Head1};
		AdvancedModelRenderer[] TAIL = new AdvancedModelRenderer[]{Tail1, Tail2, Tail3};
		if(((EntityTarbosaurus)entity).getAnimation() != EntityTarbosaurus.ANIMATION_SHAKE){
			this.faceTarget(f3, f4, 2, NECK);
		}
		this.bob(Body, speed_idle, degree_idle * 0.8F, false, entity.ticksExisted, 1);
		this.walk(Body, speed_idle, degree_idle * 0.05F, false, 0, 0, entity.ticksExisted, 1);
		this.chainWave(NECK, speed_idle, degree_idle * 0.2F, 4, entity.ticksExisted, 1);
		this.chainWave(TAIL, speed_idle, degree_idle * 0.1F, 0, entity.ticksExisted, 1);
		this.walk(RightArm1, speed_idle, degree_idle * 0.2F, false, 0, 0, entity.ticksExisted, 1);
		this.walk(RightArm2, speed_idle, degree_idle * 0.25F, true, 0, -0.3F, entity.ticksExisted, 1);
		this.walk(LeftArm1, speed_idle, degree_idle * 0.2F, false, 0, 0, entity.ticksExisted, 1);
		this.walk(LeftArm2, speed_idle, degree_idle * 0.25F, true, 0, -0.3F, entity.ticksExisted, 1);
		this.chainWave(NECK, speed_walk, degree_walk * 0.5F, 4, f, f1);
		this.chainSwing(TAIL, speed_walk, degree_walk * 0.4F, 1, f, f1);
		this.bob(Body, speed_walk, degree_walk * 0.8F, false, f, f1);
		this.walk(RightArm1, speed_walk, degree_walk * 0.3F, false, 0, 0, f, f1);
		this.walk(RightArm2, speed_walk, degree_walk * 0.35F, true, 0, -0.3F, f, f1);
		this.walk(LeftArm1, speed_walk, degree_walk * 0.3F, false, 0, 0, f, f1);
		this.walk(LeftArm2, speed_walk, degree_walk * 0.35F, true, 0, -0.3F, f, f1);
		this.walk(RightLeg1, speed_walk, degree_walk * 1.2F, true, 0, 0F, f, f1);
		this.walk(RightLeg2, speed_walk, degree_walk * 0.7F, true, 0, -0.2F, f, f1);
		this.walk(RightFeet, speed_walk, degree_walk * 0.7F, true, -0.7F, -0.4F, f, f1);
		this.walk(LeftLeg1, speed_walk, degree_walk * 1.2F, false, 0, 0F, f, f1);
		this.walk(LeftLeg2, speed_walk, degree_walk * 0.7F, false, 0, 0.2F, f, f1);
		this.walk(LeftFeet, speed_walk, degree_walk * 0.7F, false, -0.7F, 0.4F, f, f1);
		{
			float sitProgress = ((EntityLandPrehistoric)entity).sitProgress;
			sitAnimationRotation(LowerJaw2, sitProgress, (float)Math.toRadians(10.04D), 0, 0);
	        sitAnimationRotation(RightArm1, sitProgress, (float)Math.toRadians(75.65D), -((float)Math.toRadians(15.65D)), -((float)Math.toRadians(5.22D)));
	        sitAnimationRotation(LeftHand, sitProgress, (float)Math.toRadians(33.91D), 0, (float)Math.toRadians(2.61D));
	        sitAnimationRotation(Tail2, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
	        sitAnimationRotation(LeftFeet, sitProgress, (float)Math.toRadians(80.87D), 0, (float)Math.toRadians(2.61D));
	        sitAnimationRotation(LowerJaw3, sitProgress, -((float)Math.toRadians(10.04D)), 0, 0);
	        sitAnimationRotation(HeadFeathers2, sitProgress, (float)Math.toRadians(10.43D), -((float)Math.toRadians(2.61D)), -((float)Math.toRadians(7.83D)));
	        sitAnimationRotation(headPivot, sitProgress, (float)Math.toRadians(44.35D), 0, 0);
	        sitAnimationRotation(LowerJaw4, sitProgress, -((float)Math.toRadians(3.0D)), 0, 0);
	        sitAnimationRotation(Gums, sitProgress, -((float)Math.toRadians(33.91D)), 0, 0);
	        sitAnimationRotation(RightArmFeathers, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
	        sitAnimationRotation(RightLeg2, sitProgress, (float)Math.toRadians(10.43D), 0, 0);
	        sitAnimationRotation(UpperJaw1, sitProgress, (float)Math.toRadians(9.74D), 0, 0);
	        sitAnimationRotation(HeadFeathers3, sitProgress, (float)Math.toRadians(10.43D), (float)Math.toRadians(2.61D), (float)Math.toRadians(7.83D));
	        sitAnimationRotation(LeftArm1, sitProgress, (float)Math.toRadians(75.65D), (float)Math.toRadians(15.65D), (float)Math.toRadians(5.22D));
	        sitAnimationRotation(UpperJaw3, sitProgress, (float)Math.toRadians(5.31D), 0, 0);
	        sitAnimationRotation(HeadFeathers1, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
	        sitAnimationRotation(RightLeg1, sitProgress, -((float)Math.toRadians(91.3D)), (float)Math.toRadians(5.22D), (float)Math.toRadians(2.61D));
	        sitAnimationRotation(RightHand, sitProgress, (float)Math.toRadians(33.91D), 0, -((float)Math.toRadians(2.61D)));
	        sitAnimationRotation(Body2, sitProgress, -((float)Math.toRadians(8.43D)), 0, 0);
	        sitAnimationRotation(Body, sitProgress, -((float)Math.toRadians(20.87D)), 0, 0);
	        sitAnimationRotation(LeftArm2, sitProgress, -((float)Math.toRadians(57.39D)), (float)Math.toRadians(7.83D), 0);
	        sitAnimationRotation(LeftLeg2, sitProgress, (float)Math.toRadians(10.43D), 0, 0);
	        sitAnimationRotation(Neck1, sitProgress, -((float)Math.toRadians(18.26D)), 0, 0);
	        sitAnimationRotation(LeftLeg1, sitProgress, -((float)Math.toRadians(91.3D)), -((float)Math.toRadians(5.22D)), -((float)Math.toRadians(2.61D)));
	        sitAnimationRotation(RightFeet, sitProgress, (float)Math.toRadians(80.87D), 0, -((float)Math.toRadians(2.61D)));
	        sitAnimationRotation(Tail3, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
	        sitAnimationRotation(RightArm2, sitProgress, -((float)Math.toRadians(57.39D)), -((float)Math.toRadians(7.83D)), 0);
	        sitAnimationRotation(UpperJaw2, sitProgress, -((float)Math.toRadians(7.83D)), 0, 0);
	        sitAnimationPos(Body, sitProgress, 0, 12, -1);
	        sitAnimationPos(RightLeg1, sitProgress, -3, 16, 5);
	        sitAnimationPos(LeftLeg1, sitProgress, 3, 16, 5);
		}
		{
			float sitProgress = ((EntityLandPrehistoric)entity).sitProgress;
			sitAnimationRotation(Gums, sitProgress, -((float)Math.toRadians(33.91D)), 0, 0);
	        sitAnimationRotation(UpperJaw3, sitProgress, (float)Math.toRadians(5.31D), 0, 0);
	        sitAnimationRotation(RightFeet, sitProgress, (float)Math.toRadians(80.87D), 0, -((float)Math.toRadians(2.61D)));
	        sitAnimationRotation(Tail3, sitProgress, (float)Math.toRadians(2.61D), 0, 0);
	        sitAnimationRotation(LeftLeg2, sitProgress, (float)Math.toRadians(10.43D), 0, 0);
	        sitAnimationRotation(LowerJaw4, sitProgress, -((float)Math.toRadians(3.0D)), 0, 0);
	        sitAnimationRotation(LowerJaw2, sitProgress, (float)Math.toRadians(10.04D), 0, 0);
	        sitAnimationRotation(RightHand, sitProgress, (float)Math.toRadians(33.91D), 0, -((float)Math.toRadians(2.61D)));
	        sitAnimationRotation(headPivot, sitProgress, (float)Math.toRadians(83.48D), 0, 0);
	        sitAnimationRotation(HeadFeathers2, sitProgress, (float)Math.toRadians(10.43D), -((float)Math.toRadians(2.61D)), -((float)Math.toRadians(7.83D)));
	        sitAnimationRotation(RightLeg1, sitProgress, -((float)Math.toRadians(91.3D)), (float)Math.toRadians(5.22D), (float)Math.toRadians(2.61D));
	        sitAnimationRotation(LeftHand, sitProgress, (float)Math.toRadians(33.91D), 0, (float)Math.toRadians(2.61D));
	        sitAnimationRotation(HeadFeathers3, sitProgress, (float)Math.toRadians(10.43D), (float)Math.toRadians(2.61D), (float)Math.toRadians(7.83D));
	        sitAnimationRotation(Tail2, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
	        sitAnimationRotation(Neck1, sitProgress, -((float)Math.toRadians(26.09D)), 0, 0);
	        sitAnimationRotation(HeadFeathers1, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
	        sitAnimationRotation(LeftArmFeathers, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
	        sitAnimationRotation(LeftLeg1, sitProgress, -((float)Math.toRadians(91.3D)), -((float)Math.toRadians(5.22D)), -((float)Math.toRadians(2.61D)));
	        sitAnimationRotation(LowerJaw3, sitProgress, -((float)Math.toRadians(10.04D)), 0, 0);
	        sitAnimationRotation(UpperJaw2, sitProgress, -((float)Math.toRadians(7.83D)), 0, 0);
	        sitAnimationRotation(LeftFeet, sitProgress, (float)Math.toRadians(80.87D), 0, (float)Math.toRadians(2.61D));
	        sitAnimationRotation(RightArm1, sitProgress, (float)Math.toRadians(75.65D), -((float)Math.toRadians(15.65D)), -((float)Math.toRadians(5.22D)));
	        sitAnimationRotation(RightArm2, sitProgress, -((float)Math.toRadians(57.39D)), -((float)Math.toRadians(7.83D)), 0);
	        sitAnimationRotation(UpperJaw1, sitProgress, (float)Math.toRadians(9.74D), 0, 0);
	        sitAnimationRotation(LeftArm1, sitProgress, (float)Math.toRadians(75.65D), (float)Math.toRadians(15.65D), (float)Math.toRadians(5.22D));
	        sitAnimationRotation(Body, sitProgress, -((float)Math.toRadians(20.87D)), 0, 0);
	        sitAnimationRotation(LeftArm2, sitProgress, -((float)Math.toRadians(57.39D)), (float)Math.toRadians(7.83D), 0);
	        sitAnimationRotation(RightLeg2, sitProgress, (float)Math.toRadians(10.43D), 0, 0);
	        sitAnimationRotation(RightArmFeathers, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
	        sitAnimationRotation(Body2, sitProgress, -((float)Math.toRadians(8.43D)), 0, 0);
	        sitAnimationPos(Body, sitProgress, 0, 12, -1);
	        sitAnimationPos(RightLeg1, sitProgress, -3, 16, 5);
	        sitAnimationPos(LeftLeg1, sitProgress, 3, 16, 5);
		}
	}
	
    public void renderFossil(EntityFossil fossil){
    	this.Body.render(0.0625F);
		this.RightLeg1.render(0.0625F);
		this.LeftLeg1.render(0.0625F);
		this.resetToDefaultPose();
		{
			float sitProgress = 25;
			 sitAnimationRotation(LowerJaw3, sitProgress, -((float)Math.toRadians(10.04D)), 0, 0);
		        sitAnimationRotation(RightLeg1, sitProgress, -((float)Math.toRadians(75.0D)), 0, (float)Math.toRadians(2.61D));
		        sitAnimationRotation(LowerJaw2, sitProgress, (float)Math.toRadians(10.04D), 0, 0);
		        sitAnimationRotation(Gums, sitProgress, -((float)Math.toRadians(33.91D)), 0, 0);
		        sitAnimationRotation(Tail2, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
		        sitAnimationRotation(UpperJaw2, sitProgress, -((float)Math.toRadians(7.83D)), 0, 0);
		        sitAnimationRotation(Neck1, sitProgress, -((float)Math.toRadians(46.96D)), (float)Math.toRadians(23.48D), 0);
		        sitAnimationRotation(LeftHand, sitProgress, (float)Math.toRadians(33.91D), 0, (float)Math.toRadians(2.61D));
		        sitAnimationRotation(LeftArm1, sitProgress, (float)Math.toRadians(80.0D), (float)Math.toRadians(15.65D), (float)Math.toRadians(5.22D));
		        sitAnimationRotation(LeftLeg1, sitProgress, -((float)Math.toRadians(7.83D)), -((float)Math.toRadians(2.61D)), (float)Math.toRadians(20.87D));
		        sitAnimationRotation(LeftFeet, sitProgress, -((float)Math.toRadians(5.22D)), -((float)Math.toRadians(7.83D)), -((float)Math.toRadians(18.26D)));
		        sitAnimationRotation(HeadFeathers2, sitProgress, (float)Math.toRadians(10.43D), -((float)Math.toRadians(2.61D)), -((float)Math.toRadians(7.83D)));
		        sitAnimationRotation(HeadFeathers3, sitProgress, (float)Math.toRadians(10.43D), (float)Math.toRadians(2.61D), (float)Math.toRadians(7.83D));
		        sitAnimationRotation(HeadFeathers1, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
		        sitAnimationRotation(LeftLeg2, sitProgress, (float)Math.toRadians(127.83D), -((float)Math.toRadians(13.04D)), -((float)Math.toRadians(26.09D)));
		        sitAnimationRotation(RightArm1, sitProgress, (float)Math.toRadians(80.0D), -((float)Math.toRadians(15.65D)), -((float)Math.toRadians(5.22D)));
		        sitAnimationRotation(LeftArm2, sitProgress, -((float)Math.toRadians(100.0D)), (float)Math.toRadians(7.83D), 0);
		        sitAnimationRotation(RightFeet, sitProgress, (float)Math.toRadians(60.0D), 0, -((float)Math.toRadians(2.61D)));
		        sitAnimationRotation(Tail1, sitProgress, (float)Math.toRadians(20.87D), 0, 0);
		        sitAnimationRotation(Head1, sitProgress, -((float)Math.toRadians(28.7D)), -((float)Math.toRadians(13.04D)), -((float)Math.toRadians(13.04D)));
		        sitAnimationRotation(RightArmFeathers, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
		        sitAnimationRotation(LowerJaw1, sitProgress, (float)Math.toRadians(18.26D), 0, 0);
		        sitAnimationRotation(LeftArmFeathers, sitProgress, -((float)Math.toRadians(2.61D)), 0, 0);
		        sitAnimationRotation(Body2, sitProgress, -((float)Math.toRadians(8.43D)), 0, 0);
		        sitAnimationRotation(UpperJaw1, sitProgress, (float)Math.toRadians(9.74D), 0, 0);
		        sitAnimationRotation(LowerJaw4, sitProgress, -((float)Math.toRadians(3.0D)), 0, 0);
		        sitAnimationRotation(RightArm2, sitProgress, -((float)Math.toRadians(100.0D)), -((float)Math.toRadians(7.83D)), 0);
		        sitAnimationRotation(RightLeg2, sitProgress, (float)Math.toRadians(140.0D), 0, 0);
		        sitAnimationRotation(UpperJaw3, sitProgress, (float)Math.toRadians(5.31D), 0, 0);
		        sitAnimationRotation(Tail3, sitProgress, (float)Math.toRadians(15.65D), 0, 0);
		        sitAnimationRotation(RightHand, sitProgress, (float)Math.toRadians(33.91D), 0, -((float)Math.toRadians(2.61D)));

		}
    }

}
