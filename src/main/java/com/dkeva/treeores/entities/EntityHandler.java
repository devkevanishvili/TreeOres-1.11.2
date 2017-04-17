package com.dkeva.treeores.entities;

import com.dkeva.treeores.TRefs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

/**
 * Created by nefelibata on 4/17/17.
 */
public class EntityHandler {
    public static void registerMonsters(Class entityClass, String name, int entityId) {
        EntityRegistry.registerModEntity(new ResourceLocation(TRefs.MODID + ":" + name), entityClass, name, entityId, TRefs.INSTANCE, 64, 3, true);
    }
}
