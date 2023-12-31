package com.pedrodigergaming.fnafmod.item;

import com.pedrodigergaming.fnafmod.FnafMod;
import com.pedrodigergaming.fnafmod.block.ModBlocks;
import com.pedrodigergaming.fnafmod.item.custom.CoalCokeItem;
import com.pedrodigergaming.fnafmod.item.custom.SmartBlowtorchItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FnafMod.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));

    public static final RegistryObject<Item> SMART_BLOW_TORCH = ITEMS.register("smart_blow_torch",
            () -> new SmartBlowtorchItem(new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod).durability(64)));

    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModTiers.TITANIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModTiers.TITANIUM, 0, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModTiers.TITANIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModTiers.TITANIUM, 4, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModTiers.TITANIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterial.TITANIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));

    public static final RegistryObject<Item> TITANIUM_HORSE_ARMOR = ITEMS.register("titanium_horse_armor",
            () -> new HorseArmorItem(16, "titanium",
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.FNaF_Mod)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
