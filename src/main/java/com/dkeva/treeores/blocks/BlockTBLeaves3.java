package com.dkeva.treeores.blocks;

import com.dkeva.treeores.enums.TV3;
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
public class BlockTBLeaves3 extends BlockLeaves {
    public static final PropertyEnum<TV3> VARIANT = PropertyEnum.<TV3>create("variant", TV3.class, new Predicate<TV3>() {
        public boolean apply(@Nullable TV3 enumType) {
            return enumType.getMetadata() < 3;
        }
    });

    public BlockTBLeaves3() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TV3.GLOWSTONE).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        return true;
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(TBlocks.TBSaplings3);
    }


    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
        if (state.getValue(VARIANT) == TV3.GLOWSTONE && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.GLOWSTONE_DUST));
        } else if (state.getValue(VARIANT) == TV3.QUARTZ && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.QUARTZ));
        } else if (state.getValue(VARIANT) == TV3.XP && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.EXPERIENCE_BOTTLE));
        }
    }

    //TODO: How does this work?
    protected int getSaplingDropChance(IBlockState state) {
        return 40;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return Blocks.LEAVES.getBlockLayer();
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list) {
        list.add(new ItemStack(itemIn, 1, TV3.GLOWSTONE.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV3.QUARTZ.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV3.XP.getMetadata()));
    }

    protected ItemStack getSilkTouchDrop(IBlockState state) {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TV3) state.getValue(VARIANT)).getMetadata());
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
        i = i | ((TV3) state.getValue(VARIANT)).getMetadata();

        if (!((Boolean) state.getValue(DECAYABLE)).booleanValue()) {
            i |= 4;
        }

        if (((Boolean) state.getValue(CHECK_DECAY)).booleanValue()) {
            i |= 8;
        }

        return i;
    }


    public TV3 getWoodTypes(int meta) {
        return TV3.byMetadata((meta & 3) % 4);
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{VARIANT, CHECK_DECAY, DECAYABLE});
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state) {
        return ((TV3) state.getValue(VARIANT)).getMetadata();
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
