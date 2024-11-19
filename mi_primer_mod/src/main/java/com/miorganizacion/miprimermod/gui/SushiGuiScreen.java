package com.miorganizacion.miprimermod.gui;

import com.miorganizacion.miprimermod.init.InitItems;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class SushiGuiScreen extends Screen {
    private int sushiStep = 0;

    public SushiGuiScreen(Component title) {
        super(title);
    }

    @Override
    protected void init() {
        // Botón para avanzar en el proceso de hacer sushi
        addRenderableWidget(new Button(this.width / 2 - 50, this.height / 2 - 10, 100, 20, Component.literal("Siguiente Paso"), button -> {
            advanceSushiStep();
        }));
    }

    private void advanceSushiStep() {
        sushiStep++;
        switch (sushiStep) {
            case 1:
                minecraft.player.sendSystemMessage(Component.literal("Paso 1: Lava el arroz."));
                break;
            case 2:
                minecraft.player.sendSystemMessage(Component.literal("Paso 2: Coloca el pescado y el alga nori."));
                break;
            case 3:
                minecraft.player.sendSystemMessage(Component.literal("¡Sushi completado!"));
                rewardPlayer();
                sushiStep = 0; // Reinicia el minijuego
                minecraft.player.closeContainer();
                break;
        }
    }

    private void rewardPlayer() {
        ItemStack sushi = new ItemStack(InitItems.SUSHI.get());
        minecraft.player.getInventory().add(sushi);
        minecraft.player.sendSystemMessage(Component.literal("¡Has recibido un sushi completado como recompensa!"));
    }



    @Override
    public boolean isPauseScreen() {
        return false;
    }
}

