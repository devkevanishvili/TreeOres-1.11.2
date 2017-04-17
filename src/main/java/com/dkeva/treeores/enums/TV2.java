package com.dkeva.treeores.enums;

import net.minecraft.util.IStringSerializable;

import java.awt.*;

public enum TV2 implements IStringSerializable {
    DIAMOND(0, "diamond", new Color(92, 213, 219)),
    EMERALD(1, "emerald", new Color(0, 217, 58)),
    LAPIS(2, "lapis", new Color(74, 128, 255)),
    OBSIDIAN(3, "obsidian", new Color(21, 20, 31));

    private static final TV2[] META_LOOKUP = new TV2[values().length];

    static {
        for (TV2 trefs$enumtype : values()) {
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

    private TV2(int metaIn, String nameIn, Color color) {
        this(metaIn, nameIn, nameIn, color);
    }

    private TV2(int metaIn, String nameIn, String unlocalizedNameIn, Color color) {
        this.meta = metaIn;
        this.name = nameIn;
        this.unlocalizedName = unlocalizedNameIn;
        this.color = color;
    }

    public static TV2 byMetadata(int meta) {
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
