package com.greatorator.ddtc.plants;

import com.greatorator.ddtc.creativetab.CreativeTabDDTC;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class PlantsDDTC extends BlockBush
{
    public PlantsDDTC(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabDDTC.DDTC_TAB);
    }
    public PlantsDDTC()
    {
        this(Material.plants);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("plants.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
