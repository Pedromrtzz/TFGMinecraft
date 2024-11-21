package com.miorganizacion.miprimermod.init;

import com.miorganizacion.miprimermod.Miprimermod;
import com.miorganizacion.miprimermod.init.custom.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =DeferredRegister.create(
            ForgeRegistries.BLOCKS, Miprimermod.MODID
    );

    public static final RegistryObject<Block> SARTEN = BLOCKS.register(
            "sarten", () -> new SartenBlock()
    );

    public static final RegistryObject<Block> MESA = BLOCKS.register(
            "mesa", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()) {
            }
    );

    public static final RegistryObject<Block> SILLA = BLOCKS.register(
            "silla", () -> new SillaBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops()) {

            }
    );

    public static final RegistryObject<Block> ENCIMERA = BLOCKS.register(
            "encimera", () -> new EncimeraBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion()) {}
    );

    public static final RegistryObject<Block> ENCIMERA_ENTERA = BLOCKS.register(
            "encimera_entera", () -> new EncimeraEnteraBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion()) {}
    );

    public static final RegistryObject<Block> FREGADERO = BLOCKS.register(
            "fregadero", () -> new FregaderoBlock()
    );

    public static final RegistryObject<Block> EXTRACTOR = BLOCKS.register(
            "extractor", () -> new ExtractorBlock()
    );

    public static final RegistryObject<Block> ARMARIO = BLOCKS.register(
            "armario_arriba", () -> new ArmarioBlock()
    );

    public static final RegistryObject<Block> SUSHI = BLOCKS.register(
            "sushi", () -> new SushiBlock()
    );

    public static final RegistryObject<Block> VITROCERAMICA = BLOCKS.register(
            "vitroceramica", () -> new VitroceramicaBlock()
    );

    public static final RegistryObject<Block> ESTANTERIA = BLOCKS.register(
            "estanteria", () -> new EstanteriaBlock()
    );

    public static final RegistryObject<Block> NEVERA = BLOCKS.register(
            "nevera", () -> new NeveraBlock()
    );

    public static final RegistryObject<Block> BOTE = BLOCKS.register(
            "bote", () -> new BoteBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> OLLA = BLOCKS.register(
            "olla", () -> new OllaBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> BASURA = BLOCKS.register(
            "basura", () -> new BasuraBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> MICROONDAS = BLOCKS.register(
            "microondas", () -> new MicroondasBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops())
    );

    public static final RegistryObject<Block> BALDA = BLOCKS.register(
            "balda", () -> new BaldaBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().requiresCorrectToolForDrops())
    );






}
