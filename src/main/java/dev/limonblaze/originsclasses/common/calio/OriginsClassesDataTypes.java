package dev.limonblaze.originsclasses.common.calio;

import io.github.apace100.calio.data.SerializableDataType;
import dev.limonblaze.originsclasses.common.event.ModifyCraftResultEvent;

import java.util.EnumSet;

public class OriginsClassesDataTypes {
    
    public static final SerializableDataType<ModifyCraftResultEvent.CraftingResultType> CRAFTING_RESULT_TYPE =
        SerializableDataType.enumValue(ModifyCraftResultEvent.CraftingResultType.class);
    
    public static final SerializableDataType<EnumSet<ModifyCraftResultEvent.CraftingResultType>> CRAFTING_RESULT_TYPE_SET =
        SerializableDataType.enumSet(ModifyCraftResultEvent.CraftingResultType.class, CRAFTING_RESULT_TYPE);
    
}
