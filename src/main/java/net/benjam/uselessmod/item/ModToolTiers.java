package net.benjam.uselessmod.item;

import net.benjam.uselessmod.UselessMod;
import net.benjam.uselessmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier USELESSNESS = TierSortingRegistry.registerTier(
        new ForgeTier(3, 400, 0.1f, 0.3f, 20, ModTags.Blocks.NEEDS_USELESS_TOOL, () -> Ingredient.of(ModItems.USELESSNESS.get())),
        new ResourceLocation(UselessMod.MOD_ID, "uselessness"),
        List.of(Tiers.IRON),
        List.of()
    );
}
