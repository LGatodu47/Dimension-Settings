package fr.lgatodu47.dimsettings.util;

import fr.lgatodu47.dimsettings.DimensionSettings;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
public class ModMenuIntegration implements ModMenuApi
{
    @Override
    public String getModId()
    {
        return DimensionSettings.MODID;
    }

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory()
    {
        return screen -> AutoConfig.getConfigScreen(DimensionSettingsConfig.class, screen).get();
    }
}
