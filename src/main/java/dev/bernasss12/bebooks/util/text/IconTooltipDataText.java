package dev.bernasss12.bebooks.util.text;

import net.minecraft.item.ItemStack;
import net.minecraft.text.*;

import java.util.Collections;
import java.util.List;

public record IconTooltipDataText(List<ItemStack> icons) implements OrderedText, Text {

    @Override
    public boolean accept(CharacterVisitor visitor) {
        return false;
    }

    @Override
    public Style getStyle() {
        return Style.EMPTY;
    }

    @Override
    public String asString() {
        return "This is not supposed to be used as an actual string.";
    }

    @Override
    public List<Text> getSiblings() {
        return Collections.emptyList();
    }

    @Override
    public MutableText copy() {
        return new LiteralText(asString() + " Do not try to copy this.");
    }

    @Override
    public MutableText shallowCopy() {
        return copy();
    }

    @Override
    public OrderedText asOrderedText() {
        return this;
    }
}
