package sixstringedbass.example.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWand extends Item {
    
    public ItemWand(int id) {
        super(id);
        setCreativeTab(CreativeTabs.tabCombat);
        setMaxStackSize(1);
        setUnlocalizedName(ItemInfo.WAND_UNLOCALIZED_NAME);
    }
    
    @Override
    public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
        if(!target.worldObj.isRemote) {
            target.motionY = 2;
            itemstack.setItemDamage(itemstack.getItemDamage() + 1);
        }
        
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register){
    	itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.WAND_ICON);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation) {
    	info.add("Item used " + itemstack.getItemDamage() + " times");
    }
}
