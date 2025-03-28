package net.benjam.uselessmod.util;

import net.benjam.uselessmod.UselessMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_USELESS_TOOL = tag("needs_useless_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(UselessMod.MOD_ID, name));
        }
    }
    
    public static class Items {
        @SuppressWarnings("unused")
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(UselessMod.MOD_ID, name));
        }
    }
}
