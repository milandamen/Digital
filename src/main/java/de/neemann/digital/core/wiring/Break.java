package de.neemann.digital.core.wiring;

import de.neemann.digital.core.Model;
import de.neemann.digital.core.NodeException;
import de.neemann.digital.core.ObservableValue;
import de.neemann.digital.core.element.Element;
import de.neemann.digital.core.element.ElementAttributes;
import de.neemann.digital.core.element.ElementTypeDescription;
import de.neemann.digital.core.element.Keys;

import static de.neemann.digital.core.element.PinInfo.input;

/**
 * @author hneemann
 */
public class Break implements Element {

    public static final ElementTypeDescription DESCRIPTION = new ElementTypeDescription(Break.class, input("brk"))
            .addAttribute(Keys.Rotate)
            .addAttribute(Keys.Label)
            .addAttribute(Keys.Cycles);

    private final int cycles;
    private ObservableValue input;

    public Break(ElementAttributes attributes) {
        cycles = attributes.get(Keys.Cycles);
    }

    @Override
    public void setInputs(ObservableValue... inputs) throws NodeException {
        input = inputs[0].checkBits(1, null);
    }

    public ObservableValue getBreakInput() {
        return input;
    }

    public int getCycles() {
        return cycles;
    }

    @Override
    public ObservableValue[] getOutputs() {
        return new ObservableValue[0];
    }

    @Override
    public void registerNodes(Model model) {
        model.addBreak(this);
    }

}
