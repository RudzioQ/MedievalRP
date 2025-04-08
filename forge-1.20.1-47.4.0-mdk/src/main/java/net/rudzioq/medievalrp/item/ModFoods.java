package net.rudzioq.medievalrp.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.rudzioq.medievalrp.block.ModBlocks;

public class ModFoods {
    public static final FoodProperties BEER = new FoodProperties.Builder().alwaysEat().nutrition(4).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200), 1).build();
}
