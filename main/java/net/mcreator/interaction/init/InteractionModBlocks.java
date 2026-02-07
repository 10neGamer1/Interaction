/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.interaction.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.interaction.block.FlintAxeBlock;
import net.mcreator.interaction.InteractionMod;

public class InteractionModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(InteractionMod.MODID);
	public static final DeferredBlock<Block> FLINT_AXE = REGISTRY.register("flint_axe", FlintAxeBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}