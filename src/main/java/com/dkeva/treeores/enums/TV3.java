package com.dkeva.treeores.enums;

import net.minecraft.util.IStringSerializable;

import java.awt.*;

public enum TV3 implements IStringSerializable {
    GLOWSTONE(0, "glowstone", new Color(255, 255, 1)),
    QUARTZ(1, "quartz", new Color(255, 255, 255)),
    XP(2, "xp", new Color(127, 178, 56));

    private static final TV3[] META_LOOKUP = new TV3[values().length];

    static {
        for (TV3 trefs$enumtype : values()) {
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

    private TV3(int metaIn, String nameIn, Color color) {
        this(metaIn, nameIn, nameIn, color);
    }

    private TV3(int metaIn, String nameIn, String unlocalizedNameIn, Color color) {
        this.meta = metaIn;
        this.name = nameIn;
        this.unlocalizedName = unlocalizedNameIn;
        this.color = color;
    }

    public static TV3 byMetadata(int meta) {
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
