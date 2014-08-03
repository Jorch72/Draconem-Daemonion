package com.greatorator.ddtc.item;

import com.greatorator.ddtc.creativetab.CreativeTabDDTC;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class EggChucker extends Item
{

    public int colorBase;
    public int colorSpots;
    public String entityToSpawnName = "";
    protected String entityToSpawnNameFull = "";
    protected OmeletMaker entityEgg;
    private IIcon theIcon;

    public EggChucker(String entityName, int solidColor, int spotColor)
    {
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabDDTC.DDTC_TAB);
        entityToSpawnName = entityName;
        entityToSpawnNameFull = Reference.MOD_ID + "." + entityToSpawnName;
        colorBase = solidColor;
        colorSpots = spotColor;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        if (!par3EntityPlayer.capabilities.isCreativeMode) {
            --par1ItemStack.stackSize;
        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F /
                (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote) {
            entityEgg = new OmeletMaker(par2World, par3EntityPlayer);
            entityEgg.setEntityToSpawn(entityToSpawnNameFull);
            par2World.spawnEntityInWorld(entityEgg);
        }

        return par1ItemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int parColorType) {
        return (parColorType == 0) ? colorBase : colorSpots;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }

    @Override
    // Doing this override means that there is no localization for language
    // unless you specifically check for localization here and convert
    public String getItemStackDisplayName(ItemStack par1ItemStack) {
        return "Spawn " + entityToSpawnName;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        super.registerIcons(par1IconRegister);
        this.theIcon = par1IconRegister.registerIcon(this.getIconString() + "_overlay");
    }

    /**
     * Gets an icon index based on an item's damage value and the given render pass
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int par1, int par2) {
        return par2 > 0 ? this.theIcon : super.getIconFromDamageForRenderPass(par1, par2);
    }
}