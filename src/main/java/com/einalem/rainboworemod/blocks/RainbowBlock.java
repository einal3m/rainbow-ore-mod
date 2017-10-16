package com.einalem.rainboworemod.blocks;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RainbowBlock extends Block {
  public static final String REGISTRY_NAME = "rainbow_block";
  public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

  public RainbowBlock() {
    super(Material.IRON, MapColor.DIAMOND);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
    setRegistryName(REGISTRY_NAME);
    setHardness(5.0F);
    setResistance(10.0F);
    setSoundType(SoundType.METAL);
    setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
  }

  @Override
  public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
  {
    return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
  }

  @Override
  public IBlockState getStateFromMeta(int meta) {
    return getDefaultState().withProperty(FACING, EnumFacing.getFront(meta & 7));
  }

  @Override
  public int getMetaFromState(IBlockState state) {
    return state.getValue(FACING).getIndex();
  }

  @Override
  protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, FACING);
  }
}
