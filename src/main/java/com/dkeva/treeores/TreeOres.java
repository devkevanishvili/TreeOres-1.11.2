package com.dkeva.treeores;

import com.dkeva.treeores.blocks.TBlocks;
import com.dkeva.treeores.items.TItems;
import com.dkeva.treeores.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by nefelibata on 4/13/17.
 **/

@Mod(modid = TRefs.MODID, version = TRefs.VERSION, name = TRefs.NAME)
public class TreeOres {

    @SidedProxy(clientSide = TRefs.CLIENT_PROXY, serverSide = TRefs.SERVER_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs CTab;

    @Mod.EventHandler
    private void preInit(FMLPreInitializationEvent e) {

        CTab = new CreativeTabs("toTab") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Blocks.SAPLING);
            }
        };
        TItems.init();
        TBlocks.init();
        proxy.preInit();
    }

    @Mod.EventHandler
    private void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @Mod.EventHandler
    private void postInit(FMLPostInitializationEvent e) {

    }
}
