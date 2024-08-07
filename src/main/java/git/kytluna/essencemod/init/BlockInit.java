package git.kytluna.essencemod.init;

import git.kytluna.essencemod.EssenceMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS;

    public static final RegistryObject<Block> ESSENCE_ORE;

    public static final RegistryObject<Block> BLOCK_OF_ESSENCE;

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EssenceMod.MODID);

        ESSENCE_ORE = BLOCKS.register("essence_ore", () ->
                new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                        .mapColor(MapColor.COLOR_PURPLE)
                        .requiresCorrectToolForDrops()
                        .strength(2f)
                ));
        BLOCK_OF_ESSENCE = BLOCKS.register("block_of_essence", () ->
                new Block(BlockBehaviour.Properties.of()
                        .mapColor(MapColor.COLOR_PURPLE)
                        .requiresCorrectToolForDrops()
                        .strength(2f)
                ));
    }
}
