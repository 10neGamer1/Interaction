/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.interaction.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.interaction.InteractionMod;

public class InteractionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InteractionMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> INTERACTION_TAB = REGISTRY.register("interaction_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.interaction.interaction_tab")).icon(() -> new ItemStack(InteractionModBlocks.FLINT_AXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InteractionModBlocks.FLINT_AXE.get().asItem());
			}).withSearchBar().build());
}