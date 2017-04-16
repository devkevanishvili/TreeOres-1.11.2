package com.dkeva.treeores.blocks;

import com.dkeva.treeores.enums.TV1;
import com.google.common.base.Predicate;
import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

/**
 * Created by nefelibata on 4/13/17.
 *
 * PS: It is more practical to extend BlockLog, Tried already copying most of the functionality, but it seems easier to just extend it because no log type changing features is in BlockLog
 */
public class BlockTLogs1 extends BlockLog {
    /**
     * Gets variants based on the enum from TRefs Class. Variants can't be more than 4 (0,1,2,3) Limits.
     */
    public static final PropertyEnum<TV1> VARIANT = PropertyEnum.<TV1>create("variant", TV1.class, new Predicate<TV1>()
    {
        public boolean apply(@Nullable TV1 enumType)
        {
            return enumType.getMetadata() < 4;
        }
    });

    /**
     * Setting default(base) state of block . default variant = IRON (cuz' it's the first one) and log axis = y (because reasons?)
     */
    public BlockTLogs1() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TV1.IRON).withProperty(LOG_AXIS,BlockLog.EnumAxis.Y));
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

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, TV1.byMetadata((meta & 3) % 4));

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @SuppressWarnings("incomplete-switch")
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | ((TV1)state.getValue(VARIANT)).getMetadata();

        switch ((BlockLog.EnumAxis)state.getValue(LOG_AXIS))
        {
            case X:
                i |= 4;
                break;
            case Z:
                i |= 8;
                break;
            case NONE:
                i |= 12;
        }

        return i;
    }

    /**
     *
     * Creates block state?
     */
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {VARIANT, LOG_AXIS});
    }

    /**
     *
     * @param state
     * @return What Drops when mined with silktouch enchantment
     */
    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TV1)state.getValue(VARIANT)).getMetadata());
    }


    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        TV1 tv = (TV1)state.getValue(VARIANT);
        return tv.getMetadata();
    }

}
