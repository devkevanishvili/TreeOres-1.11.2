package com.dkeva.treeores.blocks;

import com.dkeva.treeores.enums.TV1;
import com.google.common.base.Predicate;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

/**
 * Created by nefelibata on 4/15/17.
 */
public class BlockTLeaves1 extends BlockLeaves {
    public static final PropertyEnum<TV1> VARIANT = PropertyEnum.<TV1>create("variant", TV1.class, new Predicate<TV1>()
    {
        public boolean apply(@Nullable TV1 enumType)
        {
            return enumType.getMetadata() < 4;
        }
    });

    public BlockTLeaves1(){
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TV1.IRON).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TBlocks.TSaplings1);
    }



    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return Blocks.LEAVES.getBlockLayer();
    }
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance)
    {
        if (state.getValue(VARIANT) == TV1.IRON && worldIn.rand.nextInt(chance) == 0)
        {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.IRON_INGOT));
        } else if(state.getValue(VARIANT) == TV1.GOLD && worldIn.rand.nextInt(chance) == 0){
            spawnAsEntity(worldIn,pos,new ItemStack(Items.GOLD_INGOT));
        } else if(state.getValue(VARIANT) == TV1.COAL && worldIn.rand.nextInt(chance) == 0){
            spawnAsEntity(worldIn,pos,new ItemStack(Items.COAL));
        } else if(state.getValue(VARIANT) == TV1.REDSTONE && worldIn.rand.nextInt(chance) == 0){
            spawnAsEntity(worldIn,pos,new ItemStack(Items.REDSTONE));
        }
    }

    //TODO: How does this work?
    protected int getSaplingDropChance(IBlockState state)
    {
        return  30;
    }
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> list)
    {
        list.add(new ItemStack(itemIn, 1, TV1.IRON.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV1.GOLD.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV1.COAL.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TV1.REDSTONE.getMetadata()));
    }


    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TV1)state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, this.getWoodTypes(meta)).withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | ((TV1)state.getValue(VARIANT)).getMetadata();

        if (!((Boolean)state.getValue(DECAYABLE)).booleanValue())
        {
            i |= 4;
        }

        if (((Boolean)state.getValue(CHECK_DECAY)).booleanValue())
        {
            i |= 8;
        }

        return i;
    }



    public TV1 getWoodTypes(int meta){
        return TV1.byMetadata((meta & 3) % 4);
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {VARIANT, CHECK_DECAY, DECAYABLE});
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return ((TV1)state.getValue(VARIANT)).getMetadata();
    }

    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack)
    {
        if (!worldIn.isRemote && stack.getItem() == Items.SHEARS)
        {
            player.addStat(StatList.getBlockStats(this));
        }
        else
        {
            super.harvestBlock(worldIn, player, pos, state, te, stack);
        }
    }

    @Override
    public NonNullList<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
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
