package top.hendrixshen.bilibilidanmaku;

import top.hendrixshen.bilibilidanmaku.config.Configs;
import top.hendrixshen.magiclib.dependency.api.ConfigDependencyPredicate;
import top.hendrixshen.magiclib.malilib.impl.ConfigOption;

public class BilibiliDanmakuPredicates {
    public static class DebugOptionPredicate implements ConfigDependencyPredicate {
        @Override
        public boolean isSatisfied(ConfigOption option) {
            return Configs.debugMode;
        }
    }
}
