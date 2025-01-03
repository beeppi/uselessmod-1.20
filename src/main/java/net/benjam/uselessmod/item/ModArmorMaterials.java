package net.benjam.uselessmod.item;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import net.benjam.uselessmod.UselessMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial {
    USELESSNESS(
        "useless",
        26,
        new int[] {5, 7, 5, 4},
        25,
        SoundEvents.ARMOR_EQUIP_GOLD,
        1f,
        0f,
        () -> Ingredient.of(ModItems.USELESSNESS.get())
    );

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue,
            SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public String getName() {
        return UselessMod.MOD_ID + ":" + this.name;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    @Override
    public int getDurabilityForType(@Nonnull Type p_266807_) {
        return BASE_DURABILITY[p_266807_.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(@Nonnull Type p_267168_) {
        return this.protectionAmounts[p_267168_.ordinal()];
    }
}
