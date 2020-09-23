package me.e404nnf.emeraldtools.materials.quartz.item;

import me.e404nnf.emeraldtools.main.Main;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class QuartzTool implements ToolMaterial{
	
	@Override
	public int getDurability() {
		// TODO Auto-generated method stub
		return 1755;
	}


	@Override
	public float getAttackDamage() {
		// TODO Auto-generated method stub
		return 6.75F;
	}

	@Override
	public int getMiningLevel() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getEnchantability() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.ofItems(Main.EMERALD_QUARTZ);
	}

    @Override
    public float getMiningSpeedMultiplier() {
       return 16.875F;
    }

}
