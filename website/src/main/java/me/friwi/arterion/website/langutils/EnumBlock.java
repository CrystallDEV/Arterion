/*
 * Copyright (c) 2015 Jerrell Fang
 *
 * This project is Open Source and distributed under The MIT License (MIT)
 * (http://opensource.org/licenses/MIT)
 *
 * You should have received a copy of the The MIT License along with
 * this project.   If not, see <http://opensource.org/licenses/MIT>.
 */

package me.friwi.arterion.website.langutils;

import org.springframework.context.MessageSource;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Meow J on 6/20/2015.
 * <p>
 * Material to Unlocalized Name
 *
 * @author Meow J
 */
public enum EnumBlock {
    STONE(Material.STONE, "tile.stone.stone.name"),
    GRANITE(Material.STONE, 1, "tile.stone.granite.name"),
    POLISHED_GRANITE(Material.STONE, 2, "tile.stone.graniteSmooth.name"),
    DIORITE(Material.STONE, 3, "tile.stone.diorite.name"),
    POLISHED_DIORITE(Material.STONE, 4, "tile.stone.dioriteSmooth.name"),
    ANDESITE(Material.STONE, 5, "tile.stone.andesite.name"),
    POLISHED_ANDESITE(Material.STONE, 6, "tile.stone.andesiteSmooth.name"),
    HAY_BALE(Material.HAY_BLOCK, "tile.hayBlock.name"),
    GRASS_BLOCK(Material.GRASS, "tile.grass.name"),
    DIRT(Material.DIRT, 0, "tile.dirt.default.name"),
    COARSE_DIRT(Material.DIRT, 1, "tile.dirt.coarse.name"),
    PODZOL(Material.DIRT, 2, "tile.dirt.podzol.name"),
    COBBLESTONE(Material.COBBLESTONE, "tile.stonebrick.name"),
    OAK_WOOD_PLANKS(Material.WOOD, "tile.wood.oak.name"),
    SPRUCE_WOOD_PLANKS(Material.WOOD, 1, "tile.wood.spruce.name"),
    BIRCH_WOOD_PLANKS(Material.WOOD, 2, "tile.wood.birch.name"),
    JUNGLE_WOOD_PLANKS(Material.WOOD, 3, "tile.wood.jungle.name"),
    ACACIA_WOOD_PLANKS(Material.WOOD, 4, "tile.wood.acacia.name"),
    DARK_OAK_WOOD_PLANKS(Material.WOOD, 5, "tile.wood.big_oak.name"),
    OAK_SAPLING(Material.SAPLING, "tile.sapling.oak.name"),
    SPRUCE_SAPLING(Material.SAPLING, 1, "tile.sapling.spruce.name"),
    BIRCH_SAPLING(Material.SAPLING, 2, "tile.sapling.birch.name"),
    JUNGLE_SAPLING(Material.SAPLING, 3, "tile.sapling.jungle.name"),
    ACACIA_SAPLING(Material.SAPLING, 4, "tile.sapling.acacia.name"),
    DARK_OAK_SAPLING(Material.SAPLING, 5, "tile.sapling.big_oak.name"),
    DEAD_BUSH(Material.DEAD_BUSH, "tile.deadbush.name"),
    BEDROCK(Material.BEDROCK, "tile.bedrock.name"),
    WATER(Material.WATER, "tile.water.name"),
    STILL_WATER(Material.STATIONARY_WATER, "tile.water.name"),
    LAVA(Material.LAVA, "tile.lava.name"),
    STILL_LAVA(Material.STATIONARY_LAVA, "tile.lava.name"),
    SAND(Material.SAND, "tile.sand.default.name"),
    RED_SAND(Material.SAND, 1, "tile.sand.red.name"),
    SANDSTONE(Material.SANDSTONE, "tile.sandStone.default.name"),
    CHISELED_SANDSTONE(Material.SANDSTONE, 1, "tile.sandStone.chiseled.name"),
    SMOOTH_SANDSTONE(Material.SANDSTONE, 2, "tile.sandStone.smooth.name"),
    GRAVEL(Material.GRAVEL, "tile.gravel.name"),
    GOLD_ORE(Material.GOLD_ORE, "tile.oreGold.name"),
    IRON_ORE(Material.IRON_ORE, "tile.oreIron.name"),
    COAL_ORE(Material.COAL_ORE, "tile.oreCoal.name"),
    OAK_WOOD(Material.LOG, "tile.log.oak.name"),
    SPRUCE_WOOD(Material.LOG, 1, "tile.log.spruce.name"),
    BIRCH_WOOD(Material.LOG, 2, "tile.log.birch.name"),
    JUNGLE_WOOD(Material.LOG, 3, "tile.log.jungle.name"),
    ACACIA_WOOD(Material.LOG_2, "tile.log.acacia.name"),
    DARK_OAK_WOOD(Material.LOG_2, 1, "tile.log.big_oak.name"),
    OAK_LEAVES(Material.LEAVES, "tile.leaves.oak.name"),
    SPRUCE_LEAVES(Material.LEAVES, 1, "tile.leaves.spruce.name"),
    BIRCH_LEAVES(Material.LEAVES, 2, "tile.leaves.birch.name"),
    JUNGLE_LEAVES(Material.LEAVES, 3, "tile.leaves.jungle.name"),
    ACACIA_LEAVES(Material.LEAVES_2, "tile.leaves.acacia.name"),
    DARK_OAK_LEAVES(Material.LEAVES_2, 1, "tile.leaves.big_oak.name"),
    SHRUB(Material.LONG_GRASS, "tile.tallgrass.shrub.name"),
    GRASS(Material.LONG_GRASS, 1, "tile.tallgrass.grass.name"),
    FERN(Material.LONG_GRASS, 2, "tile.tallgrass.fern.name"),
    SPONGE(Material.SPONGE, "tile.sponge.dry.name"),
    WET_SPONGE(Material.SPONGE, 1, "tile.sponge.wet.name"),
    GLASS(Material.GLASS, "tile.glass.name"),
    BLACK_STAINED_GLASS(Material.STAINED_GLASS, 15, "tile.stainedGlass.black.name"),
    RED_STAINED_GLASS(Material.STAINED_GLASS, 14, "tile.stainedGlass.red.name"),
    GREEN_STAINED_GLASS(Material.STAINED_GLASS, 13, "tile.stainedGlass.green.name"),
    BROWN_STAINED_GLASS(Material.STAINED_GLASS, 12, "tile.stainedGlass.brown.name"),
    BLUE_STAINED_GLASS(Material.STAINED_GLASS, 11, "tile.stainedGlass.blue.name"),
    PURPLE_STAINED_GLASS(Material.STAINED_GLASS, 10, "tile.stainedGlass.purple.name"),
    CYAN_STAINED_GLASS(Material.STAINED_GLASS, 9, "tile.stainedGlass.cyan.name"),
    LIGHT_GRAY_STAINED_GLASS(Material.STAINED_GLASS, 8, "tile.stainedGlass.silver.name"),
    GRAY_STAINED_GLASS(Material.STAINED_GLASS, 7, "tile.stainedGlass.gray.name"),
    PINK_STAINED_GLASS(Material.STAINED_GLASS, 6, "tile.stainedGlass.pink.name"),
    LIME_STAINED_GLASS(Material.STAINED_GLASS, 5, "tile.stainedGlass.lime.name"),
    YELLOW_STAINED_GLASS(Material.STAINED_GLASS, 4, "tile.stainedGlass.yellow.name"),
    LIGHT_BLUE_STAINED_GLASS(Material.STAINED_GLASS, 3, "tile.stainedGlass.lightBlue.name"),
    MAGENTA_STAINED_GLASS(Material.STAINED_GLASS, 2, "tile.stainedGlass.magenta.name"),
    ORANGE_STAINED_GLASS(Material.STAINED_GLASS, 1, "tile.stainedGlass.orange.name"),
    WHITE_STAINED_GLASS(Material.STAINED_GLASS, "tile.stainedGlass.white.name"),
    BLACK_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 15, "tile.thinStainedGlass.black.name"),
    RED_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 14, "tile.thinStainedGlass.red.name"),
    GREEN_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 13, "tile.thinStainedGlass.green.name"),
    BROWN_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 12, "tile.thinStainedGlass.brown.name"),
    BLUE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 11, "tile.thinStainedGlass.blue.name"),
    PURPLE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 10, "tile.thinStainedGlass.purple.name"),
    CYAN_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 9, "tile.thinStainedGlass.cyan.name"),
    LIGHT_GRAY_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 8, "tile.thinStainedGlass.silver.name"),
    GRAY_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 7, "tile.thinStainedGlass.gray.name"),
    PINK_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 6, "tile.thinStainedGlass.pink.name"),
    LIME_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 5, "tile.thinStainedGlass.lime.name"),
    YELLOW_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 4, "tile.thinStainedGlass.yellow.name"),
    LIGHT_BLUE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 3, "tile.thinStainedGlass.lightBlue.name"),
    MAGENTA_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 2, "tile.thinStainedGlass.magenta.name"),
    ORANGE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, 1, "tile.thinStainedGlass.orange.name"),
    WHITE_STAINED_GLASS_PANE(Material.STAINED_GLASS_PANE, "tile.thinStainedGlass.white.name"),
    GLASS_PANE(Material.THIN_GLASS, "tile.thinGlass.name"),
    DANDELION(Material.YELLOW_FLOWER, "tile.flower1.dandelion.name"),
    POPPY(Material.RED_ROSE, "tile.flower2.poppy.name"),
    BLUE_ORCHID(Material.RED_ROSE, 1, "tile.flower2.blueOrchid.name"),
    ALLIUM(Material.RED_ROSE, 2, "tile.flower2.allium.name"),
    AZURE_BLUET(Material.RED_ROSE, 3, "tile.flower2.houstonia.name"),
    RED_TULIP(Material.RED_ROSE, 4, "tile.flower2.tulipRed.name"),
    ORANGE_TULIP(Material.RED_ROSE, 5, "tile.flower2.tulipOrange.name"),
    WHITE_TULIP(Material.RED_ROSE, 6, "tile.flower2.tulipWhite.name"),
    PINK_TULIP(Material.RED_ROSE, 7, "tile.flower2.tulipPink.name"),
    OXEYE_DAISY(Material.RED_ROSE, 8, "tile.flower2.oxeyeDaisy.name"),
    SUNFLOWER(Material.DOUBLE_PLANT, "tile.doublePlant.sunflower.name"),
    LILAC(Material.DOUBLE_PLANT, 1, "tile.doublePlant.syringa.name"),
    DOUBLE_TALLGRASS(Material.DOUBLE_PLANT, 2, "tile.doublePlant.grass.name"),
    LARGE_FERN(Material.RED_ROSE, 3, "tile.doublePlant.fern.name"),
    ROSE_BUSH(Material.RED_ROSE, 4, "tile.doublePlant.rose.name"),
    PEONY(Material.RED_ROSE, 5, "tile.doublePlant.paeonia.name"),
    BROWN_MUSHROOM(Material.BROWN_MUSHROOM, "tile.mushroom.name"),
    RED_MUSHROOM(Material.RED_MUSHROOM, "tile.mushroom.name"),
    HUGE_MUSHROOM1(Material.HUGE_MUSHROOM_1, "tile.mushroom.name"),
    HUGE_MUSHROOM2(Material.HUGE_MUSHROOM_2, "tile.mushroom.name"),
    BLOCK_OF_GOLD(Material.GOLD_BLOCK, "tile.blockGold.name"),
    BLOCK_OF_IRON(Material.IRON_BLOCK, "tile.blockIron.name"),
    STONE_SLAB(Material.STEP, "tile.stoneSlab.stone.name"),
    SANDSTONE_SLAB(Material.STEP, 1, "tile.stoneSlab.sand.name"),
    WOODEN_SLAB(Material.STEP, 2, "tile.stoneSlab.wood.name"),
    COBBLESTONE_SLAB(Material.STEP, 3, "tile.stoneSlab.cobble.name"),
    BRICKS_SLAB(Material.STEP, 4, "tile.stoneSlab.brick.name"),
    STONE_BRICKS_SLAB(Material.STEP, 5, "tile.stoneSlab.smoothStoneBrick.name"),
    NETHER_BRICK_SLAB(Material.STEP, 6, "tile.stoneSlab.netherBrick.name"),
    QUARTZ_SLAB(Material.STEP, 7, "tile.stoneSlab.quartz.name"),
    OAK_WOOD_SLAB(Material.WOOD_STEP, "tile.woodSlab.oak.name"),
    SPRUCE_WOOD_SLAB(Material.WOOD_STEP, 1, "tile.woodSlab.spruce.name"),
    BIRCH_WOOD_SLAB(Material.WOOD_STEP, 2, "tile.woodSlab.birch.name"),
    JUNGLE_WOOD_SLAB(Material.WOOD_STEP, 3, "tile.woodSlab.jungle.name"),
    ACACIA_WOOD_SLAB(Material.WOOD_STEP, 4, "tile.woodSlab.acacia.name"),
    DARK_OAK_WOOD_SLAB(Material.WOOD_STEP, 5, "tile.woodSlab.big_oak.name"),
    BRICKS(Material.BRICK, "tile.brick.name"),
    TNT(Material.TNT, "tile.tnt.name"),
    BOOKSHELF(Material.BOOKSHELF, "tile.bookshelf.name"),
    MOSS_STONE(Material.MOSSY_COBBLESTONE, "tile.stoneMoss.name"),
    OBSIDIAN(Material.OBSIDIAN, "tile.obsidian.name"),
    TORCH(Material.TORCH, "tile.torch.name"),
    FIRE(Material.FIRE, "tile.fire.name"),
    MONSTER_SPAWNER(Material.MOB_SPAWNER, "tile.mobSpawner.name"),
    OAK_WOOD_STAIRS(Material.WOOD_STAIRS, "tile.stairsWood.name"),
    SPRUCE_WOOD_STAIRS(Material.SPRUCE_WOOD_STAIRS, "tile.stairsWoodSpruce.name"),
    BIRCH_WOOD_STAIRS(Material.BIRCH_WOOD_STAIRS, "tile.stairsWoodBirch.name"),
    JUNGLE_WOOD_STAIRS(Material.JUNGLE_WOOD_STAIRS, "tile.stairsWoodJungle.name"),
    ACACIA_WOOD_STAIRS(Material.ACACIA_STAIRS, "tile.stairsWoodAcacia.name"),
    DARK_OAK_WOOD_STAIRS(Material.DARK_OAK_STAIRS, "tile.stairsWoodDarkOak.name"),
    CHEST(Material.CHEST, "tile.chest.name"),
    TRAPPED_CHEST(Material.TRAPPED_CHEST, "tile.chestTrap.name"),
    REDSTONE_DUST(Material.REDSTONE_WIRE, "tile.redstoneDust.name"),
    DIAMOND_ORE(Material.DIAMOND_ORE, "tile.oreDiamond.name"),
    BLOCK_OF_COAL(Material.COAL_BLOCK, "tile.blockCoal.name"),
    BLOCK_OF_DIAMOND(Material.DIAMOND_BLOCK, "tile.blockDiamond.name"),
    CRAFTING_TABLE(Material.WORKBENCH, "tile.workbench.name"),
    CROPS(Material.CROPS, "tile.crops.name"),
    FARMLAND(Material.SOIL, "tile.farmland.name"),
    FURNACE(Material.FURNACE, "tile.furnace.name"),
    //BURN_FURNACE(Material.BURNING_FURNACE, "tile.furnace.name"),
    SIGN_POST(Material.SIGN_POST, "tile.sign.name"),
    //SIGN_WALL(Material.WALL_SIGN, "tile.sign.name"),
    LADDER(Material.LADDER, "tile.ladder.name"),
    RAIL(Material.RAILS, "tile.rail.name"),
    POWERED_RAIL(Material.POWERED_RAIL, "tile.goldenRail.name"),
    ACTIVATOR_RAIL(Material.ACTIVATOR_RAIL, "tile.activatorRail.name"),
    DETECTOR_RAIL(Material.DETECTOR_RAIL, "tile.detectorRail.name"),
    COBBLESTONE_STAIRS(Material.COBBLESTONE_STAIRS, "tile.stairsStone.name"),
    SANDSTONE_STAIRS(Material.SANDSTONE_STAIRS, "tile.stairsSandStone.name"),
    LEVER(Material.LEVER, "tile.lever.name"),
    STONE_PRESSURE_PLATE(Material.STONE_PLATE, "tile.pressurePlateStone.name"),
    WOODEN_PRESSURE_PLATE(Material.WOOD_PLATE, "tile.pressurePlateWood.name"),
    WEIGHTED_PRESSURE_PLATE_LIGHT(Material.GOLD_PLATE, "tile.weightedPlate_light.name"),
    WEIGHTED_PRESSURE_PLATE_HEAVY(Material.IRON_PLATE, "tile.weightedPlate_heavy.name"),
    IRON_DOOR_BLOCK(Material.IRON_DOOR_BLOCK, "tile.doorIron.name"),
    REDSTONE_ORE(Material.REDSTONE_ORE, "tile.oreRedstone.name"),
    REDSTONE_TORCH_OFF(Material.REDSTONE_TORCH_OFF, "tile.notGate.name"),
    //REDSTONE_TORCH_ON(Material.REDSTONE_TORCH_ON, "tile.notGate.name"),
    WOOD_BUTTON(Material.WOOD_BUTTON, "tile.button.name"),
    STONE_BUTTON(Material.STONE_BUTTON, "tile.button.name"),
    SNOW(Material.SNOW, "tile.snow.name"),
    BLACK_CARPET(Material.CARPET, 15, "tile.woolCarpet.black.name"),
    RED_CARPET(Material.CARPET, 14, "tile.woolCarpet.red.name"),
    GREEN_CARPET(Material.CARPET, 13, "tile.woolCarpet.green.name"),
    BROWN_CARPET(Material.CARPET, 12, "tile.woolCarpet.brown.name"),
    BLUE_CARPET(Material.CARPET, 11, "tile.woolCarpet.blue.name"),
    PURPLE_CARPET(Material.CARPET, 10, "tile.woolCarpet.purple.name"),
    CYAN_CARPET(Material.CARPET, 9, "tile.woolCarpet.cyan.name"),
    LIGHT_GRAY_CARPET(Material.CARPET, 8, "tile.woolCarpet.silver.name"),
    GRAY_CARPET(Material.CARPET, 7, "tile.woolCarpet.gray.name"),
    PINK_CARPET(Material.CARPET, 6, "tile.woolCarpet.pink.name"),
    LIME_CARPET(Material.CARPET, 5, "tile.woolCarpet.lime.name"),
    YELLOW_CARPET(Material.CARPET, 4, "tile.woolCarpet.yellow.name"),
    LIGHT_BLUE_CARPET(Material.CARPET, 3, "tile.woolCarpet.lightBlue.name"),
    MAGENTA_CARPET(Material.CARPET, 2, "tile.woolCarpet.magenta.name"),
    ORANGE_CARPET(Material.CARPET, 1, "tile.woolCarpet.orange.name"),
    CARPET(Material.CARPET, "tile.woolCarpet.white.name"),
    ICE(Material.ICE, "tile.ice.name"),
    PACKED_ICE(Material.PACKED_ICE, "tile.icePacked.name"),
    CACTUS(Material.CACTUS, "tile.cactus.name"),
    CLAY(Material.CLAY, "tile.clay.name"),
    BLACK_STAINED_CLAY(Material.STAINED_CLAY, 15, "tile.clayHardenedStained.black.name"),
    RED_STAINED_CLAY(Material.STAINED_CLAY, 14, "tile.clayHardenedStained.red.name"),
    GREEN_STAINED_CLAY(Material.STAINED_CLAY, 13, "tile.clayHardenedStained.green.name"),
    BROWN_STAINED_CLAY(Material.STAINED_CLAY, 12, "tile.clayHardenedStained.brown.name"),
    BLUE_STAINED_CLAY(Material.STAINED_CLAY, 11, "tile.clayHardenedStained.blue.name"),
    PURPLE_STAINED_CLAY(Material.STAINED_CLAY, 10, "tile.clayHardenedStained.purple.name"),
    CYAN_STAINED_CLAY(Material.STAINED_CLAY, 9, "tile.clayHardenedStained.cyan.name"),
    LIGHT_GRAY_STAINED_CLAY(Material.STAINED_CLAY, 8, "tile.clayHardenedStained.silver.name"),
    GRAY_STAINED_CLAY(Material.STAINED_CLAY, 7, "tile.clayHardenedStained.gray.name"),
    PINK_STAINED_CLAY(Material.STAINED_CLAY, 6, "tile.clayHardenedStained.pink.name"),
    LIME_STAINED_CLAY(Material.STAINED_CLAY, 5, "tile.clayHardenedStained.lime.name"),
    YELLOW_STAINED_CLAY(Material.STAINED_CLAY, 4, "tile.clayHardenedStained.yellow.name"),
    LIGHT_BLUE_STAINED_CLAY(Material.STAINED_CLAY, 3, "tile.clayHardenedStained.lightBlue.name"),
    MAGENTA_STAINED_CLAY(Material.STAINED_CLAY, 2, "tile.clayHardenedStained.magenta.name"),
    ORANGE_STAINED_CLAY(Material.STAINED_CLAY, 1, "tile.clayHardenedStained.orange.name"),
    WHITE_STAINED_CLAY(Material.STAINED_CLAY, "tile.clayHardenedStained.white.name"),
    HARDENED_CLAY(Material.HARD_CLAY, "tile.clayHardened.name"),
    SUGAR_CANE(Material.SUGAR_CANE_BLOCK, "tile.reeds.name"),
    JUKEBOX(Material.JUKEBOX, "tile.jukebox.name"),
    OAK_FENCE(Material.FENCE, "tile.fence.name"),
    OAK_FENCE_GATE(Material.FENCE_GATE, "tile.fenceGate.name"),
    PUMPKIN_STEM(Material.PUMPKIN_STEM, "tile.pumpkinStem.name"),
    PUMPKIN(Material.PUMPKIN, "tile.pumpkin.name"),
    JACK_O_LANTERN(Material.JACK_O_LANTERN, "tile.litpumpkin.name"),
    NETHERRACK(Material.NETHERRACK, "tile.hellrock.name"),
    SOUL_SAND(Material.SOUL_SAND, "tile.hellsand.name"),
    GLOWSTONE(Material.GLOWSTONE, "tile.lightgem.name"),
    PORTAL(Material.PORTAL, "tile.portal.name"),
    BLACK_WOOL(Material.WOOL, 15, "tile.cloth.black.name"),
    RED_WOOL(Material.WOOL, 14, "tile.cloth.red.name"),
    GREEN_WOOL(Material.WOOL, 13, "tile.cloth.green.name"),
    BROWN_WOOL(Material.WOOL, 12, "tile.cloth.brown.name"),
    BLUE_WOOL(Material.WOOL, 11, "tile.cloth.blue.name"),
    PURPLE_WOOL(Material.WOOL, 10, "tile.cloth.purple.name"),
    CYAN_WOOL(Material.WOOL, 9, "tile.cloth.cyan.name"),
    LIGHT_GRAY_WOOL(Material.WOOL, 8, "tile.cloth.silver.name"),
    GRAY_WOOL(Material.WOOL, 7, "tile.cloth.gray.name"),
    PINK_WOOL(Material.WOOL, 6, "tile.cloth.pink.name"),
    LIME_WOOL(Material.WOOL, 5, "tile.cloth.lime.name"),
    YELLOW_WOOL(Material.WOOL, 4, "tile.cloth.yellow.name"),
    LIGHT_BLUE_WOOL(Material.WOOL, 3, "tile.cloth.lightBlue.name"),
    MAGENTA_WOOL(Material.WOOL, 2, "tile.cloth.magenta.name"),
    ORANGE_WOOL(Material.WOOL, 1, "tile.cloth.orange.name"),
    WOOL(Material.WOOL, "tile.cloth.white.name"),
    LAPIS_LAZULI_ORE(Material.LAPIS_ORE, "tile.oreLapis.name"),
    LAPIS_LAZULI_BLOCK(Material.LAPIS_BLOCK, "tile.blockLapis.name"),
    DISPENSER(Material.DISPENSER, "tile.dispenser.name"),
    DROPPER(Material.DROPPER, "tile.dropper.name"),
    NOTE_BLOCK(Material.NOTE_BLOCK, "tile.musicBlock.name"),
    CAKE_BLOCK(Material.CAKE_BLOCK, "tile.cake.name"),
    BED_BLOCK(Material.BED_BLOCK, "tile.bed.name"),
    WOODEN_TRAPDOOR(Material.TRAP_DOOR, "tile.trapdoor.name"),
    COBWEB(Material.WEB, "tile.web.name"),
    STONE_BRICKS(Material.SMOOTH_BRICK, "tile.stonebricksmooth.default.name"),
    MOSSY_STONE_BRICKS(Material.SMOOTH_BRICK, 1, "tile.stonebricksmooth.mossy.name"),
    CRACKED_STONE_BRICKS(Material.SMOOTH_BRICK, 2, "tile.stonebricksmooth.cracked.name"),
    CHISELED_STONE_BRICKS(Material.SMOOTH_BRICK, 3, "tile.stonebricksmooth.chiseled.name"),
    STONE_MONSTER_EGG(Material.MONSTER_EGGS, "tile.monsterStoneEgg.stone.name"),
    COBBLESTONE_MONSTER_EGG(Material.MONSTER_EGGS, 1, "tile.monsterStoneEgg.cobble.name"),
    STONE_BRICK_MONSTER_EGG(Material.MONSTER_EGGS, 2, "tile.monsterStoneEgg.brick.name"),
    MOSSY_STONE_BRICK_MONSTER_EGG(Material.MONSTER_EGGS, 3, "tile.monsterStoneEgg.mossybrick.name"),
    CRACKED_STONE_BRICK_MONSTER_EGG(Material.MONSTER_EGGS, 4, "tile.monsterStoneEgg.crackedbrick.name"),
    CHISELED_STONE_BRICK_MONSTER_EGG(Material.MONSTER_EGGS, 5, "tile.monsterStoneEgg.chiseledbrick.name"),
    PISTON(Material.PISTON_BASE, "tile.pistonBase.name"),
    STICKY_PISTON(Material.PISTON_STICKY_BASE, "tile.pistonStickyBase.name"),
    IRON_BARS(Material.IRON_FENCE, "tile.fenceIron.name"),
    MELON_BLOCK(Material.MELON_BLOCK, "tile.melon.name"),
    BRICK_STAIRS(Material.BRICK_STAIRS, "tile.stairsBrick.name"),
    STONE_BRICK_STAIRS(Material.SMOOTH_STAIRS, "tile.stairsStoneBrickSmooth.name"),
    VINES(Material.VINE, "tile.vine.name"),
    NETHER_BRICK_BLOCK(Material.NETHER_BRICK, "tile.netherBrick.name"),
    NETHER_BRICK_FENCE(Material.NETHER_FENCE, "tile.netherFence.name"),
    NETHER_BRICK_STAIRS(Material.NETHER_BRICK_STAIRS, "tile.stairsNetherBrick.name"),
    NETHER_WART_BLOCK(Material.NETHER_WARTS, "tile.netherStalk.name"),
    CAULDRON_BLOCK(Material.CAULDRON, "tile.cauldron.name"),
    ENCHANTMENT_TABLE(Material.ENCHANTMENT_TABLE, "tile.enchantmentTable.name"),
    ANVIL(Material.ANVIL, "tile.anvil.intact.name"),
    //SLIGHTLY_DAMAGED_ANVIL(Material.ANVIL, 1, "tile.anvil.slightlyDamaged.name"),
    //VERY_DAMAGED_ANVIL(Material.ANVIL, 2, "tile.anvil.veryDamaged.name"),
    END_STONE(Material.ENDER_STONE, "tile.whiteStone.name"),
    END_PORTAL(Material.ENDER_PORTAL, "tile.endPortalFrame.name"),
    MYCELIUM(Material.MYCEL, "tile.mycel.name"),
    LILY_PAD(Material.WATER_LILY, "tile.waterlily.name"),
    DRAGON_EGG(Material.DRAGON_EGG, "tile.dragonEgg.name"),
    //REDSTONE_LAMP_ON(Material.REDSTONE_LAMP_ON, "tile.redstoneLight.name"),
    REDSTONE_LAMP_OFF(Material.REDSTONE_LAMP_OFF, "tile.redstoneLight.name"),
    COCOA(Material.COCOA, "tile.cocoa.name"),
    ENDER_CHEST(Material.ENDER_CHEST, "tile.enderChest.name"),
    EMERALD_ORE(Material.EMERALD_ORE, "tile.oreEmerald.name"),
    BLOCK_OF_EMERALD(Material.EMERALD_BLOCK, "tile.blockEmerald.name"),
    BLOCK_OF_REDSTONE(Material.REDSTONE_BLOCK, "tile.blockRedstone.name"),
    TRIPWIRE(Material.TRIPWIRE, "tile.tripWire.name"),
    TRIPWIRE_HOOK(Material.TRIPWIRE_HOOK, "tile.tripWireSource.name"),
    COMMAND_BLOCK(Material.COMMAND, "tile.commandBlock.name"),
    BEACON(Material.BEACON, "tile.beacon.name"),
    COBBLESTONE_WALL(Material.COBBLE_WALL, "tile.cobbleWall.normal.name"),
    MOSSY_COBBLESTONE_WALL(Material.COBBLE_WALL, 1, "tile.cobbleWall.mossy.name"),
    CARROTS(Material.CARROT, "tile.carrots.name"),
    POTATOES(Material.POTATO, "tile.potatoes.name"),
    DAYLIGHT_SENSOR(Material.DAYLIGHT_DETECTOR, "tile.daylightDetector.name"),
    NETHER_QUARTZ_ORE(Material.QUARTZ_ORE, "tile.netherquartz.name"),
    HOPPER(Material.HOPPER, "tile.hopper.name"),
    BLOCK_OF_QUARTZ(Material.QUARTZ_BLOCK, "tile.quartzBlock.default.name"),
    CHISELED_QUARTZ_BLOCK(Material.QUARTZ_BLOCK, 1, "tile.quartzBlock.chiseled.name"),
    PILLAR_QUARTZ_BLOCK(Material.QUARTZ_BLOCK, 2, "tile.quartzBlock.lines.name"),
    QUARTZ_STAIRS(Material.QUARTZ_STAIRS, "tile.stairsQuartz.name"),


    DOUBLE_STONE_SLAB(Material.DOUBLE_STEP, "tile.doubleStoneSlab.stone.name"),
    DOUBLE_SANDSTONE_SLAB(Material.DOUBLE_STEP, 1, "tile.doubleStoneSlab.sand.name"),
    DOUBLE_WOODEN_SLAB(Material.DOUBLE_STEP, 2, "tile.doubleStoneSlab.wood.name"),
    DOUBLE_COBBLESTONE_SLAB(Material.DOUBLE_STEP, 3, "tile.doubleStoneSlab.cobble.name"),
    DOUBLE_BRICKS_SLAB(Material.DOUBLE_STEP, 4, "tile.doubleStoneSlab.brick.name"),
    DOUBLE_STONE_BRICKS_SLAB(Material.DOUBLE_STEP, 5, "tile.doubleStoneSlab.smoothStoneBrick.name"),
    DOUBLE_NETHER_BRICK_SLAB(Material.DOUBLE_STEP, 6, "tile.doubleStoneSlab.netherBrick.name"),
    DOUBLE_QUARTZ_SLAB(Material.DOUBLE_STEP, 7, "tile.doubleStoneSlab.quartz.name"),
    DOUBLE_RED_SANDSTONE_SLAB(Material.DOUBLE_STONE_SLAB2, "tile.doubleStoneSlab2.red_sandstone.name"),
    OAK_DOOR_BLOCK(Material.WOODEN_DOOR, "tile.oak_wood_door.name"),
    SNOW_BLOCK(Material.SNOW_BLOCK, "tile.snowBlock.name"),
    DIODE_BLOCK(Material.DIODE_BLOCK_OFF, "tile.diode.name"),
    MELON_STEM(Material.MELON_STEM, "tile.melonStem.name"),
    BREWING_STAND(Material.BREWING_STAND, "tile.brewingStand.name"),
    END_PORTAL_FRAME(Material.ENDER_PORTAL_FRAME, "tile.endPortalFrame.name"),
    DOUBLE_OAK_WOOD_SLAB(Material.WOOD_DOUBLE_STEP, "tile.woodSlab.oak.name"),
    DOUBLE_SPRUCE_WOOD_SLAB(Material.WOOD_DOUBLE_STEP, 1, "tile.woodSlab.spruce.name"),
    DOUBLE_BIRCH_WOOD_SLAB(Material.WOOD_DOUBLE_STEP, 2, "tile.woodSlab.birch.name"),
    DOUBLE_JUNGLE_WOOD_SLAB(Material.WOOD_DOUBLE_STEP, 3, "tile.woodSlab.jungle.name"),
    DOUBLE_ACACIA_WOOD_SLAB(Material.WOOD_DOUBLE_STEP, 4, "tile.woodSlab.acacia.name"),
    DOUBLE_DARK_OAK_WOOD_SLAB(Material.WOOD_DOUBLE_STEP, 5, "tile.woodSlab.big_oak.name"),
    FLOWER_POT(Material.FLOWER_POT, "tile.flowerPot.name"),
    SKULL(Material.SKULL, "tile.skull.name"),
    REDSTONE_COMPARATOR(Material.REDSTONE_COMPARATOR_OFF, "tile.redstoneComparator.name"),
    SLIME_BLOCK(Material.SLIME_BLOCK, "tile.slimeBlock.name"),
    BARRIER(Material.BARRIER, "tile.barrier.name"),
    IRON_TRAPDOOR(Material.IRON_TRAPDOOR, "tile.ironTrapdoor.name"),
    PRISMARINE(Material.PRISMARINE, "tile.prismarine.name"),
    SEA_LANTERN(Material.SEA_LANTERN, "tile.seaLantern.name"),
    STANDING_BANNER(Material.STANDING_BANNER, "tile.banner.name"),

    RED_SANDSTONE(Material.RED_SANDSTONE, "tile.redSandstone.name"),
    RED_SANDSTONE_STAIRS(Material.RED_SANDSTONE_STAIRS, "tile.redSandstoneStairs.name"),
    STONE_SLAB2(Material.STONE_SLAB2, "tile.redSandstoneStep.name"),
    SPRUCE_FENCE_GATE(Material.SPRUCE_FENCE_GATE, "tile.fenceGate.spruce.name"),
    BIRCH_FENCE_GATE(Material.BIRCH_FENCE_GATE, "tile.fenceGate.birch.name"),
    JUNGLE_FENCE_GATE(Material.JUNGLE_FENCE_GATE, "tile.fenceGate.jungle.name"),
    DARK_OAK_FENCE_GATE(Material.DARK_OAK_FENCE_GATE, "tile.fenceGate.big_oak.name"),
    ACACIA_FENCE_GATE(Material.ACACIA_FENCE_GATE, "tile.fenceGate.acacia.name"),
    SPRUCE_FENCE(Material.SPRUCE_FENCE, "tile.fence.spruce.name"),
    BIRCH_FENCE(Material.BIRCH_FENCE, "tile.fence.birch.name"),
    JUNGLE_FENCE(Material.JUNGLE_FENCE, "tile.fence.jungle.name"),
    DARK_OAK_FENCE(Material.DARK_OAK_FENCE, "tile.fence.big_oak.name"),
    ACACIA_FENCE(Material.ACACIA_FENCE, "tile.fence.acacia.name"),
    SPRUCE_DOOR(Material.SPRUCE_DOOR, "tile.door.spruce.name"),
    BIRCH_DOOR(Material.BIRCH_DOOR, "tile.door.birch.name"),
    JUNGLE_DOOR(Material.JUNGLE_DOOR, "tile.door.jungle.name"),
    ACACIA_DOOR(Material.ACACIA_DOOR, "tile.door.acacia.name"),
    DARK_OAK_DOOR(Material.DARK_OAK_DOOR, "tile.door.big_oak.name"),

    ;

    private static final Map<ItemEntry, EnumBlock> lookup = new HashMap<ItemEntry, EnumBlock>();

    static {
        for (EnumBlock item : EnumSet.allOf(EnumBlock.class))
            lookup.put(new ItemEntry(item.material, item.getMetadata()), item);
    }

    private Material material;
    private int metadata;
    private String unlocalizedName;

    /**
     * Create an index of an item
     */
    EnumBlock(Material material, int metadata, String unlocalizedName) {
        this.material = material;
        this.metadata = metadata;
        this.unlocalizedName = unlocalizedName;
    }

    EnumBlock(Material material, String unlocalizedName) {
        this(material, 0, unlocalizedName);
    }

    /**
     * Get the index of an item based on {@link ItemEntry}.
     *
     * @param entry The entry for search.
     * @return The index of the item.
     */
    public static EnumBlock get(ItemEntry entry) {
        ItemEntry ignoreMeta = new ItemEntry(entry.getMaterial());
        return lookup.containsKey(entry) ? lookup.get(entry) : (lookup.containsKey(ignoreMeta) ? lookup.get(ignoreMeta) : null);
    }

    /**
     * @return The unlocalized name of the item.
     */
    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    /**
     * @return The metadata(damage value, durability) of the item.
     */
    public int getMetadata() {
        return metadata;
    }

    /**
     * @return The {@link Material} of the item.
     */
    public Material getMaterial() {
        return material;
    }

    public String getName(MessageSource source, Locale locale) {
        return source.getMessage(getUnlocalizedName(), new Object[0], locale);
    }

    public static EnumBlock byIdAndData(int id, int data) {
        for (EnumBlock b : EnumBlock.values()) {
            if (b.getMaterial().getId() == id && b.getMetadata() == data) {
                return b;
            }
        }
        return null;
    }
}
