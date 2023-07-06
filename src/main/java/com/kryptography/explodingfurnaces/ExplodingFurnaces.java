package com.kryptography.explodingfurnaces;


import com.kryptography.explodingfurnaces.registry.ItemInit;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExplodingFurnaces.MODID)
public class ExplodingFurnaces {
    public static final String MODID = "explodingfurnaces";

    public ExplodingFurnaces() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
    }
}
