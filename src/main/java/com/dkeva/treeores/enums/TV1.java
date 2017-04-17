package com.dkeva.treeores.enums;

import net.minecraft.util.IStringSerializable;

import java.awt.*;

public enum TV1 implements IStringSerializable {
    IRON(0, "iron", new Color(216, 175, 147)),
    GOLD(1, "gold", new Color(250, 238, 77)),
    COAL(2, "coal", new Color(76, 76, 76)),
    REDSTONE(3, "redstone", new Color(150, 44, 44));

    private static final TV1[] META_LOOKUP = new TV1[values().length];

    static {
        for (TV1 trefs$enumtype : values()) {
            META_LOOKUP[trefs$enumtype.getMetadata()] = trefs$enumtype;
        }
    }

    private final int meta;
    private final String name;
    private final String unlocalizedName;
    /**
     * The color that represents this entry on a map.
     */
    private final Color color;

    private TV1(int metaIn, String nameIn, Color color) {
        this(metaIn, nameIn, nameIn, color);
    }

    private TV1(int metaIn, String nameIn, String unlocalizedNameIn, Color color) {
        this.meta = metaIn;
        this.name = nameIn;
        this.unlocalizedName = unlocalizedNameIn;
        this.color = color;
    }

    public static TV1 byMetadata(int meta) {
        if (meta < 0 || meta >= META_LOOKUP.length) {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    public int getMetadata() {
        return this.meta;
    }

    /**
     * The color which represents this entry on a map.
     */
    public Color getLeafcolor() {
        return this.color;
    }

    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String getUnlocalizedName() {
        return this.unlocalizedName;
    }

}
