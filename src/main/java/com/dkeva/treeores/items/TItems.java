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

    public static void init() {
        Transformers = new ItemTransformers().setRegistryName("transformers").setUnlocalizedName("transformer").setCreativeTab(TreeOres.CTab);

        register();
    }

    private static void register() {
        GameRegistry.register(Transformers);
    }

    public static void registerRenders() {
        registerRenderers(Transformers, 3);
    }

    public static void registerVariants() {
        registerVariant(Transformers, 3);
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
