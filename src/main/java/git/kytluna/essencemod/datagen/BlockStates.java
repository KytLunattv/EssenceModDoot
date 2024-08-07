package git.kytluna.essencemod.datagen;

import git.kytluna.essencemod.EssenceMod;
import git.kytluna.essencemod.init.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, EssenceMod.MODID, fileHelper);

    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(BlockInit.BLOCK_OF_ESSENCE);
        blockWithItem(BlockInit.ESSENCE_ORE);
    }
}
