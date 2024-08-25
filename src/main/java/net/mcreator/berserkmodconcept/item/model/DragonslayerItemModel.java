package net.mcreator.berserkmodconcept.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.berserkmodconcept.item.DragonslayerItem;

public class DragonslayerItemModel extends GeoModel<DragonslayerItem> {
	@Override
	public ResourceLocation getAnimationResource(DragonslayerItem animatable) {
		return new ResourceLocation("berserkmodconcept", "animations/dragonslayer_gecko.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DragonslayerItem animatable) {
		return new ResourceLocation("berserkmodconcept", "geo/dragonslayer_gecko.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DragonslayerItem animatable) {
		return new ResourceLocation("berserkmodconcept", "textures/item/dragonslayer_tex.png");
	}
}
