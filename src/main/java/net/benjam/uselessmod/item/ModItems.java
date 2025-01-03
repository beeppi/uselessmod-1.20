package net.benjam.uselessmod.item;

import net.benjam.uselessmod.UselessMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
    DeferredRegister.create(ForgeRegistries.ITEMS, UselessMod.MOD_ID);

    public static final RegistryObject<Item> RAW_USELESSNESS =
    ITEMS.register("raw_uselessness", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> USELESSNESS =
    ITEMS.register("uselessness", () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> USELESS_HELMET =
    ITEMS.register("useless_helmet", () -> new ArmorItem(
        ModArmorMaterials.USELESSNESS, 
        ArmorItem.Type.HELMET, 
        new Item.Properties()
    ));

    public static final RegistryObject<Item> USELESS_CHESTPLATE =
    ITEMS.register("useless_chestplate", () -> new ArmorItem(
        ModArmorMaterials.USELESSNESS, 
        ArmorItem.Type.CHESTPLATE, 
        new Item.Properties()
    ));

    public static final RegistryObject<Item> USELESS_LEGGINGS =
    ITEMS.register("useless_leggings", () -> new ArmorItem(
        ModArmorMaterials.USELESSNESS, 
        ArmorItem.Type.LEGGINGS, 
        new Item.Properties()
    ));

    public static final RegistryObject<Item> USELESS_BOOTS =
    ITEMS.register("useless_boots", () -> new ArmorItem(
        ModArmorMaterials.USELESSNESS, 
        ArmorItem.Type.BOOTS, 
        new Item.Properties()
    ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
