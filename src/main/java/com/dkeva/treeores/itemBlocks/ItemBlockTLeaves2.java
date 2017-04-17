package com.dkeva.treeores.itemBlocks;

import com.dkeva.treeores.enums.TV2;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by nefelibata on 4/13/17.
 */
public class ItemBlockTLeaves2 extends ItemBlock {
    public ItemBlockTLeaves2(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= 4)) {
            i = 0;
        }
        return TV2.values()[i] + "_leaf";
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}
