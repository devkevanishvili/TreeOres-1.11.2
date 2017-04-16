package com.dkeva.treeores.blocks;

import com.dkeva.treeores.TRefs;
import com.dkeva.treeores.TreeOres;
import com.dkeva.treeores.itemBlocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
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
    public static Block TSaplings1;
    public static ItemBlock ITSaplings1;
    public static Block TSaplings2;
    public static ItemBlock ITSaplings2;
    public static Block TSaplings3;
    public static ItemBlock ITSaplings3;

    public static void init(){
        TLogs1 = new BlockTLogs1().setCreativeTab(TreeOres.CTab).setRegistryName("tlogs1").setUnlocalizedName("log");
        ITLogs1 = new ItemBlockTLogs1(TLogs1);
        TLogs2 = new BlockTLogs2().setCreativeTab(TreeOres.CTab).setRegistryName("tlogs2").setUnlocalizedName("log");
        ITLogs2 = new ItemBlockTLogs2(TLogs2);
        TLogs3 = new BlockTLogs3().setCreativeTab(TreeOres.CTab).setRegistryName("tlogs3").setUnlocalizedName("log");
        ITLogs3 = new ItemBlockTLogs3(TLogs3);
        TLeaves1 = new BlockTLeaves1().setCreativeTab(TreeOres.CTab).setRegistryName("tleaves1").setUnlocalizedName("leaf");
        ITLeaves1 = new ItemBlockTLeaves1(TLeaves1);
        TLeaves2 = new BlockTLeaves2().setCreativeTab(TreeOres.CTab).setRegistryName("tleaves2").setUnlocalizedName("leaf");
        ITLeaves2 = new ItemBlockTLeaves2(TLeaves2);
        TLeaves3 = new BlockTLeaves3().setCreativeTab(TreeOres.CTab).setRegistryName("tleaves3").setUnlocalizedName("leaf");
        ITLeaves3 = new ItemBlockTLeaves3(TLeaves3);
        TSaplings1 = new BlockTSaplings1().setCreativeTab(TreeOres.CTab).setRegistryName("tsaplings1").setUnlocalizedName("sapling");
        ITSaplings1 = new ItemBlockTSaplings1(TSaplings1);
        TSaplings2 = new BlockTSaplings2().setCreativeTab(TreeOres.CTab).setRegistryName("tsaplings2").setUnlocalizedName("sapling");
        ITSaplings2 = new ItemBlockTSaplings2(TSaplings2);
        TSaplings3 = new BlockTSaplings3().setCreativeTab(TreeOres.CTab).setRegistryName("tsaplings3").setUnlocalizedName("sapling");
        ITSaplings3 = new ItemBlockTSaplings3(TSaplings3);
        register();
    }

    private static void register(){
        GameRegistry.register(TLogs1);
        GameRegistry.register(ITLogs1.setRegistryName(TLogs1.getRegistryName()));
        GameRegistry.register(TLogs2);
        GameRegistry.register(ITLogs2.setRegistryName(TLogs2.getRegistryName()));
        GameRegistry.register(TLogs3);
        GameRegistry.register(ITLogs3.setRegistryName(TLogs3.getRegistryName()));
        GameRegistry.register(TLeaves1);
        GameRegistry.register(ITLeaves1.setRegistryName(TLeaves1.getRegistryName()));
        GameRegistry.register(TLeaves2);
        GameRegistry.register(ITLeaves2.setRegistryName(TLeaves2.getRegistryName()));
        GameRegistry.register(TLeaves3);
        GameRegistry.register(ITLeaves3.setRegistryName(TLeaves3.getRegistryName()));
        GameRegistry.register(TSaplings1);
        GameRegistry.register(ITSaplings1.setRegistryName(TSaplings1.getRegistryName()));
        GameRegistry.register(TSaplings2);
        GameRegistry.register(ITSaplings2.setRegistryName(TSaplings2.getRegistryName()));
        GameRegistry.register(TSaplings3);
        GameRegistry.register(ITSaplings3.setRegistryName(TSaplings3.getRegistryName()));
    }

    public static void registerRenders(){
        registerRenderers(TLogs1,4);
        registerRenderers(TLogs2,4);
        registerRenderers(TLogs3,3);
        registerRenderers(TLeaves1,4);
        registerRenderers(TLeaves2,4);
        registerRenderers(TLeaves3,3);
        registerRenderers(TSaplings1, 4);
        registerRenderers(TSaplings2, 4);
        registerRenderers(TSaplings3, 3);
    }
    public static void registerVariants(){
        registerVariant(TLogs1,4 );
        registerVariant(TLogs2,4 );
        registerVariant(TLogs3,4 );
        registerVariant(TLeaves1,4 );
        registerVariant(TLeaves2,4 );
        registerVariant(TLeaves3,4 );
        registerVariant(TSaplings1,4);
        registerVariant(TSaplings2,4);
        registerVariant(TSaplings3,3);
    }

    public static void registerRenderers(Block block, int meta) {
        for (int i = 0; i < meta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), i, new ModelResourceLocation(TRefs.MODID + ":" + Item.getItemFromBlock(block).getUnlocalizedName(new ItemStack(Item.getItemFromBlock(block),1,i)), "inventory"));
        }
    }

    public static void registerVariant(Block block, int meta) {
        for (int i = 0; i < meta; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(block), new ResourceLocation(TRefs.MODID + ":" + Item.getItemFromBlock(block).getUnlocalizedName(new ItemStack(Item.getItemFromBlock(block),1,i))));
        }
    }
}
