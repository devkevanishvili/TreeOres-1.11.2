package com.dkeva.treeores.renderers;

import com.dkeva.treeores.TRefs;
import com.dkeva.treeores.entities.EntityObsidianBoss;
import com.dkeva.treeores.models.ModelBoss;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

/**
 * Created by nefelibata on 4/17/17.
 */
public class RendererObsidianBoss extends RenderLiving<EntityObsidianBoss> {

    public static final ResourceLocation texture = new ResourceLocation(TRefs.MODID, "textures/entity/obsidianboss.png");

    protected ModelBoss modelEntity;


    public RendererObsidianBoss(RenderManager renderManager) {
        super(renderManager, new ModelBoss(), 0.5f);
        this.addLayer(new LayerHeldItem(this));
        modelEntity = ((ModelBoss) mainModel);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityObsidianBoss entity) {
        return texture;
    }

}