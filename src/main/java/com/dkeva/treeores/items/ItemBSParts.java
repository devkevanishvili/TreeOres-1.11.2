package com.dkeva.treeores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by nefelibata on 4/18/17.
 */
public class ItemBSParts extends Item {
    public ItemBSParts() {
        this.hasSubtypes = true;
        this.setMaxDamage(0);
    }

    public String getUnlocalizedName(ItemStack stack) {
        int i = stack.getMetadata();
        switch (i) {
            case 0:
                return super.getUnlocalizedName() + "_broken";
            case 1:
                return super.getUnlocalizedName() + "_final";
            default:
                return super.getUnlocalizedName();
        }
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
        for (int i = 0; i < 2; ++i) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }
}
