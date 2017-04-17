package com.dkeva.treeores.renderers;

import com.dkeva.treeores.TRefs;
import com.dkeva.treeores.entities.EntityEmeraldBoss;
import com.dkeva.treeores.models.ModelBoss;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

/**
 * Created by nefelibata on 4/17/17.
 */
public class RendererEmeraldBoss extends RenderLiving<EntityEmeraldBoss> {

    public static final ResourceLocation texture = new ResourceLocation(TRefs.MODID, "textures/entity/emeraldboss.png");

    protected ModelBoss modelEntity;


    public RendererEmeraldBoss(RenderManager renderManager) {
        super(renderManager, new ModelBoss(), 0.5f);
        this.addLayer(new LayerHeldItem(this));
        modelEntity = ((ModelBoss) mainModel);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityEmeraldBoss entity) {
        return texture;
    }

}