package top.hendrixshen.bilibilidanmaku;

import net.fabricmc.loader.api.FabricLoader;
import top.hendrixshen.bilibilidanmaku.config.ConfigHandler;
import top.hendrixshen.bilibilidanmaku.util.VersionParser;
import top.hendrixshen.magiclib.malilib.impl.ConfigManager;

public class BilibiliDanmakuReference {
    private static final String MOD_ID = "bilibili-danmaku";
    //#if MC > 11904
    private static final String CURRENT_MOD_ID = String.format("%s-1_20_1", MOD_ID);
    //#elseif MC > 11902
    //$$ private static final String CURRENT_MOD_ID = String.format("%s-1_19_4", MOD_ID);
    //#elseif MC > 11802
    //$$ private static final String CURRENT_MOD_ID = String.format("%s-1_19_2", MOD_ID);
    //#elseif MC > 11701
    //$$ private static final String CURRENT_MOD_ID = String.format("%s-1_18_2", MOD_ID);
    //#elseif MC > 11605
    //$$ private static final String CURRENT_MOD_ID = String.format("%s-1_17_1", MOD_ID);
    //#elseif MC > 11502
    //$$ private static final String CURRENT_MOD_ID = String.format("%s-1_16_5", MOD_ID);
    //#elseif MC > 11404
    //$$ private static final String CURRENT_MOD_ID = String.format("%s-1_15_2", MOD_ID);
    //#else
    //$$ private static final String CURRENT_MOD_ID = String.format("%s-1_14_4", MOD_ID);
    //#endif
    private static final String MOD_NAME = FabricLoader.getInstance().getModContainer(CURRENT_MOD_ID).orElseThrow(RuntimeException::new).getMetadata().getName();
    private static final String MOD_VERSION = FabricLoader.getInstance().getModContainer(CURRENT_MOD_ID).orElseThrow(RuntimeException::new).getMetadata().getVersion().getFriendlyString();
    private static final String MOD_VERSION_TYPE = VersionParser.getVersionType(MOD_VERSION);

    private static final int CONFIG_VERSION = 1;
    private static final ConfigManager CONFIG_MANAGER = ConfigManager.get(MOD_ID);
    private static final ConfigHandler CONFIG_HANDLER = new ConfigHandler(MOD_ID, CONFIG_MANAGER, CONFIG_VERSION);
    public static ConfigHandler getConfigHandler() {
        return CONFIG_HANDLER;
    }

    public static String getCurrentModId() {
        return CURRENT_MOD_ID;
    }

    public static String getModId() {
        return MOD_ID;
    }

    public static String getModName() {
        return MOD_NAME;
    }

    public static String getModVersion() {
        return MOD_VERSION;
    }

    public static String getModVersionType() {
        return MOD_VERSION_TYPE;
    }
}
