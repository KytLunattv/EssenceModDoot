package git.kytluna.essencemod.datagen;

import git.kytluna.essencemod.EssenceMod;
import git.kytluna.essencemod.init.BlockInit;
import git.kytluna.essencemod.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider implements IConditionBuilder {
    public static final List<ItemLike> ESSENCE_SMELTABLES = List.of(BlockInit.ESSENCE_ORE.get());

    public Recipes(PackOutput pOutput) {
        super(pOutput);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        Iterator var9 = p_249619_.iterator();
        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_)
                    .group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(p_250791_, EssenceMod.MODID + ":" + (p_250066_) + p_249236_ + "_" + getItemName(itemlike));
        }

    }
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, ESSENCE_SMELTABLES, RecipeCategory.MISC, ItemInit.RAW_ESSENCE.get(), 0.25f, 200, "essence");
        oreBlasting(consumer, ESSENCE_SMELTABLES, RecipeCategory.MISC, ItemInit.RAW_ESSENCE.get(), 0.25f, 100, "essence");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, BlockInit.BLOCK_OF_ESSENCE.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ItemInit.CONDENSED_ESSENCE.get())
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ItemInit.ESSENCE_PICKAXE.get())
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ItemInit.ESSENCE_SHOVEL.get())
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ItemInit.ESSENCE_AXE.get())
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ItemInit.ESSENCE_HOE.get())
                .pattern("EE ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.ESSENCE_SWORD.get())
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.ESSENCE_HELMET.get())
                .pattern("EEE")
                .pattern("E E")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.ESSENCE_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.ESSENCE_BOOTS.get())
                .pattern("E E")
                .pattern("E E")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.ESSENCE_BOOTS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ItemInit.ESSENCE_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', ItemInit.CONDENSED_ESSENCE.get())
                .unlockedBy(getHasName(ItemInit.CONDENSED_ESSENCE.get()), has(ItemInit.CONDENSED_ESSENCE.get()))
                .save(consumer);
    }
}
