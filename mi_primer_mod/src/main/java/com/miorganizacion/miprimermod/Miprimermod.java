package com.miorganizacion.miprimermod;

import com.miorganizacion.miprimermod.events.EventHandlers;
import com.miorganizacion.miprimermod.init.InitItems;
import com.miorganizacion.miprimermod.init.ModBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Miprimermod.MODID)
public class Miprimermod {
    public static final String MODID = "miprimermod";

    public Miprimermod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // Registro de ítems y bloques en el bus del Mod
        InitItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);

        // Registro de manejadores de eventos en el bus general de Minecraft
        MinecraftForge.EVENT_BUS.register(new EventHandlers());
    }
}
