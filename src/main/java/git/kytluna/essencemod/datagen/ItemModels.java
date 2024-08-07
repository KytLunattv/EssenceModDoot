package git.kytluna.essencemod.datagen;

import git.kytluna.essencemod.EssenceMod;
import git.kytluna.essencemod.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ItemModelProvider {
    public ItemModels(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, EssenceMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ItemInit.CONDENSED_ESSENCE);
        simpleItem(ItemInit.RAW_ESSENCE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EssenceMod.MODID, "item/" + item.getId().getPath()));
    }
}
