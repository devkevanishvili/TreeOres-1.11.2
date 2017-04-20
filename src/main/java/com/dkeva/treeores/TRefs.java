package com.dkeva.treeores;

import net.minecraftforge.fml.common.Mod;

/**
 * Created by nefelibata on 4/13/17.
 */
public class TRefs {


    public static final String MODID = "treeores";
    public static final String VERSION = "1.0"; //TODO: CHANGE EVERY UPDATE
    public static final String NAME = "TreeOres Mod";
    public static final String UPDATE_LINK = "https://github.com/devkevanishvili/TreeOres-1.11.2/blob/master/src/main/resources/update.json";

    public static final String SERVER_PROXY = "com.dkeva.treeores.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "com.dkeva.treeores.proxy.ClientProxy";

    @Mod.Instance(MODID)
    public static TreeOres INSTANCE;

    //CONFIG FILE
    public static boolean EnableIronTreeCrafting;
    public static boolean EnableGoldTreeCrafting;
    public static boolean EnableCoalTreeCrafting;
    public static boolean EnableRedstoneTreeCrafting;
    public static boolean EnableEmeraldTreeCrafting;
    public static boolean EnableDiamondTreeCrafting;
    public static boolean EnableLapisTreeCrafting;
    public static boolean EnableObsidianTreeCrafting;
    public static boolean EnableGlowstoneTreeCrafting;
    public static boolean EnableQuartzTreeCrafting;
    public static boolean EnableXpTreeCrafting;

    public static boolean EnableBonemeal;
    public static boolean EnableBonemealBossTrees;
    public static boolean EnableChops;

    public static String OreDictLeaves;
    public static String OreDictLogs;
    public static String OreDictSaplings;
    public static String oreDictChops;
}

