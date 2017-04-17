package com.dkeva.treeores.blocks;

import com.dkeva.treeores.enums.TV2;
import com.dkeva.treeores.worldGen.WorldGenTreeOres2;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

/**
 * Created by nefelibata on 4/16/17.
 */
public class BlockTBSaplings2 extends BlockBush implements IGrowable {
    public static final PropertyEnum<TV2> TYPE = PropertyEnum.<TV2>create("type", TV2.class);
    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);
    protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);

    public BlockTBSaplings2() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, TV2.DIAMOND).withProperty(STAGE, Integer.valueOf(0)));
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return SAPLING_AABB;
    }

    /**
     * Gets the localized name of this block. Used for the statistics page. Is this needed ?
     */
    public String getLocalizedName() {
        return I18n.translateToLocal(this.getUnlocalizedName() + "." + TV2.DIAMOND.getUnlocalizedName() + ".name");
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (((Integer) state.getValue(STAGE)).intValue() == 0) {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        } else {
            this.generateTree(worldIn, pos, state, rand);
        }
    }

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) return;
        WorldGenerator worldgenerator = new WorldGenTrees(true);
        int i = 0;
        int j = 0;
        boolean flag = false;
        IBlockState logState;
        IBlockState leafState;

        switch ((TV2) state.getValue(TYPE)) {
            case DIAMOND:
                logState = TBlocks.TLogs2.getDefaultState().withProperty(BlockTLogs2.VARIANT, TV2.DIAMOND);
                leafState = TBlocks.TBLeaves2.getDefaultState().withProperty(BlockTBLeaves2.VARIANT, TV2.DIAMOND).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres2(true, 15 + rand.nextInt(7), logState, leafState, false);
                break;
            case EMERALD:
                logState = TBlocks.TLogs2.getDefaultState().withProperty(BlockTLogs2.VARIANT, TV2.EMERALD);
                leafState = TBlocks.TBLeaves2.getDefaultState().withProperty(BlockTBLeaves2.VARIANT, TV2.EMERALD).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres2(true, 15 + rand.nextInt(7), logState, leafState, false);
                break;
            case LAPIS:
                logState = TBlocks.TLogs2.getDefaultState().withProperty(BlockTLogs2.VARIANT, TV2.LAPIS);
                leafState = TBlocks.TBLeaves2.getDefaultState().withProperty(BlockTBLeaves2.VARIANT, TV2.LAPIS).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres2(true, 15 + rand.nextInt(7), logState, leafState, false);
                break;
            case OBSIDIAN:
                logState = TBlocks.TLogs2.getDefaultState().withProperty(BlockTLogs2.VARIANT, TV2.OBSIDIAN);
                leafState = TBlocks.TBLeaves2.getDefaultState().withProperty(BlockTBLeaves2.VARIANT, TV2.OBSIDIAN).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres2(true, 15 + rand.nextInt(7), logState, leafState, false);
                break;
        }

        IBlockState airState = Blocks.AIR.getDefaultState();

        if (flag) {
            worldIn.setBlockState(pos.add(i, 0, j), airState, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j), airState, 4);
            worldIn.setBlockState(pos.add(i, 0, j + 1), airState, 4);
            worldIn.setBlockState(pos.add(i + 1, 0, j + 1), airState, 4);
        } else {
            worldIn.setBlockState(pos, airState, 4);
        }

        if (!worldgenerator.generate(worldIn, rand, pos.add(i, 0, j))) {
            if (flag) {
                worldIn.setBlockState(pos.add(i, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j), state, 4);
                worldIn.setBlockState(pos.add(i, 0, j + 1), state, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j + 1), state, 4);
            } else {
                worldIn.setBlockState(pos, state, 4);
            }
        }
    }

    private boolean isTwoByTwoOfType(World worldIn, BlockPos pos, int p_181624_3_, int p_181624_4_, TV2 type) {
        return this.isTypeAt(worldIn, pos.add(p_181624_3_, 0, p_181624_4_), type) && this.isTypeAt(worldIn, pos.add(p_181624_3_ + 1, 0, p_181624_4_), type) && this.isTypeAt(worldIn, pos.add(p_181624_3_, 0, p_181624_4_ + 1), type) && this.isTypeAt(worldIn, pos.add(p_181624_3_ + 1, 0, p_181624_4_ + 1), type);
    }

    /**
     * Check whether the given BlockPos has a Sapling of the given type
     */
    public boolean isTypeAt(World worldIn, BlockPos pos, TV2 type) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        return iblockstate.getBlock() == this && iblockstate.getValue(TYPE) == type;
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state) {
        return ((TV2) state.getValue(TYPE)).getMetadata();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
        for (TV2 TV2$enumtype : TV2.values()) {
            list.add(new ItemStack(itemIn, 1, TV2$enumtype.getMetadata()));
        }
    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
        return true;
    }


    //TODO: Can? Config file
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        return (double) worldIn.rand.nextFloat() < 0.45D;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
        this.grow(worldIn, pos, state, rand);
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(TYPE, TV2.byMetadata(meta & 7)).withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((TV2) state.getValue(TYPE)).getMetadata();
        i = i | ((Integer) state.getValue(STAGE)).intValue() << 3;
        return i;
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{TYPE, STAGE});
    }
}
