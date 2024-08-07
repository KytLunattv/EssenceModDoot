package git.kytluna.essencemod.datagen.loot;

import git.kytluna.essencemod.init.BlockInit;
import git.kytluna.essencemod.init.ItemInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {


    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(BlockInit.BLOCK_OF_ESSENCE.get());

        this.add(BlockInit.ESSENCE_ORE.get(),
                block -> createEssenceOreDrops(BlockInit.ESSENCE_ORE.get(), ItemInit.RAW_ESSENCE.get()));
    }

    protected LootTable.Builder createEssenceOreDrops(Block p_251906_, Item item) {
        return createSilkTouchDispatchTable(p_251906_, (LootPoolEntryContainer.Builder)
                this.applyExplosionDecay(p_251906_, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator
                                .between(1f, 3f)))
                        .apply(ApplyBonusCount
                                .addUniformBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
