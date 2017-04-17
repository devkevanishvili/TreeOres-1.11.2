package com.dkeva.treeores.itemBlocks;

import com.dkeva.treeores.enums.TV3;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by nefelibata on 4/13/17.
 */
public class ItemBlockTBSaplings3 extends ItemBlock {
    public ItemBlockTBSaplings3(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TV3.values().length)) {
            i = 0;
        }
        return TV3.values()[i] + "_boss_sapling";
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
}
