package com.dkeva.treeores.handlers;

import com.dkeva.treeores.items.TItems;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

/**
 * Created by nefelibata on 4/19/17.
 */
public class DropHandler {
    public static Random random;
    public static int dropped;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {
        random = new Random();
        dropped = random.nextInt(2) + 1; // DO NOT CHANGE THIS

        if (event.getEntityLiving() instanceof EntityWither) {
            event.getEntityLiving().entityDropItem(new ItemStack(TItems.BSParts, 1, 0), dropped);
        }

    }
}
