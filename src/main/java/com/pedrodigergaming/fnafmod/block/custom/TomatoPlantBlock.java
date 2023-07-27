package com.pedrodigergaming.fnafmod.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import com.pedrodigergaming.fnafmod.item.ModItems;

public class TomatoPlantBlock extends CropBlock {
    public TomatoPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.TOMATO_SEEDS.get();
    }
}