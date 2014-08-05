package com.greatorator.ddtc.item;

import com.greatorator.ddtc.creativetab.CreativeTabDDTC;
import com.greatorator.ddtc.init.ModEntity;
import com.greatorator.ddtc.mobs.EntityDonatello;
import com.greatorator.ddtc.mobs.EntityLeonardo;
import com.greatorator.ddtc.mobs.EntityMichaelangelo;
import com.greatorator.ddtc.mobs.EntityRaphael;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class EggChucker extends ItemDDTC
{
    private IIcon theIcon;

    public EggChucker()
    {
        this.setCreativeTab(CreativeTabDDTC.DDTC_TAB);
		this.setUnlocalizedName("eggChucker");
		this.setHasSubtypes(true);
    }

	@SuppressWarnings("unchecked")
	@Override
	public void getSubItems(Item item, CreativeTabs p_150895_2_, List list) {
		list.add(new ItemStack(item, 1, ModEntity.EntityLeonardoId));
        list.add(new ItemStack(item, 1, ModEntity.EntityRaphaelId));
        list.add(new ItemStack(item, 1, ModEntity.EntityMichaelangeloId));
        list.add(new ItemStack(item, 1, ModEntity.EntityDonatelloId));
	}

	@Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!player.capabilities.isCreativeMode) {
            --stack.stackSize;
        }

        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote) {
            OmeletMaker entityEgg = new OmeletMaker(world, player, getEntityFromId(stack.getItemDamage(), world));
            world.spawnEntityInWorld(entityEgg);
        }

        return stack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack stack, int parColorType) {
		long seed = getEntityFromId(stack.getItemDamage(), null).getCommandSenderName().hashCode();
		Random rand = new Random(seed);
		int solidColor = rand.nextInt() * 16777215;
		int spotColor = rand.nextInt() * 16777215;

		return (parColorType == 0) ? solidColor : spotColor;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }

    @Override
    // Doing this override means that there is no localization for language
    // unless you specifically check for localization here and convert
    public String getItemStackDisplayName(ItemStack stack) {
        return "Spawn " + getEntityFromId(stack.getItemDamage(), null).getCommandSenderName();
    }

	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":spawn_egg");
        theIcon = iconRegister.registerIcon(Reference.MOD_ID + ":spawn_egg_overlay");
    }

    /**
     * Gets an icon index based on an item's damage value and the given render pass
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int par1, int par2) {
        return par2 > 0 ? this.theIcon : super.getIconFromDamageForRenderPass(par1, par2);
    }

	public EntityLiving getEntityFromId(int id, World world){
		EntityLiving entity = null;
		switch (id){
			case ModEntity.EntityLeonardoId :
				entity = new EntityLeonardo(world);
				break;
            case ModEntity.EntityRaphaelId :
                entity = new EntityRaphael(world);
                break;
            case ModEntity.EntityMichaelangeloId :
                entity = new EntityMichaelangelo(world);
                break;
            case ModEntity.EntityDonatelloId :
                entity = new EntityDonatello(world);
                break;
		}

		return entity;
	}
}