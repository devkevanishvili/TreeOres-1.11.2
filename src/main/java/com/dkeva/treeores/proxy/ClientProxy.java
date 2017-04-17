package com.dkeva.treeores.proxy;

import com.dkeva.treeores.ColorManager;
import com.dkeva.treeores.blocks.TBlocks;
import com.dkeva.treeores.entities.*;
import com.dkeva.treeores.items.TItems;
import com.dkeva.treeores.renderers.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

/**
 * Created by nefelibata on 4/13/17.
 */
public class ClientProxy implements CommonProxy {
    @Override
    public void preInit() {
        TBlocks.registerVariants();
        TItems.registerVariants();
        EntityHandler.registerMonsters(EntityIronBoss.class, "IronTreeBoss", 0);
        RenderingRegistry.registerEntityRenderingHandler(EntityIronBoss.class, RendererIronBoss::new);

        EntityHandler.registerMonsters(EntityGoldBoss.class, "GoldTreeBoss", 1);
        RenderingRegistry.registerEntityRenderingHandler(EntityGoldBoss.class, RendererGoldBoss::new);

        EntityHandler.registerMonsters(EntityCoalBoss.class, "CoalTreeBoss", 2);
        RenderingRegistry.registerEntityRenderingHandler(EntityCoalBoss.class, RendererCoalBoss::new);

        EntityHandler.registerMonsters(EntityRedstoneBoss.class, "RedstoneTreeBoss", 3);
        RenderingRegistry.registerEntityRenderingHandler(EntityRedstoneBoss.class, RendererRedstoneBoss::new);

        EntityHandler.registerMonsters(EntityDiamondBoss.class, "DiamondTreeBoss", 4);
        RenderingRegistry.registerEntityRenderingHandler(EntityDiamondBoss.class, RendererDiamondBoss::new);

        EntityHandler.registerMonsters(EntityEmeraldBoss.class, "EmeraldTreeBoss", 5);
        RenderingRegistry.registerEntityRenderingHandler(EntityEmeraldBoss.class, RendererEmeraldBoss::new);

        EntityHandler.registerMonsters(EntityLapisBoss.class, "LapisTreeBoss", 6);
        RenderingRegistry.registerEntityRenderingHandler(EntityLapisBoss.class, RendererLapisBoss::new);

        EntityHandler.registerMonsters(EntityObsidianBoss.class, "ObsidianTreeBoss", 7);
        RenderingRegistry.registerEntityRenderingHandler(EntityObsidianBoss.class, RendererObsidianBoss::new);

        EntityHandler.registerMonsters(EntityGlowstoneBoss.class, "GlowstoneTreeBoss", 8);
        RenderingRegistry.registerEntityRenderingHandler(EntityGlowstoneBoss.class, RendererGlowstoneBoss::new);

        EntityHandler.registerMonsters(EntityQuartzBoss.class, "QuartzTreeBoss", 9);
        RenderingRegistry.registerEntityRenderingHandler(EntityQuartzBoss.class, RendererQuartzBoss::new);

        EntityHandler.registerMonsters(EntityXpBoss.class, "XpTreeBoss", 10);
        RenderingRegistry.registerEntityRenderingHandler(EntityXpBoss.class, RendererXpBoss::new);
    }

    @Override
    public void init() {
        TItems.registerRenders();
        TBlocks.registerRenders();
        ColorManager.registerColourHandlers();


    }
}
