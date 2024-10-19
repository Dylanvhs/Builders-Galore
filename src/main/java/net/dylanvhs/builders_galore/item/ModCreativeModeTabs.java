package net.dylanvhs.builders_galore.item;

import net.dylanvhs.builders_galore.BuildersGalore;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuildersGalore.MOD_ID);
    public static final RegistryObject<CreativeModeTab> BUILDERS_GALORE_TAB = CREATIVE_MODE_TABS.register("builders_galore_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.COBBLESTONE))

                    .title(Component.translatable("creativetab.builders_galore_tab"))
                    .displayItems((pParameters, pOutput) -> {




                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}