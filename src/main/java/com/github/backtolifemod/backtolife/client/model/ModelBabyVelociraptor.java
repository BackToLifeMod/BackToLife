package com.github.backtolifemod.backtolife.client.model;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

import com.github.backtolifemod.backtolife.entity.living.EntityLandPrehistoric;
import com.github.backtolifemod.backtolife.entity.living.EntityPrehistoric;
import com.github.backtolifemod.backtolife.entity.living.EntityVelociraptor;

public class ModelBabyVelociraptor extends ModelPrehistoric {
    public AdvancedModelRenderer Body1;
    public AdvancedModelRenderer RightLeg1;
    public AdvancedModelRenderer LeftLeg1;
    public AdvancedModelRenderer Neck;
    public AdvancedModelRenderer Body2;
    public AdvancedModelRenderer Tail1;
    public AdvancedModelRenderer RightArm1;
    public AdvancedModelRenderer LeftArm1;
    public AdvancedModelRenderer Head1;
    public AdvancedModelRenderer Head2;
    public AdvancedModelRenderer headPivot;
    public AdvancedModelRenderer UpperJaw1;
    public AdvancedModelRenderer UpperJaw3;
    public AdvancedModelRenderer HeadFeathers2;
    public AdvancedModelRenderer HeadFeathers3;
    public AdvancedModelRenderer HeadFeathers2_1;
    public AdvancedModelRenderer HeadFeathers4;
    public AdvancedModelRenderer HeadFeathers5;
    public AdvancedModelRenderer LowerJaw1;
    public AdvancedModelRenderer LowerJaw2;
    public AdvancedModelRenderer Gums;
    public AdvancedModelRenderer LowerJaw3;
    public AdvancedModelRenderer shape51;
    public AdvancedModelRenderer shape51_1;
    public AdvancedModelRenderer UpperJaw2;
    public AdvancedModelRenderer Teeth1;
    public AdvancedModelRenderer Teeth2;
    public AdvancedModelRenderer Tail2;
    public AdvancedModelRenderer Tailfeathers1;
    public AdvancedModelRenderer Tail3;
    public AdvancedModelRenderer Tailfeathers2;
    public AdvancedModelRenderer Tailfeathers3;
    public AdvancedModelRenderer TailFeathers4;
    public AdvancedModelRenderer RightArm2;
    public AdvancedModelRenderer RArmFeathers1;
    public AdvancedModelRenderer RArmFeathers3;
    public AdvancedModelRenderer RightHand;
    public AdvancedModelRenderer RArmFeathers2;
    public AdvancedModelRenderer LeftArm2;
    public AdvancedModelRenderer LArmFeathers1;
    public AdvancedModelRenderer LArmFeathers3;
    public AdvancedModelRenderer LeftHand;
    public AdvancedModelRenderer LArmFeathers2;
    public AdvancedModelRenderer RightLeg2;
    public AdvancedModelRenderer RightFeet;
    public AdvancedModelRenderer RightClaw1;
    public AdvancedModelRenderer RightClaw2;
    public AdvancedModelRenderer LeftLeg2;
    public AdvancedModelRenderer LeftFeet;
    public AdvancedModelRenderer LeftClaw1;
    public AdvancedModelRenderer LeftClaw2;
    public ModelAnimator animator;

    public ModelBabyVelociraptor() {
        this.textureWidth = 120;
        this.textureHeight = 100;
        this.LeftClaw1 = new AdvancedModelRenderer(this, 43, 72);
        this.LeftClaw1.setRotationPoint(-1.0F, -0.5F, 0.0F);
        this.LeftClaw1.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(LeftClaw1, 0.40980330836826856F, 0.0F, 0.0F);
        this.HeadFeathers5 = new AdvancedModelRenderer(this, 0, 15);
        this.HeadFeathers5.setRotationPoint(-0.6F, -3.0F, -1.0F);
        this.HeadFeathers5.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(HeadFeathers5, -0.091106186954104F, -0.045553093477052F, -0.045553093477052F);
        this.RArmFeathers3 = new AdvancedModelRenderer(this, 12, -8);
        this.RArmFeathers3.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.RArmFeathers3.addBox(0.0F, 0.0F, -1.0F, 0, 6, 8, 0.0F);
        this.setRotateAngle(RArmFeathers3, -1.0471975511965976F, 0.0F, 0.0F);
        this.shape51_1 = new AdvancedModelRenderer(this, 64, 73);
        this.shape51_1.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.shape51_1.addBox(-0.5F, 0.0F, -2.5F, 1, 1, 2, 0.0F);
        this.UpperJaw1 = new AdvancedModelRenderer(this, 26, 84);
        this.UpperJaw1.setRotationPoint(0.0F, -2.0F, -6.0F);
        this.UpperJaw1.addBox(-2.0F, 0.0F, -4.3F, 4, 4, 5, 0.0F);
        this.setRotateAngle(UpperJaw1, 0.045553093477052F, 0.0F, 0.0F);
        this.HeadFeathers4 = new AdvancedModelRenderer(this, 0, 15);
        this.HeadFeathers4.setRotationPoint(0.6F, -3.0F, -1.0F);
        this.HeadFeathers4.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(HeadFeathers4, -0.091106186954104F, 0.045553093477052F, 0.045553093477052F);
        this.LArmFeathers3 = new AdvancedModelRenderer(this, 12, -8);
        this.LArmFeathers3.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.LArmFeathers3.addBox(0.0F, 0.0F, -1.0F, 0, 6, 8, 0.0F);
        this.setRotateAngle(LArmFeathers3, -1.0471975511965976F, 0.0F, 0.0F);
        this.LowerJaw3 = new AdvancedModelRenderer(this, 50, 94);
        this.LowerJaw3.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.LowerJaw3.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(LowerJaw3, -0.045553093477052F, 0.0F, 0.0F);
        this.HeadFeathers2 = new AdvancedModelRenderer(this, 0, 15);
        this.HeadFeathers2.setRotationPoint(-1.3F, -3.0F, -0.5F);
        this.HeadFeathers2.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(HeadFeathers2, -0.36425021489121656F, -0.045553093477052F, 0.045553093477052F);
        this.RightArm2 = new AdvancedModelRenderer(this, 53, 74);
        this.RightArm2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.RightArm2.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(RightArm2, -1.9123572614101867F, 0.0F, 0.0F);
        this.RightLeg2 = new AdvancedModelRenderer(this, 21, 65);
        this.RightLeg2.setRotationPoint(0.0F, 3.0F, 2.0F);
        this.RightLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 3, 0.0F);
        this.setRotateAngle(RightLeg2, 0.18203784098300857F, 0.0F, 0.0F);
        this.LeftLeg1 = new AdvancedModelRenderer(this, 0, 58);
        this.LeftLeg1.setRotationPoint(3.0F, 9.0F, -1.0F);
        this.LeftLeg1.addBox(-1.5F, -3.0F, -3.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(LeftLeg1, -0.27314402793711257F, 0.0F, -0.045553093477052F);
        this.Body1 = new AdvancedModelRenderer(this, 72, 0);
        this.Body1.setRotationPoint(0.0F, 7.5F, -3.5F);
        this.Body1.addBox(-3.0F, -4.0F, -10.0F, 6, 8, 16, 0.0F);
        this.setRotateAngle(Body1, -0.22759093446006054F, 0.0F, 0.0F);
        this.Tail1 = new AdvancedModelRenderer(this, 80, 27);
        this.Tail1.setRotationPoint(0.0F, -2.6F, 4.0F);
        this.Tail1.addBox(-2.0F, -1.0F, -3.0F, 4, 5, 16, 0.0F);
        this.setRotateAngle(Tail1, 0.136659280431156F, 0.0F, 0.0F);
        this.RightLeg1 = new AdvancedModelRenderer(this, 0, 58);
        this.RightLeg1.setRotationPoint(-3.0F, 9.0F, -1.0F);
        this.RightLeg1.addBox(-1.5F, -3.0F, -3.0F, 3, 10, 6, 0.0F);
        this.setRotateAngle(RightLeg1, -0.27314402793711257F, 0.0F, 0.045553093477052F);
        this.LeftFeet = new AdvancedModelRenderer(this, 33, 73);
        this.LeftFeet.setRotationPoint(0.5F, 10.8F, 0.0F);
        this.LeftFeet.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(LeftFeet, 0.091106186954104F, 0.0F, 0.045553093477052F);
        this.shape51 = new AdvancedModelRenderer(this, 68, 80);
        this.shape51.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.shape51.addBox(-1.0F, -1.0F, -3.5F, 2, 1, 3, 0.0F);
        this.LowerJaw2 = new AdvancedModelRenderer(this, 31, 94);
        this.LowerJaw2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.LowerJaw2.addBox(-2.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F);
        this.setRotateAngle(LowerJaw2, 0.045553093477052F, 0.0F, 0.0F);
        this.TailFeathers4 = new AdvancedModelRenderer(this, 73, 85);
        this.TailFeathers4.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.TailFeathers4.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.setRotateAngle(TailFeathers4, -0.091106186954104F, 0.0F, 0.0F);
        this.Tail2 = new AdvancedModelRenderer(this, 74, 49);
        this.Tail2.setRotationPoint(0.0F, 0.4F, 11.0F);
        this.Tail2.addBox(-1.5F, -1.0F, -1.0F, 3, 4, 18, 0.0F);
        this.setRotateAngle(Tail2, 0.091106186954104F, 0.0F, 0.0F);
        this.Body2 = new AdvancedModelRenderer(this, 0, 33);
        this.Body2.setRotationPoint(0.0F, 4.0F, -8.0F);
        this.Body2.addBox(-1.5F, -8.0F, 0.0F, 3, 8, 15, 0.0F);
        this.setRotateAngle(Body2, -0.136659280431156F, 0.0F, 0.0F);
        this.HeadFeathers2_1 = new AdvancedModelRenderer(this, 0, 15);
        this.HeadFeathers2_1.setRotationPoint(0.0F, -3.0F, -2.5F);
        this.HeadFeathers2_1.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(HeadFeathers2_1, 0.136659280431156F, 0.0F, 0.0F);
        this.LeftHand = new AdvancedModelRenderer(this, 61, 77);
        this.LeftHand.setRotationPoint(-0.2F, 4.5F, -0.5F);
        this.LeftHand.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(LeftHand, 1.1838568316277536F, -0.18203784098300857F, 0.0F);
        this.HeadFeathers3 = new AdvancedModelRenderer(this, 0, 15);
        this.HeadFeathers3.setRotationPoint(1.3F, -3.0F, -0.5F);
        this.HeadFeathers3.addBox(0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F);
        this.setRotateAngle(HeadFeathers3, -0.36425021489121656F, 0.045553093477052F, -0.045553093477052F);
        this.RArmFeathers1 = new AdvancedModelRenderer(this, 0, 5);
        this.RArmFeathers1.setRotationPoint(0.1F, 0.3F, 1.4F);
        this.RArmFeathers1.addBox(0.0F, 0.0F, -2.0F, 0, 8, 3, 0.0F);
        this.setRotateAngle(RArmFeathers1, 0.36425021489121656F, 0.0F, 0.0F);
        this.Tail3 = new AdvancedModelRenderer(this, 80, 74);
        this.Tail3.setRotationPoint(0.0F, 0.2F, 17.0F);
        this.Tail3.addBox(-1.0F, -1.0F, -1.0F, 2, 3, 15, 0.0F);
        this.setRotateAngle(Tail3, -0.045553093477052F, 0.0F, 0.0F);
        this.RightClaw1 = new AdvancedModelRenderer(this, 43, 72);
        this.RightClaw1.setRotationPoint(1.0F, -0.5F, 0.0F);
        this.RightClaw1.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(RightClaw1, 0.40980330836826856F, 0.0F, 0.0F);
        this.RightHand = new AdvancedModelRenderer(this, 61, 77);
        this.RightHand.setRotationPoint(0.2F, 4.5F, -0.5F);
        this.RightHand.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(RightHand, 1.1838568316277536F, 0.18203784098300857F, 0.0F);
        this.LowerJaw1 = new AdvancedModelRenderer(this, 8, 95);
        this.LowerJaw1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.LowerJaw1.addBox(-3.0F, 0.0F, -4.0F, 6, 1, 3, 0.0F);
        this.Teeth1 = new AdvancedModelRenderer(this, 66, 96);
        this.Teeth1.setRotationPoint(0.0F, 4.0F, -0.3F);
        this.Teeth1.addBox(-1.5F, 0.0F, -4.0F, 3, 1, 3, 0.0F);
        this.LeftLeg2 = new AdvancedModelRenderer(this, 21, 65);
        this.LeftLeg2.setRotationPoint(0.0F, 3.0F, 2.0F);
        this.LeftLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 11, 3, 0.0F);
        this.setRotateAngle(LeftLeg2, 0.18203784098300857F, 0.0F, 0.0F);
        this.Head2 = new AdvancedModelRenderer(this, 0, 88);
        this.Head2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head2.addBox(-3.0F, 0.0F, -3.0F, 6, 1, 4, 0.0F);
        this.RightArm1 = new AdvancedModelRenderer(this, 52, 63);
        this.RightArm1.setRotationPoint(-2.5F, 2.0F, -9.0F);
        this.RightArm1.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(RightArm1, 1.3203415791337103F, -0.40980330836826856F, -0.22759093446006054F);
        this.LeftArm1 = new AdvancedModelRenderer(this, 52, 63);
        this.LeftArm1.setRotationPoint(2.5F, 2.0F, -9.0F);
        this.LeftArm1.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(LeftArm1, 1.3203415791337103F, 0.40980330836826856F, 0.22759093446006054F);
        this.UpperJaw2 = new AdvancedModelRenderer(this, 45, 85);
        this.UpperJaw2.setRotationPoint(0.0F, 4.0F, -4.3F);
        this.UpperJaw2.addBox(-1.5F, -4.0F, -3.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(UpperJaw2, -0.045553093477052F, 0.0F, 0.0F);
        this.Tailfeathers3 = new AdvancedModelRenderer(this, 26, 40);
        this.Tailfeathers3.setRotationPoint(0.0F, -1.0F, 14.0F);
        this.Tailfeathers3.addBox(-5.0F, 0.0F, 0.0F, 10, 1, 18, 0.0F);
        this.setRotateAngle(Tailfeathers3, -0.091106186954104F, 0.0F, 0.0F);
        this.UpperJaw3 = new AdvancedModelRenderer(this, 31, 61);
        this.UpperJaw3.setRotationPoint(0.0F, -3.0F, -6.0F);
        this.UpperJaw3.addBox(-1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(UpperJaw3, 0.31869712141416456F, 0.0F, 0.0F);
        this.Neck = new AdvancedModelRenderer(this, 29, 17);
        this.Neck.setRotationPoint(0.0F, 1.0F, -10.0F);
        this.Neck.addBox(-2.0F, -10.0F, -2.0F, 4, 12, 6, 0.0F);
        this.setRotateAngle(Neck, 0.7740535232594852F, 0.0F, 0.0F);
        this.Tailfeathers1 = new AdvancedModelRenderer(this, 41, 0);
        this.Tailfeathers1.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Tailfeathers1.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 15, 0.0F);
        this.setRotateAngle(Tailfeathers1, 0.02809980095710871F, 0.0F, 0.0F);
        this.Gums = new AdvancedModelRenderer(this, 103, 93);
        this.Gums.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Gums.addBox(-2.0F, -3.0F, 0.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(Gums, -0.4553564018453205F, 0.0F, 0.0F);
        this.LeftClaw2 = new AdvancedModelRenderer(this, 34, 70);
        this.LeftClaw2.setRotationPoint(-0.5F, -2.0F, 0.0F);
        this.LeftClaw2.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(LeftClaw2, 0.6373942428283291F, 0.0F, 0.0F);
        this.LArmFeathers1 = new AdvancedModelRenderer(this, 0, 5);
        this.LArmFeathers1.setRotationPoint(-0.1F, 0.3F, 1.4F);
        this.LArmFeathers1.addBox(0.0F, 0.0F, -2.0F, 0, 8, 3, 0.0F);
        this.setRotateAngle(LArmFeathers1, 0.36425021489121656F, 0.0F, 0.0F);
        this.Tailfeathers2 = new AdvancedModelRenderer(this, 39, 23);
        this.Tailfeathers2.setRotationPoint(0.0F, 1.0F, 15.0F);
        this.Tailfeathers2.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 14, 0.0F);
        this.setRotateAngle(Tailfeathers2, 0.091106186954104F, 0.0F, 0.0F);
        this.LeftArm2 = new AdvancedModelRenderer(this, 53, 74);
        this.LeftArm2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.LeftArm2.addBox(-0.5F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
        this.setRotateAngle(LeftArm2, -1.9123572614101867F, 0.0F, 0.0F);
        this.RightFeet = new AdvancedModelRenderer(this, 33, 73);
        this.RightFeet.setRotationPoint(-0.5F, 10.8F, 0.0F);
        this.RightFeet.addBox(-1.0F, -1.0F, -3.0F, 2, 2, 4, 0.0F);
        this.setRotateAngle(RightFeet, 0.091106186954104F, 0.0F, -0.045553093477052F);
        this.RArmFeathers2 = new AdvancedModelRenderer(this, 9, 0);
        this.RArmFeathers2.setRotationPoint(-0.1F, 0.0F, 1.0F);
        this.RArmFeathers2.addBox(0.0F, -3.0F, -1.0F, 0, 8, 8, 0.0F);
        this.LArmFeathers2 = new AdvancedModelRenderer(this, 9, 0);
        this.LArmFeathers2.setRotationPoint(0.1F, 0.0F, 1.0F);
        this.LArmFeathers2.addBox(0.0F, -3.0F, -1.0F, 0, 8, 8, 0.0F);
        this.RightClaw2 = new AdvancedModelRenderer(this, 34, 70);
        this.RightClaw2.setRotationPoint(0.5F, -2.0F, 0.0F);
        this.RightClaw2.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(RightClaw2, 0.6373942428283291F, 0.0F, 0.0F);
        this.Teeth2 = new AdvancedModelRenderer(this, 82, 95);
        this.Teeth2.setRotationPoint(0.0F, 0.0F, 0.2F);
        this.Teeth2.addBox(-1.0F, 0.0F, -2.9F, 2, 1, 3, 0.0F);
        this.Head1 = new AdvancedModelRenderer(this, 0, 75);
        this.Head1.addBox(-3.0F, -3.0F, -6.0F, 6, 5, 7, 0.0F);
        this.headPivot = new AdvancedModelRenderer(this, 0, 75);
        this.headPivot.setRotationPoint(0.0F, -8.9F, 0.9F);
        this.setRotateAngle(headPivot, -0.5009094953223726F, 0.0F, 0.0F);
        this.LeftFeet.addChild(this.LeftClaw1);
        this.Head1.addChild(this.HeadFeathers5);
        this.RightArm1.addChild(this.RArmFeathers3);
        this.LowerJaw3.addChild(this.shape51_1);
        this.Head1.addChild(this.UpperJaw1);
        this.Head1.addChild(this.HeadFeathers4);
        this.LeftArm1.addChild(this.LArmFeathers3);
        this.LowerJaw2.addChild(this.LowerJaw3);
        this.Head1.addChild(this.HeadFeathers2);
        this.RightArm1.addChild(this.RightArm2);
        this.RightLeg1.addChild(this.RightLeg2);
        this.Body1.addChild(this.Tail1);
        this.LeftLeg2.addChild(this.LeftFeet);
        this.LowerJaw2.addChild(this.shape51);
        this.LowerJaw1.addChild(this.LowerJaw2);
        this.Tailfeathers3.addChild(this.TailFeathers4);
        this.Tail1.addChild(this.Tail2);
        this.Body1.addChild(this.Body2);
        this.Head1.addChild(this.HeadFeathers2_1);
        this.LeftArm2.addChild(this.LeftHand);
        this.Head1.addChild(this.HeadFeathers3);
        this.RightArm1.addChild(this.RArmFeathers1);
        this.Tail2.addChild(this.Tail3);
        this.RightFeet.addChild(this.RightClaw1);
        this.RightArm2.addChild(this.RightHand);
        this.Head2.addChild(this.LowerJaw1);
        this.UpperJaw1.addChild(this.Teeth1);
        this.LeftLeg1.addChild(this.LeftLeg2);
        this.Head1.addChild(this.Head2);
        this.Body1.addChild(this.RightArm1);
        this.Body1.addChild(this.LeftArm1);
        this.UpperJaw1.addChild(this.UpperJaw2);
        this.Tailfeathers2.addChild(this.Tailfeathers3);
        this.Head1.addChild(this.UpperJaw3);
        this.Body1.addChild(this.Neck);
        this.Tail1.addChild(this.Tailfeathers1);
        this.LowerJaw1.addChild(this.Gums);
        this.LeftClaw1.addChild(this.LeftClaw2);
        this.LeftArm1.addChild(this.LArmFeathers1);
        this.Tailfeathers1.addChild(this.Tailfeathers2);
        this.LeftArm1.addChild(this.LeftArm2);
        this.RightLeg2.addChild(this.RightFeet);
        this.RightArm2.addChild(this.RArmFeathers2);
        this.LeftArm2.addChild(this.LArmFeathers2);
        this.RightClaw1.addChild(this.RightClaw2);
        this.UpperJaw2.addChild(this.Teeth2);
        this.Neck.addChild(this.headPivot);
        this.headPivot.addChild(this.Head1);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.RightLeg1.render(f5);
        this.Body1.render(f5);
        this.LeftLeg1.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.resetToDefaultPose();
        animator.update(entity);
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(EntityLandPrehistoric.ANIMATION_SPEAK);
        animator.startKeyframe(10);
        rotate(animator, LowerJaw1, 15F, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(10);
        animator.setAnimation(EntityPrehistoric.ANIMATION_EAT);
        animator.startKeyframe(5);
        rotate(animator, LowerJaw1, 15F, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.startKeyframe(5);
        rotate(animator, LowerJaw1, 15F, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityLandPrehistoric.ANIMATION_JUMP);
        animator.startKeyframe(15);
        rotate(animator, Body1, 13F, 0, 0);
        rotate(animator, Tail1, 23F, 0, 0);
        rotate(animator, Tail2, 5F, 0, 0);
        rotate(animator, Tail2, -2F, 0, 0);
        rotate(animator, RightArm1, 65F, -44F, 10F);
        rotate(animator, LeftArm1, 65F, 44F, 10F);
        rotate(animator, headPivot, -17F, 0, 10F);
        rotate(animator, LowerJaw1, 5F, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        rotate(animator, Body1, -46F, 0, 0);
        rotate(animator, Tail1, 18F, 0, 0);
        rotate(animator, LeftLeg1, -65F, -5F, 0);
        rotate(animator, RightLeg1, -52F, 5F, 0);
        rotate(animator, LeftFeet, 114F, 0, 0);
        rotate(animator, RightFeet, 114F, 0, 0);
        rotate(animator, LeftClaw1, -26F, 0, 0);
        rotate(animator, RightClaw1, -26F, 0, 0);
        rotate(animator, Neck, 83F, 0, 0);
        rotate(animator, headPivot, -31F, 0, 0);
        rotate(animator, RightArm1, 62F, -28F, -39F);
        rotate(animator, LeftArm1, 62F, 28F, 39F);
        rotate(animator, LowerJaw1, 15F, 0, 0);
        animator.endKeyframe();
        animator.resetKeyframe(5);
        animator.setAnimation(EntityVelociraptor.ANIMATION_RIPAPART);
        animator.startKeyframe(5);
        rotate(animator, Body1, 13F, 0, 0);
        rotate(animator, Tail1, 23F, 0, 0);
        rotate(animator, Tail2, 5F, 0, 0);
        rotate(animator, Tail2, -2F, 0, 0);
        rotate(animator, RightArm1, 65F, -44F, 10F);
        rotate(animator, LeftArm1, 65F, 44F, 10F);
        rotate(animator, headPivot, 30F, 0, 10F);
        rotate(animator, LowerJaw1, 5F, 0, 0);
        rotate(animator, Neck, 50F, 0, 0);
        rotate(animator, LowerJaw1, 15F, 0, 0);
        animator.endKeyframe();
        animator.startKeyframe(5);
        rotate(animator, Body1, 13F, 0, 0);
        rotate(animator, Tail1, 23F, 0, 0);
        rotate(animator, Tail2, 5F, 0, 0);
        rotate(animator, Tail2, -2F, 0, 0);
        rotate(animator, RightArm1, 65F, -44F, 10F);
        rotate(animator, LeftArm1, 65F, 44F, 10F);
        rotate(animator, LowerJaw1, 5F, 0, 0);
        rotate(animator, Neck, -50F, 0, 0);
        rotate(animator, headPivot, -30F, 0, 10F);
        animator.endKeyframe();
        animator.resetKeyframe(5);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        float speed_walk = 0.5F;
        float speed_idle = 0.05F;
        float degree_walk = 0.5F;
        float degree_idle = 0.5F;

        AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{Neck, Head1};
        AdvancedModelRenderer[] TAIL = new AdvancedModelRenderer[]{Tail1, Tail2, Tail3};
        if(!((EntityVelociraptor)entity).isRiding()){
            this.faceTarget(f3, f4, 2, NECK);
        }
        this.bob(Body1, speed_idle, degree_idle * 0.8F, false, entity.ticksExisted, 1);
        this.walk(Body1, speed_idle, degree_idle * 0.05F, false, 0, 0, entity.ticksExisted, 1);
        this.chainWave(NECK, speed_idle, degree_idle * 0.2F, 4, entity.ticksExisted, 1);
        this.chainWave(TAIL, speed_idle, degree_idle * 0.1F, 0, entity.ticksExisted, 1);
        this.walk(RightArm1, speed_idle, degree_idle * 0.2F, false, 0, 0, entity.ticksExisted, 1);
        this.walk(RightArm2, speed_idle, degree_idle * 0.25F, true, 0, -0.3F, entity.ticksExisted, 1);
        this.walk(LeftArm1, speed_idle, degree_idle * 0.2F, false, 0, 0, entity.ticksExisted, 1);
        this.walk(LeftArm2, speed_idle, degree_idle * 0.25F, true, 0, -0.3F, entity.ticksExisted, 1);
        this.chainWave(NECK, speed_walk, degree_walk * 0.5F, 4, f, f1);
        this.chainSwing(TAIL, speed_walk, degree_walk * 0.4F, 1, f, f1);
        this.bob(Body1, speed_walk, degree_walk * 0.8F, false, f, f1);
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
            float progress = ((EntityLandPrehistoric)entity).sitProgress;
            sitAnimationRotation(LArmFeathers3, progress, -((float)Math.toRadians(60.0D)), 0, 0);
            sitAnimationRotation(LowerJaw3, progress, -((float)Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(LArmFeathers1, progress, (float)Math.toRadians(15.65D), 0, 0);
            sitAnimationRotation(RightClaw1, progress, (float)Math.toRadians(23.48D), 0, 0);
            sitAnimationRotation(Tail1, progress, (float)Math.toRadians(7.83D), 0, 0);
            sitAnimationRotation(LeftHand, progress, (float)Math.toRadians(78.26D), -((float)Math.toRadians(10.43D)), 0);
            sitAnimationRotation(RightArm1, progress, (float)Math.toRadians(101.74D), -((float)Math.toRadians(13.04D)), -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(UpperJaw1, progress, (float)Math.toRadians(2.61D), 0, 0);
            sitAnimationRotation(HeadFeathers2, progress, (float)Math.toRadians(20.87D), -((float)Math.toRadians(2.61D)), (float)Math.toRadians(2.61D));
            sitAnimationRotation(LeftLeg2, progress, (float)Math.toRadians(10.43D), 0, 0);
            sitAnimationRotation(UpperJaw3, progress, (float)Math.toRadians(18.26D), 0, 0);
            sitAnimationRotation(Tail3, progress, (float)Math.toRadians(2.61D), 0, 0);
            sitAnimationRotation(Body1, progress, -((float)Math.toRadians(20.869999999999983D)), 0, 0);
            sitAnimationRotation(LeftLeg1, progress, -((float)Math.toRadians(83.48D)), 0, -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(UpperJaw2, progress, -((float)Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(LeftArm1, progress, (float)Math.toRadians(101.74D), (float)Math.toRadians(13.04D), 0);
            sitAnimationRotation(RightLeg1, progress, -((float)Math.toRadians(83.48D)), 0, (float)Math.toRadians(2.61D));
            sitAnimationRotation(RArmFeathers1, progress, (float)Math.toRadians(15.65D), 0, 0);
            sitAnimationRotation(RArmFeathers3, progress, -((float)Math.toRadians(60.0D)), 0, 0);
            sitAnimationRotation(headPivot, progress, -((float)Math.toRadians(20.870000000000005D)), 0, 0);
            sitAnimationRotation(RightArm2, progress, -((float)Math.toRadians(143.48D)), 0, 0);
            sitAnimationRotation(HeadFeathers3, progress, (float)Math.toRadians(20.87D), (float)Math.toRadians(2.61D), -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(RightFeet, progress, (float)Math.toRadians(70.43D), 0, -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(Tailfeathers1, progress, (float)Math.toRadians(1.61D), 0, 0);
            sitAnimationRotation(Tail2, progress, (float)Math.toRadians(5.22D), 0, 0);
            sitAnimationRotation(Tailfeathers2, progress, (float)Math.toRadians(5.22D), 0, 0);
            sitAnimationRotation(LeftClaw2, progress, (float)Math.toRadians(36.52D), 0, 0);
            sitAnimationRotation(Gums, progress, -((float)Math.toRadians(18.87D)), 0, 0);
            sitAnimationRotation(RightHand, progress, (float)Math.toRadians(78.26D), (float)Math.toRadians(10.43D), 0);
            sitAnimationRotation(TailFeathers4, progress, -((float)Math.toRadians(5.22D)), 0, 0);
            sitAnimationRotation(LeftArm2, progress, -((float)Math.toRadians(143.48D)), 0, 0);
            sitAnimationRotation(LowerJaw1, progress, -((float)Math.toRadians(3.552713678800501E-15D)), 0, 0);
            sitAnimationRotation(Body2, progress, -((float)Math.toRadians(7.83D)), 0, 0);
            sitAnimationRotation(LeftFeet, progress, (float)Math.toRadians(70.43D), 0, (float)Math.toRadians(2.61D));
            sitAnimationRotation(RightLeg2, progress, (float)Math.toRadians(10.43D), 0, 0);
            sitAnimationRotation(Neck, progress, (float)Math.toRadians(46.96000000000005D), 0, 0);
            sitAnimationRotation(RightClaw2, progress, (float)Math.toRadians(36.52D), 0, 0);
            sitAnimationRotation(LeftClaw1, progress, (float)Math.toRadians(23.48D), 0, 0);
            sitAnimationPos(Body1, progress, 0, 13, 0);
            sitAnimationPos(RightLeg1, progress, -3, 15F, 1);
            sitAnimationPos(LeftLeg1, progress, 3, 15F, 1);
        }
        {
            float progress = ((EntityLandPrehistoric)entity).sleepProgress;
            sitAnimationRotation(LArmFeathers3, progress, -((float)Math.toRadians(60.0D)), 0, 0);
            sitAnimationRotation(LeftClaw1, progress, (float)Math.toRadians(23.48D), 0, 0);
            sitAnimationRotation(UpperJaw1, progress, (float)Math.toRadians(2.61D), 0, 0);
            sitAnimationRotation(LeftArm1, progress, (float)Math.toRadians(101.74D), (float)Math.toRadians(13.04D), 0);
            sitAnimationRotation(RArmFeathers1, progress, (float)Math.toRadians(15.65D), 0, 0);
            sitAnimationRotation(LeftArm2, progress, -((float)Math.toRadians(143.48D)), 0, 0);
            sitAnimationRotation(Tailfeathers2, progress, (float)Math.toRadians(5.22D), 0, 0);
            sitAnimationRotation(HeadFeathers2, progress, (float)Math.toRadians(2.61D), -((float)Math.toRadians(2.61D)), (float)Math.toRadians(2.61D));
            sitAnimationRotation(LeftClaw2, progress, (float)Math.toRadians(36.52D), 0, 0);
            sitAnimationRotation(headPivot, progress, (float)Math.toRadians(41.74000000000004D), 0, 0);
            sitAnimationRotation(LeftLeg1, progress, -((float)Math.toRadians(83.48D)), 0, -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(Tailfeathers1, progress, (float)Math.toRadians(1.61D), 0, 0);
            sitAnimationRotation(RightClaw2, progress, (float)Math.toRadians(36.52D), 0, 0);
            sitAnimationRotation(RightLeg1, progress, -((float)Math.toRadians(83.48D)), 0, (float)Math.toRadians(2.61D));
            sitAnimationRotation(RightFeet, progress, (float)Math.toRadians(70.43D), 0, -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(LowerJaw3, progress, -((float)Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(RightArm2, progress, -((float)Math.toRadians(143.48D)), 0, 0);
            sitAnimationRotation(TailFeathers4, progress, -((float)Math.toRadians(5.22D)), 0, 0);
            sitAnimationRotation(Body1, progress, -((float)Math.toRadians(20.87000000000001D)), 0, 0);
            sitAnimationRotation(RArmFeathers3, progress, -((float)Math.toRadians(60.0D)), 0, 0);
            sitAnimationRotation(HeadFeathers3, progress, (float)Math.toRadians(2.61D), (float)Math.toRadians(2.61D), -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(Body2, progress, -((float)Math.toRadians(7.83D)), 0, 0);
            sitAnimationRotation(LeftHand, progress, (float)Math.toRadians(78.26D), -((float)Math.toRadians(10.43D)), 0);
            sitAnimationRotation(LArmFeathers1, progress, (float)Math.toRadians(15.65D), 0, 0);
            sitAnimationRotation(Neck, progress, (float)Math.toRadians(10.43D), 0, 0);
            sitAnimationRotation(LeftFeet, progress, (float)Math.toRadians(70.43D), 0, (float)Math.toRadians(2.61D));
            sitAnimationRotation(Gums, progress, -((float)Math.toRadians(18.87D)), 0, 0);
            sitAnimationRotation(RightClaw1, progress, (float)Math.toRadians(23.48D), 0, 0);
            sitAnimationRotation(RightArm1, progress, (float)Math.toRadians(101.74D), -((float)Math.toRadians(13.04D)), -((float)Math.toRadians(2.61D)));
            sitAnimationRotation(Tail2, progress, (float)Math.toRadians(5.22D), 0, 0);
            sitAnimationRotation(RightLeg2, progress, (float)Math.toRadians(10.43D), 0, 0);
            sitAnimationRotation(LeftLeg2, progress, (float)Math.toRadians(10.43D), 0, 0);
            sitAnimationRotation(UpperJaw2, progress, -((float)Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(UpperJaw3, progress, (float)Math.toRadians(18.26D), 0, 0);
            sitAnimationRotation(Tail1, progress, (float)Math.toRadians(7.83D), 0, 0);
            sitAnimationRotation(RightHand, progress, (float)Math.toRadians(78.26D), (float)Math.toRadians(10.43D), 0);
            sitAnimationRotation(LowerJaw1, progress, -((float)Math.toRadians(3.552713678800501E-15D)), 0, 0);
            sitAnimationRotation(Tail3, progress, (float)Math.toRadians(2.61D), 0, 0);
            sitAnimationPos(Body1, progress, 0, 13, 0);
            sitAnimationPos(RightLeg1, progress, -3, 15F, 1);
            sitAnimationPos(LeftLeg1, progress, 3, 15F, 1);
        }
    }
}
