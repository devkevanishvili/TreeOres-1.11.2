package com.dkeva.treeores.itemBlocks;

import com.dkeva.treeores.enums.TV1;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by nefelibata on 4/13/17.
 */
public class ItemBlockTLeaves1 extends ItemBlock {
    public ItemBlockTLeaves1(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TV1.values().length)) {
            i = 0;
        }
        return TV1.values()[i] + "_leaf";
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}
