package itsremurin.betternetherreforged.items;

import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import itsremurin.betternetherreforged.registry.ItemsRegistry;

public class BNItemShovel extends ShovelItem {
	protected float speed;

	public BNItemShovel(IItemTier material, int durability, float speed) {
		super(material, 1, -2.8F, ItemsRegistry.defaultSettings().isImmuneToFire());
		this.speed = speed;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) {
		return super.getDestroySpeed(stack, state) * speed;
	}
}