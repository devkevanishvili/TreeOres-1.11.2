package com.dkeva.treeores.renderers;

import com.dkeva.treeores.TRefs;
import com.dkeva.treeores.entities.EntityCoalBoss;
import com.dkeva.treeores.models.ModelBoss;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

/**
 * Created by nefelibata on 4/17/17.
 */
public class RendererCoalBoss extends RenderLiving<EntityCoalBoss> {

    public static final ResourceLocation texture = new ResourceLocation(TRefs.MODID, "textures/entity/coalboss.png");

    protected ModelBoss modelEntity;


    public RendererCoalBoss(RenderManager renderManager) {
        super(renderManager, new ModelBoss(), 0.5f);
        this.addLayer(new LayerHeldItem(this));
        modelEntity = ((ModelBoss) mainModel);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityCoalBoss entity) {
        return texture;
    }

}