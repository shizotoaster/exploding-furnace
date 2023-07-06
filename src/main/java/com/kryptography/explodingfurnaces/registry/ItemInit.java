package com.kryptography.explodingfurnaces.registry;

import com.kryptography.explodingfurnaces.ExplodingFurnaces;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExplodingFurnaces.MODID);

        public static final RegistryObject<Item> HOT_GUNPOWDER = ITEMS.register("hot_gunpowder",
                () -> new Item(new Item.Properties()
                        .stacksTo(64)
                ));
}
