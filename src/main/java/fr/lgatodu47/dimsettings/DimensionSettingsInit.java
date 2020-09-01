package fr.lgatodu47.dimsettings;

import fr.lgatodu47.dimsettings.util.DimensionSettingsConfig;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.ConfigHolder;
import me.sargunvohra.mcmods.autoconfig1u.serializer.DummyConfigSerializer;
import me.sargunvohra.mcmods.autoconfig1u.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;

public class DimensionSettingsInit implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        ConfigHolder<DimensionSettingsConfig> holder = AutoConfig.register(DimensionSettingsConfig.class, PartitioningSerializer.wrap(DummyConfigSerializer::new));
    }
}
