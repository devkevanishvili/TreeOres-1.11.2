package com.dkeva.treeores;

import com.dkeva.treeores.blocks.TBlocks;
import com.dkeva.treeores.handlers.DropHandler;
import com.dkeva.treeores.items.TItems;
import com.dkeva.treeores.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by nefelibata on 4/13/17.
 **/

@Mod(modid = TRefs.MODID, version = TRefs.VERSION, name = TRefs.NAME, updateJSON = TRefs.UPDATE_LINK)
public class TreeOres {

    @SidedProxy(clientSide = TRefs.CLIENT_PROXY, serverSide = TRefs.SERVER_PROXY)
    public static CommonProxy proxy;

    public static CreativeTabs CTab;

    @Mod.EventHandler
    private void preInit(FMLPreInitializationEvent e) {
        Configuration config = new Configuration(e.getSuggestedConfigurationFile());
        config.load();

        TRefs.EnableIronTreeCrafting = config.getBoolean("EnableIronTreeCrafting", "Trees", true, "Do you want to enable iron sapling crafting recipe?"); // done
        TRefs.EnableGoldTreeCrafting = config.getBoolean("EnableGoldTreeCrafting", "Trees", true, "Do you want to enable gold sapling crafting recipe?"); // done
        TRefs.EnableCoalTreeCrafting = config.getBoolean("EnableCoalTreeCrafting", "Trees", true, "Do you want to enable coal sapling crafting recipe?"); // done
        TRefs.EnableRedstoneTreeCrafting = config.getBoolean("EnableRedstoneTreeCrafting", "Trees", true, "Do you want to enable redstone sapling crafting recipe?"); // done
        TRefs.EnableEmeraldTreeCrafting = config.getBoolean("EnableEmeraldTreeCrafting", "Trees", true, "Do you want to enable emerald sapling crafting recipe?"); // done
        TRefs.EnableDiamondTreeCrafting = config.getBoolean("EnableDiamondTreeCrafting", "Trees", true, "Do you want to enable diamond sapling crafting recipe?"); // done
        TRefs.EnableLapisTreeCrafting = config.getBoolean("EnableLapisTreeCrafting", "Trees", true, "Do you want to enable lapis crafting recipe?"); // done
        TRefs.EnableObsidianTreeCrafting = config.getBoolean("EnableObsidianTreeCrafting", "Trees", true, "Do you want to enable obsidian sapling crafting recipe?"); // done
        TRefs.EnableGlowstoneTreeCrafting = config.getBoolean("EnableGlowstoneTreeCrafting", "Trees", true, "Do you want to enable glowstone sapling crafting recipe?"); // done
        TRefs.EnableQuartzTreeCrafting = config.getBoolean("EnableQuartzTreeCrafting", "Trees", true, "Do you want to enable quartz sapling crafting recipe?"); // done
        TRefs.EnableXpTreeCrafting = config.getBoolean("EnableXpTreeCrafting", "Trees", true, "Do you want to enable xp sapling crafting recipe?"); // done

        TRefs.EnableChops = config.getBoolean("EnableChops", "Trees", true, "Do you want to enable chops?"); // done
        TRefs.EnableBonemeal = config.getBoolean("EnableBonemeal", "Trees", true, "Do you want to enable bonemeal?"); // done
        TRefs.EnableBonemealBossTrees = config.getBoolean("EnableBonemealBossTrees", "Trees", true, "Do you want to enable bonemeal on boss trees?"); // done

        TRefs.OreDictLeaves = config.getString("OreDictLeaves", "Trees", "treeLeaves", "Ore Dictionary name for leaves"); // done
        TRefs.OreDictLogs = config.getString("OreDictLogs", "Trees", "logWood", "Ore Dictionary name for logs"); // done
        TRefs.OreDictSaplings = config.getString("OreDictSaplings", "Trees", "treeSapling", "Ore Dictionary name for saplings"); // done
        TRefs.oreDictChops = config.getString("OreDictChops", "Trees", "treeChop", "Ore Dictionary name for chops"); // done

        config.save();
        CTab = new CreativeTabs("toTab") {
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Blocks.SAPLING);
            }
        };
        TItems.init();
        TBlocks.init();
        proxy.preInit();
        TCrafting.addRecipesToGame();
    }

    private void oreDict() {
        for (int i = 0; i < 4; i++) {
            OreDictionary.registerOre(TRefs.OreDictLeaves, new ItemStack(TBlocks.TLeaves1, 1, i));
            OreDictionary.registerOre(TRefs.OreDictLeaves, new ItemStack(TBlocks.TLeaves2, 1, i));
            OreDictionary.registerOre(TRefs.OreDictLeaves, new ItemStack(TBlocks.TBLeaves1, 1, i));
            OreDictionary.registerOre(TRefs.OreDictLeaves, new ItemStack(TBlocks.TBLeaves2, 1, i));
            OreDictionary.registerOre(TRefs.OreDictLogs, new ItemStack(TBlocks.TLogs1, 1, i));
            OreDictionary.registerOre(TRefs.OreDictLogs, new ItemStack(TBlocks.TLogs2, 1, i));
            OreDictionary.registerOre(TRefs.OreDictSaplings, new ItemStack(TBlocks.TSaplings1, 1, i));
            OreDictionary.registerOre(TRefs.OreDictSaplings, new ItemStack(TBlocks.TSaplings2, 1, i));
            OreDictionary.registerOre(TRefs.OreDictSaplings, new ItemStack(TBlocks.TBSaplings1, 1, i));
            OreDictionary.registerOre(TRefs.OreDictSaplings, new ItemStack(TBlocks.TBSaplings2, 1, i));
            OreDictionary.registerOre(TRefs.oreDictChops, new ItemStack(TItems.TChops1, 1, i));
            OreDictionary.registerOre(TRefs.oreDictChops, new ItemStack(TItems.TChops2, 1, i));
        }
        for (int i = 0; i < 3; i++) {
            OreDictionary.registerOre(TRefs.OreDictLeaves, new ItemStack(TBlocks.TLeaves3, 1, i));
            OreDictionary.registerOre(TRefs.OreDictLeaves, new ItemStack(TBlocks.TBLeaves3, 1, i));
            OreDictionary.registerOre(TRefs.OreDictLogs, new ItemStack(TBlocks.TLogs3, 1, i));
            OreDictionary.registerOre(TRefs.OreDictSaplings, new ItemStack(TBlocks.TSaplings3, 1, i));
            OreDictionary.registerOre(TRefs.OreDictSaplings, new ItemStack(TBlocks.TBSaplings3, 1, i));
            OreDictionary.registerOre(TRefs.oreDictChops, new ItemStack(TItems.TChops3, 1, i));
        }
    }

    @Mod.EventHandler
    private void init(FMLInitializationEvent e) {
        proxy.init();
        MinecraftForge.EVENT_BUS.register(new DropHandler());
    }

    @Mod.EventHandler
    private void postInit(FMLPostInitializationEvent e) {

    }
}
