package com.miorganizacion.miprimermod.init;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModCreativeTab {

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(InitItems.ARROZ.get()); //Con esto cambiamos el icono del CREATIVETAB
        }

        //public void fillItemList(NonNullList<ItemStack> items) {
      //      super.fillItemList(items); // Esto asegura que cualquier ítem estándar también se incluya si es necesario.

            // Una vez tengamos creados todos los objetos los ordenamos a gusto
           // items.add(new ItemStack(InitItems.RAMEN.get())); // 1. Ramen
           // items.add(new ItemStack(InitItems.RAMEN_POLLO.get())); // 2. Ramen Pollo
           // items.add(new ItemStack(InitItems.ARROZ.get())); // 3. Arroz
      //  }





    };
}
