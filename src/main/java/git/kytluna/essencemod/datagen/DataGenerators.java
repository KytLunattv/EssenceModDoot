package git.kytluna.essencemod.datagen;

import com.google.common.eventbus.Subscribe;
import git.kytluna.essencemod.EssenceMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = EssenceMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput pOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new Recipes(pOutput));
        generator.addProvider(event.includeServer(), new LootTables().create(pOutput));

        generator.addProvider(event.includeClient(), new BlockStates(pOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModels(pOutput, EssenceMod.MODID, existingFileHelper));

        BlockTag blockTag = generator.addProvider(event.includeServer(), new BlockTag(pOutput, lookupProvider, EssenceMod.MODID, existingFileHelper));
        generator.addProvider(event.includeServer(), new ItemTags(pOutput, lookupProvider, blockTag.contentsGetter(), EssenceMod.MODID, existingFileHelper));
    }
}
