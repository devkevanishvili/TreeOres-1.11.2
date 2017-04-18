package com.dkeva.treeores.blocks;

import com.dkeva.treeores.TRefs;
import com.dkeva.treeores.TreeOres;
import com.dkeva.treeores.itemBlocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by nefelibata on 4/13/17.
 */
public class TBlocks {

    public static Block TLogs1;
    public static ItemBlock ITLogs1;
    public static Block TLogs2;
    public static ItemBlock ITLogs2;
    public static Block TLogs3;
    public static ItemBlock ITLogs3;
    public static Block TLeaves1;
    public static ItemBlock ITLeaves1;
    public static Block TLeaves2;
    public static ItemBlock ITLeaves2;
    public static Block TLeaves3;
    public static ItemBlock ITLeaves3;
    public static Block TBLeaves1;
    public static ItemBlock ITBLeaves1;
    public static Block TBLeaves2;
    public static ItemBlock ITBLeaves2;
    public static Block TBLeaves3;
    public static ItemBlock ITBLeaves3;
    public static Block TSaplings1;
    public static ItemBlock ITSaplings1;
    public static Block TSaplings2;
    public static ItemBlock ITSaplings2;
    public static Block TSaplings3;
    public static ItemBlock ITSaplings3;
    public static Block TBSaplings1;
    public static ItemBlock ITBSaplings1;
    public static Block TBSaplings2;
    public static ItemBlock ITBSaplings2;
    public static Block TBSaplings3;
    public static ItemBlock ITBSaplings3;

    public static void init() {
        //Logs
        TLogs1 = new BlockTLogs1().setCreativeTab(TreeOres.CTab).setRegistryName("tlogs1").setUnlocalizedName("log");
        ITLogs1 = new ItemBlockTLogs1(TLogs1);
        TLogs2 = new BlockTLogs2().setCreativeTab(TreeOres.CTab).setRegistryName("tlogs2").setUnlocalizedName("log");
        ITLogs2 = new ItemBlockTLogs2(TLogs2);
        TLogs3 = new BlockTLogs3().setCreativeTab(TreeOres.CTab).setRegistryName("tlogs3").setUnlocalizedName("log");
        ITLogs3 = new ItemBlockTLogs3(TLogs3);
        // Normal Leaves
        TLeaves1 = new BlockTLeaves1().setCreativeTab(TreeOres.CTab).setRegistryName("tleaves1").setUnlocalizedName("leaf");
        ITLeaves1 = new ItemBlockTLeaves1(TLeaves1);
        TLeaves2 = new BlockTLeaves2().setCreativeTab(TreeOres.CTab).setRegistryName("tleaves2").setUnlocalizedName("leaf");
        ITLeaves2 = new ItemBlockTLeaves2(TLeaves2);
        TLeaves3 = new BlockTLeaves3().setCreativeTab(TreeOres.CTab).setRegistryName("tleaves3").setUnlocalizedName("leaf");
        ITLeaves3 = new ItemBlockTLeaves3(TLeaves3);
        //Boss Leaves
        TBLeaves1 = new BlockTBLeaves1().setCreativeTab(TreeOres.CTab).setRegistryName("tbleaves1").setUnlocalizedName("leaf");
        ITBLeaves1 = new ItemBlockTBLeaves1(TBLeaves1);
        TBLeaves2 = new BlockTBLeaves2().setCreativeTab(TreeOres.CTab).setRegistryName("tbleaves2").setUnlocalizedName("leaf");
        ITBLeaves2 = new ItemBlockTBLeaves2(TBLeaves2);
        TBLeaves3 = new BlockTBLeaves3().setCreativeTab(TreeOres.CTab).setRegistryName("tbleaves3").setUnlocalizedName("leaf");
        ITBLeaves3 = new ItemBlockTBLeaves3(TBLeaves3);
        //Normal Saplings
        TSaplings1 = new BlockTSaplings1().setCreativeTab(TreeOres.CTab).setRegistryName("tsaplings1").setUnlocalizedName("sapling");
        ITSaplings1 = new ItemBlockTSaplings1(TSaplings1);
        TSaplings2 = new BlockTSaplings2().setCreativeTab(TreeOres.CTab).setRegistryName("tsaplings2").setUnlocalizedName("sapling");
        ITSaplings2 = new ItemBlockTSaplings2(TSaplings2);
        TSaplings3 = new BlockTSaplings3().setCreativeTab(TreeOres.CTab).setRegistryName("tsaplings3").setUnlocalizedName("sapling");
        ITSaplings3 = new ItemBlockTSaplings3(TSaplings3);
        //Boss Saplings
        TBSaplings1 = new BlockTBSaplings1().setCreativeTab(TreeOres.CTab).setRegistryName("tbsaplings1").setUnlocalizedName("sapling");
        ITBSaplings1 = new ItemBlockTBSaplings1(TBSaplings1);
        TBSaplings2 = new BlockTBSaplings2().setCreativeTab(TreeOres.CTab).setRegistryName("tbsaplings2").setUnlocalizedName("sapling");
        ITBSaplings2 = new ItemBlockTBSaplings2(TBSaplings2);
        TBSaplings3 = new BlockTBSaplings3().setCreativeTab(TreeOres.CTab).setRegistryName("tbsaplings3").setUnlocalizedName("sapling");
        ITBSaplings3 = new ItemBlockTBSaplings3(TBSaplings3);
        register();
    }

    private static void register() {
        //Logs
        GameRegistry.register(TLogs1);
        GameRegistry.register(ITLogs1.setRegistryName(TLogs1.getRegistryName()));
        GameRegistry.register(TLogs2);
        GameRegistry.register(ITLogs2.setRegistryName(TLogs2.getRegistryName()));
        GameRegistry.register(TLogs3);
        GameRegistry.register(ITLogs3.setRegistryName(TLogs3.getRegistryName()));
        //Normal Leaves
        GameRegistry.register(TLeaves1);
        GameRegistry.register(ITLeaves1.setRegistryName(TLeaves1.getRegistryName()));
        GameRegistry.register(TLeaves2);
        GameRegistry.register(ITLeaves2.setRegistryName(TLeaves2.getRegistryName()));
        GameRegistry.register(TLeaves3);
        GameRegistry.register(ITLeaves3.setRegistryName(TLeaves3.getRegistryName()));
        //Boss Leaves
        GameRegistry.register(TBLeaves1);
        GameRegistry.register(ITBLeaves1.setRegistryName(TBLeaves1.getRegistryName()));
        GameRegistry.register(TBLeaves2);
        GameRegistry.register(ITBLeaves2.setRegistryName(TBLeaves2.getRegistryName()));
        GameRegistry.register(TBLeaves3);
        GameRegistry.register(ITBLeaves3.setRegistryName(TBLeaves3.getRegistryName()));
        //Normal Saplings
        GameRegistry.register(TSaplings1);
        GameRegistry.register(ITSaplings1.setRegistryName(TSaplings1.getRegistryName()));
        GameRegistry.register(TSaplings2);
        GameRegistry.register(ITSaplings2.setRegistryName(TSaplings2.getRegistryName()));
        GameRegistry.register(TSaplings3);
        GameRegistry.register(ITSaplings3.setRegistryName(TSaplings3.getRegistryName()));
        //Boss Saplings
        GameRegistry.register(TBSaplings1);
        GameRegistry.register(ITBSaplings1.setRegistryName(TBSaplings1.getRegistryName()));
        GameRegistry.register(TBSaplings2);
        GameRegistry.register(ITBSaplings2.setRegistryName(TBSaplings2.getRegistryName()));
        GameRegistry.register(TBSaplings3);
        GameRegistry.register(ITBSaplings3.setRegistryName(TBSaplings3.getRegistryName()));

        Blocks.FIRE.setFireInfo(TLogs1, 5, 5);
        Blocks.FIRE.setFireInfo(TLogs2, 5, 5);
        Blocks.FIRE.setFireInfo(TLogs3, 5, 5);
        Blocks.FIRE.setFireInfo(TLeaves1, 30, 60);
        Blocks.FIRE.setFireInfo(TLeaves2, 30, 60);
        Blocks.FIRE.setFireInfo(TLeaves3, 30, 60);
        Blocks.FIRE.setFireInfo(TBLeaves1, 30, 60);
        Blocks.FIRE.setFireInfo(TBLeaves2, 30, 60);
        Blocks.FIRE.setFireInfo(TBLeaves3, 30, 60);
    }

    public static void registerRenders() {
        //Logs
        registerRenderers(TLogs1, 4);
        registerRenderers(TLogs2, 4);
        registerRenderers(TLogs3, 3);
        //Normal Leaves
        registerRenderers(TLeaves1, 4);
        registerRenderers(TLeaves2, 4);
        registerRenderers(TLeaves3, 3);
        //Boss Leaves
        registerRenderers(TBLeaves1, 4);
        registerRenderers(TBLeaves2, 4);
        registerRenderers(TBLeaves3, 3);
        //Normal Saplings
        registerRenderers(TSaplings1, 4);
        registerRenderers(TSaplings2, 4);
        registerRenderers(TSaplings3, 3);
        //Boss Saplings
        registerRenderers(TBSaplings1, 4);
        registerRenderers(TBSaplings2, 4);
        registerRenderers(TBSaplings3, 3);
    }

    public static void registerVariants() {
        //Logs
        registerVariant(TLogs1, 4);
        registerVariant(TLogs2, 4);
        registerVariant(TLogs3, 4);
        //Normal Leaves
        registerVariant(TLeaves1, 4);
        registerVariant(TLeaves2, 4);
        registerVariant(TLeaves3, 4);
        //Boss Leaves
        registerVariant(TBLeaves1, 4);
        registerVariant(TBLeaves2, 4);
        registerVariant(TBLeaves3, 4);
        //Normal Saplings
        registerVariant(TSaplings1, 4);
        registerVariant(TSaplings2, 4);
        registerVariant(TSaplings3, 3);
        //Boss Saplings
        registerVariant(TBSaplings1, 4);
        registerVariant(TBSaplings2, 4);
        registerVariant(TBSaplings3, 3);
    }

    public static void registerRenderers(Block block, int meta) {
        for (int i = 0; i < meta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), i, new ModelResourceLocation(TRefs.MODID + ":" + Item.getItemFromBlock(block).getUnlocalizedName(new ItemStack(Item.getItemFromBlock(block), 1, i)), "inventory"));
        }
    }

    public static void registerVariant(Block block, int meta) {
        for (int i = 0; i < meta; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(block), new ResourceLocation(TRefs.MODID + ":" + Item.getItemFromBlock(block).getUnlocalizedName(new ItemStack(Item.getItemFromBlock(block), 1, i))));
        }
    }
}
