package com.miorganizacion.miprimermod.init.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.LevelAccessor;

public class EstanteriaBlock extends Block {

    // Usamos una propiedad de dirección horizontal (NORTH, SOUTH, EAST, WEST)
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public EstanteriaBlock() {
        super(Properties.of(Material.WOOD)
                .noOcclusion()
                .lightLevel(state -> 1)
        );
        // Establecemos la dirección predeterminada en el norte
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    // Sobrescribimos el método getShape para la forma del bloque
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return Block.box(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D);
    }

    // Este método define en qué estado se coloca el bloque cuando el jugador lo coloca
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        // Coloca el bloque con la dirección en la que está mirando el jugador
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    // Este método se encarga de definir las propiedades del bloque
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Registramos la propiedad FACING como parte del BlockState
        builder.add(FACING);
    }

    // Sobrescribimos rotate para que el bloque pueda rotarse al usar pistones u otras mecánicas
    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    // Sobrescribimos mirror para que la orientación del bloque cambie adecuadamente si es espejado
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }
}
