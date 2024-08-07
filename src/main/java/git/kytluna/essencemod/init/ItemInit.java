package git.kytluna.essencemod.init;

import git.kytluna.essencemod.EssenceMod;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS;

    //Register Essence RegistryObjects
    public static final RegistryObject<Item> RAW_ESSENCE;
    public static final RegistryObject<Item> CONDENSED_ESSENCE;
    public static final RegistryObject<SwordItem> ESSENCE_SWORD;
    public static final RegistryObject<PickaxeItem> ESSENCE_PICKAXE;
    public static final RegistryObject<AxeItem> ESSENCE_AXE;
    public static final RegistryObject<ShovelItem> ESSENCE_SHOVEL;
    public static final RegistryObject<HoeItem> ESSENCE_HOE;
    public static final RegistryObject<ArmorItem> ESSENCE_HELMET;
    public static final RegistryObject<ArmorItem> ESSENCE_CHESTPLATE;
    public static final RegistryObject<ArmorItem> ESSENCE_LEGGINGS;
    public static final RegistryObject<ArmorItem> ESSENCE_BOOTS;

    //Create Block Registry Objects
    public static final RegistryObject<BlockItem> ESSENCE_ORE;
    public static final RegistryObject<BlockItem> BLOCK_OF_ESSENCE;

    //Create Pure Essence Registry Objects
    public static final RegistryObject<Item> PURE_ESSENCE;
    public static final RegistryObject<Item> PURE_CONDENSED_ESSENCE;
    public static final RegistryObject<SwordItem> PURE_ESSENCE_SWORD;
    public static final RegistryObject<PickaxeItem> PURE_ESSENCE_PICKAXE;
    public static final RegistryObject<AxeItem> PURE_ESSENCE_AXE;
    public static final RegistryObject<ShovelItem> PURE_ESSENCE_SHOVEL;
    public static final RegistryObject<HoeItem> PURE_ESSENCE_HOE;
    public static final RegistryObject<ArmorItem> PURE_ESSENCE_HELMET;
    public static final RegistryObject<ArmorItem> PURE_ESSENCE_CHESTPLATE;
    public static final RegistryObject<ArmorItem> PURE_ESSENCE_LEGGINGS;
    public static final RegistryObject<ArmorItem> PURE_ESSENCE_BOOTS;

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EssenceMod.MODID);

        //Essence Items
        RAW_ESSENCE = ITEMS.register("raw_essence",
                () -> new Item(new Item.Properties()));

        CONDENSED_ESSENCE = ITEMS.register("condensed_essence",
                () -> new Item(new Item.Properties()));

        ESSENCE_SWORD = ITEMS.register("essence_sword",
                () -> new SwordItem(TierInit.ESSENCE,
                        0,
                        -1.8f,
                        new Item.Properties()));

        ESSENCE_PICKAXE = ITEMS.register("essence_pickaxe",
                () -> new PickaxeItem(TierInit.ESSENCE,
                        -2,
                        -1.8f,
                        new Item.Properties()));

        ESSENCE_AXE = ITEMS.register("essence_axe",
                () -> new AxeItem(TierInit.ESSENCE,
                        2,
                        -2.7f,
                        new Item.Properties()));

        ESSENCE_SHOVEL = ITEMS.register("essence_shovel",
                () -> new ShovelItem(TierInit.ESSENCE,
                        -2,
                        -1.8f,
                        new Item.Properties()));

        ESSENCE_HOE = ITEMS.register("essence_hoe",
                () -> new HoeItem(TierInit.ESSENCE,
                        -6,
                        -1.8f,
                        new Item.Properties()));

        ESSENCE_HELMET = ITEMS.register("essence_helmet",
                () -> new ArmorItem(ArmourMaterialInit.ESSENCE,
                        ArmorItem.Type.HELMET,
                        new Item.Properties()));

        ESSENCE_CHESTPLATE = ITEMS.register("essence_chestplate",
                () -> new ArmorItem(ArmourMaterialInit.ESSENCE,
                        ArmorItem.Type.CHESTPLATE,
                        new Item.Properties()));

        ESSENCE_LEGGINGS = ITEMS.register("essence_leggings",
                () -> new ArmorItem(ArmourMaterialInit.ESSENCE,
                        ArmorItem.Type.LEGGINGS,
                        new Item.Properties()));

        ESSENCE_BOOTS = ITEMS.register("essence_boots",
                () -> new ArmorItem(ArmourMaterialInit.ESSENCE,
                        ArmorItem.Type.BOOTS,
                        new Item.Properties()));



        //Essence BlockItems
        ESSENCE_ORE = ITEMS.register("essence_ore", () ->
                new BlockItem(BlockInit.ESSENCE_ORE.get(),
                new Item.Properties()));

        BLOCK_OF_ESSENCE = ITEMS.register("block_of_essence", () ->
                new BlockItem(BlockInit.BLOCK_OF_ESSENCE.get(),
                new Item.Properties()));



        //Pure Essence Items
        PURE_ESSENCE = ITEMS.register("pure_essence",
                () -> new Item(new Item.Properties()));

        PURE_CONDENSED_ESSENCE = ITEMS.register("pure_condensed_essence",
                () -> new Item(new Item.Properties()));

        PURE_ESSENCE_SWORD = ITEMS.register("pure_essence_sword",
                () -> new SwordItem(TierInit.PURE_ESSENCE,
                        1,
                        -1.8f,
                        new Item.Properties()));

        PURE_ESSENCE_PICKAXE = ITEMS.register("pure_essence_pickaxe",
                () -> new PickaxeItem(TierInit.PURE_ESSENCE,
                        -1,
                        -1.8f,
                        new Item.Properties()));

        PURE_ESSENCE_AXE = ITEMS.register("pure_essence_axe",
                () -> new AxeItem(TierInit.PURE_ESSENCE,
                        3,
                        -2.7f,
                        new Item.Properties()));

        PURE_ESSENCE_SHOVEL = ITEMS.register("pure_essence_shovel",
                () -> new ShovelItem(TierInit.PURE_ESSENCE,
                        -2,
                        -1.8f,
                        new Item.Properties()));

        PURE_ESSENCE_HOE = ITEMS.register("pure_essence_hoe",
                () -> new HoeItem(TierInit.PURE_ESSENCE,
                        -6,
                        -1.8f,
                        new Item.Properties()));

        PURE_ESSENCE_HELMET = ITEMS.register("pure_essence_helmet",
                () -> new ArmorItem(ArmourMaterialInit.PURE_ESSENCE,
                        ArmorItem.Type.HELMET,
                        new Item.Properties()));

        PURE_ESSENCE_CHESTPLATE = ITEMS.register("pure_essence_chestplate",
                () -> new ArmorItem(ArmourMaterialInit.PURE_ESSENCE,
                        ArmorItem.Type.CHESTPLATE,
                        new Item.Properties()));

        PURE_ESSENCE_LEGGINGS = ITEMS.register("pure_essence_leggings",
                () -> new ArmorItem(ArmourMaterialInit.PURE_ESSENCE,
                        ArmorItem.Type.LEGGINGS,
                        new Item.Properties()));

        PURE_ESSENCE_BOOTS = ITEMS.register("pure_essence_boots",
                () -> new ArmorItem(ArmourMaterialInit.PURE_ESSENCE,
                        ArmorItem.Type.BOOTS,
                        new Item.Properties()));


    }
}
