package com.dkeva.treeores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

enum EnumTransformers implements IStringSerializable {
    NORMAL(0, 2, "normal"),
    REINFORCED(1, 1, "reinforced"),
    NETHER(2, 0, "nether");
    private static final EnumTransformers[] META_LOOKUP = new EnumTransformers[values().length];
    private static final EnumTransformers[] TRANSFORMER_DMG_LOOKUP = new EnumTransformers[values().length];

    static {
        for (EnumTransformers enumtransformers : values()) {
            META_LOOKUP[enumtransformers.getMetadata()] = enumtransformers;
            TRANSFORMER_DMG_LOOKUP[enumtransformers.getTransformerDamage()] = enumtransformers;
        }
    }

    private final int meta;
    private final int transformerDamage;
    private final String name;

    private EnumTransformers(int meta, int dyeDamage, String name) {
        this.meta = meta;
        this.transformerDamage = dyeDamage;
        this.name = name;
    }

    public static EnumTransformers byTransformerDamage(int damage) {
        if (damage < 0 || damage >= TRANSFORMER_DMG_LOOKUP.length) {
            damage = 0;
        }

        return TRANSFORMER_DMG_LOOKUP[damage];
    }

    public static EnumTransformers byMetadata(int meta) {
        if (meta < 0 || meta >= META_LOOKUP.length) {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    public int getMetadata() {
        return this.meta;
    }

    public int getTransformerDamage() {
        return this.transformerDamage;
    }

    public String getUnlocalizedName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }
}

/**
 * Created by nefelibata on 4/13/17.
 */
public class ItemTransformers extends Item {

    public ItemTransformers() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setContainerItem(this);
    }


    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack stack) {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + "_" + EnumTransformers.byTransformerDamage(i).getUnlocalizedName();
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
        for (int i = 0; i < 3; ++i) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }
}