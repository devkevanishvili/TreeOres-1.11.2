package com.dkeva.treeores.blocks;

import com.dkeva.treeores.enums.TV2;
import com.google.common.base.Predicate;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by nefelibata on 4/15/17.
 */
public class BlockTBLeaves2 extends BlockLeaves {
    public static final PropertyEnum<TV2> VARIANT = PropertyEnum.<TV2>create("variant", TV2.class, new Predicate<TV2>() {
        public boolean apply(@Nullable TV2 enumType) {
            return enumType.getMetadata() < 4;
        }
    });

    public BlockTBLeaves2() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TV2.DIAMOND).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
    }


    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(TBlocks.TBSaplings2);
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return Blocks.LEAVES.getBlockLayer();
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
        if (state.getValue(VARIANT) == TV2.DIAMOND && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.DIAMOND));
        } else if (state.getValue(VARIANT) == TV2.EMERALD && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.EMERALD));
        } else if (state.getValue(VARIANT) == TV2.LAPIS && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.DYE, 1, 11));
        } else if (state.getValue(VARIANT) == TV2.OBSIDIAN && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Blocks.OBSIDIAN));
        }
    }

    //TODO: How does this work?
    protected int getSaplingDropChance(IBlockState state) {
        return 40;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
        list.add(new ItemStack(itemIn, 1, TV2.DIAMOND.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV2.EMERALD.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV2.LAPIS.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV2.OBSIDIAN.getMetadata()));
    }


    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TV2) state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, this.getWoodTypes(meta)).withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((TV2) state.getValue(VARIANT)).getMetadata();

        if (!((Boolean) state.getValue(DECAYABLE)).booleanValue()) {
            i |= 4;
        }

        if (((Boolean) state.getValue(CHECK_DECAY)).booleanValue()) {
            i |= 8;
        }

        return i;
    }


    public TV2 getWoodTypes(int meta) {
        return TV2.byMetadata((meta & 3) % 4);
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{VARIANT, CHECK_DECAY, DECAYABLE});
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state) {
        return ((TV2) state.getValue(VARIANT)).getMetadata();
    }

    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        if (!worldIn.isRemote && stack.getItem() == Items.SHEARS) {
            player.addStat(StatList.getBlockStats(this));
        } else {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }

    @Override
    public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
        return NonNullList.withSize(1, new ItemStack(this, 1, world.getBlockState(pos).getValue(VARIANT).getMetadata()));
    }


    /**
     * @param meta
     * @return NULL, BlockPlanks not needed.... Must have this functions
     */
    @Override
    public BlockPlanks.EnumType getWoodType(int meta) {
        return null;
    }
}
