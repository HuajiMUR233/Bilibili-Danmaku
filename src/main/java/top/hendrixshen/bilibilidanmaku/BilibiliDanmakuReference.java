package top.hendrixshen.bilibilidanmaku;

import net.fabricmc.loader.api.FabricLoader;

public class BilibiliDanmakuReference {
    private static final String MOD_ID = "bilibili-danmaku";
    private static final String MOD_NAME = "Bilibili Danmaku";
    private static final String MOD_VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(RuntimeException::new).getMetadata().getVersion().getFriendlyString();
    private static final String MOD_VERSION_TYPE = "Development";

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
