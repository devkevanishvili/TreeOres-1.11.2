package com.dkeva.treeores.proxy;

import com.dkeva.treeores.ColorManager;
import com.dkeva.treeores.blocks.TBlocks;
import com.dkeva.treeores.items.TItems;

/**
 * Created by nefelibata on 4/13/17.
 */
public class ClientProxy implements CommonProxy {
    @Override
    public void preInit() {
        TBlocks.registerVariants();
    }

    @Override
    public  void init() {
        TItems.registerRenders();
        TBlocks.registerRenders();
        ColorManager.registerColourHandlers();
    }
}
