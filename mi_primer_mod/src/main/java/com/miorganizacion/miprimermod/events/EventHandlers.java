package com.miorganizacion.miprimermod.events;

import com.miorganizacion.miprimermod.gui.SushiGuiScreen;
import com.miorganizacion.miprimermod.init.InitItems;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class EventHandlers {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Player player = event.getEntity();
        ItemStack item = event.getItemStack();

        // Verifica que el jugador esté en el cliente y hace clic derecho con el ítem específico
        if (item.getItem() == InitItems.HARINA.get()) { // Item de inicio para el minijuego
            player.sendSystemMessage(Component.literal("¡Vamos a preparar un sushi!"));
            Minecraft.getInstance().setScreen(new SushiGuiScreen(Component.literal("Preparación de Sushi")));
        }

    }
}
