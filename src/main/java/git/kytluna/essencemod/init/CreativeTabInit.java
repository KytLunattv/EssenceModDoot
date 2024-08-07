package git.kytluna.essencemod.init;

import git.kytluna.essencemod.EssenceMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EssenceMod.MODID);
    public static final RegistryObject<CreativeModeTab> ESSENCE_TAB = TABS.register("essence_mod_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.essence_mod_tab"))
                    .withSearchBar()
                    .icon(() -> new ItemStack(ItemInit.RAW_ESSENCE.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ItemInit.RAW_ESSENCE.get());
                        output.accept(ItemInit.CONDENSED_ESSENCE.get());

                        output.accept(ItemInit.ESSENCE_SWORD.get());
                        output.accept(ItemInit.ESSENCE_PICKAXE.get());
                        output.accept(ItemInit.ESSENCE_AXE.get());
                        output.accept(ItemInit.ESSENCE_SHOVEL.get());
                        output.accept(ItemInit.ESSENCE_HOE.get());
                        output.accept(ItemInit.ESSENCE_HELMET.get());
                        output.accept(ItemInit.ESSENCE_CHESTPLATE.get());
                        output.accept(ItemInit.ESSENCE_LEGGINGS.get());
                        output.accept(ItemInit.ESSENCE_BOOTS.get());

                        output.accept(BlockInit.BLOCK_OF_ESSENCE.get());
                        output.accept(BlockInit.ESSENCE_ORE.get());
                    })
                    .build()
    );
}
