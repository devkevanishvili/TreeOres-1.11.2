package com.dkeva.treeores;

import com.dkeva.treeores.blocks.BlockTLeaves1;
import com.dkeva.treeores.blocks.BlockTLeaves2;
import com.dkeva.treeores.blocks.BlockTLeaves3;
import com.dkeva.treeores.blocks.TBlocks;
import com.dkeva.treeores.enums.TV2;
import com.dkeva.treeores.enums.TV3;
import com.dkeva.treeores.itemBlocks.ItemBlockTLeaves1;
import com.dkeva.treeores.itemBlocks.ItemBlockTLeaves2;
import com.dkeva.treeores.itemBlocks.ItemBlockTLeaves3;
import com.dkeva.treeores.itemBlocks.ItemBlockTLogs1;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ColorizerGrass;
import com.dkeva.treeores.enums.TV1;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

/**
 * Created by nefelibata on 4/16/17.
 */
@SideOnly(Side.CLIENT)
public class ColorManager {
    private static final Minecraft minecraft = Minecraft.getMinecraft();

    /**
     * Register the colour handlers.
     */
    public static void registerColourHandlers() {
        final BlockColors blockColors = minecraft.getBlockColors();
        final ItemColors itemColors = minecraft.getItemColors();

        registerBlockColourHandlers(blockColors);
        registerItemColourHandlers(blockColors, itemColors);
    }


    private static void registerBlockColourHandlers(final BlockColors blockColors) {
        // Use the grass colour of the biome or the default grass colour
        final IBlockColor ib = (state, blockAccess, pos, tintIndex) -> {

            if(state.getBlock() == TBlocks.TLeaves1){
                TV1 enumtype = (TV1) state.getValue(BlockTLeaves1.VARIANT);

                if (enumtype == TV1.IRON) {
                    return TV1.IRON.getLeafcolor().getRGB();
                }

                if (enumtype == TV1.GOLD) {
                    return TV1.GOLD.getLeafcolor().getRGB();
                }
                if (enumtype == TV1.COAL) {
                    return TV1.COAL.getLeafcolor().getRGB();
                }

                if (enumtype == TV1.REDSTONE) {
                    return TV1.REDSTONE.getLeafcolor().getRGB();
                }
            }
            else if (state.getBlock() == TBlocks.TLeaves2) {
                    TV2 enumtype = (TV2) state.getValue(BlockTLeaves2.VARIANT);

                    if (enumtype == TV2.DIAMOND) {
                        return TV2.DIAMOND.getLeafcolor().getRGB();
                    }

                    if (enumtype == TV2.EMERALD) {
                        return TV2.EMERALD.getLeafcolor().getRGB();
                    }
                    if (enumtype == TV2.LAPIS) {
                        return TV2.LAPIS.getLeafcolor().getRGB();
                    }

                    if (enumtype == TV2.OBSIDIAN) {
                        return TV2.OBSIDIAN.getLeafcolor().getRGB();
                    }

                }
            else if (state.getBlock() == TBlocks.TLeaves3) {
                    TV3 enumtype = (TV3) state.getValue(BlockTLeaves3.VARIANT);

                    if (enumtype == TV3.GLOWSTONE) {
                        return TV3.GLOWSTONE.getLeafcolor().getRGB();
                    }

                    if (enumtype == TV3.QUARTZ) {
                        return TV3.QUARTZ.getLeafcolor().getRGB();
                    }
                    if (enumtype == TV3.XP) {
                        return TV3.XP.getLeafcolor().getRGB();
                    }
                }
            return TV1.REDSTONE.getLeafcolor().getRGB();
        };

        blockColors.registerBlockColorHandler(ib, TBlocks.TLeaves1);
        blockColors.registerBlockColorHandler(ib, TBlocks.TLeaves2);
        blockColors.registerBlockColorHandler(ib, TBlocks.TLeaves3);
    }
    /**
     * Register the {@link IItemColor} handlers
     *
     * @param blockColors The BlockColors instance
     * @param itemColors  The ItemColors instance
     */
    private static void registerItemColourHandlers(final BlockColors blockColors, final ItemColors itemColors) {
        // Use the Block's colour handler for an ItemBlock

        IItemColor TV1Colors = new IItemColor() {
            @Override
            public int getColorFromItemstack(ItemStack stack, int tintIndex) {
                @SuppressWarnings("deprecation")
                IBlockState iblockstate = ((ItemBlockTLeaves1) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
                return blockColors.colorMultiplier(iblockstate, (IBlockAccess)null, (BlockPos)null, tintIndex);
            }
        };      IItemColor TV2Colors = new IItemColor() {
            @Override
            public int getColorFromItemstack(ItemStack stack, int tintIndex) {
                @SuppressWarnings("deprecation")
                IBlockState iblockstate = ((ItemBlockTLeaves2) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
                return blockColors.colorMultiplier(iblockstate, (IBlockAccess)null, (BlockPos)null, tintIndex);
            }
        };      IItemColor TV3Colors = new IItemColor() {
            @Override
            public int getColorFromItemstack(ItemStack stack, int tintIndex) {
                @SuppressWarnings("deprecation")
                IBlockState iblockstate = ((ItemBlockTLeaves3) stack.getItem()).getBlock().getStateFromMeta(stack.getMetadata());
                return blockColors.colorMultiplier(iblockstate, (IBlockAccess)null, (BlockPos)null, tintIndex);
            }
        };

       itemColors.registerItemColorHandler(TV1Colors, TBlocks.ITLeaves1);
       itemColors.registerItemColorHandler(TV2Colors, TBlocks.ITLeaves2);
       itemColors.registerItemColorHandler(TV3Colors, TBlocks.ITLeaves3);
    }
}