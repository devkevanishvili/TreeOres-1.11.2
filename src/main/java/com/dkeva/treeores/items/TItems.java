package com.dkeva.treeores.items;

import com.dkeva.treeores.TRefs;
import com.dkeva.treeores.TreeOres;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by nefelibata on 4/13/17.
 */
public class TItems {

    public static Item Transformers;
    public static void init(){
        Transformers = new ItemTransformers().setRegistryName("transformers").setUnlocalizedName("transformer").setCreativeTab(TreeOres.CTab);

        register();
    }

    private static void register(){
        GameRegistry.register(Transformers);
    }

    public static void registerRenders(){
        registerRender(Transformers,3);
    }

    private static void registerRender(Item item, int meta){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta ,new ModelResourceLocation(TRefs.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));

    }
}
