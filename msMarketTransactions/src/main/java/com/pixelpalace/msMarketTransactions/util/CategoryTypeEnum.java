package com.pixelpalace.msMarketTransactions.util;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;

public enum CategoryTypeEnum {

    ACTION("Action"),
    ADVENTURE("Adventure"),
    FPS_TPS("Fps_tps"),
    HACK_SLASH("Hack_slash"),
    PLATFORM("Platform"),
    PUZZLE("Puzzle"),
    RPG("Rpg"),
    SIMULATION("Simulation"),
    INDIE("Indie"),
    ARCADE("Arcade"),
    POINT_CLICK("Point_click"),
    EDUCATIONAL("Educational"),
    MMO("Mmo"),
    TERROR("Terror"),
    STRATEGY("Strategy"),
    SPORTS("Sports"),
    HORROR("Horror"),
    RACING("Racing"),
    FREE_GAMES("Free_games"),
    FIGHTING("Fighting"),
    SCIENCE("Science");

    private String description;

    CategoryTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription(){return description;}

    public static Optional<CategoryTypeEnum> getCategoryType(String category) {
         return Arrays.stream(CategoryTypeEnum.values()).filter(categoryTypeEnum -> categoryTypeEnum.getDescription().equals(category)).findFirst();

       /* return Optional.ofNullable(Map.of(
                "ACTION", CategoryTypeEnum.ACTION,
                "ADVENTURE", CategoryTypeEnum.ADVENTURE,
                "FPS_TPS", CategoryTypeEnum.FPS_TPS,
                "HACK_SLASH", CategoryTypeEnum.HACK_SLASH,
                "PLATFORM", CategoryTypeEnum.PLATFORM,
                "PUZZLE", CategoryTypeEnum.PUZZLE,
                "RPG", CategoryTypeEnum.RPG,
                "SIMULATION", CategoryTypeEnum.SIMULATION,
                "INDIE", CategoryTypeEnum.INDIE,
                "ARCADE", CategoryTypeEnum.ARCADE,
                "POINT_CLICK", CategoryTypeEnum.POINT_CLICK,
                "EDUCATIONAL", CategoryTypeEnum.EDUCATIONAL,
                "MMO", CategoryTypeEnum.MMO,
                "TERROR", CategoryTypeEnum.TERROR,
                "STRATEGY", CategoryTypeEnum.STRATEGY,
                "SPORTS", CategoryTypeEnum.SPORTS,
                "HORROR", CategoryTypeEnum.HORROR,
                "RACING", CategoryTypeEnum.RACING,
                "FREE_GAMES", CategoryTypeEnum.FREE_GAMES,
                "FIGHTING", CategoryTypeEnum.FIGHTING,
                "SCIENCE", CategoryTypeEnum.SCIENCE
        ).get(category));*/
    }

}
