package net.benjam.uselessmod.item;

import net.benjam.uselessmod.UselessMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
    DeferredRegister.create(
        ForgeRegistries.ITEMS,
        UselessMod.MOD_ID
    );

    public static final RegistryObject<Item> RAW_USELESSNESS =
    ITEMS.register(
        "raw_uselessness",
        () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> USELESSNESS =
    ITEMS.register(
        "uselessness",
        () -> new Item(new Item.Properties())
    );


    public static final RegistryObject<Item> USELESS_HELMET =
    ITEMS.register(
        "useless_helmet",
        () -> new ArmorItem(
            ModArmorMaterials.USELESSNESS, 
            ArmorItem.Type.HELMET, 
            new Item.Properties()
    ));

    public static final RegistryObject<Item> USELESS_CHESTPLATE =
    ITEMS.register(
        "useless_chestplate",
        () -> new ArmorItem(
            ModArmorMaterials.USELESSNESS, 
            ArmorItem.Type.CHESTPLATE, 
            new Item.Properties()
    ));

    public static final RegistryObject<Item> USELESS_LEGGINGS =
    ITEMS.register(
        "useless_leggings",
        () -> new ArmorItem(
            ModArmorMaterials.USELESSNESS, 
            ArmorItem.Type.LEGGINGS, 
            new Item.Properties()
    ));

    public static final RegistryObject<Item> USELESS_BOOTS =
    ITEMS.register(
        "useless_boots",
        () -> new ArmorItem(
            ModArmorMaterials.USELESSNESS, 
            ArmorItem.Type.BOOTS, 
            new Item.Properties()
    ));

    public static final RegistryObject<Item> USELESS_SWORD = 
    ITEMS.register(
        "useless_sword",
        () -> new SwordItem(
            ModToolTiers.USELESSNESS,
            2,
            1,
            new Item.Properties()
        )
    );

    public static final RegistryObject<Item> USELESS_PICKAXE = 
    ITEMS.register(
        "useless_pickaxe",
        () -> new PickaxeItem(
            ModToolTiers.USELESSNESS,
            1,
            1,
            new Item.Properties()
        )
    );

    public static final RegistryObject<Item> USELESS_AXE = 
    ITEMS.register(
        "useless_axe",
        () -> new AxeItem(
            ModToolTiers.USELESSNESS,
            4,
            1,
            new Item.Properties()
        )
    );

    public static final RegistryObject<Item> USELESS_HOE = 
    ITEMS.register(
        "useless_hoe",
        () -> new HoeItem(
            ModToolTiers.USELESSNESS,
            0,
            0,
            new Item.Properties()
        )
    );

    public static final RegistryObject<Item> USELESS_SHOVEL = 
    ITEMS.register(
        "useless_shovel",
        () -> new ShovelItem(
            ModToolTiers.USELESSNESS,
            0,
            0,
            new Item.Properties()
        )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
