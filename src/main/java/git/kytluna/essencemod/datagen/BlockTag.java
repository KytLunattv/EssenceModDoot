package git.kytluna.essencemod.datagen;

import git.kytluna.essencemod.EssenceMod;
import git.kytluna.essencemod.init.BlockInit;
import git.kytluna.essencemod.init.TagInit;
import git.kytluna.essencemod.init.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTag extends BlockTagsProvider {
    public BlockTag(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EssenceMod.MODID, existingFileHelper);
    }



    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.MOD_BLOCKS)
                .add(BlockInit.ESSENCE_ORE.get(),
                BlockInit.BLOCK_OF_ESSENCE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(BlockInit.ESSENCE_ORE.get(),
                BlockInit.BLOCK_OF_ESSENCE.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.ESSENCE_ORE.get(),
                BlockInit.BLOCK_OF_ESSENCE.get());

        this.tag(TagInit.NEEDS_ESSENCE_TOOL)
                .add(BlockInit.ESSENCE_ORE.get(),
                        BlockInit.BLOCK_OF_ESSENCE.get());

    }
}
