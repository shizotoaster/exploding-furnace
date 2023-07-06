package com.kryptography.explodingfurnaces;


import com.kryptography.explodingfurnaces.registry.ItemInit;
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
