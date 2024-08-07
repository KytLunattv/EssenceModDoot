package git.kytluna.essencemod.init;

import git.kytluna.essencemod.EssenceMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class TierInit {
    public static final Tier ESSENCE = TierSortingRegistry.registerTier(new ForgeTier(
            5,
            2000,
            8.5f,
            6,
            25,
            TagInit.NEEDS_ESSENCE_TOOL,
            () -> Ingredient.of(ItemInit.CONDENSED_ESSENCE::get)),
            new ResourceLocation(EssenceMod.MODID, "condensed_essence"),
            List.of(Tiers.NETHERITE), List.of());

    public static final Tier PURE_ESSENCE = TierSortingRegistry.registerTier(new ForgeTier(
                    6,
                    2200,
                    10f,
                    6,
                    25,
                    TagInit.NEEDS_ESSENCE_TOOL,
                    () -> Ingredient.of(ItemInit.PURE_CONDENSED_ESSENCE::get)),
            new ResourceLocation(EssenceMod.MODID, "pure_condensed_essence"),
            List.of(Tiers.NETHERITE), List.of());
}

