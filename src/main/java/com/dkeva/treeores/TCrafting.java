package com.dkeva.treeores;

import com.dkeva.treeores.blocks.TBlocks;
import com.dkeva.treeores.items.TItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by nefelibata on 4/18/17.
 */
public class TCrafting {
    public static void addRecipesToGame() {
        addLog1Recipes();
        addLog2Recipes();
        addLog3Recipes();
        addTransformerRecipes();
        addSaplingRecipes();
        addChopRecipes();
        addSpawnerMakerRecipes();
        addSpawnerRecipes();

    }

    private static void addLog1Recipes() {
        // Shapeless
        // Iron
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 1), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 2), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 3), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 4), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 5), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 6), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 7), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 8), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0),
                new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TBlocks.TLogs1, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        // Gold
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 1), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 2), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 3), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 4), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 5), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 6), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 7), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 8), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1),
                new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TBlocks.TLogs1, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        // COAL
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 1), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 2), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 3), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 4), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 5), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 6), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 7), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 8), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2),
                new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TBlocks.TLogs1, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        // REDSTONE
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 1), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 2), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 3), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 4), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 5), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 6), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 7), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 8), new Object[]{new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3),
                new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TBlocks.TLogs1, 1, 3), new ItemStack(TItems.Transformers, 1, 0)});
    }

    private static void addLog2Recipes() {
        // Shapeless
        // Emerald
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 1), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 2), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 3), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 4), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 5), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 6), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 7), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 8), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1),
                new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TBlocks.TLogs2, 1, 1), new ItemStack(TItems.Transformers, 1, 0)});
        // Diamond
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 1), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 2), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 3), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 4), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 5), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 6), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 7), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 8), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0),
                new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TBlocks.TLogs2, 1, 0), new ItemStack(TItems.Transformers, 1, 0)});
        // Lapis
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 1, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 3, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 4, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 5, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 6, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 7, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 8, 11), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2),
                new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TBlocks.TLogs2, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        // Obsidian
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 1), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TItems.Transformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 2), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TItems.Transformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 3), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TItems.Transformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 4), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TItems.Transformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 5), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TItems.Transformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 6), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TItems.Transformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 7), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TItems.Transformers, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 8), new Object[]{new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3),
                new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TBlocks.TLogs2, 1, 3), new ItemStack(TItems.Transformers, 1, 2)});
    }

    private static void addLog3Recipes() {

        // Xp
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 1), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 2), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 3), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 4), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 5), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 6), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 7), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 8), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2),
                new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TBlocks.TLogs3, 1, 2), new ItemStack(TItems.Transformers, 1, 0)});
        // Glowstone
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 1), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 1), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 3), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 4), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 5), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 6), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 7), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.GLOWSTONE_DUST, 8), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0),
                new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TBlocks.TLogs3, 1, 0), new ItemStack(TItems.Transformers, 1, 1)});
        // Quartz
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 1), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 2), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 3), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 4), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 5), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 6), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 7), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TItems.Transformers, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.QUARTZ, 8), new Object[]{new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1),
                new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TBlocks.TLogs3, 1, 1), new ItemStack(TItems.Transformers, 1, 1)});

    }

    private static void addTransformerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(TItems.Transformers, 1, 0), new Object[]{new ItemStack(Items.IRON_INGOT), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.COAL),
                new ItemStack(Items.REDSTONE), new ItemStack(Items.EMERALD), new ItemStack(Items.DIAMOND), new ItemStack(Items.DYE, 1, 4), new ItemStack(Items.IRON_SWORD),
                new ItemStack(Items.SLIME_BALL)});
        GameRegistry.addShapelessRecipe(new ItemStack(TItems.Transformers, 1, 1), new Object[]{new ItemStack(Items.GLOWSTONE_DUST), new ItemStack(Items.QUARTZ),
                new ItemStack(TItems.Transformers, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(TItems.Transformers, 1, 2), new Object[]{new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND),
                new ItemStack(Items.DIAMOND), new ItemStack(Items.DIAMOND), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_INGOT),
                new ItemStack(Items.IRON_INGOT), new ItemStack(TItems.Transformers, 1, 0)});
    }

    private static void addSaplingRecipes() {
        if (TRefs.EnableIronTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings1, 1, 0), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.IRON_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableGoldTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings1, 1, 1), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.GOLD_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableCoalTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings1, 1, 2), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.COAL_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableRedstoneTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings1, 1, 3), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.REDSTONE_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableEmeraldTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings2, 1, 1), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.EMERALD_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableDiamondTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings2, 1, 0), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.DIAMOND_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableLapisTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings2, 1, 2), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.LAPIS_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableObsidianTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings2, 1, 3), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.OBSIDIAN, 'S', "treeSapling"}));
        }
        if (TRefs.EnableGlowstoneTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings3, 1, 0), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.GLOWSTONE, 'S', "treeSapling"}));
        }
        if (TRefs.EnableQuartzTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TBlocks.TSaplings3, 1, 1), new Object[]{"XXX", "XSX", "XXX", 'X', Blocks.QUARTZ_BLOCK, 'S', "treeSapling"}));
        }
        if (TRefs.EnableXpTreeCrafting) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TBlocks.TSaplings3, 1, 2), new Object[]{new ItemStack(Items.STRING), new ItemStack(Items.SPIDER_EYE),
                    new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.GUNPOWDER), new ItemStack(Items.BONE), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.BOW),
                    new ItemStack(Items.ARROW), "treeSapling"}));
        }
    }

    private static void addSpawnerMakerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(TItems.BSParts, 1, 1), new Object[]{new ItemStack(TItems.BSParts, 1, 0), new ItemStack(TItems.BSParts, 1, 0),
                new ItemStack(TItems.BSParts, 1, 0), new ItemStack(TItems.BSParts, 1, 0)});
    }

    private static void addSpawnerRecipes() {

        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners1, 1, 0), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs1, 1, 0), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners1, 1, 1), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs1, 1, 1), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners1, 1, 2), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs1, 1, 2), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners1, 1, 3), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs1, 1, 3), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners2, 1, 0), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs2, 1, 0), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners2, 1, 1), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs2, 1, 1), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners2, 1, 2), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs2, 1, 2), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners2, 1, 3), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs2, 1, 3), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners3, 1, 0), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs3, 1, 0), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners3, 1, 1), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs3, 1, 1), 'S', new ItemStack(TItems.BSParts, 1, 1)});
        GameRegistry.addRecipe(new ItemStack(TItems.BSpawners3, 1, 2), new Object[]{"XXX", "XSX", "XXX", 'X', new ItemStack(TBlocks.TLogs3, 1, 2), 'S', new ItemStack(TItems.BSParts, 1, 1)});


    }

    private static void addChopRecipes() {
        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs1, 1, 0), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops1, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs1, 1, 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops1, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs1, 1, 2), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops1, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs1, 1, 3), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops1, 1, 3)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs2, 1, 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops2, 1, 1)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs2, 1, 0), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops2, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs2, 1, 2), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops2, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs2, 1, 3), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops2, 1, 3)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs3, 1, 2), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops3, 1, 2)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs3, 1, 0), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops3, 1, 0)});

        GameRegistry.addRecipe(new ItemStack(TBlocks.TLogs3, 1, 1), new Object[]{"XXX", "XXX", "XXX", 'X', new ItemStack(TItems.TChops3, 1, 1)});
    }
}
