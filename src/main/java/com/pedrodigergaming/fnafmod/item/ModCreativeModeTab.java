package com.pedrodigergaming.fnafmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FNaF_Mod = new CreativeModeTab("FNaFMod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };
}