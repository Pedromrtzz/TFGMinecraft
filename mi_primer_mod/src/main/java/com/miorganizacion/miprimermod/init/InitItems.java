package com.miorganizacion.miprimermod.init;

import com.miorganizacion.miprimermod.Miprimermod;
import com.miorganizacion.miprimermod.init.custom.GalletaSuerteItem;
import com.miorganizacion.miprimermod.init.custom.SushiBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SnowballItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class InitItems {



    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, Miprimermod.MODID
    );

    public static final RegistryObject<Item> POKEBALL = ITEMS.register(
            "pokeball", () -> new SnowballItem(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB).fireResistant())
    );

    public static final RegistryObject<Item> MORTERO = ITEMS.register(
            "mortero", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> HARINA = ITEMS.register(
            "harina", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> PASTA = ITEMS.register(
            "pasta", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> SAL = ITEMS.register(
            "sal", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> FIDEOS = ITEMS.register(
            "fideos", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> CALDO = ITEMS.register(
            "caldo", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> CALDO_POLLO = ITEMS.register(
            "caldo_pollo", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> CALDO_CARNE = ITEMS.register(
            "caldo_carne", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> CALDO_PESCADO = ITEMS.register(
            "caldo_pescado", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> RAMEN = ITEMS.register(
            "ramen", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.RAMEN))
    );

    public static final RegistryObject<Item> RAMEN_POLLO = ITEMS.register(
            "ramen_pollo", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                .food(ModFoods.RAMEN_POLLO))
    );

    public static final RegistryObject<Item> RAMEN_PESCADO = ITEMS.register(
            "ramen_pescado", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.RAMEN_PESCADO))
    );

    public static final RegistryObject<Item> RAMEN_CARNE = ITEMS.register(
            "ramen_carne", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.RAMEN_CARNE))
    );

    public static final RegistryObject<Item> OKONOMIYAKI_POLLO = ITEMS.register(
            "okonomiyaki_pollo", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.OKONOMIYAKI_POLLO))
    );

    public static final RegistryObject<Item> OKONOMIYAKI_CARNE = ITEMS.register(
            "okonomiyaki_carne", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.OKONOMIYAKI_CARNE))
    );

    public static final RegistryObject<Item> OKONOMIYAKI_VERDURAS = ITEMS.register(
            "okonomiyaki_verduras", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.OKONOMIYAKI_VERDURAS))
    );

    public static final RegistryObject<Item> MASA = ITEMS.register(
            "masa", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> DUMPLING = ITEMS.register(
            "dumpling", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.DUMPLING))
    );

    public static final RegistryObject<Item> ARROZ = ITEMS.register(
            "arroz", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> TAZA = ITEMS.register(
            "taza", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> LECHE = ITEMS.register(
            "leche", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> TE = ITEMS.register(
            "te", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> TE_MATCHA = ITEMS.register(
            "te_matcha", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.TE_MATCHA))
    );

    public static final RegistryObject<Item> PASTARROZ = ITEMS.register(
            "pasta_arroz", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> MOCHI_VERDE = ITEMS.register(
            "mochi_verde", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.MOCHI_VERDE))
    );

    public static final RegistryObject<Item> MOCHI_FRESA = ITEMS.register(
            "mochi_fresa", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.MOCHI_FRESA))
    );

    public static final RegistryObject<Item> FRESA = ITEMS.register(
            "fresa", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> BROCHETA_POLLO = ITEMS.register(
            "brocheta_pollo", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.BROCHETA_POLLO))
    );

    public static final RegistryObject<Item> CEBOLLA = ITEMS.register(
            "cebolla", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> TERIYAKI = ITEMS.register(
            "teriyaki", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> ARROZ_POLLO = ITEMS.register(
            "arroz_pollo", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.ARROZ_POLLO))
    );

    public static final RegistryObject<Item> ARROZ_VERDURAS = ITEMS.register(
            "arroz_verduras", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.ARROZ_VERDURAS))
    );

    public static final RegistryObject<Item> ARROZ_FRITO = ITEMS.register(
            "arroz_frito", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.ARROZ_FRITO))
    );

    public static final RegistryObject<Item> ONIGIRI = ITEMS.register(
            "onigiri", () -> new Item(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.ONIGIRI))
    );

















    public static final RegistryObject<Item> GALLETA_SUERTE = ITEMS.register(
            "galleta_suerte", () -> new GalletaSuerteItem(new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> SARTEN_ITEM = ITEMS.register(
            "sarten", () -> new BlockItem(ModBlocks.SARTEN.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> MESA_ITEM = ITEMS.register(
            "mesa", () -> new BlockItem(ModBlocks.MESA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> SILLA_ITEM = ITEMS.register(
            "silla", () -> new BlockItem(ModBlocks.SILLA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> ENCIMERA = ITEMS.register(
            "encimera", () -> new BlockItem(ModBlocks.ENCIMERA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> ENCIMERA_ENTERA = ITEMS.register(
            "encimera_entera", () -> new BlockItem(ModBlocks.ENCIMERA_ENTERA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> FREGADERO = ITEMS.register(
            "fregadero", () -> new BlockItem(ModBlocks.FREGADERO.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> EXTRACTOR = ITEMS.register(
            "extractor", () -> new BlockItem(ModBlocks.EXTRACTOR.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> ARMARIO = ITEMS.register(
            "armario_arriba", () -> new BlockItem(ModBlocks.ARMARIO.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> VITROCERAMICA = ITEMS.register(
            "vitroceramica", () -> new BlockItem(ModBlocks.VITROCERAMICA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> ESTANTERIA = ITEMS.register(
            "estanteria", () -> new BlockItem(ModBlocks.ESTANTERIA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> NEVERA = ITEMS.register(
            "nevera", () -> new BlockItem(ModBlocks.NEVERA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> BOTE = ITEMS.register(
            "bote", () -> new BlockItem(ModBlocks.BOTE.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> OLLA = ITEMS.register(
            "olla", () -> new BlockItem(ModBlocks.OLLA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> BASURA = ITEMS.register(
            "basura", () -> new BlockItem(ModBlocks.BASURA.get(), new Item.Properties().tab(ModCreativeTab.TUTORIAL_TAB))
    );

    public static final RegistryObject<Item> SUSHI = ITEMS.register(
            "sushi", () -> new BlockItem(ModBlocks.SUSHI.get(), new Item.Properties()
                    .tab(ModCreativeTab.TUTORIAL_TAB)
                    .food(ModFoods.SUSHI))
    );














}
