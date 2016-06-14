package com.github.backtolifemod.backtolife.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.backtolifemod.backtolife.entity.living.EntityProtoceratops;
import com.github.backtolifemod.backtolife.entity.living.EntityTarbosaurus;
import com.github.backtolifemod.backtolife.entity.living.EntityVelociraptor;

import fossilsarcheology.api.EnumDiet;

public enum EnumPrehistoricType {
	VELOCIRAPTOR(EntityVelociraptor.class, EnumPrehistoricFossilType.CARNIVORE_DINOSAUR, EnumPrehistoricEggType.DROMEOSAURID, EnumDiet.CARNIVORE_EGG, 0X392A22, 0XDAC9B9, 1.3F, 0.2F, 0.4F),
	PROTOCERATOPS(EntityProtoceratops.class, EnumPrehistoricFossilType.HERBIVORE_DINOSAUR, EnumPrehistoricEggType.SMALL_CERATOPSIAN, EnumDiet.HERBIVORE, 0X8D5027, 0XFA7723, 1.2F, 0.3F, 0.9F),
	TARBOSAURUS(EntityTarbosaurus.class, EnumPrehistoricFossilType.CARNIVORE_DINOSAUR, EnumPrehistoricEggType.NORMAL, EnumDiet.CARNIVORE, 0XD8CCA5, 0XAD8D52, 4.5F, 0.2F, 2.4F);
	public EnumPrehistoricFossilType fossilType;
	public EnumPrehistoricEggType eggType;
	public EnumDiet dietType;
	public Class entityClass;
	public int colorA;
	public int colorB;
	public float fossilSize;
	public float minimumModelSize;
	public float maximumModelSize;
	
	private EnumPrehistoricType(Class entityClass, EnumPrehistoricFossilType fossilType, EnumPrehistoricEggType eggType, EnumDiet dietType, int colorA, int colorB, float fossilSize, float minimumModelSize, float maximumModelSize) {
		this.entityClass = entityClass;
		this.fossilType = fossilType;
		this.eggType = eggType;
		this.dietType = dietType;
		this.colorA = colorA;
		this.colorB = colorB;
		this.fossilSize = fossilSize;
	}

	public static EnumPrehistoricType getOneOfFossilType(EnumPrehistoricFossilType fossilType_0) {
		List<EnumPrehistoricType> list = new ArrayList<EnumPrehistoricType>();
		for (EnumPrehistoricType prehistoricType : EnumPrehistoricType.values()) {
			if (prehistoricType.fossilType == fossilType_0) {
				list.add(prehistoricType);
			}
		}
		return list.get(new Random().nextInt(list.size()));
	}

	public enum EnumPrehistoricFossilType {
		CARNIVORE_DINOSAUR, HERBIVORE_DINOSAUR, PTEROSAUR;
	}
	
	public enum EnumPrehistoricEggType {
		BIG_CERATOPSIAN, SMALL_CERATOPSIAN, DROMEOSAURID, OVIRAPTORID, SAUROPOD, NORMAL;
	}
}
