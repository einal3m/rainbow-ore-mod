package com.einalem.rainbowore.worldgen;

import com.einalem.rainbowore.Config;
import com.einalem.rainbowore.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class RainbowOreWorldGenerator implements IWorldGenerator {

  WorldGenerator oreGen;

  public RainbowOreWorldGenerator() {
    oreGen = new WorldGenMinable(
        ModBlocks.rainbowOreBlock.getDefaultState(),
        Config.oreVeinSize,
        BlockMatcher.forBlock(Blocks.STONE)
    );
  }

  @Override
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    if (world.provider.getDimension() == 0) { // the overworld
      generateOre(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
  }

  private void generateOre(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    int maxHeight = Config.oreMaxHeight;
    int minHeight = Config.oreMinHeight;

    for (int j = 0; j < Config.oreVeinsPerChunk; ++j) {
      BlockPos blockpos = new BlockPos(chunkX * 16 + random.nextInt(16), random.nextInt(maxHeight - minHeight) + minHeight, chunkZ * 16 + random.nextInt(16));
      oreGen.generate(world, random, blockpos);
    }
  }
}
