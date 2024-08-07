package git.kytluna.essencemod.init;

import git.kytluna.essencemod.init.util.ModArmorMaterials;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmourMaterialInit {
    public static final ModArmorMaterials ESSENCE = new ModArmorMaterials(
            new int[] {380, 558, 520, 450},
            new int[] {4, 8, 7, 3},
            25,
            SoundEvents.FROG_TONGUE,
            () -> Ingredient.of(ItemInit.CONDENSED_ESSENCE::get),
            "essencemod:essence",
            0.25f,
            0
    );
    public static final ModArmorMaterials PURE_ESSENCE = new ModArmorMaterials(
            new int[] {400, 600, 550, 500},
            new int[] {5, 9, 8, 4},
            25,
            SoundEvents.FROG_TONGUE,
            () -> Ingredient.of(ItemInit.PURE_CONDENSED_ESSENCE::get),
            "essencemod:essence",
            0.5f,
            1
    );
}
