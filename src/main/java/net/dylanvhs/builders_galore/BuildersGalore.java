package net.dylanvhs.builders_galore;

import com.mojang.logging.LogUtils;

import net.dylanvhs.builders_galore.block.ModBlocks;
import net.dylanvhs.builders_galore.item.ModCreativeModeTabs;
import net.dylanvhs.builders_galore.item.ModItems;
import net.dylanvhs.builders_galore.particles.ModParticles;
import net.dylanvhs.builders_galore.sounds.ModSounds;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;

@Mod(BuildersGalore.MOD_ID)
public class BuildersGalore
{

    public static final String MOD_ID = "builders_galore";

    public static final Logger LOGGER = LogUtils.getLogger();
    public static final List<Runnable> CALLBACKS = new ArrayList<>();
    public BuildersGalore()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        ModSounds.register(modEventBus);

        ModParticles.PARTICLE_TYPES.register(modEventBus);

        ModBlocks.BLOCKS.register(modEventBus);


        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}