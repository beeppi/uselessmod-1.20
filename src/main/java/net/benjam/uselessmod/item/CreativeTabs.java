package net.benjam.uselessmod.item;

import net.benjam.uselessmod.UselessMod;
import net.benjam.uselessmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UselessMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEST_MOD_TAB = 
    CREATIVE_MODE_TABS.register("test_mod_tab", () -> CreativeModeTab.builder()
        .icon(() -> new ItemStack(ModItems.USELESSNESS.get()))
        .title(Component.translatable("creativetab.test_mod_tab"))
        .displayItems((pParameters, pOutput) -> {
            pOutput.accept(ModItems.RAW_USELESSNESS.get());
            pOutput.accept(ModItems.USELESSNESS.get());
            
            pOutput.accept(ModBlocks.USELESS_BLOCK.get());
            pOutput.accept(ModBlocks.USELESS_ORE.get());
            pOutput.accept(ModBlocks.DEEPSLATE_USELESS_ORE.get());

            pOutput.accept(ModItems.USELESS_HELMET.get());
            pOutput.accept(ModItems.USELESS_CHESTPLATE.get());
            pOutput.accept(ModItems.USELESS_LEGGINGS.get());
            pOutput.accept(ModItems.USELESS_BOOTS.get());
        })
        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
