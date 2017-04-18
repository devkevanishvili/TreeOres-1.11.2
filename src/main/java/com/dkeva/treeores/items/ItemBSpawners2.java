package com.dkeva.treeores.items;

import com.dkeva.treeores.entities.EntityDiamondBoss;
import com.dkeva.treeores.entities.EntityEmeraldBoss;
import com.dkeva.treeores.entities.EntityLapisBoss;
import com.dkeva.treeores.entities.EntityObsidianBoss;
import com.dkeva.treeores.enums.TV2;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by nefelibata on 4/18/17.
 */
public class ItemBSpawners2 extends Item {
    public ItemBSpawners2() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    /**
     * Returns the unlocalized name of this item. This version accepts an ItemStack so different stacks can have
     * different names based on their damage or NBT.
     */
    public String getUnlocalizedName(ItemStack stack) {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + "_" + TV2.byMetadata(i).getUnlocalizedName();
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
        for (int i = 0; i < 4; ++i) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack ie = playerIn.getHeldItem(handIn);
        if (!playerIn.capabilities.isCreativeMode) {
            ie.shrink(1);
        }
        if (!worldIn.isRemote) {
            Vec3d lookVec = playerIn.getLookVec();
            double posX = playerIn.posX + (lookVec.xCoord * 6D);
            double posY = playerIn.posY + 2D;
            double posZ = playerIn.posZ + (lookVec.zCoord * 6D);
            switch (ie.getMetadata()) {
                case 0:

                    EntityDiamondBoss entity1 = new EntityDiamondBoss(worldIn);
                    entity1.setPosition(posX, posY, posZ);
                    worldIn.spawnEntity(entity1);
                    break;
                case 1:
                    EntityEmeraldBoss entity2 = new EntityEmeraldBoss(worldIn);
                    entity2.setPosition(posX, posY, posZ);
                    worldIn.spawnEntity(entity2);
                    break;
                case 2:
                    EntityLapisBoss entity3 = new EntityLapisBoss(worldIn);
                    entity3.setPosition(posX, posY, posZ);
                    worldIn.spawnEntity(entity3);
                    break;
                case 3:
                    EntityObsidianBoss entity4 = new EntityObsidianBoss(worldIn);
                    entity4.setPosition(posX, posY, posZ);
                    worldIn.spawnEntity(entity4);
                    break;
            }
            return new ActionResult(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
        }
        return new ActionResult(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }
}
