package com.dkeva.treeores;

import net.minecraftforge.fml.common.Mod;

/**
 * Created by nefelibata on 4/13/17.
 */
public class TRefs {


    public static final String MODID = "treeores";
    public static final String VERSION = "1.0";
    public static final String NAME = "TreeOres Mod";

    public static final String SERVER_PROXY = "com.dkeva.treeores.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "com.dkeva.treeores.proxy.ClientProxy";

    @Mod.Instance(MODID)
    public static TreeOres INSTANCE;
}

