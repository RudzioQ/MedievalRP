package net.rudzioq.medievalrp.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rudzioq.medievalrp.Medieval;
import net.rudzioq.medievalrp.item.custom.FuelItem;
import net.rudzioq.medievalrp.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Medieval.MOD_ID);

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(10)));

    public static final RegistryObject<Item> BEER = ITEMS.register("beer",
            () -> new Item(new Item.Properties().food(ModFoods.BEER).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> CONE = ITEMS.register("cone",
            () -> new FuelItem(new Item.Properties(), 100));

    public static final RegistryObject<Item> BLACKSMITH_HAMMER = ITEMS.register("blacksmith_hammer",
            () -> new Item(new Item.Properties().stacksTo(1)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
