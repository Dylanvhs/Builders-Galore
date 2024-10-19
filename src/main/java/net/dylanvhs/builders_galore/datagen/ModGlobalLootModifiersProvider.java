package net.dylanvhs.builders_galore.datagen;

import net.dylanvhs.builders_galore.BuildersGalore;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, BuildersGalore.MOD_ID);
    }

    @Override
    protected void start() {

    }
}