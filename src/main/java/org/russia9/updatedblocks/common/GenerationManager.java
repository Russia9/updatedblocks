package org.russia9.updatedblocks.common;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import org.russia9.updatedblocks.common.block.ModBlocks;

import java.util.Random;

public class GenerationManager implements IWorldGenerator{
    private WorldGenerator dioriteGeneration,graniteGeneration,andesiteGeneration;

    public GenerationManager() {
        this.andesiteGeneration = new WorldGenMinable(ModBlocks.andesite,8);
        this.dioriteGeneration = new WorldGenMinable(ModBlocks.diorite,8);
        this.graniteGeneration = new WorldGenMinable(ModBlocks.andesite,8);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider ChunkGenerator, IChunkProvider ChunkProvider) {
        switch (world.provider.dimensionId) {
            case 0:
                this.runGenerator(this.andesiteGeneration,world,random,chunkX,chunkZ,6,20,65);
                this.runGenerator(this.dioriteGeneration,world,random,chunkX,chunkZ,6,20,65);
                this.runGenerator(this.graniteGeneration,world,random,chunkX,chunkZ,6,20,65);
                break;
            case -1:

                break;
            case 1:

                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || minHeight > 256 || maxHeight < 0 || maxHeight > 256) {
            throw new IllegalArgumentException("Illegal height arguments for WorldGenerator");
        }
        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(heightDiff);
            int z = chunkZ * 16 + random.nextInt(16);
            generator.generate(world, random, x, y, z);
        }
    }
}
