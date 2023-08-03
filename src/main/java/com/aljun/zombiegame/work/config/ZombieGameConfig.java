package com.aljun.zombiegame.work.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.List;

public class ZombieGameConfig {
    public static ForgeConfigSpec commonConfig;

    public static ForgeConfigSpec.ConfigValue<List<String>> blockChoosingWhiteList;
    public static ForgeConfigSpec.ConfigValue<List<String>> blockChoosingBlackList;

    public static ForgeConfigSpec.ConfigValue<List<String>> blockBreakingBlackList;

    public static ForgeConfigSpec.ConfigValue<List<String>> targetChoosingWhiteList;
    public static ForgeConfigSpec.ConfigValue<List<String>> targetChoosingBlackList;

    public static ForgeConfigSpec.ConfigValue<List<String>> replaceEntityWhiteList;
    public static ForgeConfigSpec.ConfigValue<List<String>> replaceEntityBlackList;
    public static ForgeConfigSpec.ConfigValue<List<String>> removeEntityWhiteList;
    public static ForgeConfigSpec.ConfigValue<List<String>> removeEntityBlackList;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("choosing_blocks");

        List<String> ar1 = new ArrayList<>();
        blockChoosingWhiteList = builder.define("ChoosingBlock WhiteList", ar1);

        List<String> ar2 = new ArrayList<>();
        blockChoosingBlackList = builder.define("ChoosingBlock BlackList", ar2);

        builder.pop();
        builder.push("breaking_blocks");

        List<String> ar3 = new ArrayList<>();
        blockBreakingBlackList = builder.define("blockBreaking BlackList", ar3);

        builder.pop();
        builder.push("target_choosing");

        List<String> ar4 = new ArrayList<>();
        ar4.add("guardvillagers:guard");
        targetChoosingWhiteList = builder.define("TargetChoosing WhiteList", ar4);
        List<String> ar5 = new ArrayList<>();
        targetChoosingBlackList = builder.define("TargetChoosing BlackList", ar5);

        builder.pop();
        builder.push("zombie_spawn");

        List<String> ar6 = new ArrayList<>();
        replaceEntityWhiteList = builder.define("ReplaceEntity WhiteList", ar6);
        List<String> ar7 = new ArrayList<>();
        replaceEntityBlackList = builder.define("ReplaceEntity BlackList", ar7);

        List<String> ar8 = new ArrayList<>();
        removeEntityWhiteList = builder.define("RemoveEntity WhiteList", ar8);
        List<String> ar9 = new ArrayList<>();
        removeEntityBlackList = builder.define("RemoveEntity BlackList", ar9);

        builder.pop();

        commonConfig = builder.build();
    }
}
