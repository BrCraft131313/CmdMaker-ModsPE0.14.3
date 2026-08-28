package com.brcraft131313.cmdmakerformcpe0143;

public class CMDGenerator {

    // 1. جميع الأحداث والخطافات
    public static String generateAllHooks() {
        return "// ==========================================\n" +
               "// ModPE 0.14.3 - ALL HOOKS & EVENTS\n" +
               "// ==========================================\n\n" +
               "function useItem(x, y, z, itemId, blockId, side, itemDamage, blockDamage) {}\n" +
               "function destroyBlock(x, y, z, side) {}\n" +
               "function startDestroyBlock(x, y, z, side) {}\n" +
               "function modTick() {}\n" +
               "function attackHook(attacker, entity) {}\n" +
               "function entityAddedHook(entity) {}\n" +
               "function entityRemovedHook(entity) {}\n" +
               "function entityHurtHook(attacker, victim, halfHearts) {}\n" +
               "function deathHook(attacker, victim) {}\n" +
               "function levelEventHook(player, eventId, x, y, z, data) {}\n" +
               "function blockEventHook(x, y, z, type, data) {}\n" +
               "function chatHook(str) {}\n" +
               "function serverMessageReceiveHook(str) {}\n" +
               "function newLevel() {}\n" +
               "function selectLevelHook() {}\n" +
               "function leaveGame() {}\n" +
               "function redstoneUpdateHook(x, y, z, newCurrent, worldUpdate, blockId, blockDamage) {}\n" +
               "function eatHook(hearts, saturation) {}\n";
    }

    // 2. دوال ModPE
    public static String generateModPENamespace() {
        return "// ==========================================\n" +
               "// ModPE Namespace Methods\n" +
               "// ==========================================\n\n" +
               "ModPE.overrideTexture(\"images/mob/steve.png\", \"http://site.com/skin.png\");\n" +
               "ModPE.resetImages();\n" +
               "ModPE.setCamera(Player.getEntity());\n" +
               "ModPE.resetFov();\n" +
               "ModPE.setFov(90);\n" +
               "ModPE.setGameSpeed(20.0);\n" +
               "ModPE.takeScreenshot(\"screenshot.png\");\n" +
               "ModPE.saveData(\"key\", \"value\");\n" +
               "ModPE.readData(\"key\");\n" +
               "ModPE.removeData(\"key\");\n" +
               "ModPE.showTipMessage(\"Hello ModPE\");\n";
    }

    // 3. دوال Level
    public static String generateLevelNamespace() {
        return "// ==========================================\n" +
               "// Level Namespace Methods\n" +
               "// ==========================================\n\n" +
               "Level.getBiome(0, 0);\n" +
               "Level.getBlockData(0, 0, 0);\n" +
               "Level.getBlockId(0, 0, 0);\n" +
               "Level.getDifficulty();\n" +
               "Level.getGameMode();\n" +
               "Level.getTime();\n" +
               "Level.getWorldName();\n" +
               "Level.playSound(0, 0, 0, \"random.explode\", 1.0, 1.0);\n" +
               "Level.setNightMode(true);\n" +
               "Level.setRainLevel(1.0);\n" +
               "Level.setDifficulty(2);\n" +
               "Level.setGameMode(1);\n" +
               "Level.setSpawn(0, 64, 0);\n" +
               "Level.setTime(1000);\n" +
               "Level.explode(0, 64, 0, 4.0);\n";
    }

    // 4. دوال Player
    public static String generatePlayerNamespace() {
        return "// ==========================================\n" +
               "// Player Namespace Methods\n" +
               "// ==========================================\n\n" +
               "Player.addItemCreativeInv(264, 1, 0);\n" +
               "Player.addItemInventory(264, 1, 0);\n" +
               "Player.canFly();\n" +
               "Player.getEntity();\n" +
               "Player.getExperience();\n" +
               "Player.getHunger();\n" +
               "Player.getLevel();\n" +
               "Player.getName(Player.getEntity());\n" +
               "Player.getX();\n" +
               "Player.getY();\n" +
               "Player.getZ();\n" +
               "Player.setCanFly(true);\n" +
               "Player.setFlying(true);\n" +
               "Player.setHealth(20);\n" +
               "Player.setHunger(20);\n" +
               "Player.setLevel(30);\n";
    }

    // 5. دوال Entity
    public static String generateEntityNamespace() {
        return "// ==========================================\n" +
               "// Entity Namespace Methods\n" +
               "// ==========================================\n\n" +
               "Entity.getHealth(Player.getEntity());\n" +
               "Entity.getMaxHealth(Player.getEntity());\n" +
               "Entity.getMobSkin(Player.getEntity());\n" +
               "Entity.getNameTag(Player.getEntity());\n" +
               "Entity.getX(Player.getEntity());\n" +
               "Entity.getY(Player.getEntity());\n" +
               "Entity.getZ(Player.getEntity());\n" +
               "Entity.remove(Player.getEntity());\n" +
               "Entity.setFireTicks(Player.getEntity(), 100);\n" +
               "Entity.setHealth(Player.getEntity(), 20);\n" +
               "Entity.setPosition(Player.getEntity(), 0, 64, 0);\n";
    }

    // 6. دوال Item
    public static String generateItemNamespace() {
        return "// ==========================================\n" +
               "// Item Namespace & Crafting Methods\n" +
               "// ==========================================\n\n" +
               "Item.addCraftRecipe(264, 1, 0, [1, 1, 0]);\n" +
               "Item.addFurnaceRecipe(15, 265, 0);\n";
    }

    // 7. دوال Block
    public static String generateBlockNamespace() {
        return "// ==========================================\n" +
               "// Block Namespace Methods\n" +
               "// ==========================================\n\n" +
               "Block.setDestroyTime(200, 1.5);\n" +
               "Block.setLightLevel(200, 15);\n";
    }

    // 8. دوال Server والدوال العامة
    public static String generateServerAndGlobal() {
        return "// ==========================================\n" +
               "// Server & Global Functions\n" +
               "// ==========================================\n\n" +
               "Server.sendChat(\"Message to server\");\n" +
               "addItemInventory(264, 1, 0);\n" +
               "clientMessage(\"Local client message\");\n" +
               "explode(0, 64, 0, 4.0);\n" +
               "preventDefault();\n" +
               "print(\"System Print\");\n";
    }

    // 9. الثوابت
    public static String generateConstants() {
        return "// ==========================================\n" +
               "// Constants References\n" +
               "// ==========================================\n\n" +
               "// ChatColor, ItemCategory, ParticleType, EntityType, MobEffect\n";
    }

    // الدالة الشاملة التي تجمع العنصر والأمر ودوال الـ ModPE
    public static String generateCompleteMasterMod(String name, String idStr, String texture, String commandName) {
        StringBuilder fullMod = new StringBuilder();
        
        String customId = idStr.isEmpty() ? "500" : idStr;
        String customTexture = texture.isEmpty() ? "stick" : texture;
        String cmd = commandName.isEmpty() ? "gift" : commandName.replace("/", "").trim();
        
        // 1. إضافة العنصر وتفعيل الأمر المرتبط به عبر procCmd
        fullMod.append("// ==========================================\n");
        fullMod.append("// User Custom Command & Item Mod\n");
        fullMod.append("// ==========================================\n");
        fullMod.append("ModPE.setItem(").append(customId).append(", \"")
               .append(customTexture).append("\", 0, \"")
               .append(name).append("\", 64);\n\n");

        fullMod.append("function procCmd(cmdStr) {\n");
        fullMod.append("    var args = cmdStr.split(\" \");\n");
        fullMod.append("    if(args[0] == \"").append(cmd).append("\") {\n");
        fullMod.append("        preventDefault();\n");
        fullMod.append("        Player.addItemInventory(").append(customId).append(", 1, 0);\n");
        fullMod.append("        clientMessage(\"تم تنفيذ أمر ").append(cmd).append(" بنجاح والحصول على ").append(name).append("!\");\n");
        fullMod.append("    }\n");
        fullMod.append("}\n\n");

        // إضافة جميع الدوال والخطافات الأخرى
        fullMod.append(generateAllHooks()).append("\n");
        fullMod.append(generateModPENamespace()).append("\n");
        fullMod.append(generateLevelNamespace()).append("\n");
        fullMod.append(generatePlayerNamespace()).append("\n");
        fullMod.append(generateEntityNamespace()).append("\n");
        fullMod.append(generateItemNamespace()).append("\n");
        fullMod.append(generateBlockNamespace()).append("\n");
        fullMod.append(generateServerAndGlobal()).append("\n");
        fullMod.append(generateConstants()).append("\n");
        
        return fullMod.toString();
    }
}
