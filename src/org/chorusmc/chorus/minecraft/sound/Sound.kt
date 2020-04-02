package org.chorusmc.chorus.minecraft.sound

import org.chorusmc.chorus.minecraft.McComponent

/**
 * @author Gio
 */
enum class Sound : McComponent {

    AMBIENT_CAVE,
    BLOCK_ANVIL_BREAK,
    BLOCK_ANVIL_DESTROY,
    BLOCK_ANVIL_FALL,
    BLOCK_ANVIL_HIT,
    BLOCK_ANVIL_LAND,
    BLOCK_ANVIL_PLACE,
    BLOCK_ANVIL_STEP,
    BLOCK_ANVIL_USE,
    BLOCK_BREWING_STAND_BREW,
    BLOCK_CHEST_CLOSE,
    BLOCK_CHEST_LOCKED,
    BLOCK_CHEST_OPEN,
    BLOCK_CHORUS_FLOWER_DEATH,
    BLOCK_CHORUS_FLOWER_GROW,
    BLOCK_CLOTH_BREAK,
    BLOCK_CLOTH_FALL,
    BLOCK_CLOTH_HIT,
    BLOCK_CLOTH_PLACE,
    BLOCK_CLOTH_STEP,
    BLOCK_COMPARATOR_CLICK,
    BLOCK_DISPENSER_DISPENSE,
    BLOCK_DISPENSER_FAIL,
    BLOCK_DISPENSER_LAUNCH,
    BLOCK_ENCHANTMENT_TABLE_USE,
    BLOCK_ENDERCHEST_CLOSE,
    BLOCK_ENDERCHEST_OPEN,
    BLOCK_END_GATEWAY_SPAWN,
    BLOCK_END_PORTAL_FRAME_FILL,
    BLOCK_END_PORTAL_SPAWN,
    BLOCK_FENCE_GATE_CLOSE,
    BLOCK_FENCE_GATE_OPEN,
    BLOCK_FIRE_AMBIENT,
    BLOCK_FIRE_EXTINGUISH,
    BLOCK_FURNACE_FIRE_CRACKLE,
    BLOCK_GLASS_BREAK,
    BLOCK_GLASS_FALL,
    BLOCK_GLASS_HIT,
    BLOCK_GLASS_PLACE,
    BLOCK_GLASS_STEP,
    BLOCK_GRASS_BREAK,
    BLOCK_GRASS_FALL,
    BLOCK_GRASS_HIT,
    BLOCK_GRASS_PLACE,
    BLOCK_GRASS_STEP,
    BLOCK_GRAVEL_BREAK,
    BLOCK_GRAVEL_FALL,
    BLOCK_GRAVEL_HIT,
    BLOCK_GRAVEL_PLACE,
    BLOCK_GRAVEL_STEP,
    BLOCK_IRON_DOOR_CLOSE,
    BLOCK_IRON_DOOR_OPEN,
    BLOCK_IRON_TRAPDOOR_CLOSE,
    BLOCK_IRON_TRAPDOOR_OPEN,
    BLOCK_LADDER_BREAK,
    BLOCK_LADDER_FALL,
    BLOCK_LADDER_HIT,
    BLOCK_LADDER_PLACE,
    BLOCK_LADDER_STEP,
    BLOCK_LAVA_AMBIENT,
    BLOCK_LAVA_EXTINGUISH,
    BLOCK_LAVA_POP,
    BLOCK_LEVER_CLICK,
    BLOCK_METAL_BREAK,
    BLOCK_METAL_FALL,
    BLOCK_METAL_HIT,
    BLOCK_METAL_PLACE,
    BLOCK_METAL_PRESSUREPLATE_CLICK_OFF,
    BLOCK_METAL_PRESSUREPLATE_CLICK_ON,
    BLOCK_METAL_STEP,
    BLOCK_NOTE_BASEDRUM,
    BLOCK_NOTE_BASS,
    BLOCK_NOTE_BELL,
    BLOCK_NOTE_CHIME,
    BLOCK_NOTE_FLUTE,
    BLOCK_NOTE_GUITAR,
    BLOCK_NOTE_HARP,
    BLOCK_NOTE_HAT,
    BLOCK_NOTE_PLING,
    BLOCK_NOTE_SNARE,
    BLOCK_NOTE_XYLOPHONE,
    BLOCK_PISTON_CONTRACT,
    BLOCK_PISTON_EXTEND,
    BLOCK_PORTAL_AMBIENT,
    BLOCK_PORTAL_TRAVEL,
    BLOCK_PORTAL_TRIGGER,
    BLOCK_REDSTONE_TORCH_BURNOUT,
    BLOCK_SAND_BREAK,
    BLOCK_SAND_FALL,
    BLOCK_SAND_HIT,
    BLOCK_SAND_PLACE,
    BLOCK_SAND_STEP,
    BLOCK_SHULKER_BOX_CLOSE,
    BLOCK_SHULKER_BOX_OPEN,
    BLOCK_SLIME_BREAK,
    BLOCK_SLIME_FALL,
    BLOCK_SLIME_HIT,
    BLOCK_SLIME_PLACE,
    BLOCK_SLIME_STEP,
    BLOCK_SNOW_BREAK,
    BLOCK_SNOW_FALL,
    BLOCK_SNOW_HIT,
    BLOCK_SNOW_PLACE,
    BLOCK_SNOW_STEP,
    BLOCK_STONE_BREAK,
    BLOCK_STONE_BUTTON_CLICK_OFF,
    BLOCK_STONE_BUTTON_CLICK_ON,
    BLOCK_STONE_FALL,
    BLOCK_STONE_HIT,
    BLOCK_STONE_PLACE,
    BLOCK_STONE_PRESSUREPLATE_CLICK_OFF,
    BLOCK_STONE_PRESSUREPLATE_CLICK_ON,
    BLOCK_STONE_STEP,
    BLOCK_TRIPWIRE_ATTACH,
    BLOCK_TRIPWIRE_CLICK_OFF,
    BLOCK_TRIPWIRE_CLICK_ON,
    BLOCK_TRIPWIRE_DETACH,
    BLOCK_WATERLILY_PLACE,
    BLOCK_WATER_AMBIENT,
    BLOCK_WOODEN_DOOR_CLOSE,
    BLOCK_WOODEN_DOOR_OPEN,
    BLOCK_WOODEN_TRAPDOOR_CLOSE,
    BLOCK_WOODEN_TRAPDOOR_OPEN,
    BLOCK_WOOD_BREAK,
    BLOCK_WOOD_BUTTON_CLICK_OFF,
    BLOCK_WOOD_BUTTON_CLICK_ON,
    BLOCK_WOOD_FALL,
    BLOCK_WOOD_HIT,
    BLOCK_WOOD_PLACE,
    BLOCK_WOOD_PRESSUREPLATE_CLICK_OFF,
    BLOCK_WOOD_PRESSUREPLATE_CLICK_ON,
    BLOCK_WOOD_STEP,
    ENCHANT_THORNS_HIT,
    ENTITY_ARMORSTAND_BREAK,
    ENTITY_ARMORSTAND_FALL,
    ENTITY_ARMORSTAND_HIT,
    ENTITY_ARMORSTAND_PLACE,
    ENTITY_ARROW_HIT,
    ENTITY_ARROW_HIT_PLAYER,
    ENTITY_ARROW_SHOOT,
    ENTITY_BAT_AMBIENT,
    ENTITY_BAT_DEATH,
    ENTITY_BAT_HURT,
    ENTITY_BAT_LOOP,
    ENTITY_BAT_TAKEOFF,
    ENTITY_BLAZE_AMBIENT,
    ENTITY_BLAZE_BURN,
    ENTITY_BLAZE_DEATH,
    ENTITY_BLAZE_HURT,
    ENTITY_BLAZE_SHOOT,
    ENTITY_BOAT_PADDLE_LAND,
    ENTITY_BOAT_PADDLE_WATER,
    ENTITY_BOBBER_RETRIEVE,
    ENTITY_BOBBER_SPLASH,
    ENTITY_BOBBER_THROW,
    ENTITY_CAT_AMBIENT,
    ENTITY_CAT_DEATH,
    ENTITY_CAT_HISS,
    ENTITY_CAT_HURT,
    ENTITY_CAT_PURR,
    ENTITY_CAT_PURREOW,
    ENTITY_CHICKEN_AMBIENT,
    ENTITY_CHICKEN_DEATH,
    ENTITY_CHICKEN_EGG,
    ENTITY_CHICKEN_HURT,
    ENTITY_CHICKEN_STEP,
    ENTITY_COW_AMBIENT,
    ENTITY_COW_DEATH,
    ENTITY_COW_HURT,
    ENTITY_COW_MILK,
    ENTITY_COW_STEP,
    ENTITY_CREEPER_DEATH,
    ENTITY_CREEPER_HURT,
    ENTITY_CREEPER_PRIMED,
    ENTITY_DONKEY_AMBIENT,
    ENTITY_DONKEY_ANGRY,
    ENTITY_DONKEY_CHEST,
    ENTITY_DONKEY_DEATH,
    ENTITY_DONKEY_HURT,
    ENTITY_EGG_THROW,
    ENTITY_ELDER_GUARDIAN_AMBIENT,
    ENTITY_ELDER_GUARDIAN_AMBIENT_LAND,
    ENTITY_ELDER_GUARDIAN_CURSE,
    ENTITY_ELDER_GUARDIAN_DEATH,
    ENTITY_ELDER_GUARDIAN_DEATH_LAND,
    ENTITY_ELDER_GUARDIAN_FLOP,
    ENTITY_ELDER_GUARDIAN_HURT,
    ENTITY_ELDER_GUARDIAN_HURT_LAND,
    ENTITY_ENDERDRAGON_AMBIENT,
    ENTITY_ENDERDRAGON_DEATH,
    ENTITY_ENDERDRAGON_FIREBALL_EXPLODE,
    ENTITY_ENDERDRAGON_FLAP,
    ENTITY_ENDERDRAGON_GROWL,
    ENTITY_ENDERDRAGON_HURT,
    ENTITY_ENDERDRAGON_SHOOT,
    ENTITY_ENDEREYE_DEATH,
    ENTITY_ENDEREYE_LAUNCH,
    ENTITY_ENDERMEN_AMBIENT,
    ENTITY_ENDERMEN_DEATH,
    ENTITY_ENDERMEN_HURT,
    ENTITY_ENDERMEN_SCREAM,
    ENTITY_ENDERMEN_STARE,
    ENTITY_ENDERMEN_TELEPORT,
    ENTITY_ENDERMITE_AMBIENT,
    ENTITY_ENDERMITE_DEATH,
    ENTITY_ENDERMITE_HURT,
    ENTITY_ENDERMITE_STEP,
    ENTITY_ENDERPEARL_THROW,
    ENTITY_EVOCATION_FANGS_ATTACK,
    ENTITY_EVOCATION_ILLAGER_AMBIENT,
    ENTITY_EVOCATION_ILLAGER_CAST_SPELL,
    ENTITY_EVOCATION_ILLAGER_DEATH,
    ENTITY_EVOCATION_ILLAGER_HURT,
    ENTITY_EVOCATION_ILLAGER_PREPARE_ATTACK,
    ENTITY_EVOCATION_ILLAGER_PREPARE_SUMMON,
    ENTITY_EVOCATION_ILLAGER_PREPARE_WOLOLO,
    ENTITY_EXPERIENCE_BOTTLE_THROW,
    ENTITY_EXPERIENCE_ORB_PICKUP,
    ENTITY_FIREWORK_BLAST,
    ENTITY_FIREWORK_BLAST_FAR,
    ENTITY_FIREWORK_LARGE_BLAST,
    ENTITY_FIREWORK_LARGE_BLAST_FAR,
    ENTITY_FIREWORK_LAUNCH,
    ENTITY_FIREWORK_SHOOT,
    ENTITY_FIREWORK_TWINKLE,
    ENTITY_FIREWORK_TWINKLE_FAR,
    ENTITY_GENERIC_BIG_FALL,
    ENTITY_GENERIC_BURN,
    ENTITY_GENERIC_DEATH,
    ENTITY_GENERIC_DRINK,
    ENTITY_GENERIC_EAT,
    ENTITY_GENERIC_EXPLODE,
    ENTITY_GENERIC_EXTINGUISH_FIRE,
    ENTITY_GENERIC_HURT,
    ENTITY_GENERIC_SMALL_FALL,
    ENTITY_GENERIC_SPLASH,
    ENTITY_GENERIC_SWIM,
    ENTITY_GHAST_AMBIENT,
    ENTITY_GHAST_DEATH,
    ENTITY_GHAST_HURT,
    ENTITY_GHAST_SCREAM,
    ENTITY_GHAST_SHOOT,
    ENTITY_GHAST_WARN,
    ENTITY_GUARDIAN_AMBIENT,
    ENTITY_GUARDIAN_AMBIENT_LAND,
    ENTITY_GUARDIAN_ATTACK,
    ENTITY_GUARDIAN_DEATH,
    ENTITY_GUARDIAN_DEATH_LAND,
    ENTITY_GUARDIAN_FLOP,
    ENTITY_GUARDIAN_HURT,
    ENTITY_GUARDIAN_HURT_LAND,
    ENTITY_HORSE_AMBIENT,
    ENTITY_HORSE_ANGRY,
    ENTITY_HORSE_ARMOR,
    ENTITY_HORSE_BREATHE,
    ENTITY_HORSE_DEATH,
    ENTITY_HORSE_EAT,
    ENTITY_HORSE_GALLOP,
    ENTITY_HORSE_HURT,
    ENTITY_HORSE_JUMP,
    ENTITY_HORSE_LAND,
    ENTITY_HORSE_SADDLE,
    ENTITY_HORSE_STEP,
    ENTITY_HORSE_STEP_WOOD,
    ENTITY_HOSTILE_BIG_FALL,
    ENTITY_HOSTILE_DEATH,
    ENTITY_HOSTILE_HURT,
    ENTITY_HOSTILE_SMALL_FALL,
    ENTITY_HOSTILE_SPLASH,
    ENTITY_HOSTILE_SWIM,
    ENTITY_HUSK_AMBIENT,
    ENTITY_HUSK_DEATH,
    ENTITY_HUSK_HURT,
    ENTITY_HUSK_STEP,
    ENTITY_ILLUSION_ILLAGER_AMBIENT,
    ENTITY_ILLUSION_ILLAGER_CAST_SPELL,
    ENTITY_ILLUSION_ILLAGER_DEATH,
    ENTITY_ILLUSION_ILLAGER_HURT,
    ENTITY_ILLUSION_ILLAGER_MIRROR_MOVE,
    ENTITY_ILLUSION_ILLAGER_PREPARE_BLINDNESS,
    ENTITY_ILLUSION_ILLAGER_PREPARE_MIRROR,
    ENTITY_IRONGOLEM_ATTACK,
    ENTITY_IRONGOLEM_DEATH,
    ENTITY_IRONGOLEM_HURT,
    ENTITY_IRONGOLEM_STEP,
    ENTITY_ITEMFRAME_ADD_ITEM,
    ENTITY_ITEMFRAME_BREAK,
    ENTITY_ITEMFRAME_PLACE,
    ENTITY_ITEMFRAME_REMOVE_ITEM,
    ENTITY_ITEMFRAME_ROTATE_ITEM,
    ENTITY_ITEM_BREAK,
    ENTITY_ITEM_PICKUP,
    ENTITY_LEASHKNOT_BREAK,
    ENTITY_LEASHKNOT_PLACE,
    ENTITY_LIGHTNING_IMPACT,
    ENTITY_LIGHTNING_THUNDER,
    ENTITY_LINGERINGPOTION_THROW,
    ENTITY_LLAMA_AMBIENT,
    ENTITY_LLAMA_ANGRY,
    ENTITY_LLAMA_CHEST,
    ENTITY_LLAMA_DEATH,
    ENTITY_LLAMA_EAT,
    ENTITY_LLAMA_HURT,
    ENTITY_LLAMA_SPIT,
    ENTITY_LLAMA_STEP,
    ENTITY_LLAMA_SWAG,
    ENTITY_MAGMACUBE_DEATH,
    ENTITY_MAGMACUBE_HURT,
    ENTITY_MAGMACUBE_JUMP,
    ENTITY_MAGMACUBE_SQUISH,
    ENTITY_MINECART_INSIDE,
    ENTITY_MINECART_RIDING,
    ENTITY_MOOSHROOM_SHEAR,
    ENTITY_MULE_AMBIENT,
    ENTITY_MULE_CHEST,
    ENTITY_MULE_DEATH,
    ENTITY_MULE_HURT,
    ENTITY_PAINTING_BREAK,
    ENTITY_PAINTING_PLACE,
    ENTITY_PARROT_AMBIENT,
    ENTITY_PARROT_DEATH,
    ENTITY_PARROT_EAT,
    ENTITY_PARROT_FLY,
    ENTITY_PARROT_HURT,
    ENTITY_PARROT_IMITATE_BLAZE,
    ENTITY_PARROT_IMITATE_CREEPER,
    ENTITY_PARROT_IMITATE_ELDER_GUARDIAN,
    ENTITY_PARROT_IMITATE_ENDERDRAGON,
    ENTITY_PARROT_IMITATE_ENDERMAN,
    ENTITY_PARROT_IMITATE_ENDERMITE,
    ENTITY_PARROT_IMITATE_EVOCATION_ILLAGER,
    ENTITY_PARROT_IMITATE_GHAST,
    ENTITY_PARROT_IMITATE_HUSK,
    ENTITY_PARROT_IMITATE_ILLUSION_ILLAGER,
    ENTITY_PARROT_IMITATE_MAGMACUBE,
    ENTITY_PARROT_IMITATE_POLAR_BEAR,
    ENTITY_PARROT_IMITATE_SHULKER,
    ENTITY_PARROT_IMITATE_SILVERFISH,
    ENTITY_PARROT_IMITATE_SKELETON,
    ENTITY_PARROT_IMITATE_SLIME,
    ENTITY_PARROT_IMITATE_SPIDER,
    ENTITY_PARROT_IMITATE_STRAY,
    ENTITY_PARROT_IMITATE_VEX,
    ENTITY_PARROT_IMITATE_VINDICATION_ILLAGER,
    ENTITY_PARROT_IMITATE_WITCH,
    ENTITY_PARROT_IMITATE_WITHER,
    ENTITY_PARROT_IMITATE_WITHER_SKELETON,
    ENTITY_PARROT_IMITATE_WOLF,
    ENTITY_PARROT_IMITATE_ZOMBIE,
    ENTITY_PARROT_IMITATE_ZOMBIE_PIGMAN,
    ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER,
    ENTITY_PARROT_STEP,
    ENTITY_PIG_AMBIENT,
    ENTITY_PIG_DEATH,
    ENTITY_PIG_HURT,
    ENTITY_PIG_SADDLE,
    ENTITY_PIG_STEP,
    ENTITY_PLAYER_ATTACK_CRIT,
    ENTITY_PLAYER_ATTACK_KNOCKBACK,
    ENTITY_PLAYER_ATTACK_NODAMAGE,
    ENTITY_PLAYER_ATTACK_STRONG,
    ENTITY_PLAYER_ATTACK_SWEEP,
    ENTITY_PLAYER_ATTACK_WEAK,
    ENTITY_PLAYER_BIG_FALL,
    ENTITY_PLAYER_BREATH,
    ENTITY_PLAYER_BURP,
    ENTITY_PLAYER_DEATH,
    ENTITY_PLAYER_HURT,
    ENTITY_PLAYER_HURT_DROWN,
    ENTITY_PLAYER_HURT_ON_FIRE,
    ENTITY_PLAYER_LEVELUP,
    ENTITY_PLAYER_SMALL_FALL,
    ENTITY_PLAYER_SPLASH,
    ENTITY_PLAYER_SWIM,
    ENTITY_POLAR_BEAR_AMBIENT,
    ENTITY_POLAR_BEAR_BABY_AMBIENT,
    ENTITY_POLAR_BEAR_DEATH,
    ENTITY_POLAR_BEAR_HURT,
    ENTITY_POLAR_BEAR_STEP,
    ENTITY_POLAR_BEAR_WARNING,
    ENTITY_RABBIT_AMBIENT,
    ENTITY_RABBIT_ATTACK,
    ENTITY_RABBIT_DEATH,
    ENTITY_RABBIT_HURT,
    ENTITY_RABBIT_JUMP,
    ENTITY_SHEEP_AMBIENT,
    ENTITY_SHEEP_DEATH,
    ENTITY_SHEEP_HURT,
    ENTITY_SHEEP_SHEAR,
    ENTITY_SHEEP_STEP,
    ENTITY_SHULKER_AMBIENT,
    ENTITY_SHULKER_BULLET_HIT,
    ENTITY_SHULKER_BULLET_HURT,
    ENTITY_SHULKER_CLOSE,
    ENTITY_SHULKER_DEATH,
    ENTITY_SHULKER_HURT,
    ENTITY_SHULKER_HURT_CLOSED,
    ENTITY_SHULKER_OPEN,
    ENTITY_SHULKER_SHOOT,
    ENTITY_SHULKER_TELEPORT,
    ENTITY_SILVERFISH_AMBIENT,
    ENTITY_SILVERFISH_DEATH,
    ENTITY_SILVERFISH_HURT,
    ENTITY_SILVERFISH_STEP,
    ENTITY_SKELETON_AMBIENT,
    ENTITY_SKELETON_DEATH,
    ENTITY_SKELETON_HORSE_AMBIENT,
    ENTITY_SKELETON_HORSE_DEATH,
    ENTITY_SKELETON_HORSE_HURT,
    ENTITY_SKELETON_HURT,
    ENTITY_SKELETON_SHOOT,
    ENTITY_SKELETON_STEP,
    ENTITY_SLIME_ATTACK,
    ENTITY_SLIME_DEATH,
    ENTITY_SLIME_HURT,
    ENTITY_SLIME_JUMP,
    ENTITY_SLIME_SQUISH,
    ENTITY_SMALL_MAGMACUBE_DEATH,
    ENTITY_SMALL_MAGMACUBE_HURT,
    ENTITY_SMALL_MAGMACUBE_SQUISH,
    ENTITY_SMALL_SLIME_DEATH,
    ENTITY_SMALL_SLIME_HURT,
    ENTITY_SMALL_SLIME_JUMP,
    ENTITY_SMALL_SLIME_SQUISH,
    ENTITY_SNOWBALL_THROW,
    ENTITY_SNOWMAN_AMBIENT,
    ENTITY_SNOWMAN_DEATH,
    ENTITY_SNOWMAN_HURT,
    ENTITY_SNOWMAN_SHOOT,
    ENTITY_SPIDER_AMBIENT,
    ENTITY_SPIDER_DEATH,
    ENTITY_SPIDER_HURT,
    ENTITY_SPIDER_STEP,
    ENTITY_SPLASH_POTION_BREAK,
    ENTITY_SPLASH_POTION_THROW,
    ENTITY_SQUID_AMBIENT,
    ENTITY_SQUID_DEATH,
    ENTITY_SQUID_HURT,
    ENTITY_STRAY_AMBIENT,
    ENTITY_STRAY_DEATH,
    ENTITY_STRAY_HURT,
    ENTITY_STRAY_STEP,
    ENTITY_TNT_PRIMED,
    ENTITY_VEX_AMBIENT,
    ENTITY_VEX_CHARGE,
    ENTITY_VEX_DEATH,
    ENTITY_VEX_HURT,
    ENTITY_VILLAGER_AMBIENT,
    ENTITY_VILLAGER_DEATH,
    ENTITY_VILLAGER_HURT,
    ENTITY_VILLAGER_NO,
    ENTITY_VILLAGER_TRADING,
    ENTITY_VILLAGER_YES,
    ENTITY_VINDICATION_ILLAGER_AMBIENT,
    ENTITY_VINDICATION_ILLAGER_DEATH,
    ENTITY_VINDICATION_ILLAGER_HURT,
    ENTITY_WITCH_AMBIENT,
    ENTITY_WITCH_DEATH,
    ENTITY_WITCH_DRINK,
    ENTITY_WITCH_HURT,
    ENTITY_WITCH_THROW,
    ENTITY_WITHER_AMBIENT,
    ENTITY_WITHER_BREAK_BLOCK,
    ENTITY_WITHER_DEATH,
    ENTITY_WITHER_HURT,
    ENTITY_WITHER_SHOOT,
    ENTITY_WITHER_SKELETON_AMBIENT,
    ENTITY_WITHER_SKELETON_DEATH,
    ENTITY_WITHER_SKELETON_HURT,
    ENTITY_WITHER_SKELETON_STEP,
    ENTITY_WITHER_SPAWN,
    ENTITY_WOLF_AMBIENT,
    ENTITY_WOLF_DEATH,
    ENTITY_WOLF_GROWL,
    ENTITY_WOLF_HOWL,
    ENTITY_WOLF_HURT,
    ENTITY_WOLF_PANT,
    ENTITY_WOLF_SHAKE,
    ENTITY_WOLF_STEP,
    ENTITY_WOLF_WHINE,
    ENTITY_ZOMBIE_AMBIENT,
    ENTITY_ZOMBIE_ATTACK_DOOR_WOOD,
    ENTITY_ZOMBIE_ATTACK_IRON_DOOR,
    ENTITY_ZOMBIE_BREAK_DOOR_WOOD,
    ENTITY_ZOMBIE_DEATH,
    ENTITY_ZOMBIE_HORSE_AMBIENT,
    ENTITY_ZOMBIE_HORSE_DEATH,
    ENTITY_ZOMBIE_HORSE_HURT,
    ENTITY_ZOMBIE_HURT,
    ENTITY_ZOMBIE_INFECT,
    ENTITY_ZOMBIE_PIG_AMBIENT,
    ENTITY_ZOMBIE_PIG_ANGRY,
    ENTITY_ZOMBIE_PIG_DEATH,
    ENTITY_ZOMBIE_PIG_HURT,
    ENTITY_ZOMBIE_STEP,
    ENTITY_ZOMBIE_VILLAGER_AMBIENT,
    ENTITY_ZOMBIE_VILLAGER_CONVERTED,
    ENTITY_ZOMBIE_VILLAGER_CURE,
    ENTITY_ZOMBIE_VILLAGER_DEATH,
    ENTITY_ZOMBIE_VILLAGER_HURT,
    ENTITY_ZOMBIE_VILLAGER_STEP,
    ITEM_ARMOR_EQUIP_CHAIN,
    ITEM_ARMOR_EQUIP_DIAMOND,
    ITEM_ARMOR_EQUIP_ELYTRA,
    ITEM_ARMOR_EQUIP_GENERIC,
    ITEM_ARMOR_EQUIP_GOLD,
    ITEM_ARMOR_EQUIP_IRON,
    ITEM_ARMOR_EQUIP_LEATHER,
    ITEM_BOTTLE_EMPTY,
    ITEM_BOTTLE_FILL,
    ITEM_BOTTLE_FILL_DRAGONBREATH,
    ITEM_BUCKET_EMPTY,
    ITEM_BUCKET_EMPTY_LAVA,
    ITEM_BUCKET_FILL,
    ITEM_BUCKET_FILL_LAVA,
    ITEM_CHORUS_FRUIT_TELEPORT,
    ITEM_ELYTRA_FLYING,
    ITEM_FIRECHARGE_USE,
    ITEM_FLINTANDSTEEL_USE,
    ITEM_HOE_TILL,
    ITEM_SHIELD_BLOCK,
    ITEM_SHIELD_BREAK,
    ITEM_SHOVEL_FLATTEN,
    ITEM_TOTEM_USE,
    MUSIC_CREATIVE,
    MUSIC_CREDITS,
    MUSIC_DRAGON,
    MUSIC_END,
    MUSIC_GAME,
    MUSIC_MENU,
    MUSIC_NETHER,
    RECORD_11,
    RECORD_13,
    RECORD_BLOCKS,
    RECORD_CAT,
    RECORD_CHIRP,
    RECORD_FAR,
    RECORD_MALL,
    RECORD_MELLOHI,
    RECORD_STAL,
    RECORD_STRAD,
    RECORD_WAIT,
    RECORD_WARD,
    UI_BUTTON_CLICK,
    UI_TOAST_CHALLENGE_COMPLETE,
    UI_TOAST_IN,
    UI_TOAST_OUT,
    WEATHER_RAIN,
    WEATHER_RAIN_ABOVE
}