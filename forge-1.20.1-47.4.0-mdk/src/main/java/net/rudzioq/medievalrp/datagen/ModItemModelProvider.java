package net.rudzioq.medievalrp.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rudzioq.medievalrp.Medieval;
import net.rudzioq.medievalrp.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Medieval.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.BEER);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.CONE);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.TIN_INGOT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Medieval.MOD_ID, "item/" + item.getId().getPath()));
    }
}
