package com.dkeva.treeores.items;

import com.dkeva.treeores.TRefs;
import com.dkeva.treeores.TreeOres;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by nefelibata on 4/13/17.
 */
public class TItems {

    public static Item Transformers;
    public static Item TChops1;
    public static Item TChops2;
    public static Item TChops3;

    public static void init() {
        Transformers = new ItemTransformers().setRegistryName("transformers").setUnlocalizedName("transformers").setCreativeTab(TreeOres.CTab);
        TChops1 = new ItemTChops1().setRegistryName("tchops1").setUnlocalizedName("tchops").setCreativeTab(TreeOres.CTab);
        TChops2 = new ItemTChops2().setRegistryName("tchops2").setUnlocalizedName("tchops").setCreativeTab(TreeOres.CTab);
        TChops3 = new ItemTChops3().setRegistryName("tchops3").setUnlocalizedName("tchops").setCreativeTab(TreeOres.CTab);
        register();
    }

    private static void register() {
        GameRegistry.register(Transformers);
        GameRegistry.register(TChops1);
        GameRegistry.register(TChops2);
        GameRegistry.register(TChops3);
    }

    public static void registerRenders() {
        registerRenderers(Transformers, 3);
        registerRenderers(TChops1, 4);
        registerRenderers(TChops2, 4);
        registerRenderers(TChops3, 3);
    }

    public static void registerVariants() {
        registerVariant(Transformers, 3);
        registerVariant(TChops1, 4);
        registerVariant(TChops2, 4);
        registerVariant(TChops3, 3);
    }

    public static void registerRenderers(Item item, int meta) {
        for (int i = 0; i < meta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(TRefs.MODID + ":" + item.getUnlocalizedName(new ItemStack(item, 1, i)).substring(5), "inventory"));
        }
    }

    public static void registerVariant(Item item, int meta) {
        for (int i = 0; i < meta; i++) {
            ModelBakery.registerItemVariants(item, new ResourceLocation(TRefs.MODID + ":" + item.getUnlocalizedName(new ItemStack(item, 1, i)).substring(5)));
        }
    }
}
