package git.kytluna.essencemod.init;

import git.kytluna.essencemod.EssenceMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class TagInit {
    public static final TagKey<Block> NEEDS_ESSENCE_TOOL = tag("needs_iron_tool");
    private static TagKey<Block> tag(String name) {return BlockTags.create(new ResourceLocation(EssenceMod.MODID, name));
    }
}
